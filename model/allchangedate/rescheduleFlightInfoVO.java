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
public class rescheduleFlightInfoVO extends baseDTOVO implements SOAPObject, Serializable {
    public boolean economicClassSellOut;
    public String oldSEGMENT_UUID;
    public String _AC_TYPE = null;
    public String _AIRPORT_DUTY = null;
    public String _ARRI_TERM = null;
    public String _BASE_PRICE = null;
    public String _CARRIER = null;
    public String _CARRIER_FLIGHT_NO = null;
    public List<rescheduleClassListVO> _CLASS_LIST = null;
    public String _DEP_TERM = null;
    public String _DST_CITY = null;
    public String _DST_DATE = null;
    public String _DST_TIME = null;
    public String _DURATION = null;
    public String _flightCompany = null;
    public String _FLIGHT_COMPANY_SHORT = null;
    public String _FLIGHT_NO = null;
    public String _FLIGHT_TYPE = null;
    public String _IS_CODE_SHARE = null;
    public String _MEAL = null;
    public String _OILTAX_ADULT = null;
    public String _OILTAX_BABY = null;
    public String _OILTAX_CHILD = null;
    public String _ORG_CITY = null;
    public String _ORG_DATE = null;
    public String _ORG_TIME = null;
    public String _SEGMENT_ID = null;
    public String _SPML_MEAL_NAME = null;
    public String _STOP_CITY = null;
    public String _STOP_CITY_CH = null;
    public String _J_PUBLIC_PRICE = null;
    public String _J_STORAGE = null;
    public String _Y_PUBLIC_PRICE = null;
    public String _Y_STORAGE = null;
    public String _NEW_FLIGHT_CABIN_VERSION = null;
    public String _NEAR_FLIGHT_FLAG = null;
    public String _TIME_REMAINDER = null;
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
        if (this._AC_TYPE != null) {
            xml.startTag(null, "AC_TYPE");
            xml.text(this._AC_TYPE);
            xml.endTag(null, "AC_TYPE");
        }
        if (this._AIRPORT_DUTY != null) {
            xml.startTag(null, "AIRPORT_DUTY");
            xml.text(this._AIRPORT_DUTY);
            xml.endTag(null, "AIRPORT_DUTY");
        }
        if (this._ARRI_TERM != null) {
            xml.startTag(null, "ARRI_TERM");
            xml.text(this._ARRI_TERM);
            xml.endTag(null, "ARRI_TERM");
        }
        if (this._BASE_PRICE != null) {
            xml.startTag(null, "BASE_PRICE");
            xml.text(this._BASE_PRICE);
            xml.endTag(null, "BASE_PRICE");
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
        if (this._flightCompany != null) {
            xml.startTag(null, "flightCompany");
            xml.text(this._flightCompany);
            xml.endTag(null, "flightCompany");
        }
        if (this._FLIGHT_COMPANY_SHORT != null) {
            xml.startTag(null, "FLIGHT_COMPANY_SHORT");
            xml.text(this._FLIGHT_COMPANY_SHORT);
            xml.endTag(null, "FLIGHT_COMPANY_SHORT");
        }
        if (this._FLIGHT_NO != null) {
            xml.startTag(null, "FLIGHT_NO");
            xml.text(this._FLIGHT_NO);
            xml.endTag(null, "FLIGHT_NO");
        }
        if (this._FLIGHT_TYPE != null) {
            xml.startTag(null, "FLIGHT_TYPE");
            xml.text(this._FLIGHT_TYPE);
            xml.endTag(null, "FLIGHT_TYPE");
        }
        if (this._IS_CODE_SHARE != null) {
            xml.startTag(null, "IS_CODE_SHARE");
            xml.text(this._IS_CODE_SHARE);
            xml.endTag(null, "IS_CODE_SHARE");
        }
        if (this._MEAL != null) {
            xml.startTag(null, "MEAL");
            xml.text(this._MEAL);
            xml.endTag(null, "MEAL");
        }
        if (this._OILTAX_ADULT != null) {
            xml.startTag(null, "OILTAX_ADULT");
            xml.text(this._OILTAX_ADULT);
            xml.endTag(null, "OILTAX_ADULT");
        }
        if (this._OILTAX_BABY != null) {
            xml.startTag(null, "OILTAX_BABY");
            xml.text(this._OILTAX_BABY);
            xml.endTag(null, "OILTAX_BABY");
        }
        if (this._OILTAX_CHILD != null) {
            xml.startTag(null, "OILTAX_CHILD");
            xml.text(this._OILTAX_CHILD);
            xml.endTag(null, "OILTAX_CHILD");
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
        if (this._SEGMENT_ID != null) {
            xml.startTag(null, "SEGMENT_ID");
            xml.text(this._SEGMENT_ID);
            xml.endTag(null, "SEGMENT_ID");
        }
        if (this._SPML_MEAL_NAME != null) {
            xml.startTag(null, "SPML_MEAL_NAME");
            xml.text(this._SPML_MEAL_NAME);
            xml.endTag(null, "SPML_MEAL_NAME");
        }
        if (this._STOP_CITY != null) {
            xml.startTag(null, "STOP_CITY");
            xml.text(this._STOP_CITY);
            xml.endTag(null, "STOP_CITY");
        }
        if (this._STOP_CITY_CH != null) {
            xml.startTag(null, "STOP_CITY_CH");
            xml.text(this._STOP_CITY_CH);
            xml.endTag(null, "STOP_CITY_CH");
        }
        if (this._J_PUBLIC_PRICE != null) {
            xml.startTag(null, "J_PUBLIC_PRICE");
            xml.text(this._J_PUBLIC_PRICE);
            xml.endTag(null, "J_PUBLIC_PRICE");
        }
        if (this._J_STORAGE != null) {
            xml.startTag(null, "J_STORAGE");
            xml.text(this._J_STORAGE);
            xml.endTag(null, "J_STORAGE");
        }
        if (this._Y_PUBLIC_PRICE != null) {
            xml.startTag(null, "Y_PUBLIC_PRICE");
            xml.text(this._Y_PUBLIC_PRICE);
            xml.endTag(null, "Y_PUBLIC_PRICE");
        }
        if (this._Y_STORAGE != null) {
            xml.startTag(null, "Y_STORAGE");
            xml.text(this._Y_STORAGE);
            xml.endTag(null, "Y_STORAGE");
        }
        if (this._NEW_FLIGHT_CABIN_VERSION != null) {
            xml.startTag(null, "NEW_FLIGHT_CABIN_VERSION");
            xml.text(this._NEW_FLIGHT_CABIN_VERSION);
            xml.endTag(null, "NEW_FLIGHT_CABIN_VERSION");
        }
        if (this._NEAR_FLIGHT_FLAG != null) {
            xml.startTag(null, "NEAR_FLIGHT_FLAG");
            xml.text(this._NEAR_FLIGHT_FLAG);
            xml.endTag(null, "NEAR_FLIGHT_FLAG");
        }
        if (this._TIME_REMAINDER != null) {
            xml.startTag(null, "TIME_REMAINDER");
            xml.text(this._TIME_REMAINDER);
            xml.endTag(null, "TIME_REMAINDER");
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
                    } else if ("AIRPORT_DUTY".equals(parser.getName())) {
                        this._AIRPORT_DUTY = parser.nextText();
                    } else if ("ARRI_TERM".equals(parser.getName())) {
                        this._ARRI_TERM = parser.nextText();
                    } else if ("BASE_PRICE".equals(parser.getName())) {
                        this._BASE_PRICE = parser.nextText();
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
                    } else if ("flightCompany".equals(parser.getName())) {
                        this._flightCompany = parser.nextText();
                    } else if ("FLIGHT_COMPANY_SHORT".equals(parser.getName())) {
                        this._FLIGHT_COMPANY_SHORT = parser.nextText();
                    } else if ("FLIGHT_NO".equals(parser.getName())) {
                        this._FLIGHT_NO = parser.nextText();
                    } else if ("FLIGHT_TYPE".equals(parser.getName())) {
                        this._FLIGHT_TYPE = parser.nextText();
                    } else if ("IS_CODE_SHARE".equals(parser.getName())) {
                        this._IS_CODE_SHARE = parser.nextText();
                    } else if ("MEAL".equals(parser.getName())) {
                        this._MEAL = parser.nextText();
                    } else if ("OILTAX_ADULT".equals(parser.getName())) {
                        this._OILTAX_ADULT = parser.nextText();
                    } else if ("OILTAX_BABY".equals(parser.getName())) {
                        this._OILTAX_BABY = parser.nextText();
                    } else if ("OILTAX_CHILD".equals(parser.getName())) {
                        this._OILTAX_CHILD = parser.nextText();
                    } else if ("ORG_CITY".equals(parser.getName())) {
                        this._ORG_CITY = parser.nextText();
                    } else if ("ORG_DATE".equals(parser.getName())) {
                        this._ORG_DATE = parser.nextText();
                    } else if ("ORG_TIME".equals(parser.getName())) {
                        this._ORG_TIME = parser.nextText();
                    } else if ("SEGMENT_ID".equals(parser.getName())) {
                        this._SEGMENT_ID = parser.nextText();
                    } else if ("SPML_MEAL_NAME".equals(parser.getName())) {
                        this._SPML_MEAL_NAME = parser.nextText();
                    } else if ("STOP_CITY".equals(parser.getName())) {
                        this._STOP_CITY = parser.nextText();
                    } else if ("STOP_CITY_CH".equals(parser.getName())) {
                        this._STOP_CITY_CH = parser.nextText();
                    } else if ("J_PUBLIC_PRICE".equals(parser.getName())) {
                        this._J_PUBLIC_PRICE = parser.nextText();
                    } else if ("J_STORAGE".equals(parser.getName())) {
                        this._J_STORAGE = parser.nextText();
                    } else if ("Y_PUBLIC_PRICE".equals(parser.getName())) {
                        this._Y_PUBLIC_PRICE = parser.nextText();
                    } else if ("Y_STORAGE".equals(parser.getName())) {
                        this._Y_STORAGE = parser.nextText();
                    } else if ("NEW_FLIGHT_CABIN_VERSION".equals(parser.getName())) {
                        this._NEW_FLIGHT_CABIN_VERSION = parser.nextText();
                    } else if ("NEAR_FLIGHT_FLAG".equals(parser.getName())) {
                        this._NEAR_FLIGHT_FLAG = parser.nextText();
                    } else if ("TIME_REMAINDER".equals(parser.getName())) {
                        this._TIME_REMAINDER = parser.nextText();
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