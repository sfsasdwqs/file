package com.common.szair.model.allchangedate;

import com.air.sz.bean.ChangeDateFeeBean;
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
public class reschedulePartnerInfoVO extends baseDTOVO implements SOAPObject, Serializable {
    public int _COMPANION_ID;
    public String _LAST_ONE;
    public String _LAST_THREE;
    public String _LAST_TWO;
    public List<ChangeDateFeeBean> babyClsFees;
    public List<ChangeDateFeeBean> clsFee;
    public babyInfoVO _BABY_INFO = null;
    public String _PAX_BIRTHDAY = null;
    public String _INDVL_ID_NBR = null;
    public String _INDVL_ID_TYPE = null;
    public String _MILEAGE_FLAG = null;
    public String _ZERO_CHANGE_FLAG = null;
    public String _PAX_NM = null;
    public String _PAX_TYPE = null;
    public String _PRIMARY_TIER_NAME = null;
    public String _PAX_REAL_TYPE = null;
    public List<reschedulePartnerTicketInfo> _PARTNER_TICKET_INFO = null;
    public String _TOUR_CODE = null;
    public String _PARTNER_UUID = null;
    public String _FIRST_NAME = null;
    public String _LAST_NAME = null;
    public String _CN_FIRST_NAME = null;
    public String _CN_LAST_NAME = null;
    public String _ISSUE_NATION = null;
    public String _NATION = null;
    public String _SEX = null;
    public String _EXPIRATION_DATE = null;
    public String _PARTNER_PHONE = null;
    public String _AES_NO = null;
    public String _SPEC_TICKET_TYPE = null;
    public boolean _IS_CHECKED = false;
    public boolean _IS_ENABLE = true;
    public boolean _IS_ADD = false;
    public boolean _IS_COMPANION = false;
    public String _PASS_NO = null;
    public boolean isSelf = false;
    public boolean otherChange = false;
    public boolean isCurrent = false;
    public boolean isNeedIdLastThree = false;
    public boolean isMainChange = false;
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
        if (this._BABY_INFO != null) {
            xml.startTag(null, "BABY_INFO");
            this._BABY_INFO.addElementsToNode(xml);
            xml.endTag(null, "BABY_INFO");
        }
        if (this._PAX_BIRTHDAY != null) {
            xml.startTag(null, "PAX_BIRTHDAY");
            xml.text(this._PAX_BIRTHDAY);
            xml.endTag(null, "PAX_BIRTHDAY");
        }
        if (this._INDVL_ID_NBR != null) {
            xml.startTag(null, "INDVL_ID_NBR");
            xml.text(this._INDVL_ID_NBR);
            xml.endTag(null, "INDVL_ID_NBR");
        }
        if (this._INDVL_ID_TYPE != null) {
            xml.startTag(null, "INDVL_ID_TYPE");
            xml.text(this._INDVL_ID_TYPE);
            xml.endTag(null, "INDVL_ID_TYPE");
        }
        if (this._MILEAGE_FLAG != null) {
            xml.startTag(null, "MILEAGE_FLAG");
            xml.text(this._MILEAGE_FLAG);
            xml.endTag(null, "MILEAGE_FLAG");
        }
        if (this._ZERO_CHANGE_FLAG != null) {
            xml.startTag(null, "ZERO_CHANGE_FLAG");
            xml.text(this._ZERO_CHANGE_FLAG);
            xml.endTag(null, "ZERO_CHANGE_FLAG");
        }
        if (this._PAX_NM != null) {
            xml.startTag(null, "PAX_NM");
            xml.text(this._PAX_NM);
            xml.endTag(null, "PAX_NM");
        }
        if (this._PAX_TYPE != null) {
            xml.startTag(null, "PAX_TYPE");
            xml.text(this._PAX_TYPE);
            xml.endTag(null, "PAX_TYPE");
        }
        if (this._PRIMARY_TIER_NAME != null) {
            xml.startTag(null, "PRIMARY_TIER_NAME");
            xml.text(this._PRIMARY_TIER_NAME);
            xml.endTag(null, "PRIMARY_TIER_NAME");
        }
        if (this._PAX_REAL_TYPE != null) {
            xml.startTag(null, "PAX_REAL_TYPE");
            xml.text(this._PAX_REAL_TYPE);
            xml.endTag(null, "PAX_REAL_TYPE");
        }
        List<reschedulePartnerTicketInfo> list = this._PARTNER_TICKET_INFO;
        if (list != null && list.size() > 0) {
            int size = this._PARTNER_TICKET_INFO.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "PARTNER_TICKET_INFO");
                this._PARTNER_TICKET_INFO.get(i).addElementsToNode(xml);
                xml.endTag(null, "PARTNER_TICKET_INFO");
            }
        }
        if (this._TOUR_CODE != null) {
            xml.startTag(null, "TOUR_CODE");
            xml.text(this._TOUR_CODE);
            xml.endTag(null, "TOUR_CODE");
        }
        if (this._PARTNER_UUID != null) {
            xml.startTag(null, "PARTNER_UUID");
            xml.text(this._PARTNER_UUID);
            xml.endTag(null, "PARTNER_UUID");
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
        if (this._PARTNER_PHONE != null) {
            xml.startTag(null, "PARTNER_PHONE");
            xml.text(String.valueOf(this._PARTNER_PHONE));
            xml.endTag(null, "PARTNER_PHONE");
        }
        if (this._AES_NO != null) {
            xml.startTag(null, "AES_NO");
            xml.text(String.valueOf(this._AES_NO));
            xml.endTag(null, "AES_NO");
        }
        if (this._SPEC_TICKET_TYPE != null) {
            xml.startTag(null, "SPEC_TICKET_TYPE");
            xml.text(String.valueOf(this._SPEC_TICKET_TYPE));
            xml.endTag(null, "SPEC_TICKET_TYPE");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("BABY_INFO".equals(parser.getName())) {
                        babyInfoVO babyinfovo = new babyInfoVO();
                        babyinfovo.parse(binding, parser);
                        this._BABY_INFO = babyinfovo;
                    } else if ("PAX_BIRTHDAY".equals(parser.getName())) {
                        this._PAX_BIRTHDAY = parser.nextText();
                    } else if ("INDVL_ID_NBR".equals(parser.getName())) {
                        this._INDVL_ID_NBR = parser.nextText();
                    } else if ("INDVL_ID_TYPE".equals(parser.getName())) {
                        this._INDVL_ID_TYPE = parser.nextText();
                    } else if ("MILEAGE_FLAG".equals(parser.getName())) {
                        this._MILEAGE_FLAG = parser.nextText();
                    } else if ("ZERO_CHANGE_FLAG".equals(parser.getName())) {
                        this._ZERO_CHANGE_FLAG = parser.nextText();
                    } else if ("PAX_NM".equals(parser.getName())) {
                        this._PAX_NM = parser.nextText();
                    } else if ("PAX_TYPE".equals(parser.getName())) {
                        this._PAX_TYPE = parser.nextText();
                    } else if ("PRIMARY_TIER_NAME".equals(parser.getName())) {
                        this._PRIMARY_TIER_NAME = parser.nextText();
                    } else if ("PAX_REAL_TYPE".equals(parser.getName())) {
                        this._PAX_REAL_TYPE = parser.nextText();
                    } else if ("PARTNER_TICKET_INFO".equals(parser.getName())) {
                        if (this._PARTNER_TICKET_INFO == null) {
                            this._PARTNER_TICKET_INFO = new ArrayList();
                        }
                        reschedulePartnerTicketInfo reschedulepartnerticketinfo = new reschedulePartnerTicketInfo();
                        reschedulepartnerticketinfo.parse(binding, parser);
                        this._PARTNER_TICKET_INFO.add(reschedulepartnerticketinfo);
                    } else if ("TOUR_CODE".equals(parser.getName())) {
                        this._TOUR_CODE = parser.nextText();
                    } else if ("PARTNER_UUID".equals(parser.getName())) {
                        this._PARTNER_UUID = parser.nextText();
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
                    } else if ("PARTNER_PHONE".equals(parser.getName())) {
                        this._PARTNER_PHONE = parser.nextText();
                    } else if ("AES_NO".equals(parser.getName())) {
                        this._AES_NO = parser.nextText();
                    } else if ("SPEC_TICKET_TYPE".equals(parser.getName())) {
                        this._SPEC_TICKET_TYPE = parser.nextText();
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