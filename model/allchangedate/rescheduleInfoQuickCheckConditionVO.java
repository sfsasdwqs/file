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
public class rescheduleInfoQuickCheckConditionVO extends baseDTOVO implements SOAPObject {
    public String _INDVL_ID_NBR = null;
    public String _PAX_NM = null;
    public String _PAX_TYPE = null;
    public String _AES_FLAG = null;
    public List<rescheduleInfoQuickCheckSegmentInfoVO> _SEGMENT_INFO = null;
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
        if (this._INDVL_ID_NBR != null) {
            xml.startTag(null, "INDVL_ID_NBR");
            xml.text(this._INDVL_ID_NBR);
            xml.endTag(null, "INDVL_ID_NBR");
        }
        if (this._PAX_NM != null) {
            xml.startTag(null, "PAX_NM");
            xml.text(this._PAX_NM);
            xml.endTag(null, "PAX_NM");
        }
        if (this._PAX_TYPE != null) {
            xml.startTag(null, "PAX_TYPE");
            xml.text(this._PAX_TYPE);
            xml.endTag(null, "PAX_TYPE");
        }
        if (this._AES_FLAG != null) {
            xml.startTag(null, "AES_FLAG");
            xml.text(this._AES_FLAG);
            xml.endTag(null, "AES_FLAG");
        }
        List<rescheduleInfoQuickCheckSegmentInfoVO> list = this._SEGMENT_INFO;
        if (list == null || list.size() <= 0) {
            return;
        }
        int size = this._SEGMENT_INFO.size();
        for (int i = 0; i < size; i++) {
            xml.startTag(null, "SEGMENT_INFO");
            this._SEGMENT_INFO.get(i).addElementsToNode(xml);
            xml.endTag(null, "SEGMENT_INFO");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("INDVL_ID_NBR".equals(parser.getName())) {
                        this._INDVL_ID_NBR = parser.nextText();
                    } else if ("PAX_NM".equals(parser.getName())) {
                        this._PAX_NM = parser.nextText();
                    } else if ("PAX_TYPE".equals(parser.getName())) {
                        this._PAX_TYPE = parser.nextText();
                    } else if ("AES_FLAG".equals(parser.getName())) {
                        this._AES_FLAG = parser.nextText();
                    } else if ("SEGMENT_INFO".equals(parser.getName())) {
                        if (this._SEGMENT_INFO == null) {
                            this._SEGMENT_INFO = new ArrayList();
                        }
                        rescheduleInfoQuickCheckSegmentInfoVO rescheduleinfoquickchecksegmentinfovo = new rescheduleInfoQuickCheckSegmentInfoVO();
                        rescheduleinfoquickchecksegmentinfovo.parse(binding, parser);
                        this._SEGMENT_INFO.add(rescheduleinfoquickchecksegmentinfovo);
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