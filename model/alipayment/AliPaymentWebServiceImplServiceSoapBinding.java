package com.common.szair.model.alipayment;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPFault;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class AliPaymentWebServiceImplServiceSoapBinding extends SOAPBinding {
    public AliPaymentWebServiceImplServiceSoapBinding(String endpoint) {
        super(AliPaymentWebServiceImplServiceSoapBinding.class.getPackage().getName(), endpoint);
    }

    @Override // com.common.szair.model.soap.SOAPBinding
    public Map<String, String> getNamespaces() {
        HashMap hashMap = new HashMap();
        hashMap.put("ns0", "http://com/shenzhenair/mobilewebservice/payment");
        hashMap.put("ns2", "http://www.w3.org/2001/XMLSchema");
        hashMap.put("ns5", "http://schemas.xmlsoap.org/wsdl/soap/");
        hashMap.put("ns4", "http://impl.webservice.payment.shenzhenair.com/");
        hashMap.put("ns1", "http://schemas.xmlsoap.org/wsdl/");
        hashMap.put("ns3", "http://schemas.xmlsoap.org/soap/http");
        return hashMap;
    }

    public queryAliSecurityResponse queryAliSecurity(queryAliSecurity parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("queryAliSecurity", parameters);
        }
        queryAliSecurityResponse queryalisecurityresponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof queryAliSecurityResponse)) {
                    queryalisecurityresponse = (queryAliSecurityResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    queryalisecurityresponse = new queryAliSecurityResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    queryalisecurityresponse.setexception(new Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (queryalisecurityresponse != null) {
                return queryalisecurityresponse;
            }
            queryAliSecurityResponse queryalisecurityresponse2 = new queryAliSecurityResponse();
            queryalisecurityresponse2.setexception(new NullPointerException());
            return queryalisecurityresponse2;
        } catch (Exception e) {
            queryAliSecurityResponse queryalisecurityresponse3 = new queryAliSecurityResponse();
            queryalisecurityresponse3.setexception(e);
            return queryalisecurityresponse3;
        }
    }

    public queryAliPaymentResponse queryAliPayment(queryAliPayment parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("queryAliPayment", parameters);
        }
        queryAliPaymentResponse queryalipaymentresponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof queryAliPaymentResponse)) {
                    queryalipaymentresponse = (queryAliPaymentResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    queryalipaymentresponse = new queryAliPaymentResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    queryalipaymentresponse.setexception(new Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (queryalipaymentresponse != null) {
                return queryalipaymentresponse;
            }
            queryAliPaymentResponse queryalipaymentresponse2 = new queryAliPaymentResponse();
            queryalipaymentresponse2.setexception(new NullPointerException());
            return queryalipaymentresponse2;
        } catch (Exception e) {
            queryAliPaymentResponse queryalipaymentresponse3 = new queryAliPaymentResponse();
            queryalipaymentresponse3.setexception(e);
            return queryalipaymentresponse3;
        }
    }

    public getAuthCodeParamResponse getAuthCodeParam(getAuthCodeParam parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("getAuthCodeParam", parameters);
        }
        getAuthCodeParamResponse getauthcodeparamresponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof getAuthCodeParamResponse)) {
                    getauthcodeparamresponse = (getAuthCodeParamResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    getauthcodeparamresponse = new getAuthCodeParamResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    getauthcodeparamresponse.setexception(new Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (getauthcodeparamresponse != null) {
                return getauthcodeparamresponse;
            }
            getAuthCodeParamResponse getauthcodeparamresponse2 = new getAuthCodeParamResponse();
            getauthcodeparamresponse2.setexception(new NullPointerException());
            return getauthcodeparamresponse2;
        } catch (Exception e) {
            getAuthCodeParamResponse getauthcodeparamresponse3 = new getAuthCodeParamResponse();
            getauthcodeparamresponse3.setexception(e);
            return getauthcodeparamresponse3;
        }
    }
}