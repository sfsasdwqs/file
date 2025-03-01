package com.common.szair.asynctask;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.RetryPolicy;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.StringRequest;
import java.io.UnsupportedEncodingException;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class MyStringRequest extends StringRequest {
    public MyStringRequest(int method, String url, Response.Listener<String> listener, Response.ErrorListener errorListener) {
        super(method, url, listener, errorListener);
    }

    @Override // com.android.volley.toolbox.StringRequest, com.android.volley.Request
    protected Response<String> parseNetworkResponse(NetworkResponse response) {
        String str;
        try {
            str = new String(response.data, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            str = new String(response.data);
        }
        return Response.success(str, HttpHeaderParser.parseCacheHeaders(response));
    }

    @Override // com.android.volley.Request
    public Request<?> setRetryPolicy(RetryPolicy retryPolicy) {
        return super.setRetryPolicy(new DefaultRetryPolicy(60000, 1, 1.0f));
    }
}