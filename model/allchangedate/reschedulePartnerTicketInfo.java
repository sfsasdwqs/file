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
public class reschedulePartnerTicketInfo extends baseDTOVO implements SOAPObject, Serializable {
    public Integer _babyRate = null;
    public String _MILEAGE_FLAG = null;
    public String _ZERO_CHANGE_FLAG = null;
    public String _PTN_PNR = null;
    public Integer _rate = null;
    public classCodeRateInfo _PTN_RESCHEDULE_RATE = null;
    public String _PTN_SEG_CABIN = null;
    public Integer _PTN_SEG_IDX = null;
    public Integer _PTN_SEG_PRICE = null;
    public String _PTN_SEG_STATUS = null;
    public List<String> _specialEffectiveDates = null;
    public String _specialRescheduleDateUnlimited = null;
    public String _specialRescheduleFlag = null;
    public List<String> _specialRescheduleNodeDate = null;
    public String _specialRescheduleType = null;
    public String _PTN_TICKET_NO = null;
    public String _YHDJK_ADD_MONEY = null;
    public String _YHDJK_COUNT = null;
    public String _YHDJK_COUPON_MONEY = null;
    public String _yhdjkProductCode = null;
    public String _YHDJK_USE_MONEY = null;
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
        if (this._babyRate != null) {
            xml.startTag(null, "babyRate");
            xml.text(String.valueOf(this._babyRate));
            xml.endTag(null, "babyRate");
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
        if (this._PTN_PNR != null) {
            xml.startTag(null, "PTN_PNR");
            xml.text(this._PTN_PNR);
            xml.endTag(null, "PTN_PNR");
        }
        if (this._rate != null) {
            xml.startTag(null, "rate");
            xml.text(String.valueOf(this._rate));
            xml.endTag(null, "rate");
        }
        if (this._PTN_RESCHEDULE_RATE != null) {
            xml.startTag(null, "PTN_RESCHEDULE_RATE");
            this._PTN_RESCHEDULE_RATE.addElementsToNode(xml);
            xml.endTag(null, "PTN_RESCHEDULE_RATE");
        }
        if (this._PTN_SEG_CABIN != null) {
            xml.startTag(null, "PTN_SEG_CABIN");
            xml.text(this._PTN_SEG_CABIN);
            xml.endTag(null, "PTN_SEG_CABIN");
        }
        if (this._PTN_SEG_IDX != null) {
            xml.startTag(null, "PTN_SEG_IDX");
            xml.text(String.valueOf(this._PTN_SEG_IDX));
            xml.endTag(null, "PTN_SEG_IDX");
        }
        if (this._PTN_SEG_PRICE != null) {
            xml.startTag(null, "PTN_SEG_PRICE");
            xml.text(String.valueOf(this._PTN_SEG_PRICE));
            xml.endTag(null, "PTN_SEG_PRICE");
        }
        if (this._PTN_SEG_STATUS != null) {
            xml.startTag(null, "PTN_SEG_STATUS");
            xml.text(this._PTN_SEG_STATUS);
            xml.endTag(null, "PTN_SEG_STATUS");
        }
        List<String> list = this._specialEffectiveDates;
        if (list != null && list.size() > 0) {
            int size = this._specialEffectiveDates.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "specialEffectiveDates");
                xml.text(this._specialEffectiveDates.get(i));
                xml.endTag(null, "specialEffectiveDates");
            }
        }
        if (this._specialRescheduleDateUnlimited != null) {
            xml.startTag(null, "specialRescheduleDateUnlimited");
            xml.text(this._specialRescheduleDateUnlimited);
            xml.endTag(null, "specialRescheduleDateUnlimited");
        }
        if (this._specialRescheduleFlag != null) {
            xml.startTag(null, "specialRescheduleFlag");
            xml.text(this._specialRescheduleFlag);
            xml.endTag(null, "specialRescheduleFlag");
        }
        List<String> list2 = this._specialRescheduleNodeDate;
        if (list2 != null && list2.size() > 0) {
            int size2 = this._specialRescheduleNodeDate.size();
            for (int i2 = 0; i2 < size2; i2++) {
                xml.startTag(null, "specialRescheduleNodeDate");
                xml.text(this._specialRescheduleNodeDate.get(i2));
                xml.endTag(null, "specialRescheduleNodeDate");
            }
        }
        if (this._specialRescheduleType != null) {
            xml.startTag(null, "specialRescheduleType");
            xml.text(this._specialRescheduleType);
            xml.endTag(null, "specialRescheduleType");
        }
        if (this._PTN_TICKET_NO != null) {
            xml.startTag(null, "PTN_TICKET_NO");
            xml.text(this._PTN_TICKET_NO);
            xml.endTag(null, "PTN_TICKET_NO");
        }
        if (this._YHDJK_ADD_MONEY != null) {
            xml.startTag(null, "YHDJK_ADD_MONEY");
            xml.text(this._YHDJK_ADD_MONEY);
            xml.endTag(null, "YHDJK_ADD_MONEY");
        }
        if (this._YHDJK_COUNT != null) {
            xml.startTag(null, "YHDJK_COUNT");
            xml.text(this._YHDJK_COUNT);
            xml.endTag(null, "YHDJK_COUNT");
        }
        if (this._YHDJK_COUPON_MONEY != null) {
            xml.startTag(null, "YHDJK_COUPON_MONEY");
            xml.text(this._YHDJK_COUPON_MONEY);
            xml.endTag(null, "YHDJK_COUPON_MONEY");
        }
        if (this._yhdjkProductCode != null) {
            xml.startTag(null, "yhdjkProductCode");
            xml.text(this._yhdjkProductCode);
            xml.endTag(null, "yhdjkProductCode");
        }
        if (this._YHDJK_USE_MONEY != null) {
            xml.startTag(null, "YHDJK_USE_MONEY");
            xml.text(this._YHDJK_USE_MONEY);
            xml.endTag(null, "YHDJK_USE_MONEY");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("babyRate".equals(parser.getName())) {
                        this._babyRate = Integer.valueOf(parser.nextText());
                    } else if ("MILEAGE_FLAG".equals(parser.getName())) {
                        this._MILEAGE_FLAG = parser.nextText();
                    } else if ("ZERO_CHANGE_FLAG".equals(parser.getName())) {
                        this._ZERO_CHANGE_FLAG = parser.nextText();
                    } else if ("PTN_PNR".equals(parser.getName())) {
                        this._PTN_PNR = parser.nextText();
                    } else if ("rate".equals(parser.getName())) {
                        this._rate = Integer.valueOf(parser.nextText());
                    } else if ("PTN_RESCHEDULE_RATE".equals(parser.getName())) {
                        classCodeRateInfo classcoderateinfo = new classCodeRateInfo();
                        classcoderateinfo.parse(binding, parser);
                        this._PTN_RESCHEDULE_RATE = classcoderateinfo;
                    } else if ("PTN_SEG_CABIN".equals(parser.getName())) {
                        this._PTN_SEG_CABIN = parser.nextText();
                    } else if ("PTN_SEG_IDX".equals(parser.getName())) {
                        this._PTN_SEG_IDX = Integer.valueOf(parser.nextText());
                    } else if ("PTN_SEG_PRICE".equals(parser.getName())) {
                        this._PTN_SEG_PRICE = Integer.valueOf(parser.nextText());
                    } else if ("PTN_SEG_STATUS".equals(parser.getName())) {
                        this._PTN_SEG_STATUS = parser.nextText();
                    } else if ("specialEffectiveDates".equals(parser.getName())) {
                        if (this._specialEffectiveDates == null) {
                            this._specialEffectiveDates = new ArrayList();
                        }
                        this._specialEffectiveDates.add(parser.nextText());
                    } else if ("specialRescheduleDateUnlimited".equals(parser.getName())) {
                        this._specialRescheduleDateUnlimited = parser.nextText();
                    } else if ("specialRescheduleFlag".equals(parser.getName())) {
                        this._specialRescheduleFlag = parser.nextText();
                    } else if ("specialRescheduleNodeDate".equals(parser.getName())) {
                        if (this._specialRescheduleNodeDate == null) {
                            this._specialRescheduleNodeDate = new ArrayList();
                        }
                        this._specialRescheduleNodeDate.add(parser.nextText());
                    } else if ("specialRescheduleType".equals(parser.getName())) {
                        this._specialRescheduleType = parser.nextText();
                    } else if ("PTN_TICKET_NO".equals(parser.getName())) {
                        this._PTN_TICKET_NO = parser.nextText();
                    } else if ("YHDJK_ADD_MONEY".equals(parser.getName())) {
                        this._YHDJK_ADD_MONEY = parser.nextText();
                    } else if ("YHDJK_COUNT".equals(parser.getName())) {
                        this._YHDJK_COUNT = parser.nextText();
                    } else if ("YHDJK_COUPON_MONEY".equals(parser.getName())) {
                        this._YHDJK_COUPON_MONEY = parser.nextText();
                    } else if ("yhdjkProductCode".equals(parser.getName())) {
                        this._yhdjkProductCode = parser.nextText();
                    } else if ("YHDJK_USE_MONEY".equals(parser.getName())) {
                        this._YHDJK_USE_MONEY = parser.nextText();
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