package com.common.szair.model.airportshuttle;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class poisVO implements SOAPObject {
    public String _ADDRESS = null;
    public String _ADNAME = null;
    public String _CITY_NAME = null;
    public String _LOCATION = null;
    public String _NAME = null;
    public String _PNAME = null;
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
        if (this._ADDRESS != null) {
            xml.startTag(null, "ADDRESS");
            xml.text(this._ADDRESS);
            xml.endTag(null, "ADDRESS");
        }
        if (this._ADNAME != null) {
            xml.startTag(null, "ADNAME");
            xml.text(this._ADNAME);
            xml.endTag(null, "ADNAME");
        }
        if (this._CITY_NAME != null) {
            xml.startTag(null, "CITY_NAME");
            xml.text(this._CITY_NAME);
            xml.endTag(null, "CITY_NAME");
        }
        if (this._LOCATION != null) {
            xml.startTag(null, "LOCATION");
            xml.text(this._LOCATION);
            xml.endTag(null, "LOCATION");
        }
        if (this._NAME != null) {
            xml.startTag(null, "NAME");
            xml.text(this._NAME);
            xml.endTag(null, "NAME");
        }
        if (this._PNAME != null) {
            xml.startTag(null, "PNAME");
            xml.text(this._PNAME);
            xml.endTag(null, "PNAME");
        }
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("ADDRESS".equals(parser.getName())) {
                        this._ADDRESS = parser.nextText();
                    } else if ("ADNAME".equals(parser.getName())) {
                        this._ADNAME = parser.nextText();
                    } else if ("CITY_NAME".equals(parser.getName())) {
                        this._CITY_NAME = parser.nextText();
                    } else if ("LOCATION".equals(parser.getName())) {
                        this._LOCATION = parser.nextText();
                    } else if ("NAME".equals(parser.getName())) {
                        this._NAME = parser.nextText();
                    } else if ("PNAME".equals(parser.getName())) {
                        this._PNAME = parser.nextText();
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