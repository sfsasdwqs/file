package com.common.szair.model.airportshuttle;

import com.air.sz.zxing.decoding.Intents;
import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class pickupSearchConditionVO implements SOAPObject {
    public String _CABIN = null;
    public String _chnl_id = null;
    public String _CPN_NO = null;
    public String _CT_PHONE = null;
    public String _FLT_DATE_END = null;
    public String _FLT_DATE_START = null;
    public String _FLT_NUM = null;
    public String _IS_KEY_VIP = null;
    public String _MEMBER_BRAND = null;
    public String _open_id = null;
    public String _OPERATER = null;
    public String _ORDER_NO = null;
    public String _ORDER_STATUS = null;
    public String _ORDER_TIME_END = null;
    public String _ORDER_TIME_START = null;
    public String _PAGE_INDEX = null;
    public String _PASS_ID = null;
    public String _PASS_NAME = null;
    public String _PAX_LEVEL = null;
    public String _PER_PAGE = null;
    public String _PNR = null;
    public String _PRUDUCET_NAME = null;
    public String _TYPE = null;
    public String _user_id = null;
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
        if (this._CABIN != null) {
            xml.startTag(null, "CABIN");
            xml.text(this._CABIN);
            xml.endTag(null, "CABIN");
        }
        if (this._chnl_id != null) {
            xml.startTag(null, "chnl_id");
            xml.text(this._chnl_id);
            xml.endTag(null, "chnl_id");
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
        if (this._FLT_DATE_END != null) {
            xml.startTag(null, "FLT_DATE_END");
            xml.text(this._FLT_DATE_END);
            xml.endTag(null, "FLT_DATE_END");
        }
        if (this._FLT_DATE_START != null) {
            xml.startTag(null, "FLT_DATE_START");
            xml.text(this._FLT_DATE_START);
            xml.endTag(null, "FLT_DATE_START");
        }
        if (this._FLT_NUM != null) {
            xml.startTag(null, "FLT_NUM");
            xml.text(this._FLT_NUM);
            xml.endTag(null, "FLT_NUM");
        }
        if (this._IS_KEY_VIP != null) {
            xml.startTag(null, "IS_KEY_VIP");
            xml.text(this._IS_KEY_VIP);
            xml.endTag(null, "IS_KEY_VIP");
        }
        if (this._MEMBER_BRAND != null) {
            xml.startTag(null, "MEMBER_BRAND");
            xml.text(this._MEMBER_BRAND);
            xml.endTag(null, "MEMBER_BRAND");
        }
        if (this._open_id != null) {
            xml.startTag(null, "open_id");
            xml.text(this._open_id);
            xml.endTag(null, "open_id");
        }
        if (this._OPERATER != null) {
            xml.startTag(null, "OPERATER");
            xml.text(this._OPERATER);
            xml.endTag(null, "OPERATER");
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
        if (this._ORDER_TIME_END != null) {
            xml.startTag(null, "ORDER_TIME_END");
            xml.text(this._ORDER_TIME_END);
            xml.endTag(null, "ORDER_TIME_END");
        }
        if (this._ORDER_TIME_START != null) {
            xml.startTag(null, "ORDER_TIME_START");
            xml.text(this._ORDER_TIME_START);
            xml.endTag(null, "ORDER_TIME_START");
        }
        if (this._PAGE_INDEX != null) {
            xml.startTag(null, "PAGE_INDEX");
            xml.text(this._PAGE_INDEX);
            xml.endTag(null, "PAGE_INDEX");
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
        if (this._PAX_LEVEL != null) {
            xml.startTag(null, "PAX_LEVEL");
            xml.text(this._PAX_LEVEL);
            xml.endTag(null, "PAX_LEVEL");
        }
        if (this._PER_PAGE != null) {
            xml.startTag(null, "PER_PAGE");
            xml.text(this._PER_PAGE);
            xml.endTag(null, "PER_PAGE");
        }
        if (this._PNR != null) {
            xml.startTag(null, "PNR");
            xml.text(this._PNR);
            xml.endTag(null, "PNR");
        }
        if (this._PRUDUCET_NAME != null) {
            xml.startTag(null, "PRUDUCET_NAME");
            xml.text(this._PRUDUCET_NAME);
            xml.endTag(null, "PRUDUCET_NAME");
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
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("CABIN".equals(parser.getName())) {
                        this._CABIN = parser.nextText();
                    } else if ("chnl_id".equals(parser.getName())) {
                        this._chnl_id = parser.nextText();
                    } else if ("CPN_NO".equals(parser.getName())) {
                        this._CPN_NO = parser.nextText();
                    } else if ("CT_PHONE".equals(parser.getName())) {
                        this._CT_PHONE = parser.nextText();
                    } else if ("FLT_DATE_END".equals(parser.getName())) {
                        this._FLT_DATE_END = parser.nextText();
                    } else if ("FLT_DATE_START".equals(parser.getName())) {
                        this._FLT_DATE_START = parser.nextText();
                    } else if ("FLT_NUM".equals(parser.getName())) {
                        this._FLT_NUM = parser.nextText();
                    } else if ("IS_KEY_VIP".equals(parser.getName())) {
                        this._IS_KEY_VIP = parser.nextText();
                    } else if ("MEMBER_BRAND".equals(parser.getName())) {
                        this._MEMBER_BRAND = parser.nextText();
                    } else if ("open_id".equals(parser.getName())) {
                        this._open_id = parser.nextText();
                    } else if ("OPERATER".equals(parser.getName())) {
                        this._OPERATER = parser.nextText();
                    } else if ("ORDER_NO".equals(parser.getName())) {
                        this._ORDER_NO = parser.nextText();
                    } else if ("ORDER_STATUS".equals(parser.getName())) {
                        this._ORDER_STATUS = parser.nextText();
                    } else if ("ORDER_TIME_END".equals(parser.getName())) {
                        this._ORDER_TIME_END = parser.nextText();
                    } else if ("ORDER_TIME_START".equals(parser.getName())) {
                        this._ORDER_TIME_START = parser.nextText();
                    } else if ("PAGE_INDEX".equals(parser.getName())) {
                        this._PAGE_INDEX = parser.nextText();
                    } else if ("PASS_ID".equals(parser.getName())) {
                        this._PASS_ID = parser.nextText();
                    } else if ("PASS_NAME".equals(parser.getName())) {
                        this._PASS_NAME = parser.nextText();
                    } else if ("PAX_LEVEL".equals(parser.getName())) {
                        this._PAX_LEVEL = parser.nextText();
                    } else if ("PER_PAGE".equals(parser.getName())) {
                        this._PER_PAGE = parser.nextText();
                    } else if ("PNR".equals(parser.getName())) {
                        this._PNR = parser.nextText();
                    } else if ("PRUDUCET_NAME".equals(parser.getName())) {
                        this._PRUDUCET_NAME = parser.nextText();
                    } else if (Intents.WifiConnect.TYPE.equals(parser.getName())) {
                        this._TYPE = parser.nextText();
                    } else if ("user_id".equals(parser.getName())) {
                        this._user_id = parser.nextText();
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