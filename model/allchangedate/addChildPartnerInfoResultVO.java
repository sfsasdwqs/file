package com.common.szair.model.allchangedate;

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
public class addChildPartnerInfoResultVO extends bookingResponseBaseVO implements SOAPObject {
    public String _MESSAGE = null;
    public List<reschedulePartnerInfoVO> _PARTNER_INFO = null;
    public String _OP_RESULT = null;
    private java.lang.Exception _exception = null;

    @Override // com.common.szair.model.allchangedate.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.allchangedate.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/shenzhenair/mobilewebservice/rescheduleMktWebService";
    }

    @Override // com.common.szair.model.allchangedate.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public void setexception(java.lang.Exception _exception) {
        this._exception = _exception;
    }

    @Override // com.common.szair.model.allchangedate.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public java.lang.Exception getexception() {
        return this._exception;
    }

    @Override // com.common.szair.model.allchangedate.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public void toXml(XmlSerializer xml, String name, String namespace) throws IOException {
        if (namespace == null || namespace.length() <= 0) {
            namespace = getNamespace();
        }
        xml.startTag(namespace, name);
        addAttributesToNode(xml);
        addElementsToNode(xml);
        xml.endTag(namespace, name);
    }

    @Override // com.common.szair.model.allchangedate.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public void addElementsToNode(XmlSerializer xml) throws IOException {
        if (this._MESSAGE != null) {
            xml.startTag(null, "MESSAGE");
            xml.text(this._MESSAGE);
            xml.endTag(null, "MESSAGE");
        }
        List<reschedulePartnerInfoVO> list = this._PARTNER_INFO;
        if (list != null && list.size() > 0) {
            int size = this._PARTNER_INFO.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "PARTNER_INFO");
                this._PARTNER_INFO.get(i).addElementsToNode(xml);
                xml.endTag(null, "PARTNER_INFO");
            }
        }
        if (this._OP_RESULT != null) {
            xml.startTag(null, "OP_RESULT");
            xml.text(this._OP_RESULT);
            xml.endTag(null, "OP_RESULT");
        }
    }

    @Override // com.common.szair.model.allchangedate.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("MESSAGE".equals(parser.getName())) {
                        this._MESSAGE = parser.nextText();
                    } else if ("PARTNER_INFO".equals(parser.getName())) {
                        if (this._PARTNER_INFO == null) {
                            this._PARTNER_INFO = new ArrayList();
                        }
                        reschedulePartnerInfoVO reschedulepartnerinfovo = new reschedulePartnerInfoVO();
                        reschedulepartnerinfovo.parse(binding, parser);
                        this._PARTNER_INFO.add(reschedulepartnerinfovo);
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