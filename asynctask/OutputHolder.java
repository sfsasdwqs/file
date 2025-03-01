package com.common.szair.asynctask;

import com.common.szair.model.soap.SOAPObject;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class OutputHolder<E> {
    private AsyncCallback<E> callback;
    private SOAPObject response;

    public OutputHolder(SOAPObject response, AsyncCallback<E> callback) {
        this.response = response;
        this.callback = callback;
    }

    public SOAPObject getResponse() {
        return this.response;
    }

    public AsyncCallback<E> getCallback() {
        return this.callback;
    }
}