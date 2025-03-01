package com.common.szair.model.airportshuttle;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class pickupCardConditionVO implements SOAPObject {
    public String _CARD_NO = null;
    public String _chnl_id = null;
    public String _CLASS_CODE = null;
    public String _DST_CITY = null;
    public String _open_id = null;
    public String _ORG_CITY = null;
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
        if (this._CARD_NO != null) {
            xml.startTag(null, "CARD_NO");
            xml.text(this._CARD_NO);
            xml.endTag(null, "CARD_NO");
        }
        if (this._chnl_id != null) {
            xml.startTag(null, "chnl_id");
            xml.text(this._chnl_id);
            xml.endTag(null, "chnl_id");
        }
        if (this._CLASS_CODE != null) {
            xml.startTag(null, "CLASS_CODE");
            xml.text(this._CLASS_CODE);
            xml.endTag(null, "CLASS_CODE");
        }
        if (this._DST_CITY != null) {
            xml.startTag(null, "DST_CITY");
            xml.text(this._DST_CITY);
            xml.endTag(null, "DST_CITY");
        }
        if (this._open_id != null) {
            xml.startTag(null, "open_id");
            xml.text(this._open_id);
            xml.endTag(null, "open_id");
        }
        if (this._ORG_CITY != null) {
            xml.startTag(null, "ORG_CITY");
            xml.text(this._ORG_CITY);
            xml.endTag(null, "ORG_CITY");
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
                    if ("CARD_NO".equals(parser.getName())) {
                        this._CARD_NO = parser.nextText();
                    } else if ("chnl_id".equals(parser.getName())) {
                        this._chnl_id = parser.nextText();
                    } else if ("CLASS_CODE".equals(parser.getName())) {
                        this._CLASS_CODE = parser.nextText();
                    } else if ("DST_CITY".equals(parser.getName())) {
                        this._DST_CITY = parser.nextText();
                    } else if ("open_id".equals(parser.getName())) {
                        this._open_id = parser.nextText();
                    } else if ("ORG_CITY".equals(parser.getName())) {
                        this._ORG_CITY = parser.nextText();
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