package com.common.szair.model.allchangedate;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPFault;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class RescheduleMktWebServiceServiceSoapBinding extends SOAPBinding {
    public RescheduleMktWebServiceServiceSoapBinding(String endpoint) {
        super(RescheduleMktWebServiceServiceSoapBinding.class.getPackage().getName(), endpoint);
    }

    @Override // com.common.szair.model.soap.SOAPBinding
    public Map<String, String> getNamespaces() {
        HashMap hashMap = new HashMap();
        hashMap.put("ns4", "http://schemas.xmlsoap.org/soap/http");
        hashMap.put("ns1", "http://www.w3.org/2001/XMLSchema");
        hashMap.put("ns2", "http://com/shenzhenair/mobilewebservice/rescheduleMktWebService");
        hashMap.put("ns3", "http://impl.webservice.allChannelReschedule.shenzhenair.com/");
        hashMap.put("ns0", "http://schemas.xmlsoap.org/wsdl/");
        hashMap.put("ns5", "http://schemas.xmlsoap.org/wsdl/soap/");
        return hashMap;
    }

    public com.common.szair.model.cancelcheckin.queryCheckInParamsResponse queryCheckInParams(com.common.szair.model.cancelcheckin.queryCheckInParams parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("queryCheckInParams", parameters);
        }
        com.common.szair.model.cancelcheckin.queryCheckInParamsResponse querycheckinparamsresponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof com.common.szair.model.cancelcheckin.queryCheckInParamsResponse)) {
                    querycheckinparamsresponse = (com.common.szair.model.cancelcheckin.queryCheckInParamsResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    querycheckinparamsresponse = new com.common.szair.model.cancelcheckin.queryCheckInParamsResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    querycheckinparamsresponse.setexception(new java.lang.Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (querycheckinparamsresponse != null) {
                return querycheckinparamsresponse;
            }
            com.common.szair.model.cancelcheckin.queryCheckInParamsResponse querycheckinparamsresponse2 = new com.common.szair.model.cancelcheckin.queryCheckInParamsResponse();
            querycheckinparamsresponse2.setexception(new NullPointerException());
            return querycheckinparamsresponse2;
        } catch (java.lang.Exception e) {
            com.common.szair.model.cancelcheckin.queryCheckInParamsResponse querycheckinparamsresponse3 = new com.common.szair.model.cancelcheckin.queryCheckInParamsResponse();
            querycheckinparamsresponse3.setexception(e);
            return querycheckinparamsresponse3;
        }
    }

    public sendCaptchaResponse sendCaptcha(sendCaptcha parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("sendCaptcha", parameters);
        }
        sendCaptchaResponse sendcaptcharesponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof sendCaptchaResponse)) {
                    sendcaptcharesponse = (sendCaptchaResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    sendcaptcharesponse = new sendCaptchaResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    sendcaptcharesponse.setexception(new java.lang.Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (sendcaptcharesponse != null) {
                return sendcaptcharesponse;
            }
            sendCaptchaResponse sendcaptcharesponse2 = new sendCaptchaResponse();
            sendcaptcharesponse2.setexception(new NullPointerException());
            return sendcaptcharesponse2;
        } catch (java.lang.Exception e) {
            sendCaptchaResponse sendcaptcharesponse3 = new sendCaptchaResponse();
            sendcaptcharesponse3.setexception(e);
            return sendcaptcharesponse3;
        }
    }

    public checkTripResponse checkTrip(checkTrip parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("checkTrip", parameters);
        }
        checkTripResponse checktripresponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof checkTripResponse)) {
                    checktripresponse = (checkTripResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    checktripresponse = new checkTripResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    checktripresponse.setexception(new java.lang.Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (checktripresponse != null) {
                return checktripresponse;
            }
            checkTripResponse checktripresponse2 = new checkTripResponse();
            checktripresponse2.setexception(new NullPointerException());
            return checktripresponse2;
        } catch (java.lang.Exception e) {
            checkTripResponse checktripresponse3 = new checkTripResponse();
            checktripresponse3.setexception(e);
            return checktripresponse3;
        }
    }

    public flightSearchResponse flightSearch(flightSearch parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("flightSearch", parameters);
        }
        flightSearchResponse flightsearchresponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof flightSearchResponse)) {
                    flightsearchresponse = (flightSearchResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    flightsearchresponse = new flightSearchResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    flightsearchresponse.setexception(new java.lang.Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (flightsearchresponse != null) {
                return flightsearchresponse;
            }
            flightSearchResponse flightsearchresponse2 = new flightSearchResponse();
            flightsearchresponse2.setexception(new NullPointerException());
            return flightsearchresponse2;
        } catch (java.lang.Exception e) {
            flightSearchResponse flightsearchresponse3 = new flightSearchResponse();
            flightsearchresponse3.setexception(e);
            return flightsearchresponse3;
        }
    }

    public addChildPartnerInfoResponse addChildPartnerInfo(addChildPartnerInfo parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("addChildPartnerInfo", parameters);
        }
        addChildPartnerInfoResponse addchildpartnerinforesponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof addChildPartnerInfoResponse)) {
                    addchildpartnerinforesponse = (addChildPartnerInfoResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    addchildpartnerinforesponse = new addChildPartnerInfoResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    addchildpartnerinforesponse.setexception(new java.lang.Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (addchildpartnerinforesponse != null) {
                return addchildpartnerinforesponse;
            }
            addChildPartnerInfoResponse addchildpartnerinforesponse2 = new addChildPartnerInfoResponse();
            addchildpartnerinforesponse2.setexception(new NullPointerException());
            return addchildpartnerinforesponse2;
        } catch (java.lang.Exception e) {
            addChildPartnerInfoResponse addchildpartnerinforesponse3 = new addChildPartnerInfoResponse();
            addchildpartnerinforesponse3.setexception(e);
            return addchildpartnerinforesponse3;
        }
    }

    public saveOrderResponse saveOrder(saveOrder parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("saveOrder", parameters);
        }
        saveOrderResponse saveorderresponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof saveOrderResponse)) {
                    saveorderresponse = (saveOrderResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    saveorderresponse = new saveOrderResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    saveorderresponse.setexception(new java.lang.Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (saveorderresponse != null) {
                return saveorderresponse;
            }
            saveOrderResponse saveorderresponse2 = new saveOrderResponse();
            saveorderresponse2.setexception(new NullPointerException());
            return saveorderresponse2;
        } catch (java.lang.Exception e) {
            saveOrderResponse saveorderresponse3 = new saveOrderResponse();
            saveorderresponse3.setexception(e);
            return saveorderresponse3;
        }
    }
}