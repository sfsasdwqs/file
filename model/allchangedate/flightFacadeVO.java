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
public class flightFacadeVO extends baseDTOVO implements SOAPObject {
    public List<combinationInfoVO> _COMBINATION_LIST = null;
    public List<flightInfoVO> _FLIGHT_INFO_LIST = null;
    public rescheduleClassInfoVO lowerClassInfo = null;
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
        List<combinationInfoVO> list = this._COMBINATION_LIST;
        if (list != null && list.size() > 0) {
            int size = this._COMBINATION_LIST.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "COMBINATION_LIST");
                this._COMBINATION_LIST.get(i).addElementsToNode(xml);
                xml.endTag(null, "COMBINATION_LIST");
            }
        }
        List<flightInfoVO> list2 = this._FLIGHT_INFO_LIST;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        int size2 = this._FLIGHT_INFO_LIST.size();
        for (int i2 = 0; i2 < size2; i2++) {
            xml.startTag(null, "FLIGHT_INFO_LIST");
            this._FLIGHT_INFO_LIST.get(i2).addElementsToNode(xml);
            xml.endTag(null, "FLIGHT_INFO_LIST");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("COMBINATION_LIST".equals(parser.getName())) {
                        if (this._COMBINATION_LIST == null) {
                            this._COMBINATION_LIST = new ArrayList();
                        }
                        combinationInfoVO combinationinfovo = new combinationInfoVO();
                        combinationinfovo.parse(binding, parser);
                        this._COMBINATION_LIST.add(combinationinfovo);
                    } else if ("FLIGHT_INFO_LIST".equals(parser.getName())) {
                        if (this._FLIGHT_INFO_LIST == null) {
                            this._FLIGHT_INFO_LIST = new ArrayList();
                        }
                        flightInfoVO flightinfovo = new flightInfoVO();
                        flightinfovo.parse(binding, parser);
                        this._FLIGHT_INFO_LIST.add(flightinfovo);
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