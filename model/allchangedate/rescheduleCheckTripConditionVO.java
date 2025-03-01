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
public class rescheduleCheckTripConditionVO extends baseDTOVO implements SOAPObject {
    public String _RESCHEDULE_INFO_UUID = null;
    public List<saveSegmentInfoVO> _SEGMENT_INFO_LIST = null;
    private java.lang.Exception _exception = null;

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/shenzhenair/mobilewebservice/rescheduleMktWebService";
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
        if (this._RESCHEDULE_INFO_UUID != null) {
            xml.startTag(null, "RESCHEDULE_INFO_UUID");
            xml.text(this._RESCHEDULE_INFO_UUID);
            xml.endTag(null, "RESCHEDULE_INFO_UUID");
        }
        List<saveSegmentInfoVO> list = this._SEGMENT_INFO_LIST;
        if (list == null || list.size() <= 0) {
            return;
        }
        int size = this._SEGMENT_INFO_LIST.size();
        for (int i = 0; i < size; i++) {
            xml.startTag(null, "SEGMENT_INFO_LIST");
            this._SEGMENT_INFO_LIST.get(i).addElementsToNode(xml);
            xml.endTag(null, "SEGMENT_INFO_LIST");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("RESCHEDULE_INFO_UUID".equals(parser.getName())) {
                        this._RESCHEDULE_INFO_UUID = parser.nextText();
                    } else if ("SEGMENT_INFO_LIST".equals(parser.getName())) {
                        if (this._SEGMENT_INFO_LIST == null) {
                            this._SEGMENT_INFO_LIST = new ArrayList();
                        }
                        saveSegmentInfoVO savesegmentinfovo = new saveSegmentInfoVO();
                        savesegmentinfovo.parse(binding, parser);
                        this._SEGMENT_INFO_LIST.add(savesegmentinfovo);
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