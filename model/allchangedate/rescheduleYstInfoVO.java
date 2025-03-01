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
public class rescheduleYstInfoVO implements SOAPObject, Serializable {
    public String _RESCHEDULE_SEGMENT_UUID = null;
    public String _YST_FLAG = null;
    public String _YST_AFTER = null;
    public String _YST_BEFORE = null;
    public List<String> _YST_EXCLUDE_DATE = null;
    private java.lang.Exception _exception = null;

    @Override // com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/shenzhenair/mobilewebservice/allChannelTicketReschedule";
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void setexception(java.lang.Exception _exception) {
        this._exception = _exception;
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public java.lang.Exception getexception() {
        return this._exception;
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void toXml(XmlSerializer xml, String name, String namespace) throws IOException {
        if (namespace == null || namespace.length() <= 0) {
            namespace = getNamespace();
        }
        xml.startTag(namespace, name);
        addAttributesToNode(xml);
        addElementsToNode(xml);
        xml.endTag(namespace, name);
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void addElementsToNode(XmlSerializer xml) throws IOException {
        if (this._RESCHEDULE_SEGMENT_UUID != null) {
            xml.startTag(null, "RESCHEDULE_SEGMENT_UUID");
            xml.text(String.valueOf(this._RESCHEDULE_SEGMENT_UUID));
            xml.endTag(null, "RESCHEDULE_SEGMENT_UUID");
        }
        if (this._YST_FLAG != null) {
            xml.startTag(null, "YST_FLAG");
            xml.text(this._YST_FLAG);
            xml.endTag(null, "YST_FLAG");
        }
        if (this._YST_AFTER != null) {
            xml.startTag(null, "YST_AFTER");
            xml.text(this._YST_AFTER);
            xml.endTag(null, "YST_AFTER");
        }
        if (this._YST_BEFORE != null) {
            xml.startTag(null, "YST_BEFORE");
            xml.text(this._YST_BEFORE);
            xml.endTag(null, "YST_BEFORE");
        }
        List<String> list = this._YST_EXCLUDE_DATE;
        if (list == null || list.size() <= 0) {
            return;
        }
        int size = this._YST_EXCLUDE_DATE.size();
        for (int i = 0; i < size; i++) {
            xml.startTag(null, "YST_EXCLUDE_DATE");
            xml.text(this._YST_EXCLUDE_DATE.get(i));
            xml.endTag(null, "YST_EXCLUDE_DATE");
        }
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("RESCHEDULE_SEGMENT_UUID".equals(parser.getName())) {
                        this._RESCHEDULE_SEGMENT_UUID = parser.nextText();
                    } else if ("YST_FLAG".equals(parser.getName())) {
                        this._YST_FLAG = parser.nextText();
                    } else if ("YST_AFTER".equals(parser.getName())) {
                        this._YST_AFTER = parser.nextText();
                    } else if ("YST_BEFORE".equals(parser.getName())) {
                        this._YST_BEFORE = parser.nextText();
                    } else if ("YST_EXCLUDE_DATE".equals(parser.getName())) {
                        if (this._YST_EXCLUDE_DATE == null) {
                            this._YST_EXCLUDE_DATE = new ArrayList();
                        }
                        this._YST_EXCLUDE_DATE.add(parser.nextText());
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