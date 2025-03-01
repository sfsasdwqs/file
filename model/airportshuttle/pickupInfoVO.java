package com.common.szair.model.airportshuttle;

import com.air.sz.zxing.decoding.Intents;
import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import java.io.Serializable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class pickupInfoVO implements SOAPObject, Serializable {
    public String endCity;
    public String startCity;
    public String _AES_PHONE = null;
    public String _ARR_TIME = null;
    public String _ARRIVE_PLACE = null;
    public String _ARRIVE_PLACE_JWD = null;
    public String _CABIN = null;
    public String _CABIN_PRICE = null;
    public String _CAR_FARE = null;
    public String _CHNL_ID = null;
    public String _CITY = null;
    public String _COUNT = null;
    public String _CPN_NO = null;
    public String _CT_PHONE = null;
    public String _DEPT_TIME = null;
    public String _DEST = null;
    public String _DIS_UNIT = null;
    public String _DISTANCE = null;
    public String _FARE_BASE = null;
    public String _FAVOR_CONTENT = null;
    public String _FLT_DATE = null;
    public String _FLT_NUM = null;
    public String _ID_TYPE = null;
    public String _IF_BEYOND_AREA = null;
    public String _IS_KEY_VIP = null;
    public String _LUGGAGES = null;
    public String _MEMBER_BRAND = null;
    public String _MEMBER_NO = null;
    public String _open_id = null;
    public String _operateType = null;
    public String _OPERATOR = null;
    public String _ORDER_NO = null;
    public String _ORDER_STATUS = null;
    public String _ORDER_TIME = null;
    public String _ORDER_TYPE = null;
    public String _ORIG = null;
    public String _PASS_ID = null;
    public String _PASS_NAME = null;
    public String _PASS_NUMS = null;
    public String _PAX_LEVEL = null;
    public String _PICKUP_CAPTCHA = null;
    public String _PNR = null;
    public String _CAR_TYPE = null;
    public String _REMARK = null;
    public String _RESERVED_TIME = null;
    public String _SERVICE_TYPE = null;
    public String _SPARE_PHONE = null;
    public String _START_PLACE = null;
    public String _START_PLACE_JWD = null;
    public String _STORE = null;
    public String _CARD_NO = null;
    public String _COUPON_NAME = null;
    public String _TRAVEL_REMARK = null;
    public String _TYPE = null;
    public String _user_id = null;
    public String _CAR_COMPANY = null;
    public String _ORDER_NUM = null;
    public String _SUPPLIER_NAME = null;
    public String _START_PLACE_CITY = null;
    public String _CUSTOMER_IDENTITY = null;
    public String _MEMBER_LEVEL = null;
    public String _PRODUCT_ID = null;
    private Exception _exception = null;

    @Override // com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/shenzhenair/mobilewebservice/pickup";
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void setexception(Exception _exception) {
        this._exception = _exception;
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public Exception getexception() {
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
        if (this._AES_PHONE != null) {
            xml.startTag(null, "AES_PHONE");
            xml.text(this._AES_PHONE);
            xml.endTag(null, "AES_PHONE");
        }
        if (this._ARR_TIME != null) {
            xml.startTag(null, "ARR_TIME");
            xml.text(this._ARR_TIME);
            xml.endTag(null, "ARR_TIME");
        }
        if (this._ARRIVE_PLACE != null) {
            xml.startTag(null, "ARRIVE_PLACE");
            xml.text(this._ARRIVE_PLACE);
            xml.endTag(null, "ARRIVE_PLACE");
        }
        if (this._ARRIVE_PLACE_JWD != null) {
            xml.startTag(null, "ARRIVE_PLACE_JWD");
            xml.text(this._ARRIVE_PLACE_JWD);
            xml.endTag(null, "ARRIVE_PLACE_JWD");
        }
        if (this._CABIN != null) {
            xml.startTag(null, "CABIN");
            xml.text(this._CABIN);
            xml.endTag(null, "CABIN");
        }
        if (this._CABIN_PRICE != null) {
            xml.startTag(null, "CABIN_PRICE");
            xml.text(this._CABIN_PRICE);
            xml.endTag(null, "CABIN_PRICE");
        }
        if (this._CAR_FARE != null) {
            xml.startTag(null, "CAR_FARE");
            xml.text(this._CAR_FARE);
            xml.endTag(null, "CAR_FARE");
        }
        if (this._CHNL_ID != null) {
            xml.startTag(null, "CHNL_ID");
            xml.text(this._CHNL_ID);
            xml.endTag(null, "CHNL_ID");
        }
        if (this._CITY != null) {
            xml.startTag(null, "CITY");
            xml.text(this._CITY);
            xml.endTag(null, "CITY");
        }
        if (this._COUNT != null) {
            xml.startTag(null, "COUNT");
            xml.text(this._COUNT);
            xml.endTag(null, "COUNT");
        }
        if (this._CPN_NO != null) {
            xml.startTag(null, "CPN_NO");
            xml.text(this._CPN_NO);
            xml.endTag(null, "CPN_NO");
        }
        if (this._CT_PHONE != null) {
            xml.startTag(null, "CT_PHONE");
            xml.text(this._CT_PHONE);
            xml.endTag(null, "CT_PHONE");
        }
        if (this._DEPT_TIME != null) {
            xml.startTag(null, "DEPT_TIME");
            xml.text(this._DEPT_TIME);
            xml.endTag(null, "DEPT_TIME");
        }
        if (this._DEST != null) {
            xml.startTag(null, "DEST");
            xml.text(this._DEST);
            xml.endTag(null, "DEST");
        }
        if (this._DIS_UNIT != null) {
            xml.startTag(null, "DIS_UNIT");
            xml.text(this._DIS_UNIT);
            xml.endTag(null, "DIS_UNIT");
        }
        if (this._DISTANCE != null) {
            xml.startTag(null, "DISTANCE");
            xml.text(this._DISTANCE);
            xml.endTag(null, "DISTANCE");
        }
        if (this._FARE_BASE != null) {
            xml.startTag(null, "FARE_BASE");
            xml.text(this._FARE_BASE);
            xml.endTag(null, "FARE_BASE");
        }
        if (this._FAVOR_CONTENT != null) {
            xml.startTag(null, "FAVOR_CONTENT");
            xml.text(this._FAVOR_CONTENT);
            xml.endTag(null, "FAVOR_CONTENT");
        }
        if (this._FLT_DATE != null) {
            xml.startTag(null, "FLT_DATE");
            xml.text(this._FLT_DATE);
            xml.endTag(null, "FLT_DATE");
        }
        if (this._FLT_NUM != null) {
            xml.startTag(null, "FLT_NUM");
            xml.text(this._FLT_NUM);
            xml.endTag(null, "FLT_NUM");
        }
        if (this._ID_TYPE != null) {
            xml.startTag(null, "ID_TYPE");
            xml.text(this._ID_TYPE);
            xml.endTag(null, "ID_TYPE");
        }
        if (this._IF_BEYOND_AREA != null) {
            xml.startTag(null, "IF_BEYOND_AREA");
            xml.text(this._IF_BEYOND_AREA);
            xml.endTag(null, "IF_BEYOND_AREA");
        }
        if (this._IS_KEY_VIP != null) {
            xml.startTag(null, "IS_KEY_VIP");
            xml.text(this._IS_KEY_VIP);
            xml.endTag(null, "IS_KEY_VIP");
        }
        if (this._LUGGAGES != null) {
            xml.startTag(null, "LUGGAGES");
            xml.text(this._LUGGAGES);
            xml.endTag(null, "LUGGAGES");
        }
        if (this._MEMBER_BRAND != null) {
            xml.startTag(null, "MEMBER_BRAND");
            xml.text(this._MEMBER_BRAND);
            xml.endTag(null, "MEMBER_BRAND");
        }
        if (this._MEMBER_NO != null) {
            xml.startTag(null, "MEMBER_NO");
            xml.text(this._MEMBER_NO);
            xml.endTag(null, "MEMBER_NO");
        }
        if (this._open_id != null) {
            xml.startTag(null, "open_id");
            xml.text(this._open_id);
            xml.endTag(null, "open_id");
        }
        if (this._operateType != null) {
            xml.startTag(null, "operateType");
            xml.text(this._operateType);
            xml.endTag(null, "operateType");
        }
        if (this._OPERATOR != null) {
            xml.startTag(null, "OPERATOR");
            xml.text(this._OPERATOR);
            xml.endTag(null, "OPERATOR");
        }
        if (this._ORDER_NO != null) {
            xml.startTag(null, "ORDER_NO");
            xml.text(this._ORDER_NO);
            xml.endTag(null, "ORDER_NO");
        }
        if (this._ORDER_STATUS != null) {
            xml.startTag(null, "ORDER_STATUS");
            xml.text(this._ORDER_STATUS);
            xml.endTag(null, "ORDER_STATUS");
        }
        if (this._ORDER_TIME != null) {
            xml.startTag(null, "ORDER_TIME");
            xml.text(this._ORDER_TIME);
            xml.endTag(null, "ORDER_TIME");
        }
        if (this._ORDER_TYPE != null) {
            xml.startTag(null, "ORDER_TYPE");
            xml.text(this._ORDER_TYPE);
            xml.endTag(null, "ORDER_TYPE");
        }
        if (this._ORIG != null) {
            xml.startTag(null, "ORIG");
            xml.text(this._ORIG);
            xml.endTag(null, "ORIG");
        }
        if (this._PASS_ID != null) {
            xml.startTag(null, "PASS_ID");
            xml.text(this._PASS_ID);
            xml.endTag(null, "PASS_ID");
        }
        if (this._PASS_NAME != null) {
            xml.startTag(null, "PASS_NAME");
            xml.text(this._PASS_NAME);
            xml.endTag(null, "PASS_NAME");
        }
        if (this._PASS_NUMS != null) {
            xml.startTag(null, "PASS_NUMS");
            xml.text(this._PASS_NUMS);
            xml.endTag(null, "PASS_NUMS");
        }
        if (this._PAX_LEVEL != null) {
            xml.startTag(null, "PAX_LEVEL");
            xml.text(this._PAX_LEVEL);
            xml.endTag(null, "PAX_LEVEL");
        }
        if (this._PICKUP_CAPTCHA != null) {
            xml.startTag(null, "PICKUP_CAPTCHA");
            xml.text(this._PICKUP_CAPTCHA);
            xml.endTag(null, "PICKUP_CAPTCHA");
        }
        if (this._PNR != null) {
            xml.startTag(null, "PNR");
            xml.text(this._PNR);
            xml.endTag(null, "PNR");
        }
        if (this._CAR_TYPE != null) {
            xml.startTag(null, "CAR_TYPE");
            xml.text(this._CAR_TYPE);
            xml.endTag(null, "CAR_TYPE");
        }
        if (this._CAR_COMPANY != null) {
            xml.startTag(null, "CAR_COMPANY");
            xml.text(this._CAR_COMPANY);
            xml.endTag(null, "CAR_COMPANY");
        }
        if (this._ORDER_NUM != null) {
            xml.startTag(null, "ORDER_NUM");
            xml.text(this._ORDER_NUM);
            xml.endTag(null, "ORDER_NUM");
        }
        if (this._SUPPLIER_NAME != null) {
            xml.startTag(null, "SUPPLIER_NAME");
            xml.text(this._SUPPLIER_NAME);
            xml.endTag(null, "SUPPLIER_NAME");
        }
        if (this._REMARK != null) {
            xml.startTag(null, "REMARK");
            xml.text(this._REMARK);
            xml.endTag(null, "REMARK");
        }
        if (this._RESERVED_TIME != null) {
            xml.startTag(null, "RESERVED_TIME");
            xml.text(this._RESERVED_TIME);
            xml.endTag(null, "RESERVED_TIME");
        }
        if (this._SERVICE_TYPE != null) {
            xml.startTag(null, "SERVICE_TYPE");
            xml.text(this._SERVICE_TYPE);
            xml.endTag(null, "SERVICE_TYPE");
        }
        if (this._SPARE_PHONE != null) {
            xml.startTag(null, "SPARE_PHONE");
            xml.text(this._SPARE_PHONE);
            xml.endTag(null, "SPARE_PHONE");
        }
        if (this._START_PLACE != null) {
            xml.startTag(null, "START_PLACE");
            xml.text(this._START_PLACE);
            xml.endTag(null, "START_PLACE");
        }
        if (this._START_PLACE_JWD != null) {
            xml.startTag(null, "START_PLACE_JWD");
            xml.text(this._START_PLACE_JWD);
            xml.endTag(null, "START_PLACE_JWD");
        }
        if (this._STORE != null) {
            xml.startTag(null, "STORE");
            xml.text(this._STORE);
            xml.endTag(null, "STORE");
        }
        if (this._CARD_NO != null) {
            xml.startTag(null, "CARD_NO");
            xml.text(this._CARD_NO);
            xml.endTag(null, "CARD_NO");
        }
        if (this._COUPON_NAME != null) {
            xml.startTag(null, "COUPON_NAME");
            xml.text(this._COUPON_NAME);
            xml.endTag(null, "COUPON_NAME");
        }
        if (this._TRAVEL_REMARK != null) {
            xml.startTag(null, "TRAVEL_REMARK");
            xml.text(this._TRAVEL_REMARK);
            xml.endTag(null, "TRAVEL_REMARK");
        }
        if (this._TYPE != null) {
            xml.startTag(null, Intents.WifiConnect.TYPE);
            xml.text(this._TYPE);
            xml.endTag(null, Intents.WifiConnect.TYPE);
        }
        if (this._user_id != null) {
            xml.startTag(null, "user_id");
            xml.text(this._user_id);
            xml.endTag(null, "user_id");
        }
        if (this._START_PLACE_CITY != null) {
            xml.startTag(null, "START_PLACE_CITY");
            xml.text(this._START_PLACE_CITY);
            xml.endTag(null, "START_PLACE_CITY");
        }
        if (this._CUSTOMER_IDENTITY != null) {
            xml.startTag(null, "CUSTOMER_IDENTITY");
            xml.text(this._CUSTOMER_IDENTITY);
            xml.endTag(null, "CUSTOMER_IDENTITY");
        }
        if (this._MEMBER_LEVEL != null) {
            xml.startTag(null, "MEMBER_LEVEL");
            xml.text(this._MEMBER_LEVEL);
            xml.endTag(null, "MEMBER_LEVEL");
        }
        if (this._PRODUCT_ID != null) {
            xml.startTag(null, "PRODUCT_ID");
            xml.text(this._PRODUCT_ID);
            xml.endTag(null, "PRODUCT_ID");
        }
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("AES_PHONE".equals(parser.getName())) {
                        this._AES_PHONE = parser.nextText();
                    } else if ("ARR_TIME".equals(parser.getName())) {
                        this._ARR_TIME = parser.nextText();
                    } else if ("ARRIVE_PLACE".equals(parser.getName())) {
                        this._ARRIVE_PLACE = parser.nextText();
                    } else if ("ARRIVE_PLACE_JWD".equals(parser.getName())) {
                        this._ARRIVE_PLACE_JWD = parser.nextText();
                    } else if ("CABIN".equals(parser.getName())) {
                        this._CABIN = parser.nextText();
                    } else if ("CABIN_PRICE".equals(parser.getName())) {
                        this._CABIN_PRICE = parser.nextText();
                    } else if ("CAR_FARE".equals(parser.getName())) {
                        this._CAR_FARE = parser.nextText();
                    } else if ("CHNL_ID".equals(parser.getName())) {
                        this._CHNL_ID = parser.nextText();
                    } else if ("CITY".equals(parser.getName())) {
                        this._CITY = parser.nextText();
                    } else if ("COUNT".equals(parser.getName())) {
                        this._COUNT = parser.nextText();
                    } else if ("CPN_NO".equals(parser.getName())) {
                        this._CPN_NO = parser.nextText();
                    } else if ("CT_PHONE".equals(parser.getName())) {
                        this._CT_PHONE = parser.nextText();
                    } else if ("DEPT_TIME".equals(parser.getName())) {
                        this._DEPT_TIME = parser.nextText();
                    } else if ("DEST".equals(parser.getName())) {
                        this._DEST = parser.nextText();
                    } else if ("DIS_UNIT".equals(parser.getName())) {
                        this._DIS_UNIT = parser.nextText();
                    } else if ("DISTANCE".equals(parser.getName())) {
                        this._DISTANCE = parser.nextText();
                    } else if ("FARE_BASE".equals(parser.getName())) {
                        this._FARE_BASE = parser.nextText();
                    } else if ("FAVOR_CONTENT".equals(parser.getName())) {
                        this._FAVOR_CONTENT = parser.nextText();
                    } else if ("FLT_DATE".equals(parser.getName())) {
                        this._FLT_DATE = parser.nextText();
                    } else if ("FLT_NUM".equals(parser.getName())) {
                        this._FLT_NUM = parser.nextText();
                    } else if ("ID_TYPE".equals(parser.getName())) {
                        this._ID_TYPE = parser.nextText();
                    } else if ("IF_BEYOND_AREA".equals(parser.getName())) {
                        this._IF_BEYOND_AREA = parser.nextText();
                    } else if ("IS_KEY_VIP".equals(parser.getName())) {
                        this._IS_KEY_VIP = parser.nextText();
                    } else if ("LUGGAGES".equals(parser.getName())) {
                        this._LUGGAGES = parser.nextText();
                    } else if ("MEMBER_BRAND".equals(parser.getName())) {
                        this._MEMBER_BRAND = parser.nextText();
                    } else if ("MEMBER_NO".equals(parser.getName())) {
                        this._MEMBER_NO = parser.nextText();
                    } else if ("open_id".equals(parser.getName())) {
                        this._open_id = parser.nextText();
                    } else if ("operateType".equals(parser.getName())) {
                        this._operateType = parser.nextText();
                    } else if ("OPERATOR".equals(parser.getName())) {
                        this._OPERATOR = parser.nextText();
                    } else if ("ORDER_NO".equals(parser.getName())) {
                        this._ORDER_NO = parser.nextText();
                    } else if ("ORDER_STATUS".equals(parser.getName())) {
                        this._ORDER_STATUS = parser.nextText();
                    } else if ("ORDER_TIME".equals(parser.getName())) {
                        this._ORDER_TIME = parser.nextText();
                    } else if ("ORDER_TYPE".equals(parser.getName())) {
                        this._ORDER_TYPE = parser.nextText();
                    } else if ("ORIG".equals(parser.getName())) {
                        this._ORIG = parser.nextText();
                    } else if ("PASS_ID".equals(parser.getName())) {
                        this._PASS_ID = parser.nextText();
                    } else if ("PASS_NAME".equals(parser.getName())) {
                        this._PASS_NAME = parser.nextText();
                    } else if ("PASS_NUMS".equals(parser.getName())) {
                        this._PASS_NUMS = parser.nextText();
                    } else if ("PAX_LEVEL".equals(parser.getName())) {
                        this._PAX_LEVEL = parser.nextText();
                    } else if ("PICKUP_CAPTCHA".equals(parser.getName())) {
                        this._PICKUP_CAPTCHA = parser.nextText();
                    } else if ("PNR".equals(parser.getName())) {
                        this._PNR = parser.nextText();
                    } else if ("CAR_TYPE".equals(parser.getName())) {
                        this._CAR_TYPE = parser.nextText();
                    } else if ("CAR_COMPANY".equals(parser.getName())) {
                        this._CAR_COMPANY = parser.nextText();
                    } else if ("ORDER_NUM".equals(parser.getName())) {
                        this._ORDER_NUM = parser.nextText();
                    } else if ("SUPPLIER_NAME".equals(parser.getName())) {
                        this._SUPPLIER_NAME = parser.nextText();
                    } else if ("REMARK".equals(parser.getName())) {
                        this._REMARK = parser.nextText();
                    } else if ("RESERVED_TIME".equals(parser.getName())) {
                        this._RESERVED_TIME = parser.nextText();
                    } else if ("SERVICE_TYPE".equals(parser.getName())) {
                        this._SERVICE_TYPE = parser.nextText();
                    } else if ("SPARE_PHONE".equals(parser.getName())) {
                        this._SPARE_PHONE = parser.nextText();
                    } else if ("START_PLACE".equals(parser.getName())) {
                        this._START_PLACE = parser.nextText();
                    } else if ("START_PLACE_JWD".equals(parser.getName())) {
                        this._START_PLACE_JWD = parser.nextText();
                    } else if ("STORE".equals(parser.getName())) {
                        this._STORE = parser.nextText();
                    } else if ("CARD_NO".equals(parser.getName())) {
                        this._CARD_NO = parser.nextText();
                    } else if ("COUPON_NAME".equals(parser.getName())) {
                        this._COUPON_NAME = parser.nextText();
                    } else if ("TRAVEL_REMARK".equals(parser.getName())) {
                        this._TRAVEL_REMARK = parser.nextText();
                    } else if (Intents.WifiConnect.TYPE.equals(parser.getName())) {
                        this._TYPE = parser.nextText();
                    } else if ("user_id".equals(parser.getName())) {
                        this._user_id = parser.nextText();
                    } else if ("START_PLACE_CITY".equals(parser.getName())) {
                        this._START_PLACE_CITY = parser.nextText();
                    } else if ("CUSTOMER_IDENTITY".equals(parser.getName())) {
                        this._CUSTOMER_IDENTITY = parser.nextText();
                    } else if ("MEMBER_LEVEL".equals(parser.getName())) {
                        this._MEMBER_LEVEL = parser.nextText();
                    } else if ("PRODUCT_ID".equals(parser.getName())) {
                        this._PRODUCT_ID = parser.nextText();
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