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
public class pickupUpdateConditionVO implements SOAPObject, Serializable {
    public String _IS_CARD = null;
    public String _OP_TYPE = null;
    public String _IS_COUPON = null;
    public pickupInfoVO _PICKUP_INFO_1 = null;
    public pickupInfoVO _PICKUP_INFO_2 = null;
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
        if (this._IS_CARD != null) {
            xml.startTag(null, "IS_CARD");
            xml.text(this._IS_CARD);
            xml.endTag(null, "IS_CARD");
        }
        if (this._IS_COUPON != null) {
            xml.startTag(null, "IS_COUPON");
            xml.text(this._IS_COUPON);
            xml.endTag(null, "IS_COUPON");
        }
        if (this._OP_TYPE != null) {
            xml.startTag(null, "OP_TYPE");
            xml.text(this._OP_TYPE);
            xml.endTag(null, "OP_TYPE");
        }
        if (this._PICKUP_INFO_1 != null) {
            xml.startTag(null, "PICKUP_INFO_1");
            this._PICKUP_INFO_1.addElementsToNode(xml);
            xml.endTag(null, "PICKUP_INFO_1");
        }
        if (this._PICKUP_INFO_2 != null) {
            xml.startTag(null, "PICKUP_INFO_2");
            this._PICKUP_INFO_2.addElementsToNode(xml);
            xml.endTag(null, "PICKUP_INFO_2");
        }
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("IS_CARD".equals(parser.getName())) {
                        this._IS_CARD = parser.nextText();
                    } else if ("IS_COUPON".equals(parser.getName())) {
                        this._IS_COUPON = parser.nextText();
                    } else if ("OP_TYPE".equals(parser.getName())) {
                        this._OP_TYPE = parser.nextText();
                    } else if ("PICKUP_INFO_1".equals(parser.getName())) {
                        pickupInfoVO pickupinfovo = new pickupInfoVO();
                        pickupinfovo.parse(binding, parser);
                        this._PICKUP_INFO_1 = pickupinfovo;
                    } else if ("PICKUP_INFO_2".equals(parser.getName())) {
                        pickupInfoVO pickupinfovo2 = new pickupInfoVO();
                        pickupinfovo2.parse(binding, parser);
                        this._PICKUP_INFO_2 = pickupinfovo2;
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