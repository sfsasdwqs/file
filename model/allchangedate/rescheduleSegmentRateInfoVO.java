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
public class rescheduleSegmentRateInfoVO extends baseDTOVO implements SOAPObject, Serializable {
    public Integer _BABY_RATE = null;
    public String _ZERO_CHANGE_FLAG = null;
    public Integer _RATE = null;
    public Integer _SEGMENT_INDEX = null;
    public List<String> _SPECIAL_DATE_LIST = null;
    public String _SPECIAL_DATE_UNLIMITED = null;
    public String _SPECIAL_FLAG = null;
    public List<String> _SPECIAL_NODE_DATE_LIST = null;
    public String _SPECIAL_TYPE = null;
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
        if (this._BABY_RATE != null) {
            xml.startTag(null, "BABY_RATE");
            xml.text(String.valueOf(this._BABY_RATE));
            xml.endTag(null, "BABY_RATE");
        }
        if (this._ZERO_CHANGE_FLAG != null) {
            xml.startTag(null, "ZERO_CHANGE_FLAG");
            xml.text(this._ZERO_CHANGE_FLAG);
            xml.endTag(null, "ZERO_CHANGE_FLAG");
        }
        if (this._RATE != null) {
            xml.startTag(null, "RATE");
            xml.text(String.valueOf(this._RATE));
            xml.endTag(null, "RATE");
        }
        if (this._SEGMENT_INDEX != null) {
            xml.startTag(null, "SEGMENT_INDEX");
            xml.text(String.valueOf(this._SEGMENT_INDEX));
            xml.endTag(null, "SEGMENT_INDEX");
        }
        List<String> list = this._SPECIAL_DATE_LIST;
        if (list != null && list.size() > 0) {
            int size = this._SPECIAL_DATE_LIST.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "SPECIAL_DATE_LIST");
                xml.text(this._SPECIAL_DATE_LIST.get(i));
                xml.endTag(null, "SPECIAL_DATE_LIST");
            }
        }
        if (this._SPECIAL_DATE_UNLIMITED != null) {
            xml.startTag(null, "SPECIAL_DATE_UNLIMITED");
            xml.text(this._SPECIAL_DATE_UNLIMITED);
            xml.endTag(null, "SPECIAL_DATE_UNLIMITED");
        }
        if (this._SPECIAL_FLAG != null) {
            xml.startTag(null, "SPECIAL_FLAG");
            xml.text(this._SPECIAL_FLAG);
            xml.endTag(null, "SPECIAL_FLAG");
        }
        List<String> list2 = this._SPECIAL_NODE_DATE_LIST;
        if (list2 != null && list2.size() > 0) {
            int size2 = this._SPECIAL_NODE_DATE_LIST.size();
            for (int i2 = 0; i2 < size2; i2++) {
                xml.startTag(null, "SPECIAL_NODE_DATE_LIST");
                xml.text(this._SPECIAL_NODE_DATE_LIST.get(i2));
                xml.endTag(null, "SPECIAL_NODE_DATE_LIST");
            }
        }
        if (this._SPECIAL_TYPE != null) {
            xml.startTag(null, "SPECIAL_TYPE");
            xml.text(this._SPECIAL_TYPE);
            xml.endTag(null, "SPECIAL_TYPE");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("BABY_RATE".equals(parser.getName())) {
                        this._BABY_RATE = Integer.valueOf(parser.nextText());
                    } else if ("ZERO_CHANGE_FLAG".equals(parser.getName())) {
                        this._ZERO_CHANGE_FLAG = parser.nextText();
                    } else if ("RATE".equals(parser.getName())) {
                        this._RATE = Integer.valueOf(parser.nextText());
                    } else if ("SEGMENT_INDEX".equals(parser.getName())) {
                        this._SEGMENT_INDEX = Integer.valueOf(parser.nextText());
                    } else if ("SPECIAL_DATE_LIST".equals(parser.getName())) {
                        if (this._SPECIAL_DATE_LIST == null) {
                            this._SPECIAL_DATE_LIST = new ArrayList();
                        }
                        this._SPECIAL_DATE_LIST.add(parser.nextText());
                    } else if ("SPECIAL_DATE_UNLIMITED".equals(parser.getName())) {
                        this._SPECIAL_DATE_UNLIMITED = parser.nextText();
                    } else if ("SPECIAL_FLAG".equals(parser.getName())) {
                        this._SPECIAL_FLAG = parser.nextText();
                    } else if ("SPECIAL_NODE_DATE_LIST".equals(parser.getName())) {
                        if (this._SPECIAL_NODE_DATE_LIST == null) {
                            this._SPECIAL_NODE_DATE_LIST = new ArrayList();
                        }
                        this._SPECIAL_NODE_DATE_LIST.add(parser.nextText());
                    } else if ("SPECIAL_TYPE".equals(parser.getName())) {
                        this._SPECIAL_TYPE = parser.nextText();
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