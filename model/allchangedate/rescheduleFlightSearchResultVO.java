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
public class rescheduleFlightSearchResultVO extends bookingResponseBaseVO implements SOAPObject {
    public String _HC_TYPE = null;
    public String _MESSAGE = null;
    public List<rescheduleFlightSegmentVO> _RESCHEDULE_FLIGHT_INFOS = null;
    public String _RESCHEDULE_TYPE = null;
    public String _YST_TIP = null;
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
        if (this._HC_TYPE != null) {
            xml.startTag(null, "HC_TYPE");
            xml.text(this._HC_TYPE);
            xml.endTag(null, "HC_TYPE");
        }
        if (this._MESSAGE != null) {
            xml.startTag(null, "MESSAGE");
            xml.text(this._MESSAGE);
            xml.endTag(null, "MESSAGE");
        }
        List<rescheduleFlightSegmentVO> list = this._RESCHEDULE_FLIGHT_INFOS;
        if (list != null && list.size() > 0) {
            int size = this._RESCHEDULE_FLIGHT_INFOS.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "RESCHEDULE_FLIGHT_INFOS");
                this._RESCHEDULE_FLIGHT_INFOS.get(i).addElementsToNode(xml);
                xml.endTag(null, "RESCHEDULE_FLIGHT_INFOS");
            }
        }
        if (this._RESCHEDULE_TYPE != null) {
            xml.startTag(null, "RESCHEDULE_TYPE");
            xml.text(this._RESCHEDULE_TYPE);
            xml.endTag(null, "RESCHEDULE_TYPE");
        }
        if (this._YST_TIP != null) {
            xml.startTag(null, "YST_TIP");
            xml.text(this._YST_TIP);
            xml.endTag(null, "YST_TIP");
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
                    if ("HC_TYPE".equals(parser.getName())) {
                        this._HC_TYPE = parser.nextText();
                    } else if ("MESSAGE".equals(parser.getName())) {
                        this._MESSAGE = parser.nextText();
                    } else if ("RESCHEDULE_FLIGHT_INFOS".equals(parser.getName())) {
                        if (this._RESCHEDULE_FLIGHT_INFOS == null) {
                            this._RESCHEDULE_FLIGHT_INFOS = new ArrayList();
                        }
                        rescheduleFlightSegmentVO rescheduleflightsegmentvo = new rescheduleFlightSegmentVO();
                        rescheduleflightsegmentvo.parse(binding, parser);
                        this._RESCHEDULE_FLIGHT_INFOS.add(rescheduleflightsegmentvo);
                    } else if ("RESCHEDULE_TYPE".equals(parser.getName())) {
                        this._RESCHEDULE_TYPE = parser.nextText();
                    } else if ("YST_TIP".equals(parser.getName())) {
                        this._YST_TIP = parser.nextText();
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