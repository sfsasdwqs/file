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
public class rescheduleCommitOrderConditionVO extends baseDTOVO implements SOAPObject {
    public String _CLIENT_TYPE = null;
    public String _CONTACT_NAME = null;
    public String _CONTACT_PHONE = null;
    public String _RESCHEDULE_UUID = null;
    public List<rescheduleCommitOrderSegmentInfoVO> _SEGMENT_INFO_LIST = null;
    public String _TOTAL_PRICE = null;
    public String _CAPTCHA = null;
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
        if (this._CLIENT_TYPE != null) {
            xml.startTag(null, "CLIENT_TYPE");
            xml.text(this._CLIENT_TYPE);
            xml.endTag(null, "CLIENT_TYPE");
        }
        if (this._CONTACT_NAME != null) {
            xml.startTag(null, "CONTACT_NAME");
            xml.text(this._CONTACT_NAME);
            xml.endTag(null, "CONTACT_NAME");
        }
        if (this._CONTACT_PHONE != null) {
            xml.startTag(null, "CONTACT_PHONE");
            xml.text(this._CONTACT_PHONE);
            xml.endTag(null, "CONTACT_PHONE");
        }
        if (this._RESCHEDULE_UUID != null) {
            xml.startTag(null, "RESCHEDULE_UUID");
            xml.text(this._RESCHEDULE_UUID);
            xml.endTag(null, "RESCHEDULE_UUID");
        }
        if (this._CAPTCHA != null) {
            xml.startTag(null, "CAPTCHA");
            xml.text(this._CAPTCHA);
            xml.endTag(null, "CAPTCHA");
        }
        List<rescheduleCommitOrderSegmentInfoVO> list = this._SEGMENT_INFO_LIST;
        if (list != null && list.size() > 0) {
            int size = this._SEGMENT_INFO_LIST.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "SEGMENT_INFO_LIST");
                this._SEGMENT_INFO_LIST.get(i).addElementsToNode(xml);
                xml.endTag(null, "SEGMENT_INFO_LIST");
            }
        }
        if (this._TOTAL_PRICE != null) {
            xml.startTag(null, "TOTAL_PRICE");
            xml.text(this._TOTAL_PRICE);
            xml.endTag(null, "TOTAL_PRICE");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("CLIENT_TYPE".equals(parser.getName())) {
                        this._CLIENT_TYPE = parser.nextText();
                    } else if ("CONTACT_NAME".equals(parser.getName())) {
                        this._CONTACT_NAME = parser.nextText();
                    } else if ("CONTACT_PHONE".equals(parser.getName())) {
                        this._CONTACT_PHONE = parser.nextText();
                    } else if ("CAPTCHA".equals(parser.getName())) {
                        this._CAPTCHA = parser.nextText();
                    } else if ("RESCHEDULE_UUID".equals(parser.getName())) {
                        this._RESCHEDULE_UUID = parser.nextText();
                    } else if ("SEGMENT_INFO_LIST".equals(parser.getName())) {
                        if (this._SEGMENT_INFO_LIST == null) {
                            this._SEGMENT_INFO_LIST = new ArrayList();
                        }
                        rescheduleCommitOrderSegmentInfoVO reschedulecommitordersegmentinfovo = new rescheduleCommitOrderSegmentInfoVO();
                        reschedulecommitordersegmentinfovo.parse(binding, parser);
                        this._SEGMENT_INFO_LIST.add(reschedulecommitordersegmentinfovo);
                    } else if ("TOTAL_PRICE".equals(parser.getName())) {
                        this._TOTAL_PRICE = parser.nextText();
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