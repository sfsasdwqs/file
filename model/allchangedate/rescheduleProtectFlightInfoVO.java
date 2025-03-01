package com.common.szair.model.allchangedate;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import java.io.Serializable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class rescheduleProtectFlightInfoVO extends baseDTOVO implements SOAPObject, Serializable {
    public String _DST_DATE_TIME = null;
    public String _CLASS_CODE = null;
    public String _CLASS_LEVEL = null;
    public String _ORG_DATE = null;
    public String _FLIGHT_NO = null;
    public String _ORG_AIRPORT_CH = null;
    public String _ORG_CITY_CH = null;
    public String _ORG_CITY = null;
    public String _SEGMENT_INDEX = null;
    public String _NOT_OI = null;
    public String _AC_TYPE = null;
    public String _SEGMENT_UUID = null;
    public String _STOP_CITY_CH = null;
    public String _ORG_TIME = null;
    public String _DST_AIRPORT_CH = null;
    public String _DST_CITY_CH = null;
    public String _DST_CITY = null;
    public String _WEEK = null;
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
        if (this._DST_DATE_TIME != null) {
            xml.startTag(null, "DST_DATE_TIME");
            xml.text(this._DST_DATE_TIME);
            xml.endTag(null, "DST_DATE_TIME");
        }
        if (this._CLASS_CODE != null) {
            xml.startTag(null, "CLASS_CODE");
            xml.text(this._CLASS_CODE);
            xml.endTag(null, "CLASS_CODE");
        }
        if (this._CLASS_LEVEL != null) {
            xml.startTag(null, "CLASS_LEVEL");
            xml.text(this._CLASS_LEVEL);
            xml.endTag(null, "CLASS_LEVEL");
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
        if (this._ORG_AIRPORT_CH != null) {
            xml.startTag(null, "ORG_AIRPORT_CH");
            xml.text(this._ORG_AIRPORT_CH);
            xml.endTag(null, "ORG_AIRPORT_CH");
        }
        if (this._ORG_CITY_CH != null) {
            xml.startTag(null, "ORG_CITY_CH");
            xml.text(this._ORG_CITY_CH);
            xml.endTag(null, "ORG_CITY_CH");
        }
        if (this._ORG_CITY != null) {
            xml.startTag(null, "ORG_CITY");
            xml.text(this._ORG_CITY);
            xml.endTag(null, "ORG_CITY");
        }
        if (this._SEGMENT_INDEX != null) {
            xml.startTag(null, "SEGMENT_INDEX");
            xml.text(this._SEGMENT_INDEX);
            xml.endTag(null, "SEGMENT_INDEX");
        }
        if (this._NOT_OI != null) {
            xml.startTag(null, "NOT_OI");
            xml.text(this._NOT_OI);
            xml.endTag(null, "NOT_OI");
        }
        if (this._AC_TYPE != null) {
            xml.startTag(null, "AC_TYPE");
            xml.text(this._AC_TYPE);
            xml.endTag(null, "AC_TYPE");
        }
        if (this._SEGMENT_UUID != null) {
            xml.startTag(null, "SEGMENT_UUID");
            xml.text(this._SEGMENT_UUID);
            xml.endTag(null, "SEGMENT_UUID");
        }
        if (this._STOP_CITY_CH != null) {
            xml.startTag(null, "STOP_CITY_CH");
            xml.text(this._STOP_CITY_CH);
            xml.endTag(null, "STOP_CITY_CH");
        }
        if (this._ORG_TIME != null) {
            xml.startTag(null, "ORG_TIME");
            xml.text(this._ORG_TIME);
            xml.endTag(null, "ORG_TIME");
        }
        if (this._DST_AIRPORT_CH != null) {
            xml.startTag(null, "DST_AIRPORT_CH");
            xml.text(this._DST_AIRPORT_CH);
            xml.endTag(null, "DST_AIRPORT_CH");
        }
        if (this._DST_CITY_CH != null) {
            xml.startTag(null, "DST_CITY_CH");
            xml.text(this._DST_CITY_CH);
            xml.endTag(null, "DST_CITY_CH");
        }
        if (this._DST_CITY != null) {
            xml.startTag(null, "DST_CITY");
            xml.text(this._DST_CITY);
            xml.endTag(null, "DST_CITY");
        }
        if (this._WEEK != null) {
            xml.startTag(null, "WEEK");
            xml.text(this._WEEK);
            xml.endTag(null, "WEEK");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("DST_DATE_TIME".equals(parser.getName())) {
                        this._DST_DATE_TIME = parser.nextText();
                    } else if ("CLASS_CODE".equals(parser.getName())) {
                        this._CLASS_CODE = parser.nextText();
                    } else if ("CLASS_LEVEL".equals(parser.getName())) {
                        this._CLASS_LEVEL = parser.nextText();
                    } else if ("ORG_DATE".equals(parser.getName())) {
                        this._ORG_DATE = parser.nextText();
                    } else if ("FLIGHT_NO".equals(parser.getName())) {
                        this._FLIGHT_NO = parser.nextText();
                    } else if ("ORG_AIRPORT_CH".equals(parser.getName())) {
                        this._ORG_AIRPORT_CH = parser.nextText();
                    } else if ("ORG_CITY_CH".equals(parser.getName())) {
                        this._ORG_CITY_CH = parser.nextText();
                    } else if ("ORG_CITY".equals(parser.getName())) {
                        this._ORG_CITY = parser.nextText();
                    } else if ("SEGMENT_INDEX".equals(parser.getName())) {
                        this._SEGMENT_INDEX = parser.nextText();
                    } else if ("NOT_OI".equals(parser.getName())) {
                        this._NOT_OI = parser.nextText();
                    } else if ("AC_TYPE".equals(parser.getName())) {
                        this._AC_TYPE = parser.nextText();
                    } else if ("SEGMENT_UUID".equals(parser.getName())) {
                        this._SEGMENT_UUID = parser.nextText();
                    } else if ("STOP_CITY_CH".equals(parser.getName())) {
                        this._STOP_CITY_CH = parser.nextText();
                    } else if ("ORG_TIME".equals(parser.getName())) {
                        this._ORG_TIME = parser.nextText();
                    } else if ("DST_AIRPORT_CH".equals(parser.getName())) {
                        this._DST_AIRPORT_CH = parser.nextText();
                    } else if ("DST_CITY_CH".equals(parser.getName())) {
                        this._DST_CITY_CH = parser.nextText();
                    } else if ("DST_CITY".equals(parser.getName())) {
                        this._DST_CITY = parser.nextText();
                    } else if ("WEEK".equals(parser.getName())) {
                        this._WEEK = parser.nextText();
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