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
public class rescheduleClassFeeInfoVO extends baseDTOVO implements SOAPObject, Serializable {
    public String _ASSOCIATE_PARTNER = null;
    public String _CERT_NO = null;
    public String _CERT_TYPE = null;
    public String _MAIN_CLASS_CODE = null;
    public Integer _CLASS_SALE_DISCOUNT = null;
    public Integer _CLASS_SALE_PRICE = null;
    public String _COUPON_CODE = null;
    public String _COUPON_MONEY = null;
    public String _EQUITY_FIT_RES_FLIGHT = null;
    public String _FARE_BASIS = null;
    public String _FARE_EI = null;
    public String _FEE_TYPE = null;
    public String _QUICK_CLASS_LEVEL = null;
    public String _FREE_TYPE = null;
    public Integer _HANDLING_FEE = null;
    public Integer _ORI_HANDLING_FEE = null;
    public Integer _ORI_UP_FEE = null;
    public String _PNR = null;
    public String _PSGR_NAME = null;
    public String _PAX_TYPE = null;
    public String _TICKET_NO = null;
    public Integer _FEE_TOTAL = null;
    public Integer _UP_FEE = null;
    public String _VALIDATE_SINGLE_PROD = null;
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
        if (this._ASSOCIATE_PARTNER != null) {
            xml.startTag(null, "ASSOCIATE_PARTNER");
            xml.text(this._ASSOCIATE_PARTNER);
            xml.endTag(null, "ASSOCIATE_PARTNER");
        }
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
        if (this._MAIN_CLASS_CODE != null) {
            xml.startTag(null, "MAIN_CLASS_CODE");
            xml.text(this._MAIN_CLASS_CODE);
            xml.endTag(null, "MAIN_CLASS_CODE");
        }
        if (this._CLASS_SALE_DISCOUNT != null) {
            xml.startTag(null, "CLASS_SALE_DISCOUNT");
            xml.text(String.valueOf(this._CLASS_SALE_DISCOUNT));
            xml.endTag(null, "CLASS_SALE_DISCOUNT");
        }
        if (this._CLASS_SALE_PRICE != null) {
            xml.startTag(null, "CLASS_SALE_PRICE");
            xml.text(String.valueOf(this._CLASS_SALE_PRICE));
            xml.endTag(null, "CLASS_SALE_PRICE");
        }
        if (this._COUPON_CODE != null) {
            xml.startTag(null, "COUPON_CODE");
            xml.text(this._COUPON_CODE);
            xml.endTag(null, "COUPON_CODE");
        }
        if (this._COUPON_MONEY != null) {
            xml.startTag(null, "COUPON_MONEY");
            xml.text(this._COUPON_MONEY);
            xml.endTag(null, "COUPON_MONEY");
        }
        if (this._EQUITY_FIT_RES_FLIGHT != null) {
            xml.startTag(null, "EQUITY_FIT_RES_FLIGHT");
            xml.text(this._EQUITY_FIT_RES_FLIGHT);
            xml.endTag(null, "EQUITY_FIT_RES_FLIGHT");
        }
        if (this._FARE_BASIS != null) {
            xml.startTag(null, "FARE_BASIS");
            xml.text(this._FARE_BASIS);
            xml.endTag(null, "FARE_BASIS");
        }
        if (this._FARE_EI != null) {
            xml.startTag(null, "FARE_EI");
            xml.text(this._FARE_EI);
            xml.endTag(null, "FARE_EI");
        }
        if (this._FEE_TYPE != null) {
            xml.startTag(null, "FEE_TYPE");
            xml.text(this._FEE_TYPE);
            xml.endTag(null, "FEE_TYPE");
        }
        if (this._QUICK_CLASS_LEVEL != null) {
            xml.startTag(null, "QUICK_CLASS_LEVEL");
            xml.text(this._QUICK_CLASS_LEVEL);
            xml.endTag(null, "QUICK_CLASS_LEVEL");
        }
        if (this._FREE_TYPE != null) {
            xml.startTag(null, "FREE_TYPE");
            xml.text(this._FREE_TYPE);
            xml.endTag(null, "FREE_TYPE");
        }
        if (this._HANDLING_FEE != null) {
            xml.startTag(null, "HANDLING_FEE");
            xml.text(String.valueOf(this._HANDLING_FEE));
            xml.endTag(null, "HANDLING_FEE");
        }
        if (this._ORI_HANDLING_FEE != null) {
            xml.startTag(null, "ORI_HANDLING_FEE");
            xml.text(String.valueOf(this._ORI_HANDLING_FEE));
            xml.endTag(null, "ORI_HANDLING_FEE");
        }
        if (this._ORI_UP_FEE != null) {
            xml.startTag(null, "ORI_UP_FEE");
            xml.text(String.valueOf(this._ORI_UP_FEE));
            xml.endTag(null, "ORI_UP_FEE");
        }
        if (this._PNR != null) {
            xml.startTag(null, "PNR");
            xml.text(this._PNR);
            xml.endTag(null, "PNR");
        }
        if (this._PSGR_NAME != null) {
            xml.startTag(null, "PSGR_NAME");
            xml.text(this._PSGR_NAME);
            xml.endTag(null, "PSGR_NAME");
        }
        if (this._PAX_TYPE != null) {
            xml.startTag(null, "PAX_TYPE");
            xml.text(this._PAX_TYPE);
            xml.endTag(null, "PAX_TYPE");
        }
        if (this._TICKET_NO != null) {
            xml.startTag(null, "TICKET_NO");
            xml.text(this._TICKET_NO);
            xml.endTag(null, "TICKET_NO");
        }
        if (this._FEE_TOTAL != null) {
            xml.startTag(null, "FEE_TOTAL");
            xml.text(String.valueOf(this._FEE_TOTAL));
            xml.endTag(null, "FEE_TOTAL");
        }
        if (this._UP_FEE != null) {
            xml.startTag(null, "UP_FEE");
            xml.text(String.valueOf(this._UP_FEE));
            xml.endTag(null, "UP_FEE");
        }
        if (this._VALIDATE_SINGLE_PROD != null) {
            xml.startTag(null, "VALIDATE_SINGLE_PROD");
            xml.text(this._VALIDATE_SINGLE_PROD);
            xml.endTag(null, "VALIDATE_SINGLE_PROD");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("ASSOCIATE_PARTNER".equals(parser.getName())) {
                        this._ASSOCIATE_PARTNER = parser.nextText();
                    } else if ("CERT_NO".equals(parser.getName())) {
                        this._CERT_NO = parser.nextText();
                    } else if ("CERT_TYPE".equals(parser.getName())) {
                        this._CERT_TYPE = parser.nextText();
                    } else if ("MAIN_CLASS_CODE".equals(parser.getName())) {
                        this._MAIN_CLASS_CODE = parser.nextText();
                    } else if ("CLASS_SALE_DISCOUNT".equals(parser.getName())) {
                        this._CLASS_SALE_DISCOUNT = Integer.valueOf(parser.nextText());
                    } else if ("CLASS_SALE_PRICE".equals(parser.getName())) {
                        this._CLASS_SALE_PRICE = Integer.valueOf(parser.nextText());
                    } else if ("COUPON_CODE".equals(parser.getName())) {
                        this._COUPON_CODE = parser.nextText();
                    } else if ("COUPON_MONEY".equals(parser.getName())) {
                        this._COUPON_MONEY = parser.nextText();
                    } else if ("EQUITY_FIT_RES_FLIGHT".equals(parser.getName())) {
                        this._EQUITY_FIT_RES_FLIGHT = parser.nextText();
                    } else if ("FARE_BASIS".equals(parser.getName())) {
                        this._FARE_BASIS = parser.nextText();
                    } else if ("FARE_EI".equals(parser.getName())) {
                        this._FARE_EI = parser.nextText();
                    } else if ("FEE_TYPE".equals(parser.getName())) {
                        this._FEE_TYPE = parser.nextText();
                    } else if ("QUICK_CLASS_LEVEL".equals(parser.getName())) {
                        this._QUICK_CLASS_LEVEL = parser.nextText();
                    } else if ("FREE_TYPE".equals(parser.getName())) {
                        this._FREE_TYPE = parser.nextText();
                    } else if ("HANDLING_FEE".equals(parser.getName())) {
                        this._HANDLING_FEE = Integer.valueOf(parser.nextText());
                    } else if ("ORI_HANDLING_FEE".equals(parser.getName())) {
                        this._ORI_HANDLING_FEE = Integer.valueOf(parser.nextText());
                    } else if ("ORI_UP_FEE".equals(parser.getName())) {
                        this._ORI_UP_FEE = Integer.valueOf(parser.nextText());
                    } else if ("PNR".equals(parser.getName())) {
                        this._PNR = parser.nextText();
                    } else if ("PSGR_NAME".equals(parser.getName())) {
                        this._PSGR_NAME = parser.nextText();
                    } else if ("PAX_TYPE".equals(parser.getName())) {
                        this._PAX_TYPE = parser.nextText();
                    } else if ("TICKET_NO".equals(parser.getName())) {
                        this._TICKET_NO = parser.nextText();
                    } else if ("FEE_TOTAL".equals(parser.getName())) {
                        this._FEE_TOTAL = Integer.valueOf(parser.nextText());
                    } else if ("UP_FEE".equals(parser.getName())) {
                        this._UP_FEE = Integer.valueOf(parser.nextText());
                    } else if ("VALIDATE_SINGLE_PROD".equals(parser.getName())) {
                        this._VALIDATE_SINGLE_PROD = parser.nextText();
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