package com.common.szair.model.allchangedate;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class rescheduleInfoCheckResultVO extends bookingResponseBaseVO implements SOAPObject, Serializable {
    public List<rescheduleAlreadyCheckInInfoVO> _ALREADY_CHECK_IN_LIST = null;
    public String _FZY_FLAG = null;
    public String _FZY_TYPE = null;
    public String _MESSAGE = null;
    public String _MESSAGE_CODE = null;
    public List<rescheduleProtectFlightInfoVO> _PROTECT_FLIGHT_LIST = null;
    public String _TICKET_EFFCETIVE_DATE = null;
    public List<rescheduleVoluntaryInfoVO> _VOLUNTARY_INFO_LIST = null;
    public List<rescheduleYstInfoVO> _SEGMENTINFOVO_LIST = null;
    public String _OP_RESULT = null;
    public String _YST_RULE_DETAIL = null;
    private java.lang.Exception _exception = null;

    @Override // com.common.szair.model.allchangedate.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.allchangedate.bookingResponseBaseVO, com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/shenzhenair/mobilewebservice/allChannelTicketReschedule";
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
        List<rescheduleAlreadyCheckInInfoVO> list = this._ALREADY_CHECK_IN_LIST;
        if (list != null && list.size() > 0) {
            int size = this._ALREADY_CHECK_IN_LIST.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "ALREADY_CHECK_IN_LIST");
                this._ALREADY_CHECK_IN_LIST.get(i).addElementsToNode(xml);
                xml.endTag(null, "ALREADY_CHECK_IN_LIST");
            }
        }
        if (this._FZY_FLAG != null) {
            xml.startTag(null, "FZY_FLAG");
            xml.text(this._FZY_FLAG);
            xml.endTag(null, "FZY_FLAG");
        }
        if (this._FZY_TYPE != null) {
            xml.startTag(null, "FZY_TYPE");
            xml.text(this._FZY_TYPE);
            xml.endTag(null, "FZY_TYPE");
        }
        if (this._MESSAGE != null) {
            xml.startTag(null, "MESSAGE");
            xml.text(this._MESSAGE);
            xml.endTag(null, "MESSAGE");
        }
        if (this._MESSAGE_CODE != null) {
            xml.startTag(null, "MESSAGE_CODE");
            xml.text(this._MESSAGE_CODE);
            xml.endTag(null, "MESSAGE_CODE");
        }
        List<rescheduleProtectFlightInfoVO> list2 = this._PROTECT_FLIGHT_LIST;
        if (list2 != null && list2.size() > 0) {
            int size2 = this._PROTECT_FLIGHT_LIST.size();
            for (int i2 = 0; i2 < size2; i2++) {
                xml.startTag(null, "PROTECT_FLIGHT_LIST");
                this._PROTECT_FLIGHT_LIST.get(i2).addElementsToNode(xml);
                xml.endTag(null, "PROTECT_FLIGHT_LIST");
            }
        }
        if (this._TICKET_EFFCETIVE_DATE != null) {
            xml.startTag(null, "TICKET_EFFCETIVE_DATE");
            xml.text(this._TICKET_EFFCETIVE_DATE);
            xml.endTag(null, "TICKET_EFFCETIVE_DATE");
        }
        if (this._YST_RULE_DETAIL != null) {
            xml.startTag(null, "YST_RULE_DETAIL");
            xml.text(this._YST_RULE_DETAIL);
            xml.endTag(null, "YST_RULE_DETAIL");
        }
        List<rescheduleVoluntaryInfoVO> list3 = this._VOLUNTARY_INFO_LIST;
        if (list3 != null && list3.size() > 0) {
            int size3 = this._VOLUNTARY_INFO_LIST.size();
            for (int i3 = 0; i3 < size3; i3++) {
                xml.startTag(null, "VOLUNTARY_INFO_LIST");
                this._VOLUNTARY_INFO_LIST.get(i3).addElementsToNode(xml);
                xml.endTag(null, "VOLUNTARY_INFO_LIST");
            }
        }
        List<rescheduleYstInfoVO> list4 = this._SEGMENTINFOVO_LIST;
        if (list4 != null && list4.size() > 0) {
            int size4 = this._SEGMENTINFOVO_LIST.size();
            for (int i4 = 0; i4 < size4; i4++) {
                xml.startTag(null, "SEGMENTINFOVO_LIST");
                this._SEGMENTINFOVO_LIST.get(i4).addElementsToNode(xml);
                xml.endTag(null, "SEGMENTINFOVO_LIST");
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
                    if ("ALREADY_CHECK_IN_LIST".equals(parser.getName())) {
                        if (this._ALREADY_CHECK_IN_LIST == null) {
                            this._ALREADY_CHECK_IN_LIST = new ArrayList();
                        }
                        rescheduleAlreadyCheckInInfoVO reschedulealreadycheckininfovo = new rescheduleAlreadyCheckInInfoVO();
                        reschedulealreadycheckininfovo.parse(binding, parser);
                        this._ALREADY_CHECK_IN_LIST.add(reschedulealreadycheckininfovo);
                    } else if ("FZY_FLAG".equals(parser.getName())) {
                        this._FZY_FLAG = parser.nextText();
                    } else if ("FZY_TYPE".equals(parser.getName())) {
                        this._FZY_TYPE = parser.nextText();
                    } else if ("MESSAGE".equals(parser.getName())) {
                        this._MESSAGE = parser.nextText();
                    } else if ("MESSAGE_CODE".equals(parser.getName())) {
                        this._MESSAGE_CODE = parser.nextText();
                    } else if ("PROTECT_FLIGHT_LIST".equals(parser.getName())) {
                        if (this._PROTECT_FLIGHT_LIST == null) {
                            this._PROTECT_FLIGHT_LIST = new ArrayList();
                        }
                        rescheduleProtectFlightInfoVO rescheduleprotectflightinfovo = new rescheduleProtectFlightInfoVO();
                        rescheduleprotectflightinfovo.parse(binding, parser);
                        this._PROTECT_FLIGHT_LIST.add(rescheduleprotectflightinfovo);
                    } else if ("TICKET_EFFCETIVE_DATE".equals(parser.getName())) {
                        this._TICKET_EFFCETIVE_DATE = parser.nextText();
                    } else if ("YST_RULE_DETAIL".equals(parser.getName())) {
                        this._YST_RULE_DETAIL = parser.nextText();
                    } else if ("VOLUNTARY_INFO_LIST".equals(parser.getName())) {
                        if (this._VOLUNTARY_INFO_LIST == null) {
                            this._VOLUNTARY_INFO_LIST = new ArrayList();
                        }
                        rescheduleVoluntaryInfoVO reschedulevoluntaryinfovo = new rescheduleVoluntaryInfoVO();
                        reschedulevoluntaryinfovo.parse(binding, parser);
                        this._VOLUNTARY_INFO_LIST.add(reschedulevoluntaryinfovo);
                    } else if ("SEGMENTINFOVO_LIST".equals(parser.getName())) {
                        if (this._SEGMENTINFOVO_LIST == null) {
                            this._SEGMENTINFOVO_LIST = new ArrayList();
                        }
                        rescheduleYstInfoVO rescheduleystinfovo = new rescheduleYstInfoVO();
                        rescheduleystinfovo.parse(binding, parser);
                        this._SEGMENTINFOVO_LIST.add(rescheduleystinfovo);
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