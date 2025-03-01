package com.common.szair.asynctask;

import com.common.szair.model.soap.SOAPException;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public abstract class ResponseCallback<E> {
    public abstract void onFailure(SOAPException e);

    public void onNetNotAvailable() {
    }

    public abstract void onSuccess(E response);
}