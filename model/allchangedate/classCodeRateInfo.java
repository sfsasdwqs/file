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
public class classCodeRateInfo extends baseUSPResponse implements SOAPObject, Serializable {
    public String _afterHoursRefund = null;
    public String _afterHoursReschedule = null;
    public String _beforeDaysRefund = null;
    public String _beforeDaysReschedule = null;
    public String _beforeHoursRefund = null;
    public String _beforeHoursReschedule = null;
    public String _beforeWeekRefund = null;
    public String _beforeWeekReschedule = null;
    public String _classCode = null;
    private java.lang.Exception _exception = null;

    @Override // com.common.szair.model.allchangedate.baseUSPResponse, com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.allchangedate.baseUSPResponse, com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/shenzhenair/mobilewebservice/allChannelTicketReschedule";
    }

    @Override // com.common.szair.model.allchangedate.baseUSPResponse, com.common.szair.model.soap.SOAPObject
    public void setexception(java.lang.Exception _exception) {
        this._exception = _exception;
    }

    @Override // com.common.szair.model.allchangedate.baseUSPResponse, com.common.szair.model.soap.SOAPObject
    public java.lang.Exception getexception() {
        return this._exception;
    }

    @Override // com.common.szair.model.allchangedate.baseUSPResponse, com.common.szair.model.soap.SOAPObject
    public void toXml(XmlSerializer xml, String name, String namespace) throws IOException {
        if (namespace == null || namespace.length() <= 0) {
            namespace = getNamespace();
        }
        xml.startTag(namespace, name);
        addAttributesToNode(xml);
        addElementsToNode(xml);
        xml.endTag(namespace, name);
    }

    @Override // com.common.szair.model.allchangedate.baseUSPResponse, com.common.szair.model.soap.SOAPObject
    public void addElementsToNode(XmlSerializer xml) throws IOException {
        if (this._afterHoursRefund != null) {
            xml.startTag(null, "afterHoursRefund");
            xml.text(this._afterHoursRefund);
            xml.endTag(null, "afterHoursRefund");
        }
        if (this._afterHoursReschedule != null) {
            xml.startTag(null, "afterHoursReschedule");
            xml.text(this._afterHoursReschedule);
            xml.endTag(null, "afterHoursReschedule");
        }
        if (this._beforeDaysRefund != null) {
            xml.startTag(null, "beforeDaysRefund");
            xml.text(this._beforeDaysRefund);
            xml.endTag(null, "beforeDaysRefund");
        }
        if (this._beforeDaysReschedule != null) {
            xml.startTag(null, "beforeDaysReschedule");
            xml.text(this._beforeDaysReschedule);
            xml.endTag(null, "beforeDaysReschedule");
        }
        if (this._beforeHoursRefund != null) {
            xml.startTag(null, "beforeHoursRefund");
            xml.text(this._beforeHoursRefund);
            xml.endTag(null, "beforeHoursRefund");
        }
        if (this._beforeHoursReschedule != null) {
            xml.startTag(null, "beforeHoursReschedule");
            xml.text(this._beforeHoursReschedule);
            xml.endTag(null, "beforeHoursReschedule");
        }
        if (this._beforeWeekRefund != null) {
            xml.startTag(null, "beforeWeekRefund");
            xml.text(this._beforeWeekRefund);
            xml.endTag(null, "beforeWeekRefund");
        }
        if (this._beforeWeekReschedule != null) {
            xml.startTag(null, "beforeWeekReschedule");
            xml.text(this._beforeWeekReschedule);
            xml.endTag(null, "beforeWeekReschedule");
        }
        if (this._classCode != null) {
            xml.startTag(null, "classCode");
            xml.text(this._classCode);
            xml.endTag(null, "classCode");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseUSPResponse, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("afterHoursRefund".equals(parser.getName())) {
                        this._afterHoursRefund = parser.nextText();
                    } else if ("afterHoursReschedule".equals(parser.getName())) {
                        this._afterHoursReschedule = parser.nextText();
                    } else if ("beforeDaysRefund".equals(parser.getName())) {
                        this._beforeDaysRefund = parser.nextText();
                    } else if ("beforeDaysReschedule".equals(parser.getName())) {
                        this._beforeDaysReschedule = parser.nextText();
                    } else if ("beforeHoursRefund".equals(parser.getName())) {
                        this._beforeHoursRefund = parser.nextText();
                    } else if ("beforeHoursReschedule".equals(parser.getName())) {
                        this._beforeHoursReschedule = parser.nextText();
                    } else if ("beforeWeekRefund".equals(parser.getName())) {
                        this._beforeWeekRefund = parser.nextText();
                    } else if ("beforeWeekReschedule".equals(parser.getName())) {
                        this._beforeWeekReschedule = parser.nextText();
                    } else if ("classCode".equals(parser.getName())) {
                        this._classCode = parser.nextText();
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