package com.common.szair.model.alilogin;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPFault;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class AlipayUserinfoShareWebServiceImplServiceSoapBinding extends SOAPBinding {
    public AlipayUserinfoShareWebServiceImplServiceSoapBinding(String endpoint) {
        super(AlipayUserinfoShareWebServiceImplServiceSoapBinding.class.getPackage().getName(), endpoint);
    }

    @Override // com.common.szair.model.soap.SOAPBinding
    public Map<String, String> getNamespaces() {
        HashMap hashMap = new HashMap();
        hashMap.put("ns2", "http://com/szcares/member/webservice/userinfoShare");
        hashMap.put("ns4", "http://schemas.xmlsoap.org/soap/http");
        hashMap.put("ns1", "http://www.w3.org/2001/XMLSchema");
        hashMap.put("ns3", "http://impl.webservice.member.szcares.com/");
        hashMap.put("ns0", "http://schemas.xmlsoap.org/wsdl/");
        hashMap.put("ns5", "http://schemas.xmlsoap.org/wsdl/soap/");
        return hashMap;
    }

    public shareAlipayUserinfoResponse shareAlipayUserinfo(shareAlipayUserinfo parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("shareAlipayUserinfo", parameters);
        }
        shareAlipayUserinfoResponse sharealipayuserinforesponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof shareAlipayUserinfoResponse)) {
                    sharealipayuserinforesponse = (shareAlipayUserinfoResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    sharealipayuserinforesponse = new shareAlipayUserinfoResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    sharealipayuserinforesponse.setexception(new Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (sharealipayuserinforesponse != null) {
                return sharealipayuserinforesponse;
            }
            shareAlipayUserinfoResponse sharealipayuserinforesponse2 = new shareAlipayUserinfoResponse();
            sharealipayuserinforesponse2.setexception(new NullPointerException());
            return sharealipayuserinforesponse2;
        } catch (Exception e) {
            shareAlipayUserinfoResponse sharealipayuserinforesponse3 = new shareAlipayUserinfoResponse();
            sharealipayuserinforesponse3.setexception(e);
            return sharealipayuserinforesponse3;
        }
    }

    public alipayIdentifyResponse alipayIdentify(alipayIdentify parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("alipayIdentify", parameters);
        }
        alipayIdentifyResponse alipayidentifyresponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof alipayIdentifyResponse)) {
                    alipayidentifyresponse = (alipayIdentifyResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    alipayidentifyresponse = new alipayIdentifyResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    alipayidentifyresponse.setexception(new Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (alipayidentifyresponse != null) {
                return alipayidentifyresponse;
            }
            alipayIdentifyResponse alipayidentifyresponse2 = new alipayIdentifyResponse();
            alipayidentifyresponse2.setexception(new NullPointerException());
            return alipayidentifyresponse2;
        } catch (Exception e) {
            alipayIdentifyResponse alipayidentifyresponse3 = new alipayIdentifyResponse();
            alipayidentifyresponse3.setexception(e);
            return alipayidentifyresponse3;
        }
    }
}