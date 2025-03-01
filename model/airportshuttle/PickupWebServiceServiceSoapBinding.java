package com.common.szair.model.airportshuttle;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPFault;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class PickupWebServiceServiceSoapBinding extends SOAPBinding {
    public PickupWebServiceServiceSoapBinding(String endpoint) {
        super(PickupWebServiceServiceSoapBinding.class.getPackage().getName(), endpoint);
    }

    @Override // com.common.szair.model.soap.SOAPBinding
    public Map<String, String> getNamespaces() {
        HashMap hashMap = new HashMap();
        hashMap.put("ns2", "http://www.w3.org/2001/XMLSchema");
        hashMap.put("ns0", "http://com/shenzhenair/mobilewebservice/pickup");
        hashMap.put("ns5", "http://schemas.xmlsoap.org/wsdl/soap/");
        hashMap.put("ns1", "http://schemas.xmlsoap.org/wsdl/");
        hashMap.put("ns3", "http://schemas.xmlsoap.org/soap/http");
        hashMap.put("ns4", "http://impl.webservice.pickup.shenzhenair.com/");
        return hashMap;
    }

    public searchPickupCardInfoResponse searchPickupCardInfo(searchPickupCardInfo parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("searchPickupCardInfo", parameters);
        }
        searchPickupCardInfoResponse searchpickupcardinforesponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof searchPickupCardInfoResponse)) {
                    searchpickupcardinforesponse = (searchPickupCardInfoResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    searchpickupcardinforesponse = new searchPickupCardInfoResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    searchpickupcardinforesponse.setexception(new Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (searchpickupcardinforesponse != null) {
                return searchpickupcardinforesponse;
            }
            searchPickupCardInfoResponse searchpickupcardinforesponse2 = new searchPickupCardInfoResponse();
            searchpickupcardinforesponse2.setexception(new NullPointerException());
            return searchpickupcardinforesponse2;
        } catch (Exception e) {
            searchPickupCardInfoResponse searchpickupcardinforesponse3 = new searchPickupCardInfoResponse();
            searchpickupcardinforesponse3.setexception(e);
            return searchpickupcardinforesponse3;
        }
    }

    public getUsedAddressResponse getUsedAddress(getUsedAddress parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("getUsedAddress", parameters);
        }
        getUsedAddressResponse getusedaddressresponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof getUsedAddressResponse)) {
                    getusedaddressresponse = (getUsedAddressResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    getusedaddressresponse = new getUsedAddressResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    getusedaddressresponse.setexception(new Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (getusedaddressresponse != null) {
                return getusedaddressresponse;
            }
            getUsedAddressResponse getusedaddressresponse2 = new getUsedAddressResponse();
            getusedaddressresponse2.setexception(new NullPointerException());
            return getusedaddressresponse2;
        } catch (Exception e) {
            getUsedAddressResponse getusedaddressresponse3 = new getUsedAddressResponse();
            getusedaddressresponse3.setexception(e);
            return getusedaddressresponse3;
        }
    }

    public saveUsedAddressResponse saveUsedAddress(saveUsedAddress parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("saveUsedAddress", parameters);
        }
        saveUsedAddressResponse saveusedaddressresponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof saveUsedAddressResponse)) {
                    saveusedaddressresponse = (saveUsedAddressResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    saveusedaddressresponse = new saveUsedAddressResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    saveusedaddressresponse.setexception(new Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (saveusedaddressresponse != null) {
                return saveusedaddressresponse;
            }
            saveUsedAddressResponse saveusedaddressresponse2 = new saveUsedAddressResponse();
            saveusedaddressresponse2.setexception(new NullPointerException());
            return saveusedaddressresponse2;
        } catch (Exception e) {
            saveUsedAddressResponse saveusedaddressresponse3 = new saveUsedAddressResponse();
            saveusedaddressresponse3.setexception(e);
            return saveusedaddressresponse3;
        }
    }

    public searchPickupResponse searchPickup(searchPickup parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("searchPickup", parameters);
        }
        searchPickupResponse searchpickupresponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof searchPickupResponse)) {
                    searchpickupresponse = (searchPickupResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    searchpickupresponse = new searchPickupResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    searchpickupresponse.setexception(new Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (searchpickupresponse != null) {
                return searchpickupresponse;
            }
            searchPickupResponse searchpickupresponse2 = new searchPickupResponse();
            searchpickupresponse2.setexception(new NullPointerException());
            return searchpickupresponse2;
        } catch (Exception e) {
            searchPickupResponse searchpickupresponse3 = new searchPickupResponse();
            searchpickupresponse3.setexception(e);
            return searchpickupresponse3;
        }
    }

    public updatePickupResponse updatePickup(updatePickup parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("updatePickup", parameters);
        }
        updatePickupResponse updatepickupresponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof updatePickupResponse)) {
                    updatepickupresponse = (updatePickupResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    updatepickupresponse = new updatePickupResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    updatepickupresponse.setexception(new Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (updatepickupresponse != null) {
                return updatepickupresponse;
            }
            updatePickupResponse updatepickupresponse2 = new updatePickupResponse();
            updatepickupresponse2.setexception(new NullPointerException());
            return updatepickupresponse2;
        } catch (Exception e) {
            updatePickupResponse updatepickupresponse3 = new updatePickupResponse();
            updatepickupresponse3.setexception(e);
            return updatepickupresponse3;
        }
    }

    public checkPickupCaptchaResponse checkPickupCaptcha(checkPickupCaptcha parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("checkPickupCaptcha", parameters);
        }
        checkPickupCaptchaResponse checkpickupcaptcharesponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof checkPickupCaptchaResponse)) {
                    checkpickupcaptcharesponse = (checkPickupCaptchaResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    checkpickupcaptcharesponse = new checkPickupCaptchaResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    checkpickupcaptcharesponse.setexception(new Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (checkpickupcaptcharesponse != null) {
                return checkpickupcaptcharesponse;
            }
            checkPickupCaptchaResponse checkpickupcaptcharesponse2 = new checkPickupCaptchaResponse();
            checkpickupcaptcharesponse2.setexception(new NullPointerException());
            return checkpickupcaptcharesponse2;
        } catch (Exception e) {
            checkPickupCaptchaResponse checkpickupcaptcharesponse3 = new checkPickupCaptchaResponse();
            checkpickupcaptcharesponse3.setexception(e);
            return checkpickupcaptcharesponse3;
        }
    }

    public sendPickupCaptchaResponse sendPickupCaptcha(sendPickupCaptcha parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("sendPickupCaptcha", parameters);
        }
        sendPickupCaptchaResponse sendpickupcaptcharesponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof sendPickupCaptchaResponse)) {
                    sendpickupcaptcharesponse = (sendPickupCaptchaResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    sendpickupcaptcharesponse = new sendPickupCaptchaResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    sendpickupcaptcharesponse.setexception(new Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (sendpickupcaptcharesponse != null) {
                return sendpickupcaptcharesponse;
            }
            sendPickupCaptchaResponse sendpickupcaptcharesponse2 = new sendPickupCaptchaResponse();
            sendpickupcaptcharesponse2.setexception(new NullPointerException());
            return sendpickupcaptcharesponse2;
        } catch (Exception e) {
            sendPickupCaptchaResponse sendpickupcaptcharesponse3 = new sendPickupCaptchaResponse();
            sendpickupcaptcharesponse3.setexception(e);
            return sendpickupcaptcharesponse3;
        }
    }

    public searchPickupStockResponse searchPickupStock(searchPickupStock parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("searchPickupStock", parameters);
        }
        searchPickupStockResponse searchpickupstockresponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof searchPickupStockResponse)) {
                    searchpickupstockresponse = (searchPickupStockResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    searchpickupstockresponse = new searchPickupStockResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    searchpickupstockresponse.setexception(new Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (searchpickupstockresponse != null) {
                return searchpickupstockresponse;
            }
            searchPickupStockResponse searchpickupstockresponse2 = new searchPickupStockResponse();
            searchpickupstockresponse2.setexception(new NullPointerException());
            return searchpickupstockresponse2;
        } catch (Exception e) {
            searchPickupStockResponse searchpickupstockresponse3 = new searchPickupStockResponse();
            searchpickupstockresponse3.setexception(e);
            return searchpickupstockresponse3;
        }
    }

    public deleteUsedAddressResponse deleteUsedAddress(deleteUsedAddress parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("deleteUsedAddress", parameters);
        }
        deleteUsedAddressResponse deleteusedaddressresponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof deleteUsedAddressResponse)) {
                    deleteusedaddressresponse = (deleteUsedAddressResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    deleteusedaddressresponse = new deleteUsedAddressResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    deleteusedaddressresponse.setexception(new Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (deleteusedaddressresponse != null) {
                return deleteusedaddressresponse;
            }
            deleteUsedAddressResponse deleteusedaddressresponse2 = new deleteUsedAddressResponse();
            deleteusedaddressresponse2.setexception(new NullPointerException());
            return deleteusedaddressresponse2;
        } catch (Exception e) {
            deleteUsedAddressResponse deleteusedaddressresponse3 = new deleteUsedAddressResponse();
            deleteusedaddressresponse3.setexception(e);
            return deleteusedaddressresponse3;
        }
    }

    public searchMapByAddressResponse searchMapByAddress(searchMapByAddress parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("searchMapByAddress", parameters);
        }
        searchMapByAddressResponse searchmapbyaddressresponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof searchMapByAddressResponse)) {
                    searchmapbyaddressresponse = (searchMapByAddressResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    searchmapbyaddressresponse = new searchMapByAddressResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    searchmapbyaddressresponse.setexception(new Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (searchmapbyaddressresponse != null) {
                return searchmapbyaddressresponse;
            }
            searchMapByAddressResponse searchmapbyaddressresponse2 = new searchMapByAddressResponse();
            searchmapbyaddressresponse2.setexception(new NullPointerException());
            return searchmapbyaddressresponse2;
        } catch (Exception e) {
            searchMapByAddressResponse searchmapbyaddressresponse3 = new searchMapByAddressResponse();
            searchmapbyaddressresponse3.setexception(e);
            return searchmapbyaddressresponse3;
        }
    }

    public getDistanceResponse getDistance(getDistance parameters) {
        HashMap hashMap = new HashMap();
        if (parameters != null) {
            hashMap.put("getDistance", parameters);
        }
        getDistanceResponse getdistanceresponse = null;
        try {
            Iterator<Object> it = makeRequest(hashMap).bodyElements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null && (next instanceof getDistanceResponse)) {
                    getdistanceresponse = (getDistanceResponse) next;
                    break;
                }
                if (next != null && (next instanceof SOAPFault)) {
                    getdistanceresponse = new getDistanceResponse();
                    SOAPFault sOAPFault = (SOAPFault) next;
                    getdistanceresponse.setexception(new Exception(sOAPFault.getfaultcode(), new Throwable(sOAPFault.getfaultstring())));
                    break;
                }
            }
            if (getdistanceresponse != null) {
                return getdistanceresponse;
            }
            getDistanceResponse getdistanceresponse2 = new getDistanceResponse();
            getdistanceresponse2.setexception(new NullPointerException());
            return getdistanceresponse2;
        } catch (Exception e) {
            getDistanceResponse getdistanceresponse3 = new getDistanceResponse();
            getdistanceresponse3.setexception(e);
            return getdistanceresponse3;
        }
    }
}