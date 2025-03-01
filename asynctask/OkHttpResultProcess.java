package com.common.szair.asynctask;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class OkHttpResultProcess<E> {
    final String threadId;

    public OkHttpResultProcess(final String threadId) {
        this.threadId = threadId;
    }

    protected Disposable okhttpQuery(final SOAPBinding binding, final String method, final Object[] param, final AsyncCallback<E> callback) {
        if (binding == null || param == null || param.length <= 0) {
            return null;
        }
        Object obj = param[0];
        if (obj instanceof SOAPObject) {
            return binding.rxXmlSearch(method, (SOAPObject) obj).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<DataResp<E>>() { // from class: com.common.szair.asynctask.OkHttpResultProcess.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Consumer
                public void accept(DataResp<E> dataResp) throws Exception {
                    if (dataResp.code != 0) {
                        Object netErrorObject = OkHttpResultProcess.this.getNetErrorObject(callback);
                        if (netErrorObject instanceof SOAPObject) {
                            ((SOAPObject) netErrorObject).setexception(new Exception(dataResp.msg));
                        }
                        callback.onProcess(netErrorObject, dataResp.fp);
                        AsyncClient.removeRubbishTask(OkHttpResultProcess.this.threadId);
                        return;
                    }
                    callback.onProcess(dataResp.resp, dataResp.fp);
                    AsyncClient.removeRubbishTask(OkHttpResultProcess.this.threadId);
                }
            }, new Consumer<Throwable>() { // from class: com.common.szair.asynctask.OkHttpResultProcess.2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.Consumer
                public void accept(Throwable throwable) throws Exception {
                    Object netErrorObject = OkHttpResultProcess.this.getNetErrorObject(callback);
                    if (netErrorObject instanceof SOAPObject) {
                        ((SOAPObject) netErrorObject).setexception(new Exception(throwable.getMessage()));
                    }
                    callback.onProcess(netErrorObject, null);
                    AsyncClient.removeRubbishTask(OkHttpResultProcess.this.threadId);
                }
            });
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public E getNetErrorObject(AsyncCallback<E> asyncCallback) {
        Type[] actualTypeArguments;
        try {
            Type[] genericInterfaces = asyncCallback.getClass().getGenericInterfaces();
            if (genericInterfaces != null && genericInterfaces.length > 0 && (actualTypeArguments = ((ParameterizedType) genericInterfaces[0]).getActualTypeArguments()) != null && actualTypeArguments.length > 0) {
                Type type = actualTypeArguments[0];
                if (type instanceof Class) {
                    return (E) ((Class) type).newInstance();
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }
}