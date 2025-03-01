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
public class rescheduleSegmentInfoConditionVO extends baseDTOVO implements SOAPObject, Serializable {
    public String _NEW_FLIGHT_DATE = null;
    public String _SEG_UUID = null;
    public String _ORG = null;
    public String _DST = null;
    public String _YST_TYPE = null;
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
        if (this._NEW_FLIGHT_DATE != null) {
            xml.startTag(null, "NEW_FLIGHT_DATE");
            xml.text(this._NEW_FLIGHT_DATE);
            xml.endTag(null, "NEW_FLIGHT_DATE");
        }
        if (this._SEG_UUID != null) {
            xml.startTag(null, "SEG_UUID");
            xml.text(this._SEG_UUID);
            xml.endTag(null, "SEG_UUID");
        }
        if (this._ORG != null) {
            xml.startTag(null, "ORG");
            xml.text(this._ORG);
            xml.endTag(null, "ORG");
        }
        if (this._DST != null) {
            xml.startTag(null, "DST");
            xml.text(this._DST);
            xml.endTag(null, "DST");
        }
        if (this._YST_TYPE != null) {
            xml.startTag(null, "YST_TYPE");
            xml.text(this._YST_TYPE);
            xml.endTag(null, "YST_TYPE");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("NEW_FLIGHT_DATE".equals(parser.getName())) {
                        this._NEW_FLIGHT_DATE = parser.nextText();
                    } else if ("SEG_UUID".equals(parser.getName())) {
                        this._SEG_UUID = parser.nextText();
                    } else if ("ORG".equals(parser.getName())) {
                        this._ORG = parser.nextText();
                    } else if ("DST".equals(parser.getName())) {
                        this._DST = parser.nextText();
                    } else if ("YST_TYPE".equals(parser.getName())) {
                        this._YST_TYPE = parser.nextText();
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