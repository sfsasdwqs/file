package com.common.szair.asynctask;

import android.os.AsyncTask;
import com.air.sz.util.DLog;
import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class AsyncSender<E> extends AsyncTask<InputHolder<E>, Void, OutputHolder<E>> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public OutputHolder<E> doInBackground(InputHolder<E>... params) {
        SOAPObject sOAPObject;
        InputHolder<E> inputHolder = params[0];
        try {
            SOAPBinding binding = inputHolder.getBinding();
            String method = inputHolder.getMethod();
            Object[] param = inputHolder.getParam();
            Class<?>[] clsArr = new Class[param.length];
            int length = param.length;
            for (int i = 0; i < length; i++) {
                clsArr[i] = param[i].getClass();
            }
            sOAPObject = (SOAPObject) binding.getClass().getMethod(method, clsArr).invoke(binding, param);
        } catch (Exception e) {
            DLog.i(e.toString());
            sOAPObject = null;
        }
        return new OutputHolder<>(sOAPObject, inputHolder.getCallback());
    }

    @Override // android.os.AsyncTask
    protected void onPreExecute() {
        super.onPreExecute();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(OutputHolder<E> result) {
        super.onPostExecute((AsyncSender<E>) result);
        if (isCancelled()) {
            return;
        }
        AsyncCallback<E> callback = result.getCallback();
        new AsyncResponseHandler().onResponseReceived(result.getResponse(), callback);
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        super.onCancelled();
    }
}