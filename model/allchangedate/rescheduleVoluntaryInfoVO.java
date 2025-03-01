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
public class rescheduleVoluntaryInfoVO extends baseDTOVO implements SOAPObject, Serializable {
    public String _PARTNER_UUID = null;
    public List<rescheduleSegmentRateInfoVO> _RATE_INFO_LIST = null;
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
        if (this._PARTNER_UUID != null) {
            xml.startTag(null, "PARTNER_UUID");
            xml.text(this._PARTNER_UUID);
            xml.endTag(null, "PARTNER_UUID");
        }
        List<rescheduleSegmentRateInfoVO> list = this._RATE_INFO_LIST;
        if (list == null || list.size() <= 0) {
            return;
        }
        int size = this._RATE_INFO_LIST.size();
        for (int i = 0; i < size; i++) {
            xml.startTag(null, "RATE_INFO_LIST");
            this._RATE_INFO_LIST.get(i).addElementsToNode(xml);
            xml.endTag(null, "RATE_INFO_LIST");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("PARTNER_UUID".equals(parser.getName())) {
                        this._PARTNER_UUID = parser.nextText();
                    } else if ("RATE_INFO_LIST".equals(parser.getName())) {
                        if (this._RATE_INFO_LIST == null) {
                            this._RATE_INFO_LIST = new ArrayList();
                        }
                        rescheduleSegmentRateInfoVO reschedulesegmentrateinfovo = new rescheduleSegmentRateInfoVO();
                        reschedulesegmentrateinfovo.parse(binding, parser);
                        this._RATE_INFO_LIST.add(reschedulesegmentrateinfovo);
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