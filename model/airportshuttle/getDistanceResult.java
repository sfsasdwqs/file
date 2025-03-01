package com.common.szair.model.airportshuttle;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class getDistanceResult extends bookingResponseBaseVO implements SOAPObject {
    public String _DISTANCE = null;
    public String _INFO = null;
    public String _RSP_CODE = null;
    public String _OP_RESULT = null;
    private Exception _exception = null;

    @Override // com.common.szair.model.airportshuttle.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.airportshuttle.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/shenzhenair/mobilewebservice/pickup";
    }

    @Override // com.common.szair.model.airportshuttle.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public void setexception(Exception _exception) {
        this._exception = _exception;
    }

    @Override // com.common.szair.model.airportshuttle.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public Exception getexception() {
        return this._exception;
    }

    @Override // com.common.szair.model.airportshuttle.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public void toXml(XmlSerializer xml, String name, String namespace) throws IOException {
        if (namespace == null || namespace.length() <= 0) {
            namespace = getNamespace();
        }
        xml.startTag(namespace, name);
        addAttributesToNode(xml);
        addElementsToNode(xml);
        xml.endTag(namespace, name);
    }

    @Override // com.common.szair.model.airportshuttle.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public void addElementsToNode(XmlSerializer xml) throws IOException {
        if (this._DISTANCE != null) {
            xml.startTag(null, "DISTANCE");
            xml.text(this._DISTANCE);
            xml.endTag(null, "DISTANCE");
        }
        if (this._INFO != null) {
            xml.startTag(null, "INFO");
            xml.text(this._INFO);
            xml.endTag(null, "INFO");
        }
        if (this._RSP_CODE != null) {
            xml.startTag(null, "RSP_CODE");
            xml.text(this._RSP_CODE);
            xml.endTag(null, "RSP_CODE");
        }
        if (this._OP_RESULT != null) {
            xml.startTag(null, "OP_RESULT");
            xml.text(this._OP_RESULT);
            xml.endTag(null, "OP_RESULT");
        }
    }

    @Override // com.common.szair.model.airportshuttle.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("DISTANCE".equals(parser.getName())) {
                        this._DISTANCE = parser.nextText();
                    } else if ("INFO".equals(parser.getName())) {
                        this._INFO = parser.nextText();
                    } else if ("RSP_CODE".equals(parser.getName())) {
                        this._RSP_CODE = parser.nextText();
                    } else if ("OP_RESULT".equals(parser.getName())) {
                        this._OP_RESULT = parser.nextText();
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