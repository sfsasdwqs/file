package com.common.szair.model.airportshuttle;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import java.io.Serializable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class pickupCardInfoVO implements SOAPObject, Serializable {
    public String _CARD_NO = null;
    public String _DST_CITY_CODE = null;
    public String _LEFT_TIME = null;
    public String _MESSAGE = null;
    public String _ORG_CITY_CODE = null;
    public String _PHONE = null;
    public String _RESULT_CODE = null;
    private Exception _exception = null;

    @Override // com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/shenzhenair/mobilewebservice/pickup";
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void setexception(Exception _exception) {
        this._exception = _exception;
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public Exception getexception() {
        return this._exception;
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void toXml(XmlSerializer xml, String name, String namespace) throws IOException {
        if (namespace == null || namespace.length() <= 0) {
            namespace = getNamespace();
        }
        xml.startTag(namespace, name);
        addAttributesToNode(xml);
        addElementsToNode(xml);
        xml.endTag(namespace, name);
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void addElementsToNode(XmlSerializer xml) throws IOException {
        if (this._CARD_NO != null) {
            xml.startTag(null, "CARD_NO");
            xml.text(this._CARD_NO);
            xml.endTag(null, "CARD_NO");
        }
        if (this._DST_CITY_CODE != null) {
            xml.startTag(null, "DST_CITY_CODE");
            xml.text(this._DST_CITY_CODE);
            xml.endTag(null, "DST_CITY_CODE");
        }
        if (this._LEFT_TIME != null) {
            xml.startTag(null, "LEFT_TIME");
            xml.text(this._LEFT_TIME);
            xml.endTag(null, "LEFT_TIME");
        }
        if (this._MESSAGE != null) {
            xml.startTag(null, "MESSAGE");
            xml.text(this._MESSAGE);
            xml.endTag(null, "MESSAGE");
        }
        if (this._ORG_CITY_CODE != null) {
            xml.startTag(null, "ORG_CITY_CODE");
            xml.text(this._ORG_CITY_CODE);
            xml.endTag(null, "ORG_CITY_CODE");
        }
        if (this._PHONE != null) {
            xml.startTag(null, "PHONE");
            xml.text(this._PHONE);
            xml.endTag(null, "PHONE");
        }
        if (this._RESULT_CODE != null) {
            xml.startTag(null, "RESULT_CODE");
            xml.text(this._RESULT_CODE);
            xml.endTag(null, "RESULT_CODE");
        }
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("CARD_NO".equals(parser.getName())) {
                        this._CARD_NO = parser.nextText();
                    } else if ("DST_CITY_CODE".equals(parser.getName())) {
                        this._DST_CITY_CODE = parser.nextText();
                    } else if ("LEFT_TIME".equals(parser.getName())) {
                        this._LEFT_TIME = parser.nextText();
                    } else if ("MESSAGE".equals(parser.getName())) {
                        this._MESSAGE = parser.nextText();
                    } else if ("ORG_CITY_CODE".equals(parser.getName())) {
                        this._ORG_CITY_CODE = parser.nextText();
                    } else if ("PHONE".equals(parser.getName())) {
                        this._PHONE = parser.nextText();
                    } else if ("RESULT_CODE".equals(parser.getName())) {
                        this._RESULT_CODE = parser.nextText();
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