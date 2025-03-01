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
public class rescheduleFlightSegmentVO extends baseDTOVO implements SOAPObject {
    public String _DST_CITY = null;
    public String _FLIGHT_DATE = null;
    public List<flightFacadeVO> _FLIGHT_FACADE_LIST = null;
    public String _NON_VOLUNTARY_FLAG = null;
    public Integer _INDEX = null;
    public String _ORG_CITY = null;
    public String _CONNECT_FLAG = null;
    public String _CONNECT_FREE_FLAG = null;
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
        if (this._DST_CITY != null) {
            xml.startTag(null, "DST_CITY");
            xml.text(this._DST_CITY);
            xml.endTag(null, "DST_CITY");
        }
        if (this._FLIGHT_DATE != null) {
            xml.startTag(null, "FLIGHT_DATE");
            xml.text(this._FLIGHT_DATE);
            xml.endTag(null, "FLIGHT_DATE");
        }
        if (this._NON_VOLUNTARY_FLAG != null) {
            xml.startTag(null, "NON_VOLUNTARY_FLAG");
            xml.text(this._NON_VOLUNTARY_FLAG);
            xml.endTag(null, "NON_VOLUNTARY_FLAG");
        }
        List<flightFacadeVO> list = this._FLIGHT_FACADE_LIST;
        if (list != null && list.size() > 0) {
            int size = this._FLIGHT_FACADE_LIST.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "FLIGHT_FACADE_LIST");
                this._FLIGHT_FACADE_LIST.get(i).addElementsToNode(xml);
                xml.endTag(null, "FLIGHT_FACADE_LIST");
            }
        }
        if (this._INDEX != null) {
            xml.startTag(null, "INDEX");
            xml.text(String.valueOf(this._INDEX));
            xml.endTag(null, "INDEX");
        }
        if (this._ORG_CITY != null) {
            xml.startTag(null, "ORG_CITY");
            xml.text(this._ORG_CITY);
            xml.endTag(null, "ORG_CITY");
        }
        if (this._CONNECT_FLAG != null) {
            xml.startTag(null, "CONNECT_FLAG");
            xml.text(this._CONNECT_FLAG);
            xml.endTag(null, "CONNECT_FLAG");
        }
        if (this._CONNECT_FREE_FLAG != null) {
            xml.startTag(null, "CONNECT_FREE_FLAG");
            xml.text(this._CONNECT_FREE_FLAG);
            xml.endTag(null, "CONNECT_FREE_FLAG");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("DST_CITY".equals(parser.getName())) {
                        this._DST_CITY = parser.nextText();
                    } else if ("FLIGHT_DATE".equals(parser.getName())) {
                        this._FLIGHT_DATE = parser.nextText();
                    } else if ("FLIGHT_FACADE_LIST".equals(parser.getName())) {
                        if (this._FLIGHT_FACADE_LIST == null) {
                            this._FLIGHT_FACADE_LIST = new ArrayList();
                        }
                        flightFacadeVO flightfacadevo = new flightFacadeVO();
                        flightfacadevo.parse(binding, parser);
                        this._FLIGHT_FACADE_LIST.add(flightfacadevo);
                    } else if ("INDEX".equals(parser.getName())) {
                        this._INDEX = Integer.valueOf(parser.nextText());
                    } else if ("NON_VOLUNTARY_FLAG".equals(parser.getName())) {
                        this._NON_VOLUNTARY_FLAG = parser.nextText();
                    } else if ("ORG_CITY".equals(parser.getName())) {
                        this._ORG_CITY = parser.nextText();
                    } else if ("CONNECT_FLAG".equals(parser.getName())) {
                        this._CONNECT_FLAG = parser.nextText();
                    } else if ("CONNECT_FREE_FLAG".equals(parser.getName())) {
                        this._CONNECT_FREE_FLAG = parser.nextText();
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