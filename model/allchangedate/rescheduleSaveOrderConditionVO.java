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
public class rescheduleSaveOrderConditionVO extends baseDTOVO implements SOAPObject {
    public String _CAPTCHA = null;
    public String _CLIENT_TYPE = null;
    public String _CONTACT_NAME = null;
    public String _CONTACT_PHONE = null;
    public String _OPEN_ID = null;
    public String _RESCHEDULE_INFO_UUID = null;
    public List<saveSegmentInfoVO> _SEGMENT_INFO_LIST = null;
    public String _TOTAL_PRICE = null;
    public String _UNION_ID = null;
    public String _CONNECT_RESCHEDULE_INFO_UUID = null;
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
        if (this._CAPTCHA != null) {
            xml.startTag(null, "CAPTCHA");
            xml.text(this._CAPTCHA);
            xml.endTag(null, "CAPTCHA");
        }
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
        if (this._OPEN_ID != null) {
            xml.startTag(null, "OPEN_ID");
            xml.text(this._OPEN_ID);
            xml.endTag(null, "OPEN_ID");
        }
        if (this._RESCHEDULE_INFO_UUID != null) {
            xml.startTag(null, "RESCHEDULE_INFO_UUID");
            xml.text(this._RESCHEDULE_INFO_UUID);
            xml.endTag(null, "RESCHEDULE_INFO_UUID");
        }
        List<saveSegmentInfoVO> list = this._SEGMENT_INFO_LIST;
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
        if (this._UNION_ID != null) {
            xml.startTag(null, "UNION_ID");
            xml.text(this._UNION_ID);
            xml.endTag(null, "UNION_ID");
        }
        if (this._CONNECT_RESCHEDULE_INFO_UUID != null) {
            xml.startTag(null, "CONNECT_RESCHEDULE_INFO_UUID");
            xml.text(this._CONNECT_RESCHEDULE_INFO_UUID);
            xml.endTag(null, "CONNECT_RESCHEDULE_INFO_UUID");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("CAPTCHA".equals(parser.getName())) {
                        this._CAPTCHA = parser.nextText();
                    } else if ("CLIENT_TYPE".equals(parser.getName())) {
                        this._CLIENT_TYPE = parser.nextText();
                    } else if ("CONTACT_NAME".equals(parser.getName())) {
                        this._CONTACT_NAME = parser.nextText();
                    } else if ("CONTACT_PHONE".equals(parser.getName())) {
                        this._CONTACT_PHONE = parser.nextText();
                    } else if ("OPEN_ID".equals(parser.getName())) {
                        this._OPEN_ID = parser.nextText();
                    } else if ("RESCHEDULE_INFO_UUID".equals(parser.getName())) {
                        this._RESCHEDULE_INFO_UUID = parser.nextText();
                    } else if ("SEGMENT_INFO_LIST".equals(parser.getName())) {
                        if (this._SEGMENT_INFO_LIST == null) {
                            this._SEGMENT_INFO_LIST = new ArrayList();
                        }
                        saveSegmentInfoVO savesegmentinfovo = new saveSegmentInfoVO();
                        savesegmentinfovo.parse(binding, parser);
                        this._SEGMENT_INFO_LIST.add(savesegmentinfovo);
                    } else if ("TOTAL_PRICE".equals(parser.getName())) {
                        this._TOTAL_PRICE = parser.nextText();
                    } else if ("UNION_ID".equals(parser.getName())) {
                        this._UNION_ID = parser.nextText();
                    } else if ("CONNECT_RESCHEDULE_INFO_UUID".equals(parser.getName())) {
                        this._CONNECT_RESCHEDULE_INFO_UUID = parser.nextText();
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