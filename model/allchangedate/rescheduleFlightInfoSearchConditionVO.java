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
public class rescheduleFlightInfoSearchConditionVO extends baseDTOVO implements SOAPObject {
    public String _RESCHEDULE_UUID = null;
    public List<rescheduleSegmentInfoConditionVO> _RESCHEDULE_SEGMENT_INFO = null;
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
        if (this._RESCHEDULE_UUID != null) {
            xml.startTag(null, "RESCHEDULE_UUID");
            xml.text(this._RESCHEDULE_UUID);
            xml.endTag(null, "RESCHEDULE_UUID");
        }
        List<rescheduleSegmentInfoConditionVO> list = this._RESCHEDULE_SEGMENT_INFO;
        if (list == null || list.size() <= 0) {
            return;
        }
        int size = this._RESCHEDULE_SEGMENT_INFO.size();
        for (int i = 0; i < size; i++) {
            xml.startTag(null, "RESCHEDULE_SEGMENT_INFO");
            this._RESCHEDULE_SEGMENT_INFO.get(i).addElementsToNode(xml);
            xml.endTag(null, "RESCHEDULE_SEGMENT_INFO");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("RESCHEDULE_UUID".equals(parser.getName())) {
                        this._RESCHEDULE_UUID = parser.nextText();
                    } else if ("RESCHEDULE_SEGMENT_INFO".equals(parser.getName())) {
                        if (this._RESCHEDULE_SEGMENT_INFO == null) {
                            this._RESCHEDULE_SEGMENT_INFO = new ArrayList();
                        }
                        rescheduleSegmentInfoConditionVO reschedulesegmentinfoconditionvo = new rescheduleSegmentInfoConditionVO();
                        reschedulesegmentinfoconditionvo.parse(binding, parser);
                        this._RESCHEDULE_SEGMENT_INFO.add(reschedulesegmentinfoconditionvo);
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