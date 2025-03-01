package com.common.szair.asynctask;

import ai.servicewall.android.ServicewallConstant;
import android.util.Log;
import com.air.sz.ui.widget.timeSelector.TextUtil;
import com.air.sz.util.DLog;
import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPEnvelope;
import com.common.szair.model.soap.SOAPFault;
import com.google.common.io.ByteStreams;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.LongCompanionObject;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class NetXmlCallObservable<T> extends Observable<T> {
    private static final Charset UTF8 = Charset.forName("UTF-8");
    SOAPBinding binding;
    Call call;

    public NetXmlCallObservable(SOAPBinding binding, Call call) {
        this.binding = binding;
        this.call = call;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer<? super T> observer) {
        CallCallback callCallback = new CallCallback(this.binding, this.call, observer);
        observer.onSubscribe(callCallback);
        if (callCallback.isDisposed()) {
            return;
        }
        this.call.enqueue(callCallback);
    }

    private static final class CallCallback<T> implements Disposable, Callback {
        private final SOAPBinding binding;
        private final Call call;
        private volatile boolean disposed;
        private final Observer<DataResp<T>> observer;
        private final DataResp<T> resp;
        boolean terminated = false;

        CallCallback(SOAPBinding binding, Call call, Observer<DataResp<T>> observer) {
            DataResp<T> dataResp = new DataResp<>();
            this.resp = dataResp;
            this.binding = binding;
            this.call = call;
            this.observer = observer;
            dataResp.api = binding.getApiMethod();
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            SOAPEnvelope makeResponse;
            this.binding.setCookies(response);
            if (this.disposed) {
                return;
            }
            try {
                if (response.isSuccessful()) {
                    this.resp.code = 0;
                    this.resp.fp = response.header(ServicewallConstant.CAPTCHA_HEADER);
                    if (this.binding != null && response.body() != null) {
                        String header = response.header("Content-Encoding");
                        if (!TextUtil.isEmpty(header) && header.contains("gzip")) {
                            makeResponse = this.binding.makeResponse(new GZIPInputStream(response.body().byteStream()));
                        } else {
                            makeResponse = this.binding.makeResponse(response.body().byteStream());
                        }
                        if (makeResponse != null && makeResponse.bodyElements.size() == 1) {
                            T t = (T) makeResponse.bodyElements.get(0);
                            if (t instanceof SOAPFault) {
                                this.resp.code = 9;
                                this.resp.msg = ((SOAPFault) t).getfaultstring();
                            } else {
                                this.resp.resp = t;
                            }
                        }
                    }
                    Log.i("rxXmlSearch_res", this.resp.toString());
                }
                onfinish(this.resp);
            } catch (Throwable th) {
                this.resp.msg = th.getMessage();
                onfinish(this.resp);
            }
        }

        private void printResponseBody(boolean isGzip, ResponseBody responseBody) {
            String str;
            String str2;
            String str3 = "";
            if (responseBody != null) {
                try {
                    long contentLength = responseBody.contentLength();
                    BufferedSource source = responseBody.source();
                    if (contentLength != -1) {
                        str = contentLength + "-byte";
                    } else {
                        str = "unknown-length";
                    }
                    if (contentLength != 0) {
                        String str4 = "\nbodySize:" + str + "\n";
                        if (contentLength < 102400) {
                            Buffer clone = source.buffer().clone();
                            source.request(LongCompanionObject.MAX_VALUE);
                            if (!isGzip) {
                                str2 = clone.readString(NetXmlCallObservable.UTF8);
                            } else {
                                try {
                                    str2 = new String(ByteStreams.toByteArray(new GZIPInputStream(clone.inputStream())));
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            str3 = str2;
                        } else {
                            str3 = str4;
                        }
                    }
                } catch (Exception unused) {
                    DLog.i("printResponseBody----Exception");
                    return;
                }
            }
            DLog.i("printResponseBody----" + str3);
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