package com.common.szair.model.airportshuttle;

import com.air.sz.zxing.decoding.Intents;
import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class pickupStockCondition implements SOAPObject {
    public String _CITY = null;
    public String _PRODUCT_NAME = null;
    public String _TYPE = null;
    public String _USE_TIME = null;
    public String _PRODUCT_ID = null;
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
        if (this._CITY != null) {
            xml.startTag(null, "CITY");
            xml.text(this._CITY);
            xml.endTag(null, "CITY");
        }
        if (this._PRODUCT_NAME != null) {
            xml.startTag(null, "PRODUCT_NAME");
            xml.text(this._PRODUCT_NAME);
            xml.endTag(null, "PRODUCT_NAME");
        }
        if (this._TYPE != null) {
            xml.startTag(null, Intents.WifiConnect.TYPE);
            xml.text(this._TYPE);
            xml.endTag(null, Intents.WifiConnect.TYPE);
        }
        if (this._USE_TIME != null) {
            xml.startTag(null, "USE_TIME");
            xml.text(this._USE_TIME);
            xml.endTag(null, "USE_TIME");
        }
        if (this._PRODUCT_ID != null) {
            xml.startTag(null, "PRODUCT_ID");
            xml.text(this._PRODUCT_ID);
            xml.endTag(null, "PRODUCT_ID");
        }
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("CITY".equals(parser.getName())) {
                        this._CITY = parser.nextText();
                    } else if ("PRODUCT_NAME".equals(parser.getName())) {
                        this._PRODUCT_NAME = parser.nextText();
                    } else if (Intents.WifiConnect.TYPE.equals(parser.getName())) {
                        this._TYPE = parser.nextText();
                    } else if ("USE_TIME".equals(parser.getName())) {
                        this._USE_TIME = parser.nextText();
                    } else if ("PRODUCT_ID".equals(parser.getName())) {
                        this._PRODUCT_ID = parser.nextText();
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