package com.common.szair.model.alilogin;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class alipayIdentifyReqVO implements SOAPObject {
    public String _CERT_NO = null;
    public String _CERT_TYPE = null;
    public String _FIRST_NAME_CN = null;
    public String _FIRST_NAME_EN = null;
    public String _SURNAME_CN = null;
    public String _SURNAME_EN = null;
    private Exception _exception = null;

    @Override // com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/szcares/member/webservice/userinfoShare";
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
        if (this._FIRST_NAME_CN != null) {
            xml.startTag(null, "FIRST_NAME_CN");
            xml.text(this._FIRST_NAME_CN);
            xml.endTag(null, "FIRST_NAME_CN");
        }
        if (this._FIRST_NAME_EN != null) {
            xml.startTag(null, "FIRST_NAME_EN");
            xml.text(this._FIRST_NAME_EN);
            xml.endTag(null, "FIRST_NAME_EN");
        }
        if (this._SURNAME_CN != null) {
            xml.startTag(null, "SURNAME_CN");
            xml.text(this._SURNAME_CN);
            xml.endTag(null, "SURNAME_CN");
        }
        if (this._SURNAME_EN != null) {
            xml.startTag(null, "SURNAME_EN");
            xml.text(this._SURNAME_EN);
            xml.endTag(null, "SURNAME_EN");
        }
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("CERT_NO".equals(parser.getName())) {
                        this._CERT_NO = parser.nextText();
                    } else if ("CERT_TYPE".equals(parser.getName())) {
                        this._CERT_TYPE = parser.nextText();
                    } else if ("FIRST_NAME_CN".equals(parser.getName())) {
                        this._FIRST_NAME_CN = parser.nextText();
                    } else if ("FIRST_NAME_EN".equals(parser.getName())) {
                        this._FIRST_NAME_EN = parser.nextText();
                    } else if ("SURNAME_CN".equals(parser.getName())) {
                        this._SURNAME_CN = parser.nextText();
                    } else if ("SURNAME_EN".equals(parser.getName())) {
                        this._SURNAME_EN = parser.nextText();
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