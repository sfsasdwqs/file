package com.common.szair.model.alipayment;

import com.common.szair.model.soap.SOAPBinding;
import com.common.szair.model.soap.SOAPObject;
import com.common.szair.model.soap.UnknownSOAPObject;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* loaded from: C:\Users\桥\Desktop\python\xiuhao\classes3.dex */
public class getAuthCodeParam implements SOAPObject {
    public getAuthCodeParamRequestVO _GET_AUTHCODE_PARAM_CONDITION_VO = null;
    private Exception _exception = null;

    @Override // com.common.szair.model.soap.SOAPObject
    public void addAttributesToNode(XmlSerializer xml) throws IOException {
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public String getNamespace() {
        return "http://com/shenzhenair/mobilewebservice/payment";
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void setexception(Exception _exception) {
        this._exception = _exception;
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public Exception getexception() {
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
        if (this._GET_AUTHCODE_PARAM_CONDITION_VO != null) {
            xml.startTag(null, "GET_AUTHCODE_PARAM_CONDITION_VO");
            this._GET_AUTHCODE_PARAM_CONDITION_VO.addElementsToNode(xml);
            xml.endTag(null, "GET_AUTHCODE_PARAM_CONDITION_VO");
        }
    }

    @Override // com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("GET_AUTHCODE_PARAM_CONDITION_VO".equals(parser.getName())) {
                        getAuthCodeParamRequestVO getauthcodeparamrequestvo = new getAuthCodeParamRequestVO();
                        getauthcodeparamrequestvo.parse(binding, parser);
                        this._GET_AUTHCODE_PARAM_CONDITION_VO = getauthcodeparamrequestvo;
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