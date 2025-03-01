package com.common.szair.model.allchangedate;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class rescheduleCheckWorkOrderTypeConditionVO extends baseDTOVO implements SOAPObject {
    public String _ORG_DATE = null;
    public String _FLIGHT_NO = null;
    public String _ORG_TIME = null;
    public String _RESCHEDULE_UUID = null;
    public String _SEG_UUID = null;
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
        if (this._RESCHEDULE_UUID != null) {
            xml.startTag(null, "RESCHEDULE_UUID");
            xml.text(this._RESCHEDULE_UUID);
            xml.endTag(null, "RESCHEDULE_UUID");
        }
        if (this._SEG_UUID != null) {
            xml.startTag(null, "SEG_UUID");
            xml.text(this._SEG_UUID);
            xml.endTag(null, "SEG_UUID");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("ORG_DATE".equals(parser.getName())) {
                        this._ORG_DATE = parser.nextText();
                    } else if ("FLIGHT_NO".equals(parser.getName())) {
                        this._FLIGHT_NO = parser.nextText();
                    } else if ("ORG_TIME".equals(parser.getName())) {
                        this._ORG_TIME = parser.nextText();
                    } else if ("RESCHEDULE_UUID".equals(parser.getName())) {
                        this._RESCHEDULE_UUID = parser.nextText();
                    } else if ("SEG_UUID".equals(parser.getName())) {
                        this._SEG_UUID = parser.nextText();
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