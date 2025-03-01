package com.common.szair.model.allchangedate;

import com.air.sz.ui.consts.UIConst;
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
public class returnMoreCancelCheckInVO extends bookingResponseBaseVO implements SOAPObject {
    public List<cancelCheckInVO> _CANCEL_CHECK_IN_LIST = null;
    public String _CODE = null;
    public String _ERROR_MSG = null;
    public String _MESSAGE = null;
    public String _MOBILE = null;
    public String _RESCHEDULE_UUID = null;
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
        List<cancelCheckInVO> list = this._CANCEL_CHECK_IN_LIST;
        if (list != null && list.size() > 0) {
            int size = this._CANCEL_CHECK_IN_LIST.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "CANCEL_CHECK_IN_LIST");
                this._CANCEL_CHECK_IN_LIST.get(i).addElementsToNode(xml);
                xml.endTag(null, "CANCEL_CHECK_IN_LIST");
            }
        }
        if (this._CODE != null) {
            xml.startTag(null, "CODE");
            xml.text(this._CODE);
            xml.endTag(null, "CODE");
        }
        if (this._ERROR_MSG != null) {
            xml.startTag(null, "ERROR_MSG");
            xml.text(this._ERROR_MSG);
            xml.endTag(null, "ERROR_MSG");
        }
        if (this._MESSAGE != null) {
            xml.startTag(null, "MESSAGE");
            xml.text(this._MESSAGE);
            xml.endTag(null, "MESSAGE");
        }
        if (this._MOBILE != null) {
            xml.startTag(null, UIConst.REGIST_WAY);
            xml.text(this._MOBILE);
            xml.endTag(null, UIConst.REGIST_WAY);
        }
        if (this._RESCHEDULE_UUID != null) {
            xml.startTag(null, "RESCHEDULE_UUID");
            xml.text(this._RESCHEDULE_UUID);
            xml.endTag(null, "RESCHEDULE_UUID");
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
                    if ("CANCEL_CHECK_IN_LIST".equals(parser.getName())) {
                        if (this._CANCEL_CHECK_IN_LIST == null) {
                            this._CANCEL_CHECK_IN_LIST = new ArrayList();
                        }
                        cancelCheckInVO cancelcheckinvo = new cancelCheckInVO();
                        cancelcheckinvo.parse(binding, parser);
                        this._CANCEL_CHECK_IN_LIST.add(cancelcheckinvo);
                    } else if ("CODE".equals(parser.getName())) {
                        this._CODE = parser.nextText();
                    } else if ("ERROR_MSG".equals(parser.getName())) {
                        this._ERROR_MSG = parser.nextText();
                    } else if ("MESSAGE".equals(parser.getName())) {
                        this._MESSAGE = parser.nextText();
                    } else if (UIConst.REGIST_WAY.equals(parser.getName())) {
                        this._MOBILE = parser.nextText();
                    } else if ("RESCHEDULE_UUID".equals(parser.getName())) {
                        this._RESCHEDULE_UUID = parser.nextText();
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