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
public class connectTicketFlightInfoResultVO extends bookingResponseBaseVO implements SOAPObject {
    public rescheduleInfoVO _ALL_CHANNEL_RESCHEDULE_INFO = null;
    public List<rescheduleAlreadyCheckInInfoVO> _ALREADY_CHECKIN_INFOS = null;
    public String _MESSAGE = null;
    public List<checkTripSegmentInfoVO> _SEGMENT_INFO_LIST = null;
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
        if (this._ALL_CHANNEL_RESCHEDULE_INFO != null) {
            xml.startTag(null, "ALL_CHANNEL_RESCHEDULE_INFO");
            this._ALL_CHANNEL_RESCHEDULE_INFO.addElementsToNode(xml);
            xml.endTag(null, "ALL_CHANNEL_RESCHEDULE_INFO");
        }
        List<rescheduleAlreadyCheckInInfoVO> list = this._ALREADY_CHECKIN_INFOS;
        if (list != null && list.size() > 0) {
            int size = this._ALREADY_CHECKIN_INFOS.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "ALREADY_CHECKIN_INFOS");
                this._ALREADY_CHECKIN_INFOS.get(i).addElementsToNode(xml);
                xml.endTag(null, "ALREADY_CHECKIN_INFOS");
            }
        }
        if (this._MESSAGE != null) {
            xml.startTag(null, "MESSAGE");
            xml.text(this._MESSAGE);
            xml.endTag(null, "MESSAGE");
        }
        List<checkTripSegmentInfoVO> list2 = this._SEGMENT_INFO_LIST;
        if (list2 != null && list2.size() > 0) {
            int size2 = this._SEGMENT_INFO_LIST.size();
            for (int i2 = 0; i2 < size2; i2++) {
                xml.startTag(null, "SEGMENT_INFO_LIST");
                this._SEGMENT_INFO_LIST.get(i2).addElementsToNode(xml);
                xml.endTag(null, "SEGMENT_INFO_LIST");
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
                    if ("ALL_CHANNEL_RESCHEDULE_INFO".equals(parser.getName())) {
                        rescheduleInfoVO rescheduleinfovo = new rescheduleInfoVO();
                        rescheduleinfovo.parse(binding, parser);
                        this._ALL_CHANNEL_RESCHEDULE_INFO = rescheduleinfovo;
                    } else if ("ALREADY_CHECKIN_INFOS".equals(parser.getName())) {
                        if (this._ALREADY_CHECKIN_INFOS == null) {
                            this._ALREADY_CHECKIN_INFOS = new ArrayList();
                        }
                        rescheduleAlreadyCheckInInfoVO reschedulealreadycheckininfovo = new rescheduleAlreadyCheckInInfoVO();
                        reschedulealreadycheckininfovo.parse(binding, parser);
                        this._ALREADY_CHECKIN_INFOS.add(reschedulealreadycheckininfovo);
                    } else if ("MESSAGE".equals(parser.getName())) {
                        this._MESSAGE = parser.nextText();
                    } else if ("SEGMENT_INFO_LIST".equals(parser.getName())) {
                        if (this._SEGMENT_INFO_LIST == null) {
                            this._SEGMENT_INFO_LIST = new ArrayList();
                        }
                        checkTripSegmentInfoVO checktripsegmentinfovo = new checkTripSegmentInfoVO();
                        checktripsegmentinfovo.parse(binding, parser);
                        this._SEGMENT_INFO_LIST.add(checktripsegmentinfovo);
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