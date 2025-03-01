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
public class productInfoVO extends baseDTOVO implements SOAPObject, Serializable {
    public String _ADD_MONEY = null;
    public String _COUPON_VALUE = null;
    public String _EXPIRY_DATE_ALLOW = null;
    public String _INSTANCE_ID = null;
    public String _IS_COMBINATION = null;
    public String _PRODUCT_CODE = null;
    public String _PRODUCT_TYPE = null;
    public String _SALE_NUM = null;
    public String _TRANSFER_TYPE = null;
    public String _USE_VALUE = null;
    private java.lang.Exception _exception = null;

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/shenzhenair/mobilewebservice/rescheduleMktWebService";
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
        if (this._ADD_MONEY != null) {
            xml.startTag(null, "ADD_MONEY");
            xml.text(this._ADD_MONEY);
            xml.endTag(null, "ADD_MONEY");
        }
        if (this._COUPON_VALUE != null) {
            xml.startTag(null, "COUPON_VALUE");
            xml.text(this._COUPON_VALUE);
            xml.endTag(null, "COUPON_VALUE");
        }
        if (this._EXPIRY_DATE_ALLOW != null) {
            xml.startTag(null, "EXPIRY_DATE_ALLOW");
            xml.text(this._EXPIRY_DATE_ALLOW);
            xml.endTag(null, "EXPIRY_DATE_ALLOW");
        }
        if (this._INSTANCE_ID != null) {
            xml.startTag(null, "INSTANCE_ID");
            xml.text(this._INSTANCE_ID);
            xml.endTag(null, "INSTANCE_ID");
        }
        if (this._IS_COMBINATION != null) {
            xml.startTag(null, "IS_COMBINATION");
            xml.text(this._IS_COMBINATION);
            xml.endTag(null, "IS_COMBINATION");
        }
        if (this._PRODUCT_CODE != null) {
            xml.startTag(null, "PRODUCT_CODE");
            xml.text(this._PRODUCT_CODE);
            xml.endTag(null, "PRODUCT_CODE");
        }
        if (this._PRODUCT_TYPE != null) {
            xml.startTag(null, "PRODUCT_TYPE");
            xml.text(this._PRODUCT_TYPE);
            xml.endTag(null, "PRODUCT_TYPE");
        }
        if (this._SALE_NUM != null) {
            xml.startTag(null, "SALE_NUM");
            xml.text(this._SALE_NUM);
            xml.endTag(null, "SALE_NUM");
        }
        if (this._TRANSFER_TYPE != null) {
            xml.startTag(null, "TRANSFER_TYPE");
            xml.text(this._TRANSFER_TYPE);
            xml.endTag(null, "TRANSFER_TYPE");
        }
        if (this._USE_VALUE != null) {
            xml.startTag(null, "USE_VALUE");
            xml.text(this._USE_VALUE);
            xml.endTag(null, "USE_VALUE");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("ADD_MONEY".equals(parser.getName())) {
                        this._ADD_MONEY = parser.nextText();
                    } else if ("COUPON_VALUE".equals(parser.getName())) {
                        this._COUPON_VALUE = parser.nextText();
                    } else if ("EXPIRY_DATE_ALLOW".equals(parser.getName())) {
                        this._EXPIRY_DATE_ALLOW = parser.nextText();
                    } else if ("INSTANCE_ID".equals(parser.getName())) {
                        this._INSTANCE_ID = parser.nextText();
                    } else if ("IS_COMBINATION".equals(parser.getName())) {
                        this._IS_COMBINATION = parser.nextText();
                    } else if ("PRODUCT_CODE".equals(parser.getName())) {
                        this._PRODUCT_CODE = parser.nextText();
                    } else if ("PRODUCT_TYPE".equals(parser.getName())) {
                        this._PRODUCT_TYPE = parser.nextText();
                    } else if ("SALE_NUM".equals(parser.getName())) {
                        this._SALE_NUM = parser.nextText();
                    } else if ("TRANSFER_TYPE".equals(parser.getName())) {
                        this._TRANSFER_TYPE = parser.nextText();
                    } else if ("USE_VALUE".equals(parser.getName())) {
                        this._USE_VALUE = parser.nextText();
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