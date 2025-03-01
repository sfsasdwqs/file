package com.common.szair.model.allchangedate;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class rescheduleCommitOrderPassengerInfoVO extends baseDTOVO implements SOAPObject {
    public String _ACCOMPANY_UUID = null;
    public String _CLASS_CODE = null;
    public String _DISCOUNT = null;
    public String _EI = null;
    public String _FARE_BASIC = null;
    public String _SPOLCODE = null;
    public Integer _HANDLING = null;
    public String _PARTNER_UUID = null;
    public String _PRODUCT_VALUE = null;
    public String _REAL_PRODUCT_VALUE = null;
    public Integer _PRICE = null;
    public Integer _UPGRADE = null;
    public String _FIRST_NAME = null;
    public String _LAST_NAME = null;
    public String _CN_FIRST_NAME = null;
    public String _CN_LAST_NAME = null;
    public String _ISSUE_NATION = null;
    public String _NATION = null;
    public String _SEX = null;
    public String _EXPIRATION_DATE = null;
    public String _CERT_NO = null;
    public String _CERT_TYPE = null;
    public String _BIRTHDAY = null;
    private java.lang.Exception _exception = null;

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/shenzhenair/mobilewebservice/allChannelTicketReschedule";
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
        if (this._ACCOMPANY_UUID != null) {
            xml.startTag(null, "ACCOMPANY_UUID");
            xml.text(this._ACCOMPANY_UUID);
            xml.endTag(null, "ACCOMPANY_UUID");
        }
        if (this._CLASS_CODE != null) {
            xml.startTag(null, "CLASS_CODE");
            xml.text(this._CLASS_CODE);
            xml.endTag(null, "CLASS_CODE");
        }
        if (this._DISCOUNT != null) {
            xml.startTag(null, "DISCOUNT");
            xml.text(this._DISCOUNT);
            xml.endTag(null, "DISCOUNT");
        }
        if (this._EI != null) {
            xml.startTag(null, "EI");
            xml.text(this._EI);
            xml.endTag(null, "EI");
        }
        if (this._FARE_BASIC != null) {
            xml.startTag(null, "FARE_BASIC");
            xml.text(this._FARE_BASIC);
            xml.endTag(null, "FARE_BASIC");
        }
        if (this._SPOLCODE != null) {
            xml.startTag(null, "SPOLCODE");
            xml.text(this._SPOLCODE);
            xml.endTag(null, "SPOLCODE");
        }
        if (this._HANDLING != null) {
            xml.startTag(null, "HANDLING");
            xml.text(String.valueOf(this._HANDLING));
            xml.endTag(null, "HANDLING");
        }
        if (this._PARTNER_UUID != null) {
            xml.startTag(null, "PARTNER_UUID");
            xml.text(this._PARTNER_UUID);
            xml.endTag(null, "PARTNER_UUID");
        }
        if (this._PRODUCT_VALUE != null) {
            xml.startTag(null, "PRODUCT_VALUE");
            xml.text(this._PRODUCT_VALUE);
            xml.endTag(null, "PRODUCT_VALUE");
        }
        if (this._PRICE != null) {
            xml.startTag(null, "PRICE");
            xml.text(String.valueOf(this._PRICE));
            xml.endTag(null, "PRICE");
        }
        if (this._UPGRADE != null) {
            xml.startTag(null, "UPGRADE");
            xml.text(String.valueOf(this._UPGRADE));
            xml.endTag(null, "UPGRADE");
        }
        if (this._REAL_PRODUCT_VALUE != null) {
            xml.startTag(null, "REAL_PRODUCT_VALUE");
            xml.text(String.valueOf(this._REAL_PRODUCT_VALUE));
            xml.endTag(null, "REAL_PRODUCT_VALUE");
        }
        if (this._FIRST_NAME != null) {
            xml.startTag(null, "FIRST_NAME");
            xml.text(String.valueOf(this._FIRST_NAME));
            xml.endTag(null, "FIRST_NAME");
        }
        if (this._LAST_NAME != null) {
            xml.startTag(null, "LAST_NAME");
            xml.text(String.valueOf(this._LAST_NAME));
            xml.endTag(null, "LAST_NAME");
        }
        if (this._CN_FIRST_NAME != null) {
            xml.startTag(null, "CN_FIRST_NAME");
            xml.text(String.valueOf(this._CN_FIRST_NAME));
            xml.endTag(null, "CN_FIRST_NAME");
        }
        if (this._CN_LAST_NAME != null) {
            xml.startTag(null, "CN_LAST_NAME");
            xml.text(String.valueOf(this._CN_LAST_NAME));
            xml.endTag(null, "CN_LAST_NAME");
        }
        if (this._ISSUE_NATION != null) {
            xml.startTag(null, "ISSUE_NATION");
            xml.text(String.valueOf(this._ISSUE_NATION));
            xml.endTag(null, "ISSUE_NATION");
        }
        if (this._NATION != null) {
            xml.startTag(null, "NATION");
            xml.text(String.valueOf(this._NATION));
            xml.endTag(null, "NATION");
        }
        if (this._SEX != null) {
            xml.startTag(null, "SEX");
            xml.text(String.valueOf(this._SEX));
            xml.endTag(null, "SEX");
        }
        if (this._EXPIRATION_DATE != null) {
            xml.startTag(null, "EXPIRATION_DATE");
            xml.text(String.valueOf(this._EXPIRATION_DATE));
            xml.endTag(null, "EXPIRATION_DATE");
        }
        if (this._CERT_NO != null) {
            xml.startTag(null, "CERT_NO");
            xml.text(String.valueOf(this._CERT_NO));
            xml.endTag(null, "CERT_NO");
        }
        if (this._CERT_TYPE != null) {
            xml.startTag(null, "CERT_TYPE");
            xml.text(String.valueOf(this._CERT_TYPE));
            xml.endTag(null, "CERT_TYPE");
        }
        if (this._BIRTHDAY != null) {
            xml.startTag(null, "BIRTHDAY");
            xml.text(String.valueOf(this._BIRTHDAY));
            xml.endTag(null, "BIRTHDAY");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("ACCOMPANY_UUID".equals(parser.getName())) {
                        this._ACCOMPANY_UUID = parser.nextText();
                    } else if ("CLASS_CODE".equals(parser.getName())) {
                        this._CLASS_CODE = parser.nextText();
                    } else if ("DISCOUNT".equals(parser.getName())) {
                        this._DISCOUNT = parser.nextText();
                    } else if ("EI".equals(parser.getName())) {
                        this._EI = parser.nextText();
                    } else if ("FARE_BASIC".equals(parser.getName())) {
                        this._FARE_BASIC = parser.nextText();
                    } else if ("SPOLCODE".equals(parser.getName())) {
                        this._SPOLCODE = parser.nextText();
                    } else if ("HANDLING".equals(parser.getName())) {
                        this._HANDLING = Integer.valueOf(parser.nextText());
                    } else if ("PARTNER_UUID".equals(parser.getName())) {
                        this._PARTNER_UUID = parser.nextText();
                    } else if ("PRODUCT_VALUE".equals(parser.getName())) {
                        this._PRODUCT_VALUE = parser.nextText();
                    } else if ("REAL_PRODUCT_VALUE".equals(parser.getName())) {
                        this._REAL_PRODUCT_VALUE = parser.nextText();
                    } else if ("FIRST_NAME".equals(parser.getName())) {
                        this._FIRST_NAME = parser.nextText();
                    } else if ("LAST_NAME".equals(parser.getName())) {
                        this._LAST_NAME = parser.nextText();
                    } else if ("CN_FIRST_NAME".equals(parser.getName())) {
                        this._CN_FIRST_NAME = parser.nextText();
                    } else if ("CN_LAST_NAME".equals(parser.getName())) {
                        this._CN_LAST_NAME = parser.nextText();
                    } else if ("ISSUE_NATION".equals(parser.getName())) {
                        this._ISSUE_NATION = parser.nextText();
                    } else if ("NATION".equals(parser.getName())) {
                        this._NATION = parser.nextText();
                    } else if ("SEX".equals(parser.getName())) {
                        this._SEX = parser.nextText();
                    } else if ("EXPIRATION_DATE".equals(parser.getName())) {
                        this._EXPIRATION_DATE = parser.nextText();
                    } else if ("CERT_NO".equals(parser.getName())) {
                        this._CERT_NO = parser.nextText();
                    } else if ("CERT_TYPE".equals(parser.getName())) {
                        this._CERT_TYPE = parser.nextText();
                    } else if ("BIRTHDAY".equals(parser.getName())) {
                        this._BIRTHDAY = parser.nextText();
                    } else if ("PRICE".equals(parser.getName())) {
                        this._PRICE = Integer.valueOf(parser.nextText());
                    } else if ("UPGRADE".equals(parser.getName())) {
                        this._UPGRADE = Integer.valueOf(parser.nextText());
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