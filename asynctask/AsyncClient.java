package com.common.szair.asynctask;

import android.os.AsyncTask;
import com.air.sz.R;
import com.air.sz.util.DLog;
import com.air.sz.util.ToastUtil;
import com.air.sz.util.UiUtil;
import com.common.szair.model.soap.SOAPBinding;
import com.xiaomi.mipush.sdk.Constants;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class AsyncClient<E> {
    private static ConcurrentHashMap<String, AsyncSender<?>> tasks = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Disposable> newtasks = new ConcurrentHashMap<>();

    public static <E> void sendRequest(final String threadId, final SOAPBinding binding, final String method, final Object[] param, AsyncCallback<E> callback) {
        if (!UiUtil.isNetAvailable()) {
            ToastUtil.showCommenToast(R.string.network_err);
            ToastUtil.dismissLoadingDialog();
            if (callback instanceof AbsAsyncCallback) {
                ((AbsAsyncCallback) callback).onNetworkError();
                return;
            }
            return;
        }
        Disposable okhttpQuery = new OkHttpResultProcess(threadId).okhttpQuery(binding, method, param, callback);
        if (okhttpQuery != null) {
            newtasks.put(threadId, okhttpQuery);
            DLog.i("requestmap----" + threadId + ":disposable" + okhttpQuery);
        }
    }

    public static void cancelRequest(final String threadId) {
        if (newtasks.size() > 0 && newtasks.containsKey(threadId)) {
            Disposable remove = newtasks.remove(threadId);
            if (remove != null) {
                remove.dispose();
            }
            DLog.i("requestmap----" + threadId + Constants.COLON_SEPARATOR + remove);
        }
        ConcurrentHashMap<String, AsyncSender<?>> concurrentHashMap = tasks;
        if (concurrentHashMap == null || concurrentHashMap.size() == 0) {
            return;
        }
        AsyncSender<?> asyncSender = tasks.get(threadId);
        if (asyncSender != null && asyncSender.getStatus() != null && asyncSender.getStatus() != AsyncTask.Status.FINISHED) {
            asyncSender.cancel(true);
        }
        tasks.remove(threadId);
    }

    public static void removeRubbishTask(final String threadId) {
        if (newtasks.size() > 0) {
            newtasks.remove(threadId);
            ArrayList arrayList = new ArrayList();
            for (String str : newtasks.keySet()) {
                Disposable disposable = newtasks.get(str);
                if (disposable != null && disposable.isDisposed()) {
                    arrayList.add(str);
                }
            }
            if (arrayList.size() > 0) {
                Iterator<E> it = arrayList.iterator();
                while (it.hasNext()) {
                    newtasks.remove((String) it.next());
                }
            }
        }
    }
}