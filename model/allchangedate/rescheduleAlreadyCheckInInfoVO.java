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
public class rescheduleAlreadyCheckInInfoVO extends baseDTOVO implements SOAPObject, Serializable {
    public List<rescheduleAlreadyCheckInPsgrInfoVO> _PASSENGER_INFO = null;
    public String _DST_CITY = null;
    public String _DST_CITY_CH = null;
    public String _FLIGHT_NO = null;
    public String _ORG_CITY = null;
    public String _ORG_CITY_CH = null;
    public Integer _SEGMENT_INDEX = null;
    public String _ORG_DATE_TIME = null;
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
        List<rescheduleAlreadyCheckInPsgrInfoVO> list = this._PASSENGER_INFO;
        if (list != null && list.size() > 0) {
            int size = this._PASSENGER_INFO.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "PASSENGER_INFO");
                this._PASSENGER_INFO.get(i).addElementsToNode(xml);
                xml.endTag(null, "PASSENGER_INFO");
            }
        }
        if (this._DST_CITY != null) {
            xml.startTag(null, "DST_CITY");
            xml.text(this._DST_CITY);
            xml.endTag(null, "DST_CITY");
        }
        if (this._DST_CITY_CH != null) {
            xml.startTag(null, "DST_CITY_CH");
            xml.text(this._DST_CITY_CH);
            xml.endTag(null, "DST_CITY_CH");
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
        if (this._ORG_CITY_CH != null) {
            xml.startTag(null, "ORG_CITY_CH");
            xml.text(this._ORG_CITY_CH);
            xml.endTag(null, "ORG_CITY_CH");
        }
        if (this._SEGMENT_INDEX != null) {
            xml.startTag(null, "SEGMENT_INDEX");
            xml.text(String.valueOf(this._SEGMENT_INDEX));
            xml.endTag(null, "SEGMENT_INDEX");
        }
        if (this._ORG_DATE_TIME != null) {
            xml.startTag(null, "ORG_DATE_TIME");
            xml.text(this._ORG_DATE_TIME);
            xml.endTag(null, "ORG_DATE_TIME");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("PASSENGER_INFO".equals(parser.getName())) {
                        if (this._PASSENGER_INFO == null) {
                            this._PASSENGER_INFO = new ArrayList();
                        }
                        rescheduleAlreadyCheckInPsgrInfoVO reschedulealreadycheckinpsgrinfovo = new rescheduleAlreadyCheckInPsgrInfoVO();
                        reschedulealreadycheckinpsgrinfovo.parse(binding, parser);
                        this._PASSENGER_INFO.add(reschedulealreadycheckinpsgrinfovo);
                    } else if ("DST_CITY".equals(parser.getName())) {
                        this._DST_CITY = parser.nextText();
                    } else if ("DST_CITY_CH".equals(parser.getName())) {
                        this._DST_CITY_CH = parser.nextText();
                    } else if ("FLIGHT_NO".equals(parser.getName())) {
                        this._FLIGHT_NO = parser.nextText();
                    } else if ("ORG_CITY".equals(parser.getName())) {
                        this._ORG_CITY = parser.nextText();
                    } else if ("ORG_CITY_CH".equals(parser.getName())) {
                        this._ORG_CITY_CH = parser.nextText();
                    } else if ("SEGMENT_INDEX".equals(parser.getName())) {
                        this._SEGMENT_INDEX = Integer.valueOf(parser.nextText());
                    } else if ("ORG_DATE_TIME".equals(parser.getName())) {
                        this._ORG_DATE_TIME = parser.nextText();
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