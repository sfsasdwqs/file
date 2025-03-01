package com.common.szair.asynctask;

import android.util.Log;
import com.air.sz.ui.widget.timeSelector.TextUtil;
import com.google.common.base.Charsets;
import com.google.common.io.CharStreams;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class NetJsonCallObservable<T> extends Observable<T> {
    Call call;
    String url;

    public NetJsonCallObservable(String url, Call call) {
        this.url = url;
        this.call = call;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer<? super T> observer) {
        CallCallback callCallback = new CallCallback(this.url, this.call, observer);
        observer.onSubscribe(callCallback);
        if (callCallback.isDisposed()) {
            return;
        }
        this.call.enqueue(callCallback);
    }

    private static final class CallCallback<T> implements Disposable, Callback {
        private final Call call;
        private volatile boolean disposed;
        private final Observer<DataResp<T>> observer;
        private final String url;
        boolean terminated = false;
        private final DataResp<T> resp = new DataResp<>();

        CallCallback(String url, Call call, Observer<DataResp<T>> observer) {
            this.url = url;
            this.call = call;
            this.observer = observer;
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
            T t;
            if (this.disposed) {
                return;
            }
            try {
                if (response.isSuccessful()) {
                    this.resp.code = 0;
                    if (this.url != null && response.body() != null) {
                        String header = response.header("Content-Encoding");
                        if (!TextUtil.isEmpty(header) && header.contains("gzip")) {
                            t = (T) CharStreams.toString(new InputStreamReader(new GZIPInputStream(response.body().byteStream()), Charsets.UTF_8));
                        } else {
                            t = (T) CharStreams.toString(new InputStreamReader(response.body().byteStream(), Charsets.UTF_8));
                        }
                        this.resp.resp = t;
                    }
                    Log.i("rxXmlSearch_res", this.resp.toString());
                } else {
                    this.resp.code = response.code();
                    this.resp.msg = response.message();
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