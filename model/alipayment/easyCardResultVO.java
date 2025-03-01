package com.common.szair.model.alipayment;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class easyCardResultVO implements SOAPObject {
    public String _LISTENER = null;
    public String _MER_NO = null;
    public String _MILEAGE_NUM = null;
    public String _ORDER_TYPE = null;
    public String _REQUEST_ORDER = null;
    public String _REQUEST_SN = null;
    public String _TRADE_NO = null;
    public String _TRANS_AMT = null;
    public String _USER_ID = null;
    private Exception _exception = null;

    @Override // com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/shenzhenair/mobilewebservice/payment";
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
        if (this._LISTENER != null) {
            xml.startTag(null, "LISTENER");
            xml.text(this._LISTENER);
            xml.endTag(null, "LISTENER");
        }
        if (this._MER_NO != null) {
            xml.startTag(null, "MER_NO");
            xml.text(this._MER_NO);
            xml.endTag(null, "MER_NO");
        }
        if (this._MILEAGE_NUM != null) {
            xml.startTag(null, "MILEAGE_NUM");
            xml.text(this._MILEAGE_NUM);
            xml.endTag(null, "MILEAGE_NUM");
        }
        if (this._ORDER_TYPE != null) {
            xml.startTag(null, "ORDER_TYPE");
            xml.text(this._ORDER_TYPE);
            xml.endTag(null, "ORDER_TYPE");
        }
        if (this._REQUEST_ORDER != null) {
            xml.startTag(null, "REQUEST_ORDER");
            xml.text(this._REQUEST_ORDER);
            xml.endTag(null, "REQUEST_ORDER");
        }
        if (this._REQUEST_SN != null) {
            xml.startTag(null, "REQUEST_SN");
            xml.text(this._REQUEST_SN);
            xml.endTag(null, "REQUEST_SN");
        }
        if (this._TRADE_NO != null) {
            xml.startTag(null, "TRADE_NO");
            xml.text(this._TRADE_NO);
            xml.endTag(null, "TRADE_NO");
        }
        if (this._TRANS_AMT != null) {
            xml.startTag(null, "TRANS_AMT");
            xml.text(this._TRANS_AMT);
            xml.endTag(null, "TRANS_AMT");
        }
        if (this._USER_ID != null) {
            xml.startTag(null, "USER_ID");
            xml.text(this._USER_ID);
            xml.endTag(null, "USER_ID");
        }
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("LISTENER".equals(parser.getName())) {
                        this._LISTENER = parser.nextText();
                    } else if ("MER_NO".equals(parser.getName())) {
                        this._MER_NO = parser.nextText();
                    } else if ("MILEAGE_NUM".equals(parser.getName())) {
                        this._MILEAGE_NUM = parser.nextText();
                    } else if ("ORDER_TYPE".equals(parser.getName())) {
                        this._ORDER_TYPE = parser.nextText();
                    } else if ("REQUEST_ORDER".equals(parser.getName())) {
                        this._REQUEST_ORDER = parser.nextText();
                    } else if ("REQUEST_SN".equals(parser.getName())) {
                        this._REQUEST_SN = parser.nextText();
                    } else if ("TRADE_NO".equals(parser.getName())) {
                        this._TRADE_NO = parser.nextText();
                    } else if ("TRANS_AMT".equals(parser.getName())) {
                        this._TRANS_AMT = parser.nextText();
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