package com.common.szair.model.alipayment;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class aliSecurityResultVO extends bookingResponseBaseVO implements SOAPObject {
    public String _SIGN_DATA = null;
    public String _OP_RESULT = null;
    public String _RETURN_MSG = null;
    public easyCardResultVO _YIHUIPAY_INFO = null;
    public String _HTML = null;
    private Exception _exception = null;

    @Override // com.common.szair.model.alipayment.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.alipayment.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/shenzhenair/mobilewebservice/payment";
    }

    @Override // com.common.szair.model.alipayment.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public void setexception(Exception _exception) {
        this._exception = _exception;
    }

    @Override // com.common.szair.model.alipayment.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public Exception getexception() {
        return this._exception;
    }

    @Override // com.common.szair.model.alipayment.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public void toXml(XmlSerializer xml, String name, String namespace) throws IOException {
        if (namespace == null || namespace.length() <= 0) {
            namespace = getNamespace();
        }
        xml.startTag(namespace, name);
        addAttributesToNode(xml);
        addElementsToNode(xml);
        xml.endTag(namespace, name);
    }

    @Override // com.common.szair.model.alipayment.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public void addElementsToNode(XmlSerializer xml) throws IOException {
        if (this._YIHUIPAY_INFO != null) {
            xml.startTag(null, "YIHUIPAY_INFO");
            this._YIHUIPAY_INFO.addElementsToNode(xml);
            xml.endTag(null, "YIHUIPAY_INFO");
        }
        if (this._HTML != null) {
            xml.startTag(null, "HTML");
            xml.text(this._HTML);
            xml.endTag(null, "HTML");
        }
        if (this._SIGN_DATA != null) {
            xml.startTag(null, "SIGN_DATA");
            xml.text(this._SIGN_DATA);
            xml.endTag(null, "SIGN_DATA");
        }
        if (this._OP_RESULT != null) {
            xml.startTag(null, "OP_RESULT");
            xml.text(this._OP_RESULT);
            xml.endTag(null, "OP_RESULT");
        }
        if (this._RETURN_MSG != null) {
            xml.startTag(null, "RETURN_MSG");
            xml.text(this._RETURN_MSG);
            xml.endTag(null, "RETURN_MSG");
        }
    }

    @Override // com.common.szair.model.alipayment.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("YIHUIPAY_INFO".equals(parser.getName())) {
                        easyCardResultVO easycardresultvo = new easyCardResultVO();
                        easycardresultvo.parse(binding, parser);
                        this._YIHUIPAY_INFO = easycardresultvo;
                    } else if ("HTML".equals(parser.getName())) {
                        this._HTML = parser.nextText();
                    } else if ("SIGN_DATA".equals(parser.getName())) {
                        this._SIGN_DATA = parser.nextText();
                    } else if ("OP_RESULT".equals(parser.getName())) {
                        this._OP_RESULT = parser.nextText();
                    } else if ("RETURN_MSG".equals(parser.getName())) {
                        this._RETURN_MSG = parser.nextText();
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