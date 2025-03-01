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
public class flightInfoVO extends baseDTOVO implements SOAPObject, Serializable {
    public String _AC_TYPE = null;
    public String _ARRI_TERM = null;
    public String _CARRIER = null;
    public String _CARRIER_FLIGHT_NO = null;
    public List<rescheduleClassListVO> _CLASS_LIST = null;
    public String _DEP_TERM = null;
    public String _DST_CITY = null;
    public String _DST_DATE = null;
    public String _DST_TIME = null;
    public String _DURATION = null;
    public Integer _FLIGHT_COMPANY_SORT = null;
    public String _FLIGHT_NO = null;
    public String _G_STORAGE = null;
    public String _IS_CODE_SHARE = null;
    public String _J_STORAGE = null;
    public String _MEAL = null;
    public String _MEAL_CODE = null;
    public String _NEAR_FLIGHT_FLAG = null;
    public String _ORG_CITY = null;
    public String _ORG_DATE = null;
    public String _ORG_TIME = null;
    public Boolean _SELL_OUT_FLAG = null;
    public String _STOP_CITY = null;
    public String _STOP_DEPT_DATE = null;
    public String _STOP_DST_DATE = null;
    public String _STOP_DURING = null;
    public Integer _TIME_REMAINDER = null;
    public String _Y_STORAGE = null;
    public String _UN_TK = null;
    public String _IS_FOREIGN = null;
    public String _CURRENT_CLASS_TYPE = null;
    public rescheduleClassInfoVO lowerClassInfo = null;
    public boolean isFzy = false;
    public boolean isYst = false;
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
        if (this._AC_TYPE != null) {
            xml.startTag(null, "AC_TYPE");
            xml.text(this._AC_TYPE);
            xml.endTag(null, "AC_TYPE");
        }
        if (this._ARRI_TERM != null) {
            xml.startTag(null, "ARRI_TERM");
            xml.text(this._ARRI_TERM);
            xml.endTag(null, "ARRI_TERM");
        }
        if (this._CARRIER != null) {
            xml.startTag(null, "CARRIER");
            xml.text(this._CARRIER);
            xml.endTag(null, "CARRIER");
        }
        if (this._CARRIER_FLIGHT_NO != null) {
            xml.startTag(null, "CARRIER_FLIGHT_NO");
            xml.text(this._CARRIER_FLIGHT_NO);
            xml.endTag(null, "CARRIER_FLIGHT_NO");
        }
        List<rescheduleClassListVO> list = this._CLASS_LIST;
        if (list != null && list.size() > 0) {
            int size = this._CLASS_LIST.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "CLASS_LIST");
                this._CLASS_LIST.get(i).addElementsToNode(xml);
                xml.endTag(null, "CLASS_LIST");
            }
        }
        if (this._DEP_TERM != null) {
            xml.startTag(null, "DEP_TERM");
            xml.text(this._DEP_TERM);
            xml.endTag(null, "DEP_TERM");
        }
        if (this._DST_CITY != null) {
            xml.startTag(null, "DST_CITY");
            xml.text(this._DST_CITY);
            xml.endTag(null, "DST_CITY");
        }
        if (this._DST_DATE != null) {
            xml.startTag(null, "DST_DATE");
            xml.text(this._DST_DATE);
            xml.endTag(null, "DST_DATE");
        }
        if (this._DST_TIME != null) {
            xml.startTag(null, "DST_TIME");
            xml.text(this._DST_TIME);
            xml.endTag(null, "DST_TIME");
        }
        if (this._DURATION != null) {
            xml.startTag(null, "DURATION");
            xml.text(this._DURATION);
            xml.endTag(null, "DURATION");
        }
        if (this._FLIGHT_COMPANY_SORT != null) {
            xml.startTag(null, "FLIGHT_COMPANY_SORT");
            xml.text(String.valueOf(this._FLIGHT_COMPANY_SORT));
            xml.endTag(null, "FLIGHT_COMPANY_SORT");
        }
        if (this._FLIGHT_NO != null) {
            xml.startTag(null, "FLIGHT_NO");
            xml.text(this._FLIGHT_NO);
            xml.endTag(null, "FLIGHT_NO");
        }
        if (this._G_STORAGE != null) {
            xml.startTag(null, "G_STORAGE");
            xml.text(this._G_STORAGE);
            xml.endTag(null, "G_STORAGE");
        }
        if (this._IS_CODE_SHARE != null) {
            xml.startTag(null, "IS_CODE_SHARE");
            xml.text(this._IS_CODE_SHARE);
            xml.endTag(null, "IS_CODE_SHARE");
        }
        if (this._J_STORAGE != null) {
            xml.startTag(null, "J_STORAGE");
            xml.text(this._J_STORAGE);
            xml.endTag(null, "J_STORAGE");
        }
        if (this._MEAL != null) {
            xml.startTag(null, "MEAL");
            xml.text(this._MEAL);
            xml.endTag(null, "MEAL");
        }
        if (this._MEAL_CODE != null) {
            xml.startTag(null, "MEAL_CODE");
            xml.text(this._MEAL_CODE);
            xml.endTag(null, "MEAL_CODE");
        }
        if (this._NEAR_FLIGHT_FLAG != null) {
            xml.startTag(null, "NEAR_FLIGHT_FLAG");
            xml.text(this._NEAR_FLIGHT_FLAG);
            xml.endTag(null, "NEAR_FLIGHT_FLAG");
        }
        if (this._ORG_CITY != null) {
            xml.startTag(null, "ORG_CITY");
            xml.text(this._ORG_CITY);
            xml.endTag(null, "ORG_CITY");
        }
        if (this._ORG_DATE != null) {
            xml.startTag(null, "ORG_DATE");
            xml.text(this._ORG_DATE);
            xml.endTag(null, "ORG_DATE");
        }
        if (this._ORG_TIME != null) {
            xml.startTag(null, "ORG_TIME");
            xml.text(this._ORG_TIME);
            xml.endTag(null, "ORG_TIME");
        }
        if (this._SELL_OUT_FLAG != null) {
            xml.startTag(null, "SELL_OUT_FLAG");
            xml.text(String.valueOf(this._SELL_OUT_FLAG));
            xml.endTag(null, "SELL_OUT_FLAG");
        }
        if (this._STOP_CITY != null) {
            xml.startTag(null, "STOP_CITY");
            xml.text(this._STOP_CITY);
            xml.endTag(null, "STOP_CITY");
        }
        if (this._STOP_DEPT_DATE != null) {
            xml.startTag(null, "STOP_DEPT_DATE");
            xml.text(this._STOP_DEPT_DATE);
            xml.endTag(null, "STOP_DEPT_DATE");
        }
        if (this._STOP_DST_DATE != null) {
            xml.startTag(null, "STOP_DST_DATE");
            xml.text(this._STOP_DST_DATE);
            xml.endTag(null, "STOP_DST_DATE");
        }
        if (this._STOP_DURING != null) {
            xml.startTag(null, "STOP_DURING");
            xml.text(this._STOP_DURING);
            xml.endTag(null, "STOP_DURING");
        }
        if (this._TIME_REMAINDER != null) {
            xml.startTag(null, "TIME_REMAINDER");
            xml.text(String.valueOf(this._TIME_REMAINDER));
            xml.endTag(null, "TIME_REMAINDER");
        }
        if (this._Y_STORAGE != null) {
            xml.startTag(null, "Y_STORAGE");
            xml.text(this._Y_STORAGE);
            xml.endTag(null, "Y_STORAGE");
        }
        if (this._UN_TK != null) {
            xml.startTag(null, "UN_TK");
            xml.text(this._UN_TK);
            xml.endTag(null, "UN_TK");
        }
        if (this._IS_FOREIGN != null) {
            xml.startTag(null, "IS_FOREIGN");
            xml.text(this._IS_FOREIGN);
            xml.endTag(null, "IS_FOREIGN");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("AC_TYPE".equals(parser.getName())) {
                        this._AC_TYPE = parser.nextText();
                    } else if ("ARRI_TERM".equals(parser.getName())) {
                        this._ARRI_TERM = parser.nextText();
                    } else if ("CARRIER".equals(parser.getName())) {
                        this._CARRIER = parser.nextText();
                    } else if ("CARRIER_FLIGHT_NO".equals(parser.getName())) {
                        this._CARRIER_FLIGHT_NO = parser.nextText();
                    } else if ("CLASS_LIST".equals(parser.getName())) {
                        if (this._CLASS_LIST == null) {
                            this._CLASS_LIST = new ArrayList();
                        }
                        rescheduleClassListVO rescheduleclasslistvo = new rescheduleClassListVO();
                        rescheduleclasslistvo.parse(binding, parser);
                        this._CLASS_LIST.add(rescheduleclasslistvo);
                    } else if ("DEP_TERM".equals(parser.getName())) {
                        this._DEP_TERM = parser.nextText();
                    } else if ("DST_CITY".equals(parser.getName())) {
                        this._DST_CITY = parser.nextText();
                    } else if ("DST_DATE".equals(parser.getName())) {
                        this._DST_DATE = parser.nextText();
                    } else if ("DST_TIME".equals(parser.getName())) {
                        this._DST_TIME = parser.nextText();
                    } else if ("DURATION".equals(parser.getName())) {
                        this._DURATION = parser.nextText();
                    } else if ("FLIGHT_COMPANY_SORT".equals(parser.getName())) {
                        this._FLIGHT_COMPANY_SORT = Integer.valueOf(parser.nextText());
                    } else if ("FLIGHT_NO".equals(parser.getName())) {
                        this._FLIGHT_NO = parser.nextText();
                    } else if ("G_STORAGE".equals(parser.getName())) {
                        this._G_STORAGE = parser.nextText();
                    } else if ("IS_CODE_SHARE".equals(parser.getName())) {
                        this._IS_CODE_SHARE = parser.nextText();
                    } else if ("J_STORAGE".equals(parser.getName())) {
                        this._J_STORAGE = parser.nextText();
                    } else if ("MEAL".equals(parser.getName())) {
                        this._MEAL = parser.nextText();
                    } else if ("MEAL_CODE".equals(parser.getName())) {
                        this._MEAL_CODE = parser.nextText();
                    } else if ("NEAR_FLIGHT_FLAG".equals(parser.getName())) {
                        this._NEAR_FLIGHT_FLAG = parser.nextText();
                    } else if ("ORG_CITY".equals(parser.getName())) {
                        this._ORG_CITY = parser.nextText();
                    } else if ("ORG_DATE".equals(parser.getName())) {
                        this._ORG_DATE = parser.nextText();
                    } else if ("ORG_TIME".equals(parser.getName())) {
                        this._ORG_TIME = parser.nextText();
                    } else if ("SELL_OUT_FLAG".equals(parser.getName())) {
                        this._SELL_OUT_FLAG = Boolean.valueOf(parser.nextText());
                    } else if ("STOP_CITY".equals(parser.getName())) {
                        this._STOP_CITY = parser.nextText();
                    } else if ("STOP_DEPT_DATE".equals(parser.getName())) {
                        this._STOP_DEPT_DATE = parser.nextText();
                    } else if ("STOP_DST_DATE".equals(parser.getName())) {
                        this._STOP_DST_DATE = parser.nextText();
                    } else if ("STOP_DURING".equals(parser.getName())) {
                        this._STOP_DURING = parser.nextText();
                    } else if ("TIME_REMAINDER".equals(parser.getName())) {
                        this._TIME_REMAINDER = Integer.valueOf(parser.nextText());
                    } else if ("Y_STORAGE".equals(parser.getName())) {
                        this._Y_STORAGE = parser.nextText();
                    } else if ("UN_TK".equals(parser.getName())) {
                        this._UN_TK = parser.nextText();
                    } else if ("IS_FOREIGN".equals(parser.getName())) {
                        this._IS_FOREIGN = parser.nextText();
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