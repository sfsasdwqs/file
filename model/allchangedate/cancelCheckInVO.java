package com.common.szair.model.allchangedate;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class cancelCheckInVO extends baseDTOVO implements SOAPObject {
    public String _ARRIVE_CITY = null;
    public String _ID_NO = null;
    public String _ID_TYPE = null;
    public String _CODE = null;
    public String _DEP_TIME = null;
    public String _DEPARTURE_CITY = null;
    public String _EDI_ET_CODE = null;
    public String _ET_CODE = null;
    public String _FLIGHT_DATE = null;
    public String _FLIGHT_NO = null;
    public String _ORG_CITY = null;
    public String _ORDER_NO = null;
    public List<rescheduleCommitOrderPassengerInfoVO> _PASSENGER_INFO_LIST = null;
    public String _PHONE_NO = null;
    public String _PSGR_NAME = null;
    public String _PSGR_TYPE = null;
    public String _RETURN_CODE = null;
    public String _SEAT_NO = null;
    public String _SEG_UUID = null;
    public String _DST_CITY = null;
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
        if (this._ARRIVE_CITY != null) {
            xml.startTag(null, "ARRIVE_CITY");
            xml.text(this._ARRIVE_CITY);
            xml.endTag(null, "ARRIVE_CITY");
        }
        if (this._ID_NO != null) {
            xml.startTag(null, "ID_NO");
            xml.text(this._ID_NO);
            xml.endTag(null, "ID_NO");
        }
        if (this._ID_TYPE != null) {
            xml.startTag(null, "ID_TYPE");
            xml.text(this._ID_TYPE);
            xml.endTag(null, "ID_TYPE");
        }
        if (this._CODE != null) {
            xml.startTag(null, "CODE");
            xml.text(this._CODE);
            xml.endTag(null, "CODE");
        }
        if (this._DEP_TIME != null) {
            xml.startTag(null, "DEP_TIME");
            xml.text(this._DEP_TIME);
            xml.endTag(null, "DEP_TIME");
        }
        if (this._DEPARTURE_CITY != null) {
            xml.startTag(null, "DEPARTURE_CITY");
            xml.text(this._DEPARTURE_CITY);
            xml.endTag(null, "DEPARTURE_CITY");
        }
        if (this._EDI_ET_CODE != null) {
            xml.startTag(null, "EDI_ET_CODE");
            xml.text(this._EDI_ET_CODE);
            xml.endTag(null, "EDI_ET_CODE");
        }
        if (this._ET_CODE != null) {
            xml.startTag(null, "ET_CODE");
            xml.text(this._ET_CODE);
            xml.endTag(null, "ET_CODE");
        }
        if (this._FLIGHT_DATE != null) {
            xml.startTag(null, "FLIGHT_DATE");
            xml.text(this._FLIGHT_DATE);
            xml.endTag(null, "FLIGHT_DATE");
        }
        if (this._FLIGHT_NO != null) {
            xml.startTag(null, "FLIGHT_NO");
            xml.text(this._FLIGHT_NO);
            xml.endTag(null, "FLIGHT_NO");
        }
        if (this._ORG_CITY != null) {
            xml.startTag(null, "ORG_CITY");
            xml.text(this._ORG_CITY);
            xml.endTag(null, "ORG_CITY");
        }
        if (this._ORDER_NO != null) {
            xml.startTag(null, "ORDER_NO");
            xml.text(this._ORDER_NO);
            xml.endTag(null, "ORDER_NO");
        }
        List<rescheduleCommitOrderPassengerInfoVO> list = this._PASSENGER_INFO_LIST;
        if (list != null && list.size() > 0) {
            int size = this._PASSENGER_INFO_LIST.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "PASSENGER_INFO_LIST");
                this._PASSENGER_INFO_LIST.get(i).addElementsToNode(xml);
                xml.endTag(null, "PASSENGER_INFO_LIST");
            }
        }
        if (this._PHONE_NO != null) {
            xml.startTag(null, "PHONE_NO");
            xml.text(this._PHONE_NO);
            xml.endTag(null, "PHONE_NO");
        }
        if (this._PSGR_NAME != null) {
            xml.startTag(null, "PSGR_NAME");
            xml.text(this._PSGR_NAME);
            xml.endTag(null, "PSGR_NAME");
        }
        if (this._PSGR_TYPE != null) {
            xml.startTag(null, "PSGR_TYPE");
            xml.text(this._PSGR_TYPE);
            xml.endTag(null, "PSGR_TYPE");
        }
        if (this._RETURN_CODE != null) {
            xml.startTag(null, "RETURN_CODE");
            xml.text(this._RETURN_CODE);
            xml.endTag(null, "RETURN_CODE");
        }
        if (this._SEAT_NO != null) {
            xml.startTag(null, "SEAT_NO");
            xml.text(this._SEAT_NO);
            xml.endTag(null, "SEAT_NO");
        }
        if (this._SEG_UUID != null) {
            xml.startTag(null, "SEG_UUID");
            xml.text(this._SEG_UUID);
            xml.endTag(null, "SEG_UUID");
        }
        if (this._DST_CITY != null) {
            xml.startTag(null, "DST_CITY");
            xml.text(this._DST_CITY);
            xml.endTag(null, "DST_CITY");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("ARRIVE_CITY".equals(parser.getName())) {
                        this._ARRIVE_CITY = parser.nextText();
                    } else if ("ID_NO".equals(parser.getName())) {
                        this._ID_NO = parser.nextText();
                    } else if ("ID_TYPE".equals(parser.getName())) {
                        this._ID_TYPE = parser.nextText();
                    } else if ("CODE".equals(parser.getName())) {
                        this._CODE = parser.nextText();
                    } else if ("DEP_TIME".equals(parser.getName())) {
                        this._DEP_TIME = parser.nextText();
                    } else if ("DEPARTURE_CITY".equals(parser.getName())) {
                        this._DEPARTURE_CITY = parser.nextText();
                    } else if ("EDI_ET_CODE".equals(parser.getName())) {
                        this._EDI_ET_CODE = parser.nextText();
                    } else if ("ET_CODE".equals(parser.getName())) {
                        this._ET_CODE = parser.nextText();
                    } else if ("FLIGHT_DATE".equals(parser.getName())) {
                        this._FLIGHT_DATE = parser.nextText();
                    } else if ("FLIGHT_NO".equals(parser.getName())) {
                        this._FLIGHT_NO = parser.nextText();
                    } else if ("ORG_CITY".equals(parser.getName())) {
                        this._ORG_CITY = parser.nextText();
                    } else if ("ORDER_NO".equals(parser.getName())) {
                        this._ORDER_NO = parser.nextText();
                    } else if ("PASSENGER_INFO_LIST".equals(parser.getName())) {
                        if (this._PASSENGER_INFO_LIST == null) {
                            this._PASSENGER_INFO_LIST = new ArrayList();
                        }
                        rescheduleCommitOrderPassengerInfoVO reschedulecommitorderpassengerinfovo = new rescheduleCommitOrderPassengerInfoVO();
                        reschedulecommitorderpassengerinfovo.parse(binding, parser);
                        this._PASSENGER_INFO_LIST.add(reschedulecommitorderpassengerinfovo);
                    } else if ("PHONE_NO".equals(parser.getName())) {
                        this._PHONE_NO = parser.nextText();
                    } else if ("PSGR_NAME".equals(parser.getName())) {
                        this._PSGR_NAME = parser.nextText();
                    } else if ("PSGR_TYPE".equals(parser.getName())) {
                        this._PSGR_TYPE = parser.nextText();
                    } else if ("RETURN_CODE".equals(parser.getName())) {
                        this._RETURN_CODE = parser.nextText();
                    } else if ("SEAT_NO".equals(parser.getName())) {
                        this._SEAT_NO = parser.nextText();
                    } else if ("SEG_UUID".equals(parser.getName())) {
                        this._SEG_UUID = parser.nextText();
                    } else if ("DST_CITY".equals(parser.getName())) {
                        this._DST_CITY = parser.nextText();
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