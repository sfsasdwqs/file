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
public class rescheduleFlightSegmentInfoVO extends baseDTOVO implements SOAPObject, Serializable {
    public List<rescheduleFlightInfoVO> _RESCHEDULE_FLIGHT_INFO = null;
    public String _RESCHEDULE_SEGMENT_UUID = null;
    public String _YST_FLAG = null;
    public String _YST_TIP = null;
    private java.lang.Exception _exception = null;

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/shenzhenair/mobilewebservice/allChannelTicketReschedule";
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void setexception(java.lang.Exception _exception) {
        this._exception = _exception;
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public java.lang.Exception getexception() {
        return this._exception;
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void toXml(XmlSerializer xml, String name, String namespace) throws IOException {
        if (namespace == null || namespace.length() <= 0) {
            namespace = getNamespace();
        }
        xml.startTag(namespace, name);
        addAttributesToNode(xml);
        addElementsToNode(xml);
        xml.endTag(namespace, name);
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void addElementsToNode(XmlSerializer xml) throws IOException {
        List<rescheduleFlightInfoVO> list = this._RESCHEDULE_FLIGHT_INFO;
        if (list != null && list.size() > 0) {
            int size = this._RESCHEDULE_FLIGHT_INFO.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "RESCHEDULE_FLIGHT_INFO");
                this._RESCHEDULE_FLIGHT_INFO.get(i).addElementsToNode(xml);
                xml.endTag(null, "RESCHEDULE_FLIGHT_INFO");
            }
        }
        if (this._RESCHEDULE_SEGMENT_UUID != null) {
            xml.startTag(null, "RESCHEDULE_SEGMENT_UUID");
            xml.text(this._RESCHEDULE_SEGMENT_UUID);
            xml.endTag(null, "RESCHEDULE_SEGMENT_UUID");
        }
        if (this._YST_FLAG != null) {
            xml.startTag(null, "YST_FLAG");
            xml.text(this._YST_FLAG);
            xml.endTag(null, "YST_FLAG");
        }
        if (this._YST_TIP != null) {
            xml.startTag(null, "YST_TIP");
            xml.text(this._YST_TIP);
            xml.endTag(null, "YST_TIP");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("RESCHEDULE_FLIGHT_INFO".equals(parser.getName())) {
                        if (this._RESCHEDULE_FLIGHT_INFO == null) {
                            this._RESCHEDULE_FLIGHT_INFO = new ArrayList();
                        }
                        rescheduleFlightInfoVO rescheduleflightinfovo = new rescheduleFlightInfoVO();
                        rescheduleflightinfovo.parse(binding, parser);
                        this._RESCHEDULE_FLIGHT_INFO.add(rescheduleflightinfovo);
                    } else if ("RESCHEDULE_SEGMENT_UUID".equals(parser.getName())) {
                        this._RESCHEDULE_SEGMENT_UUID = parser.nextText();
                    } else if ("YST_FLAG".equals(parser.getName())) {
                        this._YST_FLAG = parser.nextText();
                    } else if ("YST_TIP".equals(parser.getName())) {
                        this._YST_TIP = parser.nextText();
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