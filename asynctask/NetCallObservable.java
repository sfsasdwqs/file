package com.common.szair.asynctask;

import ai.servicewall.android.ServicewallConstant;
import com.air.sz.util.DLog;
import com.air.sz.util.ToastUtil;
import com.common.szair.model.protofultomodel.FlightSearchInternalConvertorOk;
import com.common.szair.model.soap.GZIPConstants;
import com.common.szair.model.soap.SOAPBinding;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class NetCallObservable<T> extends Observable<T> {
    String api;
    SOAPBinding binding;
    Call call;

    public NetCallObservable(SOAPBinding binding, String api, Call call) {
        this.api = api;
        this.call = call;
        this.binding = binding;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer<? super T> observer) {
        CallCallback callCallback = new CallCallback(this.binding, this.api, this.call, observer);
        observer.onSubscribe(callCallback);
        if (callCallback.isDisposed()) {
            return;
        }
        this.call.enqueue(callCallback);
    }

    private static final class CallCallback<T> implements Disposable, Callback {
        private final String api;
        private final SOAPBinding binding;
        private final Call call;
        private volatile boolean disposed;
        private final Observer<DataResp<T>> observer;
        private final DataResp<T> resp;
        boolean terminated = false;

        CallCallback(SOAPBinding binding, String api, Call call, Observer<DataResp<T>> observer) {
            DataResp<T> dataResp = new DataResp<>();
            this.resp = dataResp;
            this.api = api;
            this.call = call;
            this.observer = observer;
            dataResp.api = api;
            this.binding = binding;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
            this.call.cancel();
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e) {
            if (call.isCanceled()) {
                return;
            }
            this.resp.code = -1;
            this.resp.msg = e.getMessage();
            onfinish(this.resp);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            this.binding.setCookies(response);
            if (this.disposed) {
                return;
            }
            try {
                if (response.isSuccessful()) {
                    this.resp.code = 0;
                    this.resp.fp = response.header(ServicewallConstant.CAPTCHA_HEADER);
                    FlightSearchInternalConvertorOk flightSearchInternalConvertorOk = new FlightSearchInternalConvertorOk("flightSearch".equals(this.api));
                    byte[] bytes = response.body().bytes();
                    long currentTimeMillis = System.currentTimeMillis();
                    ToastUtil.shoufaTime = currentTimeMillis - ToastUtil.startTime;
                    byte[] uncompress = GZIPConstants.uncompress(bytes);
                    ToastUtil.jieyaTime = System.currentTimeMillis() - currentTimeMillis;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    this.resp.resp = (T) flightSearchInternalConvertorOk.convert(uncompress);
                    ToastUtil.erPushTemp = System.currentTimeMillis();
                    ToastUtil.erTime = System.currentTimeMillis() - currentTimeMillis2;
                    DLog.i("航班查询解压--耗时:" + (currentTimeMillis2 - currentTimeMillis));
                    DLog.i("onResponse:" + new String(uncompress));
                }
                onfinish(this.resp);
            } catch (Throwable th) {
                this.resp.msg = th.getMessage();
                onfinish(this.resp);
            }
        }

        private void onfinish(DataResp<T> res) {
            this.observer.onNext(res);
            if (this.disposed) {
                return;
            }
            this.terminated = true;
            this.observer.onComplete();
        }
    }
}