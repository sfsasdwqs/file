package com.common.szair.model.airportshuttle;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class saveUsedAddressConditionVO implements SOAPObject {
    public String _CITY_NAME = null;
    public String _DETAIL_ADDRESS = null;
    public String _LATITUDE = null;
    public String _LONGITUDE = null;
    public String _SHORT_ADDRESS = null;
    public String _USER_ID = null;
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
        if (this._CITY_NAME != null) {
            xml.startTag(null, "CITY_NAME");
            xml.text(this._CITY_NAME);
            xml.endTag(null, "CITY_NAME");
        }
        if (this._DETAIL_ADDRESS != null) {
            xml.startTag(null, "DETAIL_ADDRESS");
            xml.text(this._DETAIL_ADDRESS);
            xml.endTag(null, "DETAIL_ADDRESS");
        }
        if (this._LATITUDE != null) {
            xml.startTag(null, "LATITUDE");
            xml.text(this._LATITUDE);
            xml.endTag(null, "LATITUDE");
        }
        if (this._LONGITUDE != null) {
            xml.startTag(null, "LONGITUDE");
            xml.text(this._LONGITUDE);
            xml.endTag(null, "LONGITUDE");
        }
        if (this._SHORT_ADDRESS != null) {
            xml.startTag(null, "SHORT_ADDRESS");
            xml.text(this._SHORT_ADDRESS);
            xml.endTag(null, "SHORT_ADDRESS");
        }
        if (this._USER_ID != null) {
            xml.startTag(null, "USER_ID");
            xml.text(this._USER_ID);
            xml.endTag(null, "USER_ID");
        }
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("CITY_NAME".equals(parser.getName())) {
                        this._CITY_NAME = parser.nextText();
                    } else if ("DETAIL_ADDRESS".equals(parser.getName())) {
                        this._DETAIL_ADDRESS = parser.nextText();
                    } else if ("LATITUDE".equals(parser.getName())) {
                        this._LATITUDE = parser.nextText();
                    } else if ("LONGITUDE".equals(parser.getName())) {
                        this._LONGITUDE = parser.nextText();
                    } else if ("SHORT_ADDRESS".equals(parser.getName())) {
                        this._SHORT_ADDRESS = parser.nextText();
                    } else if ("USER_ID".equals(parser.getName())) {
                        this._USER_ID = parser.nextText();
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