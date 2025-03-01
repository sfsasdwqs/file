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
public class rescheduleClassListVO extends baseDTOVO implements SOAPObject, Serializable {
    public List<rescheduleClassInfoVO> _CLASS_LIST = null;
    public String _CLASS_LIST_TYPE = null;
    public rescheduleClassInfoVO lowerClassInfo = null;
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
        List<rescheduleClassInfoVO> list = this._CLASS_LIST;
        if (list != null && list.size() > 0) {
            int size = this._CLASS_LIST.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "CLASS_LIST");
                this._CLASS_LIST.get(i).addElementsToNode(xml);
                xml.endTag(null, "CLASS_LIST");
            }
        }
        if (this._CLASS_LIST_TYPE != null) {
            xml.startTag(null, "CLASS_LIST_TYPE");
            xml.text(this._CLASS_LIST_TYPE);
            xml.endTag(null, "CLASS_LIST_TYPE");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("CLASS_LIST".equals(parser.getName())) {
                        if (this._CLASS_LIST == null) {
                            this._CLASS_LIST = new ArrayList();
                        }
                        rescheduleClassInfoVO rescheduleclassinfovo = new rescheduleClassInfoVO();
                        rescheduleclassinfovo.parse(binding, parser);
                        this._CLASS_LIST.add(rescheduleclassinfovo);
                    } else if ("CLASS_LIST_TYPE".equals(parser.getName())) {
                        this._CLASS_LIST_TYPE = parser.nextText();
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