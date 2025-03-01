package com.common.szair.model.airportshuttle;

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
public class getUsedAddressResultVO extends bookingResponseBaseVO implements SOAPObject {
    public List<usedAddresssVO> _ADDRESS_LIST = null;
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
        List<usedAddresssVO> list = this._ADDRESS_LIST;
        if (list != null && list.size() > 0) {
            int size = this._ADDRESS_LIST.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "ADDRESS_LIST");
                this._ADDRESS_LIST.get(i).addElementsToNode(xml);
                xml.endTag(null, "ADDRESS_LIST");
            }
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
                    if ("ADDRESS_LIST".equals(parser.getName())) {
                        if (this._ADDRESS_LIST == null) {
                            this._ADDRESS_LIST = new ArrayList();
                        }
                        usedAddresssVO usedaddresssvo = new usedAddresssVO();
                        usedaddresssvo.parse(binding, parser);
                        this._ADDRESS_LIST.add(usedaddresssvo);
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