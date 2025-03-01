package com.common.szair.model.airportshuttle;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class pickupUpdateResultVO extends bookingResponseBaseVO implements SOAPObject {
    public String _INFO_1 = null;
    public String _INFO_2 = null;
    public String _RSPCODE_1 = null;
    public String _RSPCODE_2 = null;
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
        if (this._INFO_1 != null) {
            xml.startTag(null, "INFO_1");
            xml.text(this._INFO_1);
            xml.endTag(null, "INFO_1");
        }
        if (this._INFO_2 != null) {
            xml.startTag(null, "INFO_2");
            xml.text(this._INFO_2);
            xml.endTag(null, "INFO_2");
        }
        if (this._RSPCODE_1 != null) {
            xml.startTag(null, "RSPCODE_1");
            xml.text(this._RSPCODE_1);
            xml.endTag(null, "RSPCODE_1");
        }
        if (this._RSPCODE_2 != null) {
            xml.startTag(null, "RSPCODE_2");
            xml.text(this._RSPCODE_2);
            xml.endTag(null, "RSPCODE_2");
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
                    if ("INFO_1".equals(parser.getName())) {
                        this._INFO_1 = parser.nextText();
                    } else if ("INFO_2".equals(parser.getName())) {
                        this._INFO_2 = parser.nextText();
                    } else if ("RSPCODE_1".equals(parser.getName())) {
                        this._RSPCODE_1 = parser.nextText();
                    } else if ("RSPCODE_2".equals(parser.getName())) {
                        this._RSPCODE_2 = parser.nextText();
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