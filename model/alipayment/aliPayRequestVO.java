package com.common.szair.model.alipayment;

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
public class aliPayRequestVO implements SOAPObject {
    public String _BANK_NAME = null;
    public List<String> _CHANGE_IDS = null;
    public String _DESC_CONTENT = null;
    public String _ORDER_NO = null;
    public String _CHANGE_NUM = null;
    public String _PAY_FLAG = null;
    public String _PLAT_ID = null;
    public String _PAY_TYPE = null;
    public yihuiPayVO _YIHUI_PAY = null;
    private Exception _exception = null;

    @Override // com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/shenzhenair/mobilewebservice/payment";
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
        if (this._BANK_NAME != null) {
            xml.startTag(null, "BANK_NAME");
            xml.text(this._BANK_NAME);
            xml.endTag(null, "BANK_NAME");
        }
        List<String> list = this._CHANGE_IDS;
        if (list != null && list.size() > 0) {
            int size = this._CHANGE_IDS.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "CHANGE_IDS");
                xml.text(this._CHANGE_IDS.get(i));
                xml.endTag(null, "CHANGE_IDS");
            }
        }
        if (this._DESC_CONTENT != null) {
            xml.startTag(null, "DESC_CONTENT");
            xml.text(this._DESC_CONTENT);
            xml.endTag(null, "DESC_CONTENT");
        }
        if (this._ORDER_NO != null) {
            xml.startTag(null, "ORDER_NO");
            xml.text(this._ORDER_NO);
            xml.endTag(null, "ORDER_NO");
        }
        if (this._PAY_FLAG != null) {
            xml.startTag(null, "PAY_FLAG");
            xml.text(this._PAY_FLAG);
            xml.endTag(null, "PAY_FLAG");
        }
        if (this._PLAT_ID != null) {
            xml.startTag(null, "PLAT_ID");
            xml.text(this._PLAT_ID);
            xml.endTag(null, "PLAT_ID");
        }
        if (this._CHANGE_NUM != null) {
            xml.startTag(null, "CHANGE_NUM");
            xml.text(this._CHANGE_NUM);
            xml.endTag(null, "CHANGE_NUM");
        }
        if (this._PAY_TYPE != null) {
            xml.startTag(null, "PAY_TYPE");
            xml.text(this._PAY_TYPE);
            xml.endTag(null, "PAY_TYPE");
        }
        if (this._YIHUI_PAY != null) {
            xml.startTag(null, "YIHUI_PAY");
            this._YIHUI_PAY.addElementsToNode(xml);
            xml.endTag(null, "YIHUI_PAY");
        }
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("BANK_NAME".equals(parser.getName())) {
                        this._BANK_NAME = parser.nextText();
                    } else if ("CHANGE_IDS".equals(parser.getName())) {
                        if (this._CHANGE_IDS == null) {
                            this._CHANGE_IDS = new ArrayList();
                        }
                        this._CHANGE_IDS.add(parser.nextText());
                    } else if ("DESC_CONTENT".equals(parser.getName())) {
                        this._DESC_CONTENT = parser.nextText();
                    } else if ("ORDER_NO".equals(parser.getName())) {
                        this._ORDER_NO = parser.nextText();
                    } else if ("PLAT_ID".equals(parser.getName())) {
                        this._PLAT_ID = parser.nextText();
                    } else if ("PAY_FLAG".equals(parser.getName())) {
                        this._PAY_FLAG = parser.nextText();
                    } else if ("CHANGE_NUM".equals(parser.getName())) {
                        this._CHANGE_NUM = parser.nextText();
                    } else if ("PAY_TYPE".equals(parser.getName())) {
                        this._PAY_TYPE = parser.nextText();
                    } else if ("YIHUI_PAY".equals(parser.getName())) {
                        yihuiPayVO yihuipayvo = new yihuiPayVO();
                        yihuipayvo.parse(binding, parser);
                        this._YIHUI_PAY = yihuipayvo;
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