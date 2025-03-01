package com.common.szair.model.alilogin;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class alipayUserinfoShareRespVO extends baseRespVO implements SOAPObject {
    public String _CITY = null;
    public String _COUNTY = null;
    public String _CRM_FREQUENT_FLYER_FLAG = null;
    public String _DETAIL_ADDRESS = null;
    public String _DOCUMENT_NO = null;
    public String _DOCUMEMT_TYPE = null;
    public String _FIRSTNAME_CN = null;
    public String _FIRSTNAME_EN = null;
    public String _POSTCODE = null;
    public String _PROVINCE = null;
    public String _SEX = null;
    public String _SURNAME_CN = null;
    public String _SURNAME_EN = null;
    public String _CODE = null;
    public String _MSG = null;
    private Exception _exception = null;

    @Override // com.common.szair.model.alilogin.baseRespVO, com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.alilogin.baseRespVO, com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/szcares/member/webservice/userinfoShare";
    }

    @Override // com.common.szair.model.alilogin.baseRespVO, com.common.szair.model.soap.SOAPObject
    public void setexception(Exception _exception) {
        this._exception = _exception;
    }

    @Override // com.common.szair.model.alilogin.baseRespVO, com.common.szair.model.soap.SOAPObject
    public Exception getexception() {
        return this._exception;
    }

    @Override // com.common.szair.model.alilogin.baseRespVO, com.common.szair.model.soap.SOAPObject
    public void toXml(XmlSerializer xml, String name, String namespace) throws IOException {
        if (namespace == null || namespace.length() <= 0) {
            namespace = getNamespace();
        }
        xml.startTag(namespace, name);
        addAttributesToNode(xml);
        addElementsToNode(xml);
        xml.endTag(namespace, name);
    }

    @Override // com.common.szair.model.alilogin.baseRespVO, com.common.szair.model.soap.SOAPObject
    public void addElementsToNode(XmlSerializer xml) throws IOException {
        if (this._CITY != null) {
            xml.startTag(null, "CITY");
            xml.text(this._CITY);
            xml.endTag(null, "CITY");
        }
        if (this._COUNTY != null) {
            xml.startTag(null, "COUNTY");
            xml.text(this._COUNTY);
            xml.endTag(null, "COUNTY");
        }
        if (this._CRM_FREQUENT_FLYER_FLAG != null) {
            xml.startTag(null, "CRM_FREQUENT_FLYER_FLAG");
            xml.text(this._CRM_FREQUENT_FLYER_FLAG);
            xml.endTag(null, "CRM_FREQUENT_FLYER_FLAG");
        }
        if (this._DETAIL_ADDRESS != null) {
            xml.startTag(null, "DETAIL_ADDRESS");
            xml.text(this._DETAIL_ADDRESS);
            xml.endTag(null, "DETAIL_ADDRESS");
        }
        if (this._DOCUMENT_NO != null) {
            xml.startTag(null, "DOCUMENT_NO");
            xml.text(this._DOCUMENT_NO);
            xml.endTag(null, "DOCUMENT_NO");
        }
        if (this._DOCUMEMT_TYPE != null) {
            xml.startTag(null, "DOCUMEMT_TYPE");
            xml.text(this._DOCUMEMT_TYPE);
            xml.endTag(null, "DOCUMEMT_TYPE");
        }
        if (this._FIRSTNAME_CN != null) {
            xml.startTag(null, "FIRSTNAME_CN");
            xml.text(this._FIRSTNAME_CN);
            xml.endTag(null, "FIRSTNAME_CN");
        }
        if (this._FIRSTNAME_EN != null) {
            xml.startTag(null, "FIRSTNAME_EN");
            xml.text(this._FIRSTNAME_EN);
            xml.endTag(null, "FIRSTNAME_EN");
        }
        if (this._POSTCODE != null) {
            xml.startTag(null, "POSTCODE");
            xml.text(this._POSTCODE);
            xml.endTag(null, "POSTCODE");
        }
        if (this._PROVINCE != null) {
            xml.startTag(null, "PROVINCE");
            xml.text(this._PROVINCE);
            xml.endTag(null, "PROVINCE");
        }
        if (this._SEX != null) {
            xml.startTag(null, "SEX");
            xml.text(this._SEX);
            xml.endTag(null, "SEX");
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
        if (this._CODE != null) {
            xml.startTag(null, "CODE");
            xml.text(this._CODE);
            xml.endTag(null, "CODE");
        }
        if (this._MSG != null) {
            xml.startTag(null, "MSG");
            xml.text(this._MSG);
            xml.endTag(null, "MSG");
        }
    }

    @Override // com.common.szair.model.alilogin.baseRespVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("CITY".equals(parser.getName())) {
                        this._CITY = parser.nextText();
                    } else if ("COUNTY".equals(parser.getName())) {
                        this._COUNTY = parser.nextText();
                    } else if ("CRM_FREQUENT_FLYER_FLAG".equals(parser.getName())) {
                        this._CRM_FREQUENT_FLYER_FLAG = parser.nextText();
                    } else if ("DETAIL_ADDRESS".equals(parser.getName())) {
                        this._DETAIL_ADDRESS = parser.nextText();
                    } else if ("DOCUMENT_NO".equals(parser.getName())) {
                        this._DOCUMENT_NO = parser.nextText();
                    } else if ("DOCUMEMT_TYPE".equals(parser.getName())) {
                        this._DOCUMEMT_TYPE = parser.nextText();
                    } else if ("FIRSTNAME_CN".equals(parser.getName())) {
                        this._FIRSTNAME_CN = parser.nextText();
                    } else if ("FIRSTNAME_EN".equals(parser.getName())) {
                        this._FIRSTNAME_EN = parser.nextText();
                    } else if ("POSTCODE".equals(parser.getName())) {
                        this._POSTCODE = parser.nextText();
                    } else if ("PROVINCE".equals(parser.getName())) {
                        this._PROVINCE = parser.nextText();
                    } else if ("SEX".equals(parser.getName())) {
                        this._SEX = parser.nextText();
                    } else if ("SURNAME_CN".equals(parser.getName())) {
                        this._SURNAME_CN = parser.nextText();
                    } else if ("SURNAME_EN".equals(parser.getName())) {
                        this._SURNAME_EN = parser.nextText();
                    } else if ("CODE".equals(parser.getName())) {
                        this._CODE = parser.nextText();
                    } else if ("MSG".equals(parser.getName())) {
                        this._MSG = parser.nextText();
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