package com.common.szair.asynctask;

import com.common.szair.model.soap.SOAPObject;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class AsyncResponseHandler {
    public <E> void onResponseReceived(SOAPObject response, AsyncCallback<E> callback) {
        callback.onProcess(response, null);
    }
}