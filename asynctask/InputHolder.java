package com.common.szair.asynctask;

import com.common.szair.model.soap.SOAPBinding;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class InputHolder<E> {
    private SOAPBinding binding;
    private AsyncCallback<E> callback;
    private String method;
    private Object[] param;

    public InputHolder(SOAPBinding binding, String method, Object[] param, AsyncCallback<E> callback) {
        this.binding = binding;
        this.method = method;
        this.param = param;
        this.callback = callback;
    }

    public SOAPBinding getBinding() {
        return this.binding;
    }

    public Object[] getParam() {
        return this.param;
    }

    public String getMethod() {
        return this.method;
    }

    public AsyncCallback<E> getCallback() {
        return this.callback;
    }
}