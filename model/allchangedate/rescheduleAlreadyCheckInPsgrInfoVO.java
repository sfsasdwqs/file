package com.common.szair.model.allchangedate;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class rescheduleAlreadyCheckInPsgrInfoVO extends baseDTOVO implements SOAPObject {
    public String _INDVL_ID_NBR = null;
    public String _INDVL_ID_TYPE = null;
    public String _PAX_NM = null;
    public String _SEAT_NO = null;
    public String _TEL_NO = null;
    public String _TICKET_NO = null;
    public String _PAX_TYPE = null;
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
        if (this._INDVL_ID_NBR != null) {
            xml.startTag(null, "INDVL_ID_NBR");
            xml.text(this._INDVL_ID_NBR);
            xml.endTag(null, "INDVL_ID_NBR");
        }
        if (this._INDVL_ID_TYPE != null) {
            xml.startTag(null, "INDVL_ID_TYPE");
            xml.text(this._INDVL_ID_TYPE);
            xml.endTag(null, "INDVL_ID_TYPE");
        }
        if (this._PAX_NM != null) {
            xml.startTag(null, "PAX_NM");
            xml.text(this._PAX_NM);
            xml.endTag(null, "PAX_NM");
        }
        if (this._SEAT_NO != null) {
            xml.startTag(null, "SEAT_NO");
            xml.text(this._SEAT_NO);
            xml.endTag(null, "SEAT_NO");
        }
        if (this._TEL_NO != null) {
            xml.startTag(null, "TEL_NO");
            xml.text(this._TEL_NO);
            xml.endTag(null, "TEL_NO");
        }
        if (this._TICKET_NO != null) {
            xml.startTag(null, "TICKET_NO");
            xml.text(this._TICKET_NO);
            xml.endTag(null, "TICKET_NO");
        }
        if (this._PAX_TYPE != null) {
            xml.startTag(null, "PAX_TYPE");
            xml.text(this._PAX_TYPE);
            xml.endTag(null, "PAX_TYPE");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("INDVL_ID_NBR".equals(parser.getName())) {
                        this._INDVL_ID_NBR = parser.nextText();
                    } else if ("INDVL_ID_TYPE".equals(parser.getName())) {
                        this._INDVL_ID_TYPE = parser.nextText();
                    } else if ("PAX_NM".equals(parser.getName())) {
                        this._PAX_NM = parser.nextText();
                    } else if ("SEAT_NO".equals(parser.getName())) {
                        this._SEAT_NO = parser.nextText();
                    } else if ("TEL_NO".equals(parser.getName())) {
                        this._TEL_NO = parser.nextText();
                    } else if ("TICKET_NO".equals(parser.getName())) {
                        this._TICKET_NO = parser.nextText();
                    } else if ("PAX_TYPE".equals(parser.getName())) {
                        this._PAX_TYPE = parser.nextText();
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