package com.common.szair.model.allchangedate;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class babyInfoVO extends baseDTOVO implements SOAPObject, Serializable {
    public String _BABY_NAME = null;
    public String _BIRTH_DAY = null;
    public String _BABY_ID_NBR = null;
    public String _BABY_CERT_TYPE = null;
    public List<reschedulePartnerTicketInfo> _BABY_TICKET_INFO = null;
    public String _TK_NO = null;
    public String _BABY_FIRST_NAME = null;
    public String _BABY_LAST_NAME = null;
    public String _BABY_CN_FIRST_NAME = null;
    public String _BABY_CN_LAST_NAME = null;
    public String _BABY_ISSUE_NATION = null;
    public String _BABY_NATION = null;
    public String _BABY_SEX = null;
    public String _BABY_EXPIRATION_DATE = null;
    public String _BABY_PHONE = null;
    public boolean isCurrent = false;
    public String _BABY_PASS_NO = null;
    public String _BABY_AES_NO = null;
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
        if (this._BABY_NAME != null) {
            xml.startTag(null, "BABY_NAME");
            xml.text(this._BABY_NAME);
            xml.endTag(null, "BABY_NAME");
        }
        if (this._BIRTH_DAY != null) {
            xml.startTag(null, "BIRTH_DAY");
            xml.text(this._BIRTH_DAY);
            xml.endTag(null, "BIRTH_DAY");
        }
        if (this._BABY_ID_NBR != null) {
            xml.startTag(null, "BABY_ID_NBR");
            xml.text(this._BABY_ID_NBR);
            xml.endTag(null, "BABY_ID_NBR");
        }
        if (this._BABY_CERT_TYPE != null) {
            xml.startTag(null, "BABY_CERT_TYPE");
            xml.text(this._BABY_CERT_TYPE);
            xml.endTag(null, "BABY_CERT_TYPE");
        }
        if (this._BABY_FIRST_NAME != null) {
            xml.startTag(null, "BABY_FIRST_NAME");
            xml.text(String.valueOf(this._BABY_FIRST_NAME));
            xml.endTag(null, "BABY_FIRST_NAME");
        }
        if (this._BABY_LAST_NAME != null) {
            xml.startTag(null, "BABY_LAST_NAME");
            xml.text(String.valueOf(this._BABY_LAST_NAME));
            xml.endTag(null, "BABY_LAST_NAME");
        }
        if (this._BABY_CN_FIRST_NAME != null) {
            xml.startTag(null, "BABY_CN_FIRST_NAME");
            xml.text(String.valueOf(this._BABY_CN_FIRST_NAME));
            xml.endTag(null, "BABY_CN_FIRST_NAME");
        }
        if (this._BABY_CN_LAST_NAME != null) {
            xml.startTag(null, "BABY_CN_LAST_NAME");
            xml.text(String.valueOf(this._BABY_CN_LAST_NAME));
            xml.endTag(null, "BABY_CN_LAST_NAME");
        }
        if (this._BABY_ISSUE_NATION != null) {
            xml.startTag(null, "BABY_ISSUE_NATION");
            xml.text(String.valueOf(this._BABY_ISSUE_NATION));
            xml.endTag(null, "BABY_ISSUE_NATION");
        }
        if (this._BABY_NATION != null) {
            xml.startTag(null, "BABY_NATION");
            xml.text(String.valueOf(this._BABY_NATION));
            xml.endTag(null, "BABY_NATION");
        }
        if (this._BABY_SEX != null) {
            xml.startTag(null, "BABY_SEX");
            xml.text(String.valueOf(this._BABY_SEX));
            xml.endTag(null, "BABY_SEX");
        }
        if (this._BABY_EXPIRATION_DATE != null) {
            xml.startTag(null, "BABY_EXPIRATION_DATE");
            xml.text(String.valueOf(this._BABY_EXPIRATION_DATE));
            xml.endTag(null, "BABY_EXPIRATION_DATE");
        }
        List<reschedulePartnerTicketInfo> list = this._BABY_TICKET_INFO;
        if (list != null && list.size() > 0) {
            int size = this._BABY_TICKET_INFO.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "BABY_TICKET_INFO");
                this._BABY_TICKET_INFO.get(i).addElementsToNode(xml);
                xml.endTag(null, "BABY_TICKET_INFO");
            }
        }
        if (this._TK_NO != null) {
            xml.startTag(null, "TK_NO");
            xml.text(this._TK_NO);
            xml.endTag(null, "TK_NO");
        }
        if (this._BABY_PHONE != null) {
            xml.startTag(null, "BABY_PHONE");
            xml.text(String.valueOf(this._BABY_PHONE));
            xml.endTag(null, "BABY_PHONE");
        }
        if (this._BABY_PASS_NO != null) {
            xml.startTag(null, "BABY_PASS_NO");
            xml.text(String.valueOf(this._BABY_PASS_NO));
            xml.endTag(null, "BABY_PASS_NO");
        }
        if (this._BABY_AES_NO != null) {
            xml.startTag(null, "BABY_AES_NO");
            xml.text(String.valueOf(this._BABY_AES_NO));
            xml.endTag(null, "BABY_AES_NO");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("BABY_NAME".equals(parser.getName())) {
                        this._BABY_NAME = parser.nextText();
                    } else if ("BIRTH_DAY".equals(parser.getName())) {
                        this._BIRTH_DAY = parser.nextText();
                    } else if ("BABY_ID_NBR".equals(parser.getName())) {
                        this._BABY_ID_NBR = parser.nextText();
                    } else if ("BABY_CERT_TYPE".equals(parser.getName())) {
                        this._BABY_CERT_TYPE = parser.nextText();
                    } else if ("BABY_FIRST_NAME".equals(parser.getName())) {
                        this._BABY_FIRST_NAME = parser.nextText();
                    } else if ("BABY_LAST_NAME".equals(parser.getName())) {
                        this._BABY_LAST_NAME = parser.nextText();
                    } else if ("BABY_CN_FIRST_NAME".equals(parser.getName())) {
                        this._BABY_CN_FIRST_NAME = parser.nextText();
                    } else if ("BABY_CN_LAST_NAME".equals(parser.getName())) {
                        this._BABY_CN_LAST_NAME = parser.nextText();
                    } else if ("BABY_ISSUE_NATION".equals(parser.getName())) {
                        this._BABY_ISSUE_NATION = parser.nextText();
                    } else if ("BABY_NATION".equals(parser.getName())) {
                        this._BABY_NATION = parser.nextText();
                    } else if ("BABY_SEX".equals(parser.getName())) {
                        this._BABY_SEX = parser.nextText();
                    } else if ("BABY_EXPIRATION_DATE".equals(parser.getName())) {
                        this._BABY_EXPIRATION_DATE = parser.nextText();
                    } else if ("BABY_TICKET_INFO".equals(parser.getName())) {
                        if (this._BABY_TICKET_INFO == null) {
                            this._BABY_TICKET_INFO = new ArrayList();
                        }
                        reschedulePartnerTicketInfo reschedulepartnerticketinfo = new reschedulePartnerTicketInfo();
                        reschedulepartnerticketinfo.parse(binding, parser);
                        this._BABY_TICKET_INFO.add(reschedulepartnerticketinfo);
                    } else if ("BABY_PHONE".equals(parser.getName())) {
                        this._BABY_PHONE = parser.nextText();
                    } else if ("TK_NO".equals(parser.getName())) {
                        this._TK_NO = parser.nextText();
                    } else if ("BABY_PASS_NO".equals(parser.getName())) {
                        this._BABY_PASS_NO = parser.nextText();
                    } else if ("BABY_AES_NO".equals(parser.getName())) {
                        this._BABY_AES_NO = parser.nextText();
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