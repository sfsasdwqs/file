package com.common.szair.model.airportshuttle;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class checkPickupCaptcha implements SOAPObject {
    public String _PICKUP_CAPTCHA_MOBILE = null;
    public String _PICKUP_CAPTCHA = null;
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
        if (this._PICKUP_CAPTCHA_MOBILE != null) {
            xml.startTag(null, "PICKUP_CAPTCHA_MOBILE");
            xml.text(this._PICKUP_CAPTCHA_MOBILE);
            xml.endTag(null, "PICKUP_CAPTCHA_MOBILE");
        }
        if (this._PICKUP_CAPTCHA != null) {
            xml.startTag(null, "PICKUP_CAPTCHA");
            xml.text(this._PICKUP_CAPTCHA);
            xml.endTag(null, "PICKUP_CAPTCHA");
        }
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("PICKUP_CAPTCHA_MOBILE".equals(parser.getName())) {
                        this._PICKUP_CAPTCHA_MOBILE = parser.nextText();
                    } else if ("PICKUP_CAPTCHA".equals(parser.getName())) {
                        this._PICKUP_CAPTCHA = parser.nextText();
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