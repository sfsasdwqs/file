package com.common.szair.model.allchangedate;

import android.text.TextUtils;
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
public class rescheduleClassInfoVO extends baseDTOVO implements SOAPObject, Serializable {
    public String _AFTER_HOURS_REFUND = null;
    public String _AFTER_HOURS_REFUND_MONEY = null;
    public String _AFTER_HOURS_RESCHEDULE = null;
    public String _AFTER_HOURS_RESCHEDULE_MONEY = null;
    public String _BABY_TICKET_PRICE = null;
    public String _BASE_DISCOUNT = null;
    public String _BEFORE_DAYS_REFUND = null;
    public String _BEFORE_DAYS_REFUND_MONEY = null;
    public String _BEFORE_DAYS_RESCHEDULE = null;
    public String _BEFORE_DAYS_RESCHEDULE_MONEY = null;
    public String _BEFORE_HOURS_REFUND = null;
    public String _BEFORE_HOURS_REFUND_MONEY = null;
    public String _BEFORE_HOURS_RESCHEDULE = null;
    public String _BEFORE_HOURS_RESCHEDULE_MONEY = null;
    public String _BEFORE_WEEK_REFUND = null;
    public String _BEFORE_WEEK_REFUND_MONEY = null;
    public String _BEFORE_WEEK_RESCHEDULE = null;
    public String _BEFORE_WEEK_RESCHEDULE_MONEY = null;
    public String _CHANGE_REFUND = null;
    public String _CHILD_TICKET_PRICE = null;
    public String _CHOSE_FLIGHT_SHOW = null;
    public String _CLASS_CODE = null;
    public String _YST_SAME_CABIN = null;
    public List<rescheduleClassFeeInfoVO> _RESCHEDULE_SPECIAL_FEE = null;
    public String _CLASS_NAME = null;
    public String _CLASS_PRICE = null;
    public String _CLASS_TYPE = null;
    public String _DISCOUNT = null;
    public Integer _RESCHEDULE_HANDLING = null;
    public String _LOWEST_ACC = null;
    public String _PASSENGER_INFO_SHOW = null;
    public String _PRODUCT_VALUE = null;
    public String _PUBLIC_CLASS_PRICE = null;
    public String _REAL_PRODUCT_VALUE = null;
    public Integer _RESCHEDULE_TOTAL = null;
    public String _SPOLCODE = null;
    public String _STORGE = null;
    public String _TICKET_INFO_SHOW = null;
    public String _ZUNXIANG_FLAG = null;
    public String _MILE_ACC_PRO = null;
    public Integer _RESCHEDULE_UPGRADE = null;
    public String _NEWRULES_FLAG = null;
    public Integer freeTotal = null;
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
        if (this._AFTER_HOURS_REFUND != null) {
            xml.startTag(null, "AFTER_HOURS_REFUND");
            xml.text(this._AFTER_HOURS_REFUND);
            xml.endTag(null, "AFTER_HOURS_REFUND");
        }
        if (this._AFTER_HOURS_REFUND_MONEY != null) {
            xml.startTag(null, "AFTER_HOURS_REFUND_MONEY");
            xml.text(this._AFTER_HOURS_REFUND_MONEY);
            xml.endTag(null, "AFTER_HOURS_REFUND_MONEY");
        }
        if (this._AFTER_HOURS_RESCHEDULE != null) {
            xml.startTag(null, "AFTER_HOURS_RESCHEDULE");
            xml.text(this._AFTER_HOURS_RESCHEDULE);
            xml.endTag(null, "AFTER_HOURS_RESCHEDULE");
        }
        if (this._AFTER_HOURS_RESCHEDULE_MONEY != null) {
            xml.startTag(null, "AFTER_HOURS_RESCHEDULE_MONEY");
            xml.text(this._AFTER_HOURS_RESCHEDULE_MONEY);
            xml.endTag(null, "AFTER_HOURS_RESCHEDULE_MONEY");
        }
        if (this._BABY_TICKET_PRICE != null) {
            xml.startTag(null, "BABY_TICKET_PRICE");
            xml.text(this._BABY_TICKET_PRICE);
            xml.endTag(null, "BABY_TICKET_PRICE");
        }
        if (this._BASE_DISCOUNT != null) {
            xml.startTag(null, "BASE_DISCOUNT");
            xml.text(this._BASE_DISCOUNT);
            xml.endTag(null, "BASE_DISCOUNT");
        }
        if (this._BEFORE_DAYS_REFUND != null) {
            xml.startTag(null, "BEFORE_DAYS_REFUND");
            xml.text(this._BEFORE_DAYS_REFUND);
            xml.endTag(null, "BEFORE_DAYS_REFUND");
        }
        if (this._BEFORE_DAYS_REFUND_MONEY != null) {
            xml.startTag(null, "BEFORE_DAYS_REFUND_MONEY");
            xml.text(this._BEFORE_DAYS_REFUND_MONEY);
            xml.endTag(null, "BEFORE_DAYS_REFUND_MONEY");
        }
        if (this._BEFORE_DAYS_RESCHEDULE != null) {
            xml.startTag(null, "BEFORE_DAYS_RESCHEDULE");
            xml.text(this._BEFORE_DAYS_RESCHEDULE);
            xml.endTag(null, "BEFORE_DAYS_RESCHEDULE");
        }
        if (this._BEFORE_DAYS_RESCHEDULE_MONEY != null) {
            xml.startTag(null, "BEFORE_DAYS_RESCHEDULE_MONEY");
            xml.text(this._BEFORE_DAYS_RESCHEDULE_MONEY);
            xml.endTag(null, "BEFORE_DAYS_RESCHEDULE_MONEY");
        }
        if (this._BEFORE_HOURS_REFUND != null) {
            xml.startTag(null, "BEFORE_HOURS_REFUND");
            xml.text(this._BEFORE_HOURS_REFUND);
            xml.endTag(null, "BEFORE_HOURS_REFUND");
        }
        if (this._BEFORE_HOURS_REFUND_MONEY != null) {
            xml.startTag(null, "BEFORE_HOURS_REFUND_MONEY");
            xml.text(this._BEFORE_HOURS_REFUND_MONEY);
            xml.endTag(null, "BEFORE_HOURS_REFUND_MONEY");
        }
        if (this._BEFORE_HOURS_RESCHEDULE != null) {
            xml.startTag(null, "BEFORE_HOURS_RESCHEDULE");
            xml.text(this._BEFORE_HOURS_RESCHEDULE);
            xml.endTag(null, "BEFORE_HOURS_RESCHEDULE");
        }
        if (this._BEFORE_HOURS_RESCHEDULE_MONEY != null) {
            xml.startTag(null, "BEFORE_HOURS_RESCHEDULE_MONEY");
            xml.text(this._BEFORE_HOURS_RESCHEDULE_MONEY);
            xml.endTag(null, "BEFORE_HOURS_RESCHEDULE_MONEY");
        }
        if (this._BEFORE_WEEK_REFUND != null) {
            xml.startTag(null, "BEFORE_WEEK_REFUND");
            xml.text(this._BEFORE_WEEK_REFUND);
            xml.endTag(null, "BEFORE_WEEK_REFUND");
        }
        if (this._BEFORE_WEEK_REFUND_MONEY != null) {
            xml.startTag(null, "BEFORE_WEEK_REFUND_MONEY");
            xml.text(this._BEFORE_WEEK_REFUND_MONEY);
            xml.endTag(null, "BEFORE_WEEK_REFUND_MONEY");
        }
        if (this._BEFORE_WEEK_RESCHEDULE != null) {
            xml.startTag(null, "BEFORE_WEEK_RESCHEDULE");
            xml.text(this._BEFORE_WEEK_RESCHEDULE);
            xml.endTag(null, "BEFORE_WEEK_RESCHEDULE");
        }
        if (this._BEFORE_WEEK_RESCHEDULE_MONEY != null) {
            xml.startTag(null, "BEFORE_WEEK_RESCHEDULE_MONEY");
            xml.text(this._BEFORE_WEEK_RESCHEDULE_MONEY);
            xml.endTag(null, "BEFORE_WEEK_RESCHEDULE_MONEY");
        }
        if (this._CHANGE_REFUND != null) {
            xml.startTag(null, "CHANGE_REFUND");
            xml.text(this._CHANGE_REFUND);
            xml.endTag(null, "CHANGE_REFUND");
        }
        if (this._CHILD_TICKET_PRICE != null) {
            xml.startTag(null, "CHILD_TICKET_PRICE");
            xml.text(this._CHILD_TICKET_PRICE);
            xml.endTag(null, "CHILD_TICKET_PRICE");
        }
        if (this._CHOSE_FLIGHT_SHOW != null) {
            xml.startTag(null, "CHOSE_FLIGHT_SHOW");
            xml.text(this._CHOSE_FLIGHT_SHOW);
            xml.endTag(null, "CHOSE_FLIGHT_SHOW");
        }
        if (this._CLASS_CODE != null) {
            xml.startTag(null, "CLASS_CODE");
            xml.text(this._CLASS_CODE);
            xml.endTag(null, "CLASS_CODE");
        }
        if (this._YST_SAME_CABIN != null) {
            xml.startTag(null, "YST_SAME_CABIN");
            xml.text(this._YST_SAME_CABIN);
            xml.endTag(null, "YST_SAME_CABIN");
        }
        List<rescheduleClassFeeInfoVO> list = this._RESCHEDULE_SPECIAL_FEE;
        if (list != null && list.size() > 0) {
            int size = this._RESCHEDULE_SPECIAL_FEE.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "RESCHEDULE_SPECIAL_FEE");
                this._RESCHEDULE_SPECIAL_FEE.get(i).addElementsToNode(xml);
                xml.endTag(null, "RESCHEDULE_SPECIAL_FEE");
            }
        }
        if (this._CLASS_NAME != null) {
            xml.startTag(null, "CLASS_NAME");
            xml.text(this._CLASS_NAME);
            xml.endTag(null, "CLASS_NAME");
        }
        if (this._CLASS_PRICE != null) {
            xml.startTag(null, "CLASS_PRICE");
            xml.text(this._CLASS_PRICE);
            xml.endTag(null, "CLASS_PRICE");
        }
        if (this._CLASS_TYPE != null) {
            xml.startTag(null, "CLASS_TYPE");
            xml.text(this._CLASS_TYPE);
            xml.endTag(null, "CLASS_TYPE");
        }
        if (this._DISCOUNT != null) {
            xml.startTag(null, "DISCOUNT");
            xml.text(this._DISCOUNT);
            xml.endTag(null, "DISCOUNT");
        }
        if (this._RESCHEDULE_HANDLING != null) {
            xml.startTag(null, "RESCHEDULE_HANDLING");
            xml.text(String.valueOf(this._RESCHEDULE_HANDLING));
            xml.endTag(null, "RESCHEDULE_HANDLING");
        }
        if (this._LOWEST_ACC != null) {
            xml.startTag(null, "LOWEST_ACC");
            xml.text(this._LOWEST_ACC);
            xml.endTag(null, "LOWEST_ACC");
        }
        if (this._PASSENGER_INFO_SHOW != null) {
            xml.startTag(null, "PASSENGER_INFO_SHOW");
            xml.text(this._PASSENGER_INFO_SHOW);
            xml.endTag(null, "PASSENGER_INFO_SHOW");
        }
        if (this._PRODUCT_VALUE != null) {
            xml.startTag(null, "PRODUCT_VALUE");
            xml.text(this._PRODUCT_VALUE);
            xml.endTag(null, "PRODUCT_VALUE");
        }
        if (this._PUBLIC_CLASS_PRICE != null) {
            xml.startTag(null, "PUBLIC_CLASS_PRICE");
            xml.text(this._PUBLIC_CLASS_PRICE);
            xml.endTag(null, "PUBLIC_CLASS_PRICE");
        }
        if (this._REAL_PRODUCT_VALUE != null) {
            xml.startTag(null, "REAL_PRODUCT_VALUE");
            xml.text(this._REAL_PRODUCT_VALUE);
            xml.endTag(null, "REAL_PRODUCT_VALUE");
        }
        if (this._RESCHEDULE_TOTAL != null) {
            xml.startTag(null, "RESCHEDULE_TOTAL");
            xml.text(String.valueOf(this._RESCHEDULE_TOTAL));
            xml.endTag(null, "RESCHEDULE_TOTAL");
        }
        if (this._SPOLCODE != null) {
            xml.startTag(null, "SPOLCODE");
            xml.text(this._SPOLCODE);
            xml.endTag(null, "SPOLCODE");
        }
        if (this._STORGE != null) {
            xml.startTag(null, "STORGE");
            xml.text(this._STORGE);
            xml.endTag(null, "STORGE");
        }
        if (this._TICKET_INFO_SHOW != null) {
            xml.startTag(null, "TICKET_INFO_SHOW");
            xml.text(this._TICKET_INFO_SHOW);
            xml.endTag(null, "TICKET_INFO_SHOW");
        }
        if (this._ZUNXIANG_FLAG != null) {
            xml.startTag(null, "ZUNXIANG_FLAG");
            xml.text(this._ZUNXIANG_FLAG);
            xml.endTag(null, "ZUNXIANG_FLAG");
        }
        if (this._NEWRULES_FLAG != null) {
            xml.startTag(null, "NEWRULES_FLAG");
            xml.text(this._NEWRULES_FLAG);
            xml.endTag(null, "NEWRULES_FLAG");
        }
        if (this._RESCHEDULE_UPGRADE != null) {
            xml.startTag(null, "RESCHEDULE_UPGRADE");
            xml.text(String.valueOf(this._RESCHEDULE_UPGRADE));
            xml.endTag(null, "RESCHEDULE_UPGRADE");
        }
        if (this._MILE_ACC_PRO != null) {
            xml.startTag(null, "MILE_ACC_PRO");
            xml.text(String.valueOf(this._MILE_ACC_PRO));
            xml.endTag(null, "MILE_ACC_PRO");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("AFTER_HOURS_REFUND".equals(parser.getName())) {
                        this._AFTER_HOURS_REFUND = parser.nextText();
                    } else if ("AFTER_HOURS_REFUND_MONEY".equals(parser.getName())) {
                        this._AFTER_HOURS_REFUND_MONEY = parser.nextText();
                    } else if ("AFTER_HOURS_RESCHEDULE".equals(parser.getName())) {
                        this._AFTER_HOURS_RESCHEDULE = parser.nextText();
                    } else if ("AFTER_HOURS_RESCHEDULE_MONEY".equals(parser.getName())) {
                        this._AFTER_HOURS_RESCHEDULE_MONEY = parser.nextText();
                    } else if ("BABY_TICKET_PRICE".equals(parser.getName())) {
                        this._BABY_TICKET_PRICE = parser.nextText();
                    } else if ("BASE_DISCOUNT".equals(parser.getName())) {
                        this._BASE_DISCOUNT = parser.nextText();
                    } else if ("BEFORE_DAYS_REFUND".equals(parser.getName())) {
                        this._BEFORE_DAYS_REFUND = parser.nextText();
                    } else if ("BEFORE_DAYS_REFUND_MONEY".equals(parser.getName())) {
                        this._BEFORE_DAYS_REFUND_MONEY = parser.nextText();
                    } else if ("BEFORE_DAYS_RESCHEDULE".equals(parser.getName())) {
                        this._BEFORE_DAYS_RESCHEDULE = parser.nextText();
                    } else if ("BEFORE_DAYS_RESCHEDULE_MONEY".equals(parser.getName())) {
                        this._BEFORE_DAYS_RESCHEDULE_MONEY = parser.nextText();
                    } else if ("BEFORE_HOURS_REFUND".equals(parser.getName())) {
                        this._BEFORE_HOURS_REFUND = parser.nextText();
                    } else if ("BEFORE_HOURS_REFUND_MONEY".equals(parser.getName())) {
                        this._BEFORE_HOURS_REFUND_MONEY = parser.nextText();
                    } else if ("BEFORE_HOURS_RESCHEDULE".equals(parser.getName())) {
                        this._BEFORE_HOURS_RESCHEDULE = parser.nextText();
                    } else if ("BEFORE_HOURS_RESCHEDULE_MONEY".equals(parser.getName())) {
                        this._BEFORE_HOURS_RESCHEDULE_MONEY = parser.nextText();
                    } else if ("BEFORE_WEEK_REFUND".equals(parser.getName())) {
                        this._BEFORE_WEEK_REFUND = parser.nextText();
                    } else if ("BEFORE_WEEK_REFUND_MONEY".equals(parser.getName())) {
                        this._BEFORE_WEEK_REFUND_MONEY = parser.nextText();
                    } else if ("BEFORE_WEEK_RESCHEDULE".equals(parser.getName())) {
                        this._BEFORE_WEEK_RESCHEDULE = parser.nextText();
                    } else if ("BEFORE_WEEK_RESCHEDULE_MONEY".equals(parser.getName())) {
                        this._BEFORE_WEEK_RESCHEDULE_MONEY = parser.nextText();
                    } else if ("CHANGE_REFUND".equals(parser.getName())) {
                        this._CHANGE_REFUND = parser.nextText();
                    } else if ("CHILD_TICKET_PRICE".equals(parser.getName())) {
                        this._CHILD_TICKET_PRICE = parser.nextText();
                    } else if ("CHOSE_FLIGHT_SHOW".equals(parser.getName())) {
                        this._CHOSE_FLIGHT_SHOW = parser.nextText();
                    } else if ("CLASS_CODE".equals(parser.getName())) {
                        this._CLASS_CODE = parser.nextText();
                    } else if ("YST_SAME_CABIN".equals(parser.getName())) {
                        this._YST_SAME_CABIN = parser.nextText();
                    } else if ("RESCHEDULE_SPECIAL_FEE".equals(parser.getName())) {
                        if (this._RESCHEDULE_SPECIAL_FEE == null) {
                            this._RESCHEDULE_SPECIAL_FEE = new ArrayList();
                        }
                        rescheduleClassFeeInfoVO rescheduleclassfeeinfovo = new rescheduleClassFeeInfoVO();
                        rescheduleclassfeeinfovo.parse(binding, parser);
                        this._RESCHEDULE_SPECIAL_FEE.add(rescheduleclassfeeinfovo);
                    } else if ("CLASS_NAME".equals(parser.getName())) {
                        this._CLASS_NAME = parser.nextText();
                    } else if ("CLASS_PRICE".equals(parser.getName())) {
                        String nextText = parser.nextText();
                        this._CLASS_PRICE = nextText;
                        if (nextText == null || TextUtils.equals(nextText, "null")) {
                            this._CLASS_PRICE = "0";
                        }
                    } else if ("CLASS_TYPE".equals(parser.getName())) {
                        this._CLASS_TYPE = parser.nextText();
                    } else if ("DISCOUNT".equals(parser.getName())) {
                        this._DISCOUNT = parser.nextText();
                    } else if ("RESCHEDULE_HANDLING".equals(parser.getName())) {
                        this._RESCHEDULE_HANDLING = Integer.valueOf(parser.nextText());
                    } else if ("LOWEST_ACC".equals(parser.getName())) {
                        this._LOWEST_ACC = parser.nextText();
                    } else if ("PASSENGER_INFO_SHOW".equals(parser.getName())) {
                        this._PASSENGER_INFO_SHOW = parser.nextText();
                    } else if ("PRODUCT_VALUE".equals(parser.getName())) {
                        this._PRODUCT_VALUE = parser.nextText();
                    } else if ("PUBLIC_CLASS_PRICE".equals(parser.getName())) {
                        this._PUBLIC_CLASS_PRICE = parser.nextText();
                    } else if ("REAL_PRODUCT_VALUE".equals(parser.getName())) {
                        this._REAL_PRODUCT_VALUE = parser.nextText();
                    } else if ("RESCHEDULE_TOTAL".equals(parser.getName())) {
                        this._RESCHEDULE_TOTAL = Integer.valueOf(parser.nextText());
                    } else if ("SPOLCODE".equals(parser.getName())) {
                        this._SPOLCODE = parser.nextText();
                    } else if ("STORGE".equals(parser.getName())) {
                        this._STORGE = parser.nextText();
                    } else if ("TICKET_INFO_SHOW".equals(parser.getName())) {
                        this._TICKET_INFO_SHOW = parser.nextText();
                    } else if ("ZUNXIANG_FLAG".equals(parser.getName())) {
                        this._ZUNXIANG_FLAG = parser.nextText();
                    } else if ("NEWRULES_FLAG".equals(parser.getName())) {
                        this._NEWRULES_FLAG = parser.nextText();
                    } else if ("RESCHEDULE_UPGRADE".equals(parser.getName())) {
                        this._RESCHEDULE_UPGRADE = Integer.valueOf(parser.nextText());
                    } else if ("MILE_ACC_PRO".equals(parser.getName())) {
                        this._MILE_ACC_PRO = parser.nextText();
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