package com.common.szair.model.alilogin;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class alipayUserinfoShareReqVO extends baseReqVO implements SOAPObject {
    public alipayIdentifyReqVO _ALIPAY_IDENTIFY_REQVO = null;
    public String _AUTH_CODE = null;
    public String _CODE = null;
    public String _DEVICE_NUMBER = null;
    public String _DEVICE_TOKEN = null;
    public String _DEVICE_TYPE = null;
    public String _LAST_LOGIN_ACCOUNT = null;
    public String _PHONE = null;
    public String _REQUEST_TYPE = null;
    public String _UUID = null;
    public String _APP_ID = null;
    public String _APP_IP = null;
    private Exception _exception = null;

    @Override // com.common.szair.model.alilogin.baseReqVO, com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.alilogin.baseReqVO, com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/szcares/member/webservice/userinfoShare";
    }

    @Override // com.common.szair.model.alilogin.baseReqVO, com.common.szair.model.soap.SOAPObject
    public void setexception(Exception _exception) {
        this._exception = _exception;
    }

    @Override // com.common.szair.model.alilogin.baseReqVO, com.common.szair.model.soap.SOAPObject
    public Exception getexception() {
        return this._exception;
    }

    @Override // com.common.szair.model.alilogin.baseReqVO, com.common.szair.model.soap.SOAPObject
    public void toXml(XmlSerializer xml, String name, String namespace) throws IOException {
        if (namespace == null || namespace.length() <= 0) {
            namespace = getNamespace();
        }
        xml.startTag(namespace, name);
        addAttributesToNode(xml);
        addElementsToNode(xml);
        xml.endTag(namespace, name);
    }

    @Override // com.common.szair.model.alilogin.baseReqVO, com.common.szair.model.soap.SOAPObject
    public void addElementsToNode(XmlSerializer xml) throws IOException {
        if (this._ALIPAY_IDENTIFY_REQVO != null) {
            xml.startTag(null, "ALIPAY_IDENTIFY_REQVO");
            this._ALIPAY_IDENTIFY_REQVO.addElementsToNode(xml);
            xml.endTag(null, "ALIPAY_IDENTIFY_REQVO");
        }
        if (this._AUTH_CODE != null) {
            xml.startTag(null, "AUTH_CODE");
            xml.text(this._AUTH_CODE);
            xml.endTag(null, "AUTH_CODE");
        }
        if (this._CODE != null) {
            xml.startTag(null, "CODE");
            xml.text(this._CODE);
            xml.endTag(null, "CODE");
        }
        if (this._DEVICE_NUMBER != null) {
            xml.startTag(null, "DEVICE_NUMBER");
            xml.text(this._DEVICE_NUMBER);
            xml.endTag(null, "DEVICE_NUMBER");
        }
        if (this._DEVICE_TOKEN != null) {
            xml.startTag(null, "DEVICE_TOKEN");
            xml.text(this._DEVICE_TOKEN);
            xml.endTag(null, "DEVICE_TOKEN");
        }
        if (this._DEVICE_TYPE != null) {
            xml.startTag(null, "DEVICE_TYPE");
            xml.text(this._DEVICE_TYPE);
            xml.endTag(null, "DEVICE_TYPE");
        }
        if (this._LAST_LOGIN_ACCOUNT != null) {
            xml.startTag(null, "LAST_LOGIN_ACCOUNT");
            xml.text(this._LAST_LOGIN_ACCOUNT);
            xml.endTag(null, "LAST_LOGIN_ACCOUNT");
        }
        if (this._PHONE != null) {
            xml.startTag(null, "PHONE");
            xml.text(this._PHONE);
            xml.endTag(null, "PHONE");
        }
        if (this._REQUEST_TYPE != null) {
            xml.startTag(null, "REQUEST_TYPE");
            xml.text(this._REQUEST_TYPE);
            xml.endTag(null, "REQUEST_TYPE");
        }
        if (this._UUID != null) {
            xml.startTag(null, "UUID");
            xml.text(this._UUID);
            xml.endTag(null, "UUID");
        }
        if (this._APP_ID != null) {
            xml.startTag(null, "APP_ID");
            xml.text(this._APP_ID);
            xml.endTag(null, "APP_ID");
        }
        if (this._APP_IP != null) {
            xml.startTag(null, "APP_IP");
            xml.text(this._APP_IP);
            xml.endTag(null, "APP_IP");
        }
    }

    @Override // com.common.szair.model.alilogin.baseReqVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("ALIPAY_IDENTIFY_REQVO".equals(parser.getName())) {
                        alipayIdentifyReqVO alipayidentifyreqvo = new alipayIdentifyReqVO();
                        alipayidentifyreqvo.parse(binding, parser);
                        this._ALIPAY_IDENTIFY_REQVO = alipayidentifyreqvo;
                    } else if ("AUTH_CODE".equals(parser.getName())) {
                        this._AUTH_CODE = parser.nextText();
                    } else if ("CODE".equals(parser.getName())) {
                        this._CODE = parser.nextText();
                    } else if ("DEVICE_NUMBER".equals(parser.getName())) {
                        this._DEVICE_NUMBER = parser.nextText();
                    } else if ("DEVICE_TOKEN".equals(parser.getName())) {
                        this._DEVICE_TOKEN = parser.nextText();
                    } else if ("DEVICE_TYPE".equals(parser.getName())) {
                        this._DEVICE_TYPE = parser.nextText();
                    } else if ("LAST_LOGIN_ACCOUNT".equals(parser.getName())) {
                        this._LAST_LOGIN_ACCOUNT = parser.nextText();
                    } else if ("PHONE".equals(parser.getName())) {
                        this._PHONE = parser.nextText();
                    } else if ("REQUEST_TYPE".equals(parser.getName())) {
                        this._REQUEST_TYPE = parser.nextText();
                    } else if ("UUID".equals(parser.getName())) {
                        this._UUID = parser.nextText();
                    } else if ("APP_ID".equals(parser.getName())) {
                        this._APP_ID = parser.nextText();
                    } else if ("APP_IP".equals(parser.getName())) {
                        this._APP_IP = parser.nextText();
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