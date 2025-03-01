package com.common.szair.model.allchangedate;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class connectTicketFlightInfoConditionVO extends baseDTOVO implements SOAPObject {
    public String _CERT_NO = null;
    public String _CERT_TYPE = null;
    public String _INTERNATIONAL_FLAG = null;
    public String _PASSENGER_NAME = null;
    public String _PASSENGER_TYPE = null;
    public String _RESCHEDULE_UUID = null;
    public String _TICKET_NO = null;
    public String _USER_ID = null;
    public String _CONNECT_FLAG = null;
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
        if (this._INTERNATIONAL_FLAG != null) {
            xml.startTag(null, "INTERNATIONAL_FLAG");
            xml.text(this._INTERNATIONAL_FLAG);
            xml.endTag(null, "INTERNATIONAL_FLAG");
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
        if (this._RESCHEDULE_UUID != null) {
            xml.startTag(null, "RESCHEDULE_UUID");
            xml.text(this._RESCHEDULE_UUID);
            xml.endTag(null, "RESCHEDULE_UUID");
        }
        if (this._TICKET_NO != null) {
            xml.startTag(null, "TICKET_NO");
            xml.text(this._TICKET_NO);
            xml.endTag(null, "TICKET_NO");
        }
        if (this._USER_ID != null) {
            xml.startTag(null, "USER_ID");
            xml.text(this._USER_ID);
            xml.endTag(null, "USER_ID");
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
                    } else if ("INTERNATIONAL_FLAG".equals(parser.getName())) {
                        this._INTERNATIONAL_FLAG = parser.nextText();
                    } else if ("PASSENGER_NAME".equals(parser.getName())) {
                        this._PASSENGER_NAME = parser.nextText();
                    } else if ("PASSENGER_TYPE".equals(parser.getName())) {
                        this._PASSENGER_TYPE = parser.nextText();
                    } else if ("RESCHEDULE_UUID".equals(parser.getName())) {
                        this._RESCHEDULE_UUID = parser.nextText();
                    } else if ("TICKET_NO".equals(parser.getName())) {
                        this._TICKET_NO = parser.nextText();
                    } else if ("USER_ID".equals(parser.getName())) {
                        this._USER_ID = parser.nextText();
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