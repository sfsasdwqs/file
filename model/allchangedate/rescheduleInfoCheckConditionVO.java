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
public class rescheduleInfoCheckConditionVO extends baseDTOVO implements SOAPObject {
    public List<String> _RESCHEDULE_CHECK_CODE = null;
    public String _RESCHEDULE_UUID = null;
    public List<String> _RESCHEDULE_PARTNER_UUID = null;
    public List<String> _RESCHEDULE_SEGMENT_UUID = null;
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
        List<String> list = this._RESCHEDULE_CHECK_CODE;
        if (list != null && list.size() > 0) {
            int size = this._RESCHEDULE_CHECK_CODE.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "RESCHEDULE_CHECK_CODE");
                xml.text(this._RESCHEDULE_CHECK_CODE.get(i));
                xml.endTag(null, "RESCHEDULE_CHECK_CODE");
            }
        }
        if (this._RESCHEDULE_UUID != null) {
            xml.startTag(null, "RESCHEDULE_UUID");
            xml.text(this._RESCHEDULE_UUID);
            xml.endTag(null, "RESCHEDULE_UUID");
        }
        List<String> list2 = this._RESCHEDULE_PARTNER_UUID;
        if (list2 != null && list2.size() > 0) {
            int size2 = this._RESCHEDULE_PARTNER_UUID.size();
            for (int i2 = 0; i2 < size2; i2++) {
                xml.startTag(null, "RESCHEDULE_PARTNER_UUID");
                xml.text(this._RESCHEDULE_PARTNER_UUID.get(i2));
                xml.endTag(null, "RESCHEDULE_PARTNER_UUID");
            }
        }
        List<String> list3 = this._RESCHEDULE_SEGMENT_UUID;
        if (list3 == null || list3.size() <= 0) {
            return;
        }
        int size3 = this._RESCHEDULE_SEGMENT_UUID.size();
        for (int i3 = 0; i3 < size3; i3++) {
            xml.startTag(null, "RESCHEDULE_SEGMENT_UUID");
            xml.text(this._RESCHEDULE_SEGMENT_UUID.get(i3));
            xml.endTag(null, "RESCHEDULE_SEGMENT_UUID");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("RESCHEDULE_CHECK_CODE".equals(parser.getName())) {
                        if (this._RESCHEDULE_CHECK_CODE == null) {
                            this._RESCHEDULE_CHECK_CODE = new ArrayList();
                        }
                        this._RESCHEDULE_CHECK_CODE.add(parser.nextText());
                    } else if ("RESCHEDULE_UUID".equals(parser.getName())) {
                        this._RESCHEDULE_UUID = parser.nextText();
                    } else if ("RESCHEDULE_PARTNER_UUID".equals(parser.getName())) {
                        if (this._RESCHEDULE_PARTNER_UUID == null) {
                            this._RESCHEDULE_PARTNER_UUID = new ArrayList();
                        }
                        this._RESCHEDULE_PARTNER_UUID.add(parser.nextText());
                    } else if ("RESCHEDULE_SEGMENT_UUID".equals(parser.getName())) {
                        if (this._RESCHEDULE_SEGMENT_UUID == null) {
                            this._RESCHEDULE_SEGMENT_UUID = new ArrayList();
                        }
                        this._RESCHEDULE_SEGMENT_UUID.add(parser.nextText());
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