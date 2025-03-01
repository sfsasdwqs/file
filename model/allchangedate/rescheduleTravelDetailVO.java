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
public class rescheduleTravelDetailVO extends baseDTOVO implements SOAPObject, Serializable {
    public String _ARRV_AIRPT = null;
    public String _ARRV_CT = null;
    public String _CLASS_CODE = null;
    public String _CLS_NM = null;
    public String _CLASS_PRICE = null;
    public String _CTAX = null;
    public String _DPT_AIRPT = null;
    public String _DPT_CT = null;
    public String _EI = null;
    public String _FST_LEG_ARR_DT = null;
    public String _FLT_LEG_ARR_TM = null;
    public String _FST_LEG_DPT_DT = null;
    public String _FLIGHT_NO = null;
    public String _FST_LEG_DPT_TM = null;
    public String _FZY_CLASS_BASIC = null;
    public String _FZY_FLAG = null;
    public String _IS_B2C = null;
    public String _IS_CHD = null;
    public String _IS_CIVIL = null;
    public String _MILEAGE_FLAG = null;
    public String _ZERO_CHANGE_FLAG = null;
    public String _MESSAGE = null;
    public String _PSG_ID_NO = null;
    public String _PS_GNAME = null;
    public String _PSG_TYPE = null;
    public String _PNR_NO = null;
    public String _TK_ARRIVE_TIME = null;
    public String _TK_CLASS_CODE = null;
    public String _TK_FLIGHT_NO = null;
    public String _TK_SEGMENT = null;
    public String _TK_TAKEOFF_TIME = null;
    public String _SEGMENT = null;
    public Integer _SEG_IDX = null;
    public List<specialAvailInfoVO> _SPECIAL_AVAIL_INFO_LIST = null;
    public String _SZAIR_EXPRESS_FLAG = null;
    public String _TKT_NO = null;
    public String _TICKET_STATUS = null;
    public String _TOUR_CODE = null;
    public String _CARRIER = null;
    public String _USABLE = null;
    public String _SEG_UUID = null;
    public String _ZY_FLAG = null;
    public String _ZYFL = null;
    public String _YHDJK_ADD_MONEY = null;
    public String _YHDJK_COUNT = null;
    public String _YHDJK_COUPON_MONEY = null;
    public String _yhdjkProductCode = null;
    public String _YHDJK_USE_MONEY = null;
    public String _FTAX = null;
    public boolean isChecked = false;
    public String isYst = null;
    public String _MEAL = null;
    public String _AIRLINE_TYPE = null;
    public String _STOP_DURING = null;
    public String _STOP_CITY = null;
    public String _ORDER_ID = null;
    public String _ORDER_NO = null;
    public String _DURATION = null;
    public String _TRANSIT_CITY = null;
    public String _TRANSIT_DURING = null;
    public String _OPEN_FLAG = null;
    public String _RESCHEDULE_TYPE = null;
    public String _UN_TK = null;
    public String _DEPARTURE_TERM = null;
    public String _ARRIVE_TERM = null;
    public String _IS_SHARE_FLIGHT = null;
    public String _OP_FLIGHT_NO = null;
    public String _MUL_DELAY_FLAG = null;
    public String _CONNECT_FLAG = null;
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
        if (this._ARRV_AIRPT != null) {
            xml.startTag(null, "ARRV_AIRPT");
            xml.text(this._ARRV_AIRPT);
            xml.endTag(null, "ARRV_AIRPT");
        }
        if (this._ARRV_CT != null) {
            xml.startTag(null, "ARRV_CT");
            xml.text(this._ARRV_CT);
            xml.endTag(null, "ARRV_CT");
        }
        if (this._CLASS_CODE != null) {
            xml.startTag(null, "CLASS_CODE");
            xml.text(this._CLASS_CODE);
            xml.endTag(null, "CLASS_CODE");
        }
        if (this._CLS_NM != null) {
            xml.startTag(null, "CLS_NM");
            xml.text(this._CLS_NM);
            xml.endTag(null, "CLS_NM");
        }
        if (this._CLASS_PRICE != null) {
            xml.startTag(null, "CLASS_PRICE");
            xml.text(this._CLASS_PRICE);
            xml.endTag(null, "CLASS_PRICE");
        }
        if (this._CTAX != null) {
            xml.startTag(null, "CTAX");
            xml.text(this._CTAX);
            xml.endTag(null, "CTAX");
        }
        if (this._DPT_AIRPT != null) {
            xml.startTag(null, "DPT_AIRPT");
            xml.text(this._DPT_AIRPT);
            xml.endTag(null, "DPT_AIRPT");
        }
        if (this._DPT_CT != null) {
            xml.startTag(null, "DPT_CT");
            xml.text(this._DPT_CT);
            xml.endTag(null, "DPT_CT");
        }
        if (this._EI != null) {
            xml.startTag(null, "EI");
            xml.text(this._EI);
            xml.endTag(null, "EI");
        }
        if (this._FST_LEG_ARR_DT != null) {
            xml.startTag(null, "FST_LEG_ARR_DT");
            xml.text(this._FST_LEG_ARR_DT);
            xml.endTag(null, "FST_LEG_ARR_DT");
        }
        if (this._FLT_LEG_ARR_TM != null) {
            xml.startTag(null, "FLT_LEG_ARR_TM");
            xml.text(this._FLT_LEG_ARR_TM);
            xml.endTag(null, "FLT_LEG_ARR_TM");
        }
        if (this._FST_LEG_DPT_DT != null) {
            xml.startTag(null, "FST_LEG_DPT_DT");
            xml.text(this._FST_LEG_DPT_DT);
            xml.endTag(null, "FST_LEG_DPT_DT");
        }
        if (this._FLIGHT_NO != null) {
            xml.startTag(null, "FLIGHT_NO");
            xml.text(this._FLIGHT_NO);
            xml.endTag(null, "FLIGHT_NO");
        }
        if (this._FST_LEG_DPT_TM != null) {
            xml.startTag(null, "FST_LEG_DPT_TM");
            xml.text(this._FST_LEG_DPT_TM);
            xml.endTag(null, "FST_LEG_DPT_TM");
        }
        if (this._FZY_CLASS_BASIC != null) {
            xml.startTag(null, "FZY_CLASS_BASIC");
            xml.text(this._FZY_CLASS_BASIC);
            xml.endTag(null, "FZY_CLASS_BASIC");
        }
        if (this._FZY_FLAG != null) {
            xml.startTag(null, "FZY_FLAG");
            xml.text(this._FZY_FLAG);
            xml.endTag(null, "FZY_FLAG");
        }
        if (this._IS_B2C != null) {
            xml.startTag(null, "IS_B2C");
            xml.text(this._IS_B2C);
            xml.endTag(null, "IS_B2C");
        }
        if (this._IS_CHD != null) {
            xml.startTag(null, "IS_CHD");
            xml.text(this._IS_CHD);
            xml.endTag(null, "IS_CHD");
        }
        if (this._IS_CIVIL != null) {
            xml.startTag(null, "IS_CIVIL");
            xml.text(this._IS_CIVIL);
            xml.endTag(null, "IS_CIVIL");
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
        if (this._MESSAGE != null) {
            xml.startTag(null, "MESSAGE");
            xml.text(this._MESSAGE);
            xml.endTag(null, "MESSAGE");
        }
        if (this._PSG_ID_NO != null) {
            xml.startTag(null, "PSG_ID_NO");
            xml.text(this._PSG_ID_NO);
            xml.endTag(null, "PSG_ID_NO");
        }
        if (this._PS_GNAME != null) {
            xml.startTag(null, "PS_GNAME");
            xml.text(this._PS_GNAME);
            xml.endTag(null, "PS_GNAME");
        }
        if (this._PSG_TYPE != null) {
            xml.startTag(null, "PSG_TYPE");
            xml.text(this._PSG_TYPE);
            xml.endTag(null, "PSG_TYPE");
        }
        if (this._PNR_NO != null) {
            xml.startTag(null, "PNR_NO");
            xml.text(this._PNR_NO);
            xml.endTag(null, "PNR_NO");
        }
        if (this._TK_ARRIVE_TIME != null) {
            xml.startTag(null, "TK_ARRIVE_TIME");
            xml.text(this._TK_ARRIVE_TIME);
            xml.endTag(null, "TK_ARRIVE_TIME");
        }
        if (this._TK_CLASS_CODE != null) {
            xml.startTag(null, "TK_CLASS_CODE");
            xml.text(this._TK_CLASS_CODE);
            xml.endTag(null, "TK_CLASS_CODE");
        }
        if (this._TK_FLIGHT_NO != null) {
            xml.startTag(null, "TK_FLIGHT_NO");
            xml.text(this._TK_FLIGHT_NO);
            xml.endTag(null, "TK_FLIGHT_NO");
        }
        if (this._TK_SEGMENT != null) {
            xml.startTag(null, "TK_SEGMENT");
            xml.text(this._TK_SEGMENT);
            xml.endTag(null, "TK_SEGMENT");
        }
        if (this._TK_TAKEOFF_TIME != null) {
            xml.startTag(null, "TK_TAKEOFF_TIME");
            xml.text(this._TK_TAKEOFF_TIME);
            xml.endTag(null, "TK_TAKEOFF_TIME");
        }
        if (this._SEGMENT != null) {
            xml.startTag(null, "SEGMENT");
            xml.text(this._SEGMENT);
            xml.endTag(null, "SEGMENT");
        }
        if (this._SEG_IDX != null) {
            xml.startTag(null, "SEG_IDX");
            xml.text(String.valueOf(this._SEG_IDX));
            xml.endTag(null, "SEG_IDX");
        }
        List<specialAvailInfoVO> list = this._SPECIAL_AVAIL_INFO_LIST;
        if (list != null && list.size() > 0) {
            int size = this._SPECIAL_AVAIL_INFO_LIST.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "SPECIAL_AVAIL_INFO_LIST");
                this._SPECIAL_AVAIL_INFO_LIST.get(i).addElementsToNode(xml);
                xml.endTag(null, "SPECIAL_AVAIL_INFO_LIST");
            }
        }
        if (this._SZAIR_EXPRESS_FLAG != null) {
            xml.startTag(null, "SZAIR_EXPRESS_FLAG");
            xml.text(this._SZAIR_EXPRESS_FLAG);
            xml.endTag(null, "SZAIR_EXPRESS_FLAG");
        }
        if (this._TKT_NO != null) {
            xml.startTag(null, "TKT_NO");
            xml.text(this._TKT_NO);
            xml.endTag(null, "TKT_NO");
        }
        if (this._TICKET_STATUS != null) {
            xml.startTag(null, "TICKET_STATUS");
            xml.text(this._TICKET_STATUS);
            xml.endTag(null, "TICKET_STATUS");
        }
        if (this._TOUR_CODE != null) {
            xml.startTag(null, "TOUR_CODE");
            xml.text(this._TOUR_CODE);
            xml.endTag(null, "TOUR_CODE");
        }
        if (this._USABLE != null) {
            xml.startTag(null, "USABLE");
            xml.text(this._USABLE);
            xml.endTag(null, "USABLE");
        }
        if (this._SEG_UUID != null) {
            xml.startTag(null, "SEG_UUID");
            xml.text(this._SEG_UUID);
            xml.endTag(null, "SEG_UUID");
        }
        if (this._ZY_FLAG != null) {
            xml.startTag(null, "ZY_FLAG");
            xml.text(this._ZY_FLAG);
            xml.endTag(null, "ZY_FLAG");
        }
        if (this._ZYFL != null) {
            xml.startTag(null, "ZYFL");
            xml.text(this._ZYFL);
            xml.endTag(null, "ZYFL");
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
        if (this._FTAX != null) {
            xml.startTag(null, "FTAX");
            xml.text(this._FTAX);
            xml.endTag(null, "FTAX");
        }
        if (this._MEAL != null) {
            xml.startTag(null, "MEAL");
            xml.text(this._MEAL);
            xml.endTag(null, "MEAL");
        }
        if (this._AIRLINE_TYPE != null) {
            xml.startTag(null, "AIRLINE_TYPE");
            xml.text(this._AIRLINE_TYPE);
            xml.endTag(null, "AIRLINE_TYPE");
        }
        if (this._STOP_DURING != null) {
            xml.startTag(null, "STOP_DURING");
            xml.text(this._STOP_DURING);
            xml.endTag(null, "STOP_DURING");
        }
        if (this._STOP_CITY != null) {
            xml.startTag(null, "STOP_CITY");
            xml.text(this._STOP_CITY);
            xml.endTag(null, "STOP_CITY");
        }
        if (this._ORDER_ID != null) {
            xml.startTag(null, "ORDER_ID");
            xml.text(this._ORDER_ID);
            xml.endTag(null, "ORDER_ID");
        }
        if (this._ORDER_NO != null) {
            xml.startTag(null, "ORDER_NO");
            xml.text(this._ORDER_NO);
            xml.endTag(null, "ORDER_NO");
        }
        if (this._TRANSIT_CITY != null) {
            xml.startTag(null, "TRANSIT_CITY");
            xml.text(this._TRANSIT_CITY);
            xml.endTag(null, "TRANSIT_CITY");
        }
        if (this._TRANSIT_DURING != null) {
            xml.startTag(null, "TRANSIT_DURING");
            xml.text(this._TRANSIT_DURING);
            xml.endTag(null, "TRANSIT_DURING");
        }
        if (this._OPEN_FLAG != null) {
            xml.startTag(null, "OPEN_FLAG");
            xml.text(this._OPEN_FLAG);
            xml.endTag(null, "OPEN_FLAG");
        }
        if (this._DURATION != null) {
            xml.startTag(null, "DURATION");
            xml.text(this._DURATION);
            xml.endTag(null, "DURATION");
        }
        if (this._UN_TK != null) {
            xml.startTag(null, "UN_TK");
            xml.text(this._UN_TK);
            xml.endTag(null, "UN_TK");
        }
        if (this._DEPARTURE_TERM != null) {
            xml.startTag(null, "DEPARTURE_TERM");
            xml.text(this._DEPARTURE_TERM);
            xml.endTag(null, "DEPARTURE_TERM");
        }
        if (this._ARRIVE_TERM != null) {
            xml.startTag(null, "ARRIVE_TERM");
            xml.text(this._ARRIVE_TERM);
            xml.endTag(null, "ARRIVE_TERM");
        }
        if (this._IS_SHARE_FLIGHT != null) {
            xml.startTag(null, "IS_SHARE_FLIGHT");
            xml.text(this._IS_SHARE_FLIGHT);
            xml.endTag(null, "IS_SHARE_FLIGHT");
        }
        if (this._OP_FLIGHT_NO != null) {
            xml.startTag(null, "OP_FLIGHT_NO");
            xml.text(this._OP_FLIGHT_NO);
            xml.endTag(null, "OP_FLIGHT_NO");
        }
        if (this._MUL_DELAY_FLAG != null) {
            xml.startTag(null, "MUL_DELAY_FLAG");
            xml.text(this._MUL_DELAY_FLAG);
            xml.endTag(null, "MUL_DELAY_FLAG");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("ARRV_AIRPT".equals(parser.getName())) {
                        this._ARRV_AIRPT = parser.nextText();
                    } else if ("ARRV_CT".equals(parser.getName())) {
                        this._ARRV_CT = parser.nextText();
                    } else if ("CLASS_CODE".equals(parser.getName())) {
                        this._CLASS_CODE = parser.nextText();
                    } else if ("CLS_NM".equals(parser.getName())) {
                        this._CLS_NM = parser.nextText();
                    } else if ("CLASS_PRICE".equals(parser.getName())) {
                        this._CLASS_PRICE = parser.nextText();
                    } else if ("CTAX".equals(parser.getName())) {
                        this._CTAX = parser.nextText();
                    } else if ("DPT_AIRPT".equals(parser.getName())) {
                        this._DPT_AIRPT = parser.nextText();
                    } else if ("DPT_CT".equals(parser.getName())) {
                        this._DPT_CT = parser.nextText();
                    } else if ("EI".equals(parser.getName())) {
                        this._EI = parser.nextText();
                    } else if ("FST_LEG_ARR_DT".equals(parser.getName())) {
                        this._FST_LEG_ARR_DT = parser.nextText();
                    } else if ("FLT_LEG_ARR_TM".equals(parser.getName())) {
                        this._FLT_LEG_ARR_TM = parser.nextText();
                    } else if ("FST_LEG_DPT_DT".equals(parser.getName())) {
                        this._FST_LEG_DPT_DT = parser.nextText();
                    } else if ("FLIGHT_NO".equals(parser.getName())) {
                        this._FLIGHT_NO = parser.nextText();
                    } else if ("FST_LEG_DPT_TM".equals(parser.getName())) {
                        this._FST_LEG_DPT_TM = parser.nextText();
                    } else if ("FZY_CLASS_BASIC".equals(parser.getName())) {
                        this._FZY_CLASS_BASIC = parser.nextText();
                    } else if ("FZY_FLAG".equals(parser.getName())) {
                        this._FZY_FLAG = parser.nextText();
                    } else if ("IS_B2C".equals(parser.getName())) {
                        this._IS_B2C = parser.nextText();
                    } else if ("IS_CHD".equals(parser.getName())) {
                        this._IS_CHD = parser.nextText();
                    } else if ("IS_CIVIL".equals(parser.getName())) {
                        this._IS_CIVIL = parser.nextText();
                    } else if ("MILEAGE_FLAG".equals(parser.getName())) {
                        this._MILEAGE_FLAG = parser.nextText();
                    } else if ("ZERO_CHANGE_FLAG".equals(parser.getName())) {
                        this._ZERO_CHANGE_FLAG = parser.nextText();
                    } else if ("MESSAGE".equals(parser.getName())) {
                        this._MESSAGE = parser.nextText();
                    } else if ("PSG_ID_NO".equals(parser.getName())) {
                        this._PSG_ID_NO = parser.nextText();
                    } else if ("PS_GNAME".equals(parser.getName())) {
                        this._PS_GNAME = parser.nextText();
                    } else if ("PSG_TYPE".equals(parser.getName())) {
                        this._PSG_TYPE = parser.nextText();
                    } else if ("PNR_NO".equals(parser.getName())) {
                        this._PNR_NO = parser.nextText();
                    } else if ("TK_ARRIVE_TIME".equals(parser.getName())) {
                        this._TK_ARRIVE_TIME = parser.nextText();
                    } else if ("TK_CLASS_CODE".equals(parser.getName())) {
                        this._TK_CLASS_CODE = parser.nextText();
                    } else if ("TK_FLIGHT_NO".equals(parser.getName())) {
                        this._TK_FLIGHT_NO = parser.nextText();
                    } else if ("TK_SEGMENT".equals(parser.getName())) {
                        this._TK_SEGMENT = parser.nextText();
                    } else if ("TK_TAKEOFF_TIME".equals(parser.getName())) {
                        this._TK_TAKEOFF_TIME = parser.nextText();
                    } else if ("SEGMENT".equals(parser.getName())) {
                        this._SEGMENT = parser.nextText();
                    } else if ("SEG_IDX".equals(parser.getName())) {
                        this._SEG_IDX = Integer.valueOf(parser.nextText());
                    } else if ("SPECIAL_AVAIL_INFO_LIST".equals(parser.getName())) {
                        if (this._SPECIAL_AVAIL_INFO_LIST == null) {
                            this._SPECIAL_AVAIL_INFO_LIST = new ArrayList();
                        }
                        specialAvailInfoVO specialavailinfovo = new specialAvailInfoVO();
                        specialavailinfovo.parse(binding, parser);
                        this._SPECIAL_AVAIL_INFO_LIST.add(specialavailinfovo);
                    } else if ("SZAIR_EXPRESS_FLAG".equals(parser.getName())) {
                        this._SZAIR_EXPRESS_FLAG = parser.nextText();
                    } else if ("TKT_NO".equals(parser.getName())) {
                        this._TKT_NO = parser.nextText();
                    } else if ("TICKET_STATUS".equals(parser.getName())) {
                        this._TICKET_STATUS = parser.nextText();
                    } else if ("TOUR_CODE".equals(parser.getName())) {
                        this._TOUR_CODE = parser.nextText();
                    } else if ("USABLE".equals(parser.getName())) {
                        this._USABLE = parser.nextText();
                    } else if ("SEG_UUID".equals(parser.getName())) {
                        this._SEG_UUID = parser.nextText();
                    } else if ("ZY_FLAG".equals(parser.getName())) {
                        this._ZY_FLAG = parser.nextText();
                    } else if ("ZYFL".equals(parser.getName())) {
                        this._ZYFL = parser.nextText();
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
                    } else if ("FTAX".equals(parser.getName())) {
                        this._FTAX = parser.nextText();
                    } else if ("MEAL".equals(parser.getName())) {
                        this._MEAL = parser.nextText();
                    } else if ("AIRLINE_TYPE".equals(parser.getName())) {
                        this._AIRLINE_TYPE = parser.nextText();
                    } else if ("STOP_DURING".equals(parser.getName())) {
                        this._STOP_DURING = parser.nextText();
                    } else if ("STOP_CITY".equals(parser.getName())) {
                        this._STOP_CITY = parser.nextText();
                    } else if ("ORDER_ID".equals(parser.getName())) {
                        this._ORDER_ID = parser.nextText();
                    } else if ("ORDER_NO".equals(parser.getName())) {
                        this._ORDER_NO = parser.nextText();
                    } else if ("TRANSIT_CITY".equals(parser.getName())) {
                        this._TRANSIT_CITY = parser.nextText();
                    } else if ("TRANSIT_DURING".equals(parser.getName())) {
                        this._TRANSIT_DURING = parser.nextText();
                    } else if ("OPEN_FLAG".equals(parser.getName())) {
                        this._OPEN_FLAG = parser.nextText();
                    } else if ("DURATION".equals(parser.getName())) {
                        this._DURATION = parser.nextText();
                    } else if ("UN_TK".equals(parser.getName())) {
                        this._UN_TK = parser.nextText();
                    } else if ("DEPARTURE_TERM".equals(parser.getName())) {
                        this._DEPARTURE_TERM = parser.nextText();
                    } else if ("ARRIVE_TERM".equals(parser.getName())) {
                        this._ARRIVE_TERM = parser.nextText();
                    } else if ("IS_SHARE_FLIGHT".equals(parser.getName())) {
                        this._IS_SHARE_FLIGHT = parser.nextText();
                    } else if ("OP_FLIGHT_NO".equals(parser.getName())) {
                        this._OP_FLIGHT_NO = parser.nextText();
                    } else if ("MUL_DELAY_FLAG".equals(parser.getName())) {
                        this._MUL_DELAY_FLAG = parser.nextText();
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