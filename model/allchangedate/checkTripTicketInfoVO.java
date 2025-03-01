package com.common.szair.model.allchangedate;

import android.text.TextUtils;
import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class checkTripTicketInfoVO extends baseDTOVO implements SOAPObject, Serializable {
    public String _CERT_NO = null;
    public String _CERT_TYPE = null;
    public String _CLASS_CODE = null;
    public String _CONTACT = null;
    public String _CTCM = null;
    public String _CTCT = null;
    public List<String> _NON_VOLUNTARY_DATE_LIST = null;
    public String _NON_VOLUNTARY_END = null;
    public String _NON_VOLUNTARY_FLAG = null;
    public String _NON_VOLUNTARY_START = null;
    public String _ONWARD_TRANSIT_FLAG = null;
    public String _PASSENGER_NAME = null;
    public String _PASSENGER_TYPE = null;
    public String _PNR = null;
    public String _QUICK_AIRLINE_FLIGHT_FLG = null;
    public String _TICKET_NO = null;
    public ticketPriceVO _TICKET_PRICE_INFO = null;
    public String _WORK_ODER_FLAG = null;
    public Integer _YST_AFTER = null;
    public Integer _YST_BEFORE = null;
    public List<String> _YST_EXCLUDE_DATE = null;
    public String _YST_FLAG = null;
    public String _YST_TIP = null;
    public String _ORDER_SOURCE = null;
    public String _VOLUNTARY_ERROR = null;
    public String _SPECIAL_CHANGE_TIME = null;
    public String _YST_RULE_DETAIL = null;
    public String _PRIMARY_TIER_NAME = null;
    public String _SK_FLAG = null;
    public String _SPECIAL_CODE = null;
    public String _SPECIAL_TYPE = null;
    public rescheduleProtectFlightInfoVO _PROTECT_FLIGHTINFO_VO = null;
    public boolean isSelf = false;
    public List<String> ystDate = null;
    private java.lang.Exception _exception = null;

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/shenzhenair/mobilewebservice/rescheduleMktWebService";
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void setexception(java.lang.Exception _exception) {
        this._exception = _exception;
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public java.lang.Exception getexception() {
        return this._exception;
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void toXml(XmlSerializer xml, String name, String namespace) throws IOException {
        if (namespace == null || namespace.length() <= 0) {
            namespace = getNamespace();
        }
        xml.startTag(namespace, name);
        addAttributesToNode(xml);
        addElementsToNode(xml);
        xml.endTag(namespace, name);
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void addElementsToNode(XmlSerializer xml) throws IOException {
        if (this._CERT_NO != null) {
            xml.startTag(null, "CERT_NO");
            xml.text(this._CERT_NO);
            xml.endTag(null, "CERT_NO");
        }
        if (this._CERT_TYPE != null) {
            xml.startTag(null, "CERT_TYPE");
            xml.text(this._CERT_TYPE);
            xml.endTag(null, "CERT_TYPE");
        }
        if (this._CLASS_CODE != null) {
            xml.startTag(null, "CLASS_CODE");
            xml.text(this._CLASS_CODE);
            xml.endTag(null, "CLASS_CODE");
        }
        if (this._CONTACT != null) {
            xml.startTag(null, "CONTACT");
            xml.text(this._CONTACT);
            xml.endTag(null, "CONTACT");
        }
        if (this._CTCM != null) {
            xml.startTag(null, "CTCM");
            xml.text(this._CTCM);
            xml.endTag(null, "CTCM");
        }
        if (this._CTCT != null) {
            xml.startTag(null, "CTCT");
            xml.text(this._CTCT);
            xml.endTag(null, "CTCT");
        }
        if (this._SK_FLAG != null) {
            xml.startTag(null, "SK_FLAG");
            xml.text(this._SK_FLAG);
            xml.endTag(null, "SK_FLAG");
        }
        List<String> list = this._NON_VOLUNTARY_DATE_LIST;
        if (list != null && list.size() > 0) {
            int size = this._NON_VOLUNTARY_DATE_LIST.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "NON_VOLUNTARY_DATE_LIST");
                xml.text(this._NON_VOLUNTARY_DATE_LIST.get(i));
                xml.endTag(null, "NON_VOLUNTARY_DATE_LIST");
            }
        }
        if (this._NON_VOLUNTARY_END != null) {
            xml.startTag(null, "NON_VOLUNTARY_END");
            xml.text(this._NON_VOLUNTARY_END);
            xml.endTag(null, "NON_VOLUNTARY_END");
        }
        if (this._PROTECT_FLIGHTINFO_VO != null) {
            xml.startTag(null, "PROTECT_FLIGHTINFO_VO");
            this._PROTECT_FLIGHTINFO_VO.addElementsToNode(xml);
            xml.endTag(null, "PROTECT_FLIGHTINFO_VO");
        }
        if (this._NON_VOLUNTARY_FLAG != null) {
            xml.startTag(null, "NON_VOLUNTARY_FLAG");
            xml.text(this._NON_VOLUNTARY_FLAG);
            xml.endTag(null, "NON_VOLUNTARY_FLAG");
        }
        if (this._NON_VOLUNTARY_START != null) {
            xml.startTag(null, "NON_VOLUNTARY_START");
            xml.text(this._NON_VOLUNTARY_START);
            xml.endTag(null, "NON_VOLUNTARY_START");
        }
        if (this._ONWARD_TRANSIT_FLAG != null) {
            xml.startTag(null, "ONWARD_TRANSIT_FLAG");
            xml.text(this._ONWARD_TRANSIT_FLAG);
            xml.endTag(null, "ONWARD_TRANSIT_FLAG");
        }
        if (this._PASSENGER_NAME != null) {
            xml.startTag(null, "PASSENGER_NAME");
            xml.text(this._PASSENGER_NAME);
            xml.endTag(null, "PASSENGER_NAME");
        }
        if (this._PASSENGER_TYPE != null) {
            xml.startTag(null, "PASSENGER_TYPE");
            xml.text(this._PASSENGER_TYPE);
            xml.endTag(null, "PASSENGER_TYPE");
        }
        if (this._PNR != null) {
            xml.startTag(null, "PNR");
            xml.text(this._PNR);
            xml.endTag(null, "PNR");
        }
        if (this._QUICK_AIRLINE_FLIGHT_FLG != null) {
            xml.startTag(null, "QUICK_AIRLINE_FLIGHT_FLG");
            xml.text(this._QUICK_AIRLINE_FLIGHT_FLG);
            xml.endTag(null, "QUICK_AIRLINE_FLIGHT_FLG");
        }
        if (this._TICKET_NO != null) {
            xml.startTag(null, "TICKET_NO");
            xml.text(this._TICKET_NO);
            xml.endTag(null, "TICKET_NO");
        }
        if (this._TICKET_PRICE_INFO != null) {
            xml.startTag(null, "TICKET_PRICE_INFO");
            this._TICKET_PRICE_INFO.addElementsToNode(xml);
            xml.endTag(null, "TICKET_PRICE_INFO");
        }
        if (this._WORK_ODER_FLAG != null) {
            xml.startTag(null, "WORK_ODER_FLAG");
            xml.text(this._WORK_ODER_FLAG);
            xml.endTag(null, "WORK_ODER_FLAG");
        }
        if (this._YST_AFTER != null) {
            xml.startTag(null, "YST_AFTER");
            xml.text(String.valueOf(this._YST_AFTER));
            xml.endTag(null, "YST_AFTER");
        }
        if (this._YST_BEFORE != null) {
            xml.startTag(null, "YST_BEFORE");
            xml.text(String.valueOf(this._YST_BEFORE));
            xml.endTag(null, "YST_BEFORE");
        }
        List<String> list2 = this._YST_EXCLUDE_DATE;
        if (list2 != null && list2.size() > 0) {
            int size2 = this._YST_EXCLUDE_DATE.size();
            for (int i2 = 0; i2 < size2; i2++) {
                xml.startTag(null, "YST_EXCLUDE_DATE");
                xml.text(this._YST_EXCLUDE_DATE.get(i2));
                xml.endTag(null, "YST_EXCLUDE_DATE");
            }
        }
        if (this._YST_FLAG != null) {
            xml.startTag(null, "YST_FLAG");
            xml.text(this._YST_FLAG);
            xml.endTag(null, "YST_FLAG");
        }
        if (this._SPECIAL_CODE != null) {
            xml.startTag(null, "SPECIAL_CODE");
            xml.text(this._SPECIAL_CODE);
            xml.endTag(null, "SPECIAL_CODE");
        }
        if (this._SPECIAL_TYPE != null) {
            xml.startTag(null, "SPECIAL_TYPE");
            xml.text(this._SPECIAL_TYPE);
            xml.endTag(null, "SPECIAL_TYPE");
        }
        if (this._YST_TIP != null) {
            xml.startTag(null, "YST_TIP");
            xml.text(this._YST_TIP);
            xml.endTag(null, "YST_TIP");
        }
        if (this._ORDER_SOURCE != null) {
            xml.startTag(null, "ORDER_SOURCE");
            xml.text(this._ORDER_SOURCE);
            xml.endTag(null, "ORDER_SOURCE");
        }
        if (this._VOLUNTARY_ERROR != null) {
            xml.startTag(null, "VOLUNTARY_ERROR");
            xml.text(this._VOLUNTARY_ERROR);
            xml.endTag(null, "VOLUNTARY_ERROR");
        }
        if (this._SPECIAL_CHANGE_TIME != null) {
            xml.startTag(null, "SPECIAL_CHANGE_TIME");
            xml.text(this._SPECIAL_CHANGE_TIME);
            xml.endTag(null, "SPECIAL_CHANGE_TIME");
        }
        if (this._YST_RULE_DETAIL != null) {
            xml.startTag(null, "YST_RULE_DETAIL");
            xml.text(this._YST_RULE_DETAIL);
            xml.endTag(null, "YST_RULE_DETAIL");
        }
        if (this._PRIMARY_TIER_NAME != null) {
            xml.startTag(null, "PRIMARY_TIER_NAME");
            xml.text(this._PRIMARY_TIER_NAME);
            xml.endTag(null, "PRIMARY_TIER_NAME");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("CERT_NO".equals(parser.getName())) {
                        this._CERT_NO = parser.nextText();
                    } else if ("CERT_TYPE".equals(parser.getName())) {
                        this._CERT_TYPE = parser.nextText();
                    } else if ("CLASS_CODE".equals(parser.getName())) {
                        this._CLASS_CODE = parser.nextText();
                    } else if ("CONTACT".equals(parser.getName())) {
                        this._CONTACT = parser.nextText();
                    } else if ("CTCM".equals(parser.getName())) {
                        this._CTCM = parser.nextText();
                    } else if ("CTCT".equals(parser.getName())) {
                        this._CTCT = parser.nextText();
                    } else if ("NON_VOLUNTARY_DATE_LIST".equals(parser.getName())) {
                        if (this._NON_VOLUNTARY_DATE_LIST == null) {
                            this._NON_VOLUNTARY_DATE_LIST = new ArrayList();
                        }
                        this._NON_VOLUNTARY_DATE_LIST.add(parser.nextText());
                    } else if ("NON_VOLUNTARY_END".equals(parser.getName())) {
                        this._NON_VOLUNTARY_END = parser.nextText();
                    } else if ("NON_VOLUNTARY_FLAG".equals(parser.getName())) {
                        this._NON_VOLUNTARY_FLAG = parser.nextText();
                    } else if ("NON_VOLUNTARY_START".equals(parser.getName())) {
                        this._NON_VOLUNTARY_START = parser.nextText();
                    } else if ("PROTECT_FLIGHTINFO_VO".equals(parser.getName())) {
                        rescheduleProtectFlightInfoVO rescheduleprotectflightinfovo = new rescheduleProtectFlightInfoVO();
                        rescheduleprotectflightinfovo.parse(binding, parser);
                        this._PROTECT_FLIGHTINFO_VO = rescheduleprotectflightinfovo;
                    } else if ("ONWARD_TRANSIT_FLAG".equals(parser.getName())) {
                        this._ONWARD_TRANSIT_FLAG = parser.nextText();
                    } else if ("PASSENGER_NAME".equals(parser.getName())) {
                        this._PASSENGER_NAME = parser.nextText();
                    } else if ("SPECIAL_CODE".equals(parser.getName())) {
                        this._SPECIAL_CODE = parser.nextText();
                    } else if ("SPECIAL_TYPE".equals(parser.getName())) {
                        this._SPECIAL_TYPE = parser.nextText();
                    } else if ("PASSENGER_TYPE".equals(parser.getName())) {
                        this._PASSENGER_TYPE = parser.nextText();
                    } else if ("PNR".equals(parser.getName())) {
                        this._PNR = parser.nextText();
                    } else if ("QUICK_AIRLINE_FLIGHT_FLG".equals(parser.getName())) {
                        this._QUICK_AIRLINE_FLIGHT_FLG = parser.nextText();
                    } else if ("TICKET_NO".equals(parser.getName())) {
                        this._TICKET_NO = parser.nextText();
                    } else if ("SK_FLAG".equals(parser.getName())) {
                        this._SK_FLAG = parser.nextText();
                    } else if ("TICKET_PRICE_INFO".equals(parser.getName())) {
                        ticketPriceVO ticketpricevo = new ticketPriceVO();
                        ticketpricevo.parse(binding, parser);
                        this._TICKET_PRICE_INFO = ticketpricevo;
                    } else if ("WORK_ODER_FLAG".equals(parser.getName())) {
                        this._WORK_ODER_FLAG = parser.nextText();
                    } else if ("YST_AFTER".equals(parser.getName())) {
                        this._YST_AFTER = Integer.valueOf(parser.nextText());
                    } else if ("YST_BEFORE".equals(parser.getName())) {
                        this._YST_BEFORE = Integer.valueOf(parser.nextText());
                    } else if ("YST_EXCLUDE_DATE".equals(parser.getName())) {
                        if (this._YST_EXCLUDE_DATE == null) {
                            this._YST_EXCLUDE_DATE = new ArrayList();
                        }
                        this._YST_EXCLUDE_DATE.add(parser.nextText());
                    } else if ("YST_FLAG".equals(parser.getName())) {
                        this._YST_FLAG = parser.nextText();
                    } else if ("YST_TIP".equals(parser.getName())) {
                        this._YST_TIP = parser.nextText();
                    } else if ("ORDER_SOURCE".equals(parser.getName())) {
                        String nextText = parser.nextText();
                        this._ORDER_SOURCE = nextText;
                        if (!TextUtils.isEmpty(nextText)) {
                            this._ORDER_SOURCE = this._ORDER_SOURCE.toUpperCase();
                        }
                    } else if ("VOLUNTARY_ERROR".equals(parser.getName())) {
                        this._VOLUNTARY_ERROR = parser.nextText();
                    } else if ("SPECIAL_CHANGE_TIME".equals(parser.getName())) {
                        this._SPECIAL_CHANGE_TIME = parser.nextText();
                    } else if ("YST_RULE_DETAIL".equals(parser.getName())) {
                        this._YST_RULE_DETAIL = parser.nextText();
                    } else if ("PRIMARY_TIER_NAME".equals(parser.getName())) {
                        this._PRIMARY_TIER_NAME = parser.nextText();
                    } else {
                        new UnknownSOAPObject().parse(binding, parser);
                    }
                }
                next = parser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}