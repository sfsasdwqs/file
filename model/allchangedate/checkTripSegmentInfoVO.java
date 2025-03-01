package com.common.szair.model.allchangedate;

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
public class checkTripSegmentInfoVO extends baseDTOVO implements SOAPObject, Serializable {
    public String _CHANGE_FLAG = null;
    public String _DST = null;
    public String _DST_DATE = null;
    public String _DST_TIME = null;
    public String _FLIGHT_DATE = null;
    public String _FLIGHT_NO = null;
    public String _FLIGHT_TIME = null;
    public String _ORG = null;
    public String _CONNECT_FLAG = null;
    public List<checkTripTicketInfoVO> _TRIP_TICKET_INFO_LIST = null;
    public String _FLIGHT_DATE_NEW = null;
    public String _ORG_CITY_NEW = null;
    public String _DST_CITY_NEW = null;
    public List<flightInfoVO> _flightInfoVOList = null;
    public List<flightInfoVO> _oldFlightInfoVOList = null;
    public rescheduleClassInfoVO _classInfoVO = null;
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
        if (this._CHANGE_FLAG != null) {
            xml.startTag(null, "CHANGE_FLAG");
            xml.text(this._CHANGE_FLAG);
            xml.endTag(null, "CHANGE_FLAG");
        }
        if (this._DST != null) {
            xml.startTag(null, "DST");
            xml.text(this._DST);
            xml.endTag(null, "DST");
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
        if (this._FLIGHT_TIME != null) {
            xml.startTag(null, "FLIGHT_TIME");
            xml.text(this._FLIGHT_TIME);
            xml.endTag(null, "FLIGHT_TIME");
        }
        if (this._ORG != null) {
            xml.startTag(null, "ORG");
            xml.text(this._ORG);
            xml.endTag(null, "ORG");
        }
        if (this._CONNECT_FLAG != null) {
            xml.startTag(null, "CONNECT_FLAG");
            xml.text(this._CONNECT_FLAG);
            xml.endTag(null, "CONNECT_FLAG");
        }
        List<checkTripTicketInfoVO> list = this._TRIP_TICKET_INFO_LIST;
        if (list == null || list.size() <= 0) {
            return;
        }
        int size = this._TRIP_TICKET_INFO_LIST.size();
        for (int i = 0; i < size; i++) {
            xml.startTag(null, "TRIP_TICKET_INFO_LIST");
            this._TRIP_TICKET_INFO_LIST.get(i).addElementsToNode(xml);
            xml.endTag(null, "TRIP_TICKET_INFO_LIST");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("CHANGE_FLAG".equals(parser.getName())) {
                        this._CHANGE_FLAG = parser.nextText();
                    } else if ("DST".equals(parser.getName())) {
                        this._DST = parser.nextText();
                    } else if ("DST_DATE".equals(parser.getName())) {
                        this._DST_DATE = parser.nextText();
                    } else if ("DST_TIME".equals(parser.getName())) {
                        this._DST_TIME = parser.nextText();
                    } else if ("FLIGHT_DATE".equals(parser.getName())) {
                        this._FLIGHT_DATE = parser.nextText();
                    } else if ("FLIGHT_NO".equals(parser.getName())) {
                        this._FLIGHT_NO = parser.nextText();
                    } else if ("FLIGHT_TIME".equals(parser.getName())) {
                        this._FLIGHT_TIME = parser.nextText();
                    } else if ("ORG".equals(parser.getName())) {
                        this._ORG = parser.nextText();
                    } else if ("CONNECT_FLAG".equals(parser.getName())) {
                        this._CONNECT_FLAG = parser.nextText();
                    } else if ("TRIP_TICKET_INFO_LIST".equals(parser.getName())) {
                        if (this._TRIP_TICKET_INFO_LIST == null) {
                            this._TRIP_TICKET_INFO_LIST = new ArrayList();
                        }
                        checkTripTicketInfoVO checktripticketinfovo = new checkTripTicketInfoVO();
                        checktripticketinfovo.parse(binding, parser);
                        this._TRIP_TICKET_INFO_LIST.add(checktripticketinfovo);
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