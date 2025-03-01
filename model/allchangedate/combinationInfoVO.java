package com.common.szair.model.allchangedate;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class combinationInfoVO implements SOAPObject {
    public Integer _ADULT_COMBINATION_DISCOUNT = null;
    public Integer _ADULT_COMBINATION_PRICE = null;
    public String _AFTER_HOURS_REFUND = null;
    public String _AFTER_HOURS_REFUND_MONEY = null;
    public String _AFTER_HOURS_RESCHEDULE = null;
    public String _AFTER_HOURS_RESCHEDULE_MONEY = null;
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
    public Integer _CHILD_COMBINATION_DISCOUNT = null;
    public Integer _CHILD_COMBINATION_PRICE = null;
    public List<rescheduleClassFeeInfoVO> _RESCHEDULE_SPECIAL_FEE = null;
    public String _combinationInfoText = null;
    public String _FARE_CODE = null;
    public Integer _INFANT_COMBINATION_DISCOUNT = null;
    public Integer _INFANT_COMBINATION_PRICE = null;
    public String _PRODUCT_CODE = null;
    private java.lang.Exception _exception = null;

    @Override // com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/shenzhenair/mobilewebservice/rescheduleMktWebService";
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void setexception(java.lang.Exception _exception) {
        this._exception = _exception;
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public java.lang.Exception getexception() {
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
        if (this._ADULT_COMBINATION_DISCOUNT != null) {
            xml.startTag(null, "ADULT_COMBINATION_DISCOUNT");
            xml.text(String.valueOf(this._ADULT_COMBINATION_DISCOUNT));
            xml.endTag(null, "ADULT_COMBINATION_DISCOUNT");
        }
        if (this._ADULT_COMBINATION_PRICE != null) {
            xml.startTag(null, "ADULT_COMBINATION_PRICE");
            xml.text(String.valueOf(this._ADULT_COMBINATION_PRICE));
            xml.endTag(null, "ADULT_COMBINATION_PRICE");
        }
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
        if (this._CHILD_COMBINATION_DISCOUNT != null) {
            xml.startTag(null, "CHILD_COMBINATION_DISCOUNT");
            xml.text(String.valueOf(this._CHILD_COMBINATION_DISCOUNT));
            xml.endTag(null, "CHILD_COMBINATION_DISCOUNT");
        }
        if (this._CHILD_COMBINATION_PRICE != null) {
            xml.startTag(null, "CHILD_COMBINATION_PRICE");
            xml.text(String.valueOf(this._CHILD_COMBINATION_PRICE));
            xml.endTag(null, "CHILD_COMBINATION_PRICE");
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
        if (this._combinationInfoText != null) {
            xml.startTag(null, "combinationInfoText");
            xml.text(this._combinationInfoText);
            xml.endTag(null, "combinationInfoText");
        }
        if (this._FARE_CODE != null) {
            xml.startTag(null, "FARE_CODE");
            xml.text(this._FARE_CODE);
            xml.endTag(null, "FARE_CODE");
        }
        if (this._INFANT_COMBINATION_DISCOUNT != null) {
            xml.startTag(null, "INFANT_COMBINATION_DISCOUNT");
            xml.text(String.valueOf(this._INFANT_COMBINATION_DISCOUNT));
            xml.endTag(null, "INFANT_COMBINATION_DISCOUNT");
        }
        if (this._INFANT_COMBINATION_PRICE != null) {
            xml.startTag(null, "INFANT_COMBINATION_PRICE");
            xml.text(String.valueOf(this._INFANT_COMBINATION_PRICE));
            xml.endTag(null, "INFANT_COMBINATION_PRICE");
        }
        if (this._PRODUCT_CODE != null) {
            xml.startTag(null, "PRODUCT_CODE");
            xml.text(this._PRODUCT_CODE);
            xml.endTag(null, "PRODUCT_CODE");
        }
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("ADULT_COMBINATION_DISCOUNT".equals(parser.getName())) {
                        this._ADULT_COMBINATION_DISCOUNT = Integer.valueOf(parser.nextText());
                    } else if ("ADULT_COMBINATION_PRICE".equals(parser.getName())) {
                        this._ADULT_COMBINATION_PRICE = Integer.valueOf(parser.nextText());
                    } else if ("AFTER_HOURS_REFUND".equals(parser.getName())) {
                        this._AFTER_HOURS_REFUND = parser.nextText();
                    } else if ("AFTER_HOURS_REFUND_MONEY".equals(parser.getName())) {
                        this._AFTER_HOURS_REFUND_MONEY = parser.nextText();
                    } else if ("AFTER_HOURS_RESCHEDULE".equals(parser.getName())) {
                        this._AFTER_HOURS_RESCHEDULE = parser.nextText();
                    } else if ("AFTER_HOURS_RESCHEDULE_MONEY".equals(parser.getName())) {
                        this._AFTER_HOURS_RESCHEDULE_MONEY = parser.nextText();
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
                    } else if ("CHILD_COMBINATION_DISCOUNT".equals(parser.getName())) {
                        this._CHILD_COMBINATION_DISCOUNT = Integer.valueOf(parser.nextText());
                    } else if ("CHILD_COMBINATION_PRICE".equals(parser.getName())) {
                        this._CHILD_COMBINATION_PRICE = Integer.valueOf(parser.nextText());
                    } else if ("RESCHEDULE_SPECIAL_FEE".equals(parser.getName())) {
                        if (this._RESCHEDULE_SPECIAL_FEE == null) {
                            this._RESCHEDULE_SPECIAL_FEE = new ArrayList();
                        }
                        rescheduleClassFeeInfoVO rescheduleclassfeeinfovo = new rescheduleClassFeeInfoVO();
                        rescheduleclassfeeinfovo.parse(binding, parser);
                        this._RESCHEDULE_SPECIAL_FEE.add(rescheduleclassfeeinfovo);
                    } else if ("combinationInfoText".equals(parser.getName())) {
                        this._combinationInfoText = parser.nextText();
                    } else if ("FARE_CODE".equals(parser.getName())) {
                        this._FARE_CODE = parser.nextText();
                    } else if ("INFANT_COMBINATION_DISCOUNT".equals(parser.getName())) {
                        this._INFANT_COMBINATION_DISCOUNT = Integer.valueOf(parser.nextText());
                    } else if ("INFANT_COMBINATION_PRICE".equals(parser.getName())) {
                        this._INFANT_COMBINATION_PRICE = Integer.valueOf(parser.nextText());
                    } else if ("PRODUCT_CODE".equals(parser.getName())) {
                        this._PRODUCT_CODE = parser.nextText();
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