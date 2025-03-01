package com.common.szair.asynctask;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class DataResp<T> {
    public String api;
    public int code = -1;
    public String fp;
    public String msg;
    public T resp;

    public String toString() {
        return "DataResp{code=" + this.code + ", msg='" + this.msg + "', resp=" + this.resp + ", api='" + this.api + "', fp='" + this.fp + "'}";
    }
}