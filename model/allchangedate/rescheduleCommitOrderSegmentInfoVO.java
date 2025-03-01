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
public class rescheduleCommitOrderSegmentInfoVO extends baseDTOVO implements SOAPObject {
    public String _AC_TYPE = null;
    public String _CARRIER_FLIGHT_NO = null;
    public String _DST_DATE = null;
    public String _DST_TIME = null;
    public String _DST_CITY = null;
    public String _ORG_DATE = null;
    public String _FLIGHT_NO = null;
    public String _ORG_TIME = null;
    public String _IS_CODE_SHARE = null;
    public String _MEAL = null;
    public String _ORG_CITY = null;
    public List<rescheduleCommitOrderPassengerInfoVO> _PASSENGER_INFO_LIST = null;
    public String _SEG_UUID = null;
    public String _STOP_CITY = null;
    private java.lang.Exception _exception = null;

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/shenzhenair/mobilewebservice/allChannelTicketReschedule";
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
        if (this._AC_TYPE != null) {
            xml.startTag(null, "AC_TYPE");
            xml.text(this._AC_TYPE);
            xml.endTag(null, "AC_TYPE");
        }
        if (this._CARRIER_FLIGHT_NO != null) {
            xml.startTag(null, "CARRIER_FLIGHT_NO");
            xml.text(this._CARRIER_FLIGHT_NO);
            xml.endTag(null, "CARRIER_FLIGHT_NO");
        }
        if (this._DST_DATE != null) {
            xml.startTag(null, "DST_DATE");
            xml.text(this._DST_DATE);
            xml.endTag(null, "DST_DATE");
        }
        if (this._DST_TIME != null) {
            xml.startTag(null, "DST_TIME");
            xml.text(this._DST_TIME);
            xml.endTag(null, "DST_TIME");
        }
        if (this._DST_CITY != null) {
            xml.startTag(null, "DST_CITY");
            xml.text(this._DST_CITY);
            xml.endTag(null, "DST_CITY");
        }
        if (this._ORG_DATE != null) {
            xml.startTag(null, "ORG_DATE");
            xml.text(this._ORG_DATE);
            xml.endTag(null, "ORG_DATE");
        }
        if (this._FLIGHT_NO != null) {
            xml.startTag(null, "FLIGHT_NO");
            xml.text(this._FLIGHT_NO);
            xml.endTag(null, "FLIGHT_NO");
        }
        if (this._ORG_TIME != null) {
            xml.startTag(null, "ORG_TIME");
            xml.text(this._ORG_TIME);
            xml.endTag(null, "ORG_TIME");
        }
        if (this._IS_CODE_SHARE != null) {
            xml.startTag(null, "IS_CODE_SHARE");
            xml.text(this._IS_CODE_SHARE);
            xml.endTag(null, "IS_CODE_SHARE");
        }
        if (this._MEAL != null) {
            xml.startTag(null, "MEAL");
            xml.text(this._MEAL);
            xml.endTag(null, "MEAL");
        }
        if (this._ORG_CITY != null) {
            xml.startTag(null, "ORG_CITY");
            xml.text(this._ORG_CITY);
            xml.endTag(null, "ORG_CITY");
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
        if (this._SEG_UUID != null) {
            xml.startTag(null, "SEG_UUID");
            xml.text(this._SEG_UUID);
            xml.endTag(null, "SEG_UUID");
        }
        if (this._STOP_CITY != null) {
            xml.startTag(null, "STOP_CITY");
            xml.text(this._STOP_CITY);
            xml.endTag(null, "STOP_CITY");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("AC_TYPE".equals(parser.getName())) {
                        this._AC_TYPE = parser.nextText();
                    } else if ("CARRIER_FLIGHT_NO".equals(parser.getName())) {
                        this._CARRIER_FLIGHT_NO = parser.nextText();
                    } else if ("DST_DATE".equals(parser.getName())) {
                        this._DST_DATE = parser.nextText();
                    } else if ("DST_TIME".equals(parser.getName())) {
                        this._DST_TIME = parser.nextText();
                    } else if ("DST_CITY".equals(parser.getName())) {
                        this._DST_CITY = parser.nextText();
                    } else if ("ORG_DATE".equals(parser.getName())) {
                        this._ORG_DATE = parser.nextText();
                    } else if ("FLIGHT_NO".equals(parser.getName())) {
                        this._FLIGHT_NO = parser.nextText();
                    } else if ("ORG_TIME".equals(parser.getName())) {
                        this._ORG_TIME = parser.nextText();
                    } else if ("IS_CODE_SHARE".equals(parser.getName())) {
                        this._IS_CODE_SHARE = parser.nextText();
                    } else if ("MEAL".equals(parser.getName())) {
                        this._MEAL = parser.nextText();
                    } else if ("ORG_CITY".equals(parser.getName())) {
                        this._ORG_CITY = parser.nextText();
                    } else if ("PASSENGER_INFO_LIST".equals(parser.getName())) {
                        if (this._PASSENGER_INFO_LIST == null) {
                            this._PASSENGER_INFO_LIST = new ArrayList();
                        }
                        rescheduleCommitOrderPassengerInfoVO reschedulecommitorderpassengerinfovo = new rescheduleCommitOrderPassengerInfoVO();
                        reschedulecommitorderpassengerinfovo.parse(binding, parser);
                        this._PASSENGER_INFO_LIST.add(reschedulecommitorderpassengerinfovo);
                    } else if ("SEG_UUID".equals(parser.getName())) {
                        this._SEG_UUID = parser.nextText();
                    } else if ("STOP_CITY".equals(parser.getName())) {
                        this._STOP_CITY = parser.nextText();
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