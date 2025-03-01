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
public class rescheduleInfoVO extends baseDTOVO implements SOAPObject, Serializable {
    public Integer _adultCount = null;
    public String _checkFlag = null;
    public Integer _childCount = null;
    public String _DIFF_TICKET_ORDER_FLAG = null;
    public Integer _djkCouponMoney = null;
    public String _djkFlag = null;
    public String _djkProductCode = null;
    public String _ERROR_MESSAGE = null;
    public String _CARRIER = null;
    public String _fzyFlag = null;
    public Integer _infantCount = null;
    public String _orderNo = null;
    public List<reschedulePartnerInfoVO> _partnerInfos = null;
    public String _INDVL_ID_NBR = null;
    public String _PAX_NM = null;
    public String _PAX_TYPE = null;
    public List<rescheduleProtectFlightInfoVO> _protectFlightInfos = null;
    public Integer _rescheduleAdultCount = null;
    public Integer _rescheduleChildCount = null;
    public List<rescheduleFlightSegmentInfoVO> _rescheduleFlightSegmentInfos = null;
    public Integer _rescheduleInfantCount = null;
    public List<String> _reschedulePartnerUUID = null;
    public List<String> _rescheduleSegmentUUID = null;
    public String _rescheduleSpecialType = null;
    public List<rescheduleTravelDetailVO> _RESCHEDULE_TICKET_DETAIL = null;
    public String _RESCHEDULE_TYPE = null;
    public Integer _rescheduleUnaccompaniedChild = null;
    public Integer _rescheduleYoungCount = null;
    public String _TKT_FST_SEG_FLT_DT = null;
    public String _RESCHEDULE_UUID = null;
    public List<rescheduleVoluntaryInfoVO> _voluntaryInfos = null;
    public Integer _youngCount = null;
    public String _zyFlag = null;
    public List<rescheduleVoluntaryInfoVO> _VOLUNTARY_INFO_LIST = null;
    public boolean isWorkOrder = false;
    public String _FZY_TYPE = null;
    public boolean isHoldProtect = false;
    public String _FIRST_NAME = null;
    public String _LAST_NAME = null;
    public String _CN_FIRST_NAME = null;
    public String _CN_LAST_NAME = null;
    public String _ISSUE_NATION = null;
    public String _NATION = null;
    public String _SEX = null;
    public String _EXPIRATION_DATE = null;
    public String _TRANSIT_CITY = null;
    public String _TRANSIT_DURING = null;
    public String ONESELF_FLAG = null;
    public List<reschedulePartnerInfoVO> selectPsgs = null;
    public List<reschedulePartnerInfoVO> selectPsgslist = null;
    public List<rescheduleTravelDetailVO> selectFlights = null;
    public ArrayList<String> dateList = null;
    public boolean otherChange = false;
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
        if (this._adultCount != null) {
            xml.startTag(null, "adultCount");
            xml.text(String.valueOf(this._adultCount));
            xml.endTag(null, "adultCount");
        }
        if (this._checkFlag != null) {
            xml.startTag(null, "checkFlag");
            xml.text(this._checkFlag);
            xml.endTag(null, "checkFlag");
        }
        if (this._childCount != null) {
            xml.startTag(null, "childCount");
            xml.text(String.valueOf(this._childCount));
            xml.endTag(null, "childCount");
        }
        if (this._DIFF_TICKET_ORDER_FLAG != null) {
            xml.startTag(null, "DIFF_TICKET_ORDER_FLAG");
            xml.text(this._DIFF_TICKET_ORDER_FLAG);
            xml.endTag(null, "DIFF_TICKET_ORDER_FLAG");
        }
        if (this._djkCouponMoney != null) {
            xml.startTag(null, "djkCouponMoney");
            xml.text(String.valueOf(this._djkCouponMoney));
            xml.endTag(null, "djkCouponMoney");
        }
        if (this._djkFlag != null) {
            xml.startTag(null, "djkFlag");
            xml.text(this._djkFlag);
            xml.endTag(null, "djkFlag");
        }
        if (this._djkProductCode != null) {
            xml.startTag(null, "djkProductCode");
            xml.text(this._djkProductCode);
            xml.endTag(null, "djkProductCode");
        }
        if (this._ERROR_MESSAGE != null) {
            xml.startTag(null, "ERROR_MESSAGE");
            xml.text(this._ERROR_MESSAGE);
            xml.endTag(null, "ERROR_MESSAGE");
        }
        if (this._fzyFlag != null) {
            xml.startTag(null, "fzyFlag");
            xml.text(this._fzyFlag);
            xml.endTag(null, "fzyFlag");
        }
        if (this._infantCount != null) {
            xml.startTag(null, "infantCount");
            xml.text(String.valueOf(this._infantCount));
            xml.endTag(null, "infantCount");
        }
        if (this._orderNo != null) {
            xml.startTag(null, "orderNo");
            xml.text(this._orderNo);
            xml.endTag(null, "orderNo");
        }
        List<reschedulePartnerInfoVO> list = this._partnerInfos;
        if (list != null && list.size() > 0) {
            int size = this._partnerInfos.size();
            for (int i = 0; i < size; i++) {
                xml.startTag(null, "partnerInfos");
                this._partnerInfos.get(i).addElementsToNode(xml);
                xml.endTag(null, "partnerInfos");
            }
        }
        if (this._INDVL_ID_NBR != null) {
            xml.startTag(null, "INDVL_ID_NBR");
            xml.text(this._INDVL_ID_NBR);
            xml.endTag(null, "INDVL_ID_NBR");
        }
        if (this._PAX_NM != null) {
            xml.startTag(null, "PAX_NM");
            xml.text(this._PAX_NM);
            xml.endTag(null, "PAX_NM");
        }
        if (this._PAX_TYPE != null) {
            xml.startTag(null, "PAX_TYPE");
            xml.text(this._PAX_TYPE);
            xml.endTag(null, "PAX_TYPE");
        }
        List<rescheduleProtectFlightInfoVO> list2 = this._protectFlightInfos;
        if (list2 != null && list2.size() > 0) {
            int size2 = this._protectFlightInfos.size();
            for (int i2 = 0; i2 < size2; i2++) {
                xml.startTag(null, "protectFlightInfos");
                this._protectFlightInfos.get(i2).addElementsToNode(xml);
                xml.endTag(null, "protectFlightInfos");
            }
        }
        if (this._rescheduleAdultCount != null) {
            xml.startTag(null, "rescheduleAdultCount");
            xml.text(String.valueOf(this._rescheduleAdultCount));
            xml.endTag(null, "rescheduleAdultCount");
        }
        if (this._rescheduleChildCount != null) {
            xml.startTag(null, "rescheduleChildCount");
            xml.text(String.valueOf(this._rescheduleChildCount));
            xml.endTag(null, "rescheduleChildCount");
        }
        List<rescheduleFlightSegmentInfoVO> list3 = this._rescheduleFlightSegmentInfos;
        if (list3 != null && list3.size() > 0) {
            int size3 = this._rescheduleFlightSegmentInfos.size();
            for (int i3 = 0; i3 < size3; i3++) {
                xml.startTag(null, "rescheduleFlightSegmentInfos");
                this._rescheduleFlightSegmentInfos.get(i3).addElementsToNode(xml);
                xml.endTag(null, "rescheduleFlightSegmentInfos");
            }
        }
        if (this._rescheduleInfantCount != null) {
            xml.startTag(null, "rescheduleInfantCount");
            xml.text(String.valueOf(this._rescheduleInfantCount));
            xml.endTag(null, "rescheduleInfantCount");
        }
        List<String> list4 = this._reschedulePartnerUUID;
        if (list4 != null && list4.size() > 0) {
            int size4 = this._reschedulePartnerUUID.size();
            for (int i4 = 0; i4 < size4; i4++) {
                xml.startTag(null, "reschedulePartnerUUID");
                xml.text(this._reschedulePartnerUUID.get(i4));
                xml.endTag(null, "reschedulePartnerUUID");
            }
        }
        List<String> list5 = this._rescheduleSegmentUUID;
        if (list5 != null && list5.size() > 0) {
            int size5 = this._rescheduleSegmentUUID.size();
            for (int i5 = 0; i5 < size5; i5++) {
                xml.startTag(null, "rescheduleSegmentUUID");
                xml.text(this._rescheduleSegmentUUID.get(i5));
                xml.endTag(null, "rescheduleSegmentUUID");
            }
        }
        if (this._rescheduleSpecialType != null) {
            xml.startTag(null, "rescheduleSpecialType");
            xml.text(this._rescheduleSpecialType);
            xml.endTag(null, "rescheduleSpecialType");
        }
        List<rescheduleTravelDetailVO> list6 = this._RESCHEDULE_TICKET_DETAIL;
        if (list6 != null && list6.size() > 0) {
            int size6 = this._RESCHEDULE_TICKET_DETAIL.size();
            for (int i6 = 0; i6 < size6; i6++) {
                xml.startTag(null, "RESCHEDULE_TICKET_DETAIL");
                this._RESCHEDULE_TICKET_DETAIL.get(i6).addElementsToNode(xml);
                xml.endTag(null, "RESCHEDULE_TICKET_DETAIL");
            }
        }
        if (this._RESCHEDULE_TYPE != null) {
            xml.startTag(null, "RESCHEDULE_TYPE");
            xml.text(this._RESCHEDULE_TYPE);
            xml.endTag(null, "RESCHEDULE_TYPE");
        }
        if (this._rescheduleUnaccompaniedChild != null) {
            xml.startTag(null, "rescheduleUnaccompaniedChild");
            xml.text(String.valueOf(this._rescheduleUnaccompaniedChild));
            xml.endTag(null, "rescheduleUnaccompaniedChild");
        }
        if (this._rescheduleYoungCount != null) {
            xml.startTag(null, "rescheduleYoungCount");
            xml.text(String.valueOf(this._rescheduleYoungCount));
            xml.endTag(null, "rescheduleYoungCount");
        }
        if (this._TKT_FST_SEG_FLT_DT != null) {
            xml.startTag(null, "TKT_FST_SEG_FLT_DT");
            xml.text(this._TKT_FST_SEG_FLT_DT);
            xml.endTag(null, "TKT_FST_SEG_FLT_DT");
        }
        if (this._RESCHEDULE_UUID != null) {
            xml.startTag(null, "RESCHEDULE_UUID");
            xml.text(this._RESCHEDULE_UUID);
            xml.endTag(null, "RESCHEDULE_UUID");
        }
        List<rescheduleVoluntaryInfoVO> list7 = this._voluntaryInfos;
        if (list7 != null && list7.size() > 0) {
            int size7 = this._voluntaryInfos.size();
            for (int i7 = 0; i7 < size7; i7++) {
                xml.startTag(null, "voluntaryInfos");
                this._voluntaryInfos.get(i7).addElementsToNode(xml);
                xml.endTag(null, "voluntaryInfos");
            }
        }
        if (this._youngCount != null) {
            xml.startTag(null, "youngCount");
            xml.text(String.valueOf(this._youngCount));
            xml.endTag(null, "youngCount");
        }
        if (this._zyFlag != null) {
            xml.startTag(null, "zyFlag");
            xml.text(this._zyFlag);
            xml.endTag(null, "zyFlag");
        }
        if (this._FIRST_NAME != null) {
            xml.startTag(null, "FIRST_NAME");
            xml.text(String.valueOf(this._FIRST_NAME));
            xml.endTag(null, "FIRST_NAME");
        }
        if (this._LAST_NAME != null) {
            xml.startTag(null, "LAST_NAME");
            xml.text(String.valueOf(this._LAST_NAME));
            xml.endTag(null, "LAST_NAME");
        }
        if (this._CN_FIRST_NAME != null) {
            xml.startTag(null, "CN_FIRST_NAME");
            xml.text(String.valueOf(this._CN_FIRST_NAME));
            xml.endTag(null, "CN_FIRST_NAME");
        }
        if (this._CN_LAST_NAME != null) {
            xml.startTag(null, "CN_LAST_NAME");
            xml.text(String.valueOf(this._CN_LAST_NAME));
            xml.endTag(null, "CN_LAST_NAME");
        }
        if (this._ISSUE_NATION != null) {
            xml.startTag(null, "ISSUE_NATION");
            xml.text(String.valueOf(this._ISSUE_NATION));
            xml.endTag(null, "ISSUE_NATION");
        }
        if (this._NATION != null) {
            xml.startTag(null, "NATION");
            xml.text(String.valueOf(this._NATION));
            xml.endTag(null, "NATION");
        }
        if (this._SEX != null) {
            xml.startTag(null, "SEX");
            xml.text(String.valueOf(this._SEX));
            xml.endTag(null, "SEX");
        }
        if (this._EXPIRATION_DATE != null) {
            xml.startTag(null, "EXPIRATION_DATE");
            xml.text(String.valueOf(this._EXPIRATION_DATE));
            xml.endTag(null, "EXPIRATION_DATE");
        }
        if (this._TRANSIT_CITY != null) {
            xml.startTag(null, "TRANSIT_CITY");
            xml.text(this._TRANSIT_CITY);
            xml.endTag(null, "TRANSIT_CITY");
        }
        if (this._TRANSIT_DURING != null) {
            xml.startTag(null, "TRANSIT_DURING");
            xml.text(this._TRANSIT_DURING);
            xml.endTag(null, "TRANSIT_DURING");
        }
        if (this.ONESELF_FLAG != null) {
            xml.startTag(null, "ONESELF_FLAG");
            xml.text(this.ONESELF_FLAG);
            xml.endTag(null, "ONESELF_FLAG");
        }
    }

    @Override // com.common.szair.model.allchangedate.baseDTOVO, com.common.szair.model.soap.SOAPObject
    public void parse(SOAPBinding binding, XmlPullParser parser) {
        try {
            int next = parser.next();
            while (next != 3) {
                if (next == 2) {
                    if ("adultCount".equals(parser.getName())) {
                        this._adultCount = Integer.valueOf(parser.nextText());
                    } else if ("checkFlag".equals(parser.getName())) {
                        this._checkFlag = parser.nextText();
                    } else if ("childCount".equals(parser.getName())) {
                        this._childCount = Integer.valueOf(parser.nextText());
                    } else if ("DIFF_TICKET_ORDER_FLAG".equals(parser.getName())) {
                        this._DIFF_TICKET_ORDER_FLAG = parser.nextText();
                    } else if ("djkCouponMoney".equals(parser.getName())) {
                        this._djkCouponMoney = Integer.valueOf(parser.nextText());
                    } else if ("djkFlag".equals(parser.getName())) {
                        this._djkFlag = parser.nextText();
                    } else if ("djkProductCode".equals(parser.getName())) {
                        this._djkProductCode = parser.nextText();
                    } else if ("ERROR_MESSAGE".equals(parser.getName())) {
                        this._ERROR_MESSAGE = parser.nextText();
                    } else if ("fzyFlag".equals(parser.getName())) {
                        this._fzyFlag = parser.nextText();
                    } else if ("infantCount".equals(parser.getName())) {
                        this._infantCount = Integer.valueOf(parser.nextText());
                    } else if ("orderNo".equals(parser.getName())) {
                        this._orderNo = parser.nextText();
                    } else if ("ONESELF_FLAG".equals(parser.getName())) {
                        this.ONESELF_FLAG = parser.nextText();
                    } else if ("partnerInfos".equals(parser.getName())) {
                        if (this._partnerInfos == null) {
                            this._partnerInfos = new ArrayList();
                        }
                        reschedulePartnerInfoVO reschedulepartnerinfovo = new reschedulePartnerInfoVO();
                        reschedulepartnerinfovo.parse(binding, parser);
                        this._partnerInfos.add(reschedulepartnerinfovo);
                    } else if ("INDVL_ID_NBR".equals(parser.getName())) {
                        this._INDVL_ID_NBR = parser.nextText();
                    } else if ("PAX_NM".equals(parser.getName())) {
                        this._PAX_NM = parser.nextText();
                    } else if ("PAX_TYPE".equals(parser.getName())) {
                        this._PAX_TYPE = parser.nextText();
                    } else if ("protectFlightInfos".equals(parser.getName())) {
                        if (this._protectFlightInfos == null) {
                            this._protectFlightInfos = new ArrayList();
                        }
                        rescheduleProtectFlightInfoVO rescheduleprotectflightinfovo = new rescheduleProtectFlightInfoVO();
                        rescheduleprotectflightinfovo.parse(binding, parser);
                        this._protectFlightInfos.add(rescheduleprotectflightinfovo);
                    } else if ("rescheduleAdultCount".equals(parser.getName())) {
                        this._rescheduleAdultCount = Integer.valueOf(parser.nextText());
                    } else if ("rescheduleChildCount".equals(parser.getName())) {
                        this._rescheduleChildCount = Integer.valueOf(parser.nextText());
                    } else if ("rescheduleFlightSegmentInfos".equals(parser.getName())) {
                        if (this._rescheduleFlightSegmentInfos == null) {
                            this._rescheduleFlightSegmentInfos = new ArrayList();
                        }
                        rescheduleFlightSegmentInfoVO rescheduleflightsegmentinfovo = new rescheduleFlightSegmentInfoVO();
                        rescheduleflightsegmentinfovo.parse(binding, parser);
                        this._rescheduleFlightSegmentInfos.add(rescheduleflightsegmentinfovo);
                    } else if ("rescheduleInfantCount".equals(parser.getName())) {
                        this._rescheduleInfantCount = Integer.valueOf(parser.nextText());
                    } else if ("reschedulePartnerUUID".equals(parser.getName())) {
                        if (this._reschedulePartnerUUID == null) {
                            this._reschedulePartnerUUID = new ArrayList();
                        }
                        this._reschedulePartnerUUID.add(parser.nextText());
                    } else if ("rescheduleSegmentUUID".equals(parser.getName())) {
                        if (this._rescheduleSegmentUUID == null) {
                            this._rescheduleSegmentUUID = new ArrayList();
                        }
                        this._rescheduleSegmentUUID.add(parser.nextText());
                    } else if ("rescheduleSpecialType".equals(parser.getName())) {
                        this._rescheduleSpecialType = parser.nextText();
                    } else if ("RESCHEDULE_TICKET_DETAIL".equals(parser.getName())) {
                        if (this._RESCHEDULE_TICKET_DETAIL == null) {
                            this._RESCHEDULE_TICKET_DETAIL = new ArrayList();
                        }
                        rescheduleTravelDetailVO rescheduletraveldetailvo = new rescheduleTravelDetailVO();
                        rescheduletraveldetailvo.parse(binding, parser);
                        this._RESCHEDULE_TICKET_DETAIL.add(rescheduletraveldetailvo);
                    } else if ("RESCHEDULE_TYPE".equals(parser.getName())) {
                        this._RESCHEDULE_TYPE = parser.nextText();
                    } else if ("rescheduleUnaccompaniedChild".equals(parser.getName())) {
                        this._rescheduleUnaccompaniedChild = Integer.valueOf(parser.nextText());
                    } else if ("rescheduleYoungCount".equals(parser.getName())) {
                        this._rescheduleYoungCount = Integer.valueOf(parser.nextText());
                    } else if ("TKT_FST_SEG_FLT_DT".equals(parser.getName())) {
                        this._TKT_FST_SEG_FLT_DT = parser.nextText();
                    } else if ("RESCHEDULE_UUID".equals(parser.getName())) {
                        this._RESCHEDULE_UUID = parser.nextText();
                    } else if ("FIRST_NAME".equals(parser.getName())) {
                        this._FIRST_NAME = parser.nextText();
                    } else if ("LAST_NAME".equals(parser.getName())) {
                        this._LAST_NAME = parser.nextText();
                    } else if ("CN_FIRST_NAME".equals(parser.getName())) {
                        this._CN_FIRST_NAME = parser.nextText();
                    } else if ("CN_LAST_NAME".equals(parser.getName())) {
                        this._CN_LAST_NAME = parser.nextText();
                    } else if ("ISSUE_NATION".equals(parser.getName())) {
                        this._ISSUE_NATION = parser.nextText();
                    } else if ("NATION".equals(parser.getName())) {
                        this._NATION = parser.nextText();
                    } else if ("SEX".equals(parser.getName())) {
                        this._SEX = parser.nextText();
                    } else if ("EXPIRATION_DATE".equals(parser.getName())) {
                        this._EXPIRATION_DATE = parser.nextText();
                    } else if ("voluntaryInfos".equals(parser.getName())) {
                        if (this._voluntaryInfos == null) {
                            this._voluntaryInfos = new ArrayList();
                        }
                        rescheduleVoluntaryInfoVO reschedulevoluntaryinfovo = new rescheduleVoluntaryInfoVO();
                        reschedulevoluntaryinfovo.parse(binding, parser);
                        this._voluntaryInfos.add(reschedulevoluntaryinfovo);
                    } else if ("youngCount".equals(parser.getName())) {
                        this._youngCount = Integer.valueOf(parser.nextText());
                    } else if ("zyFlag".equals(parser.getName())) {
                        this._zyFlag = parser.nextText();
                    } else if ("TRANSIT_CITY".equals(parser.getName())) {
                        this._TRANSIT_CITY = parser.nextText();
                    } else if ("TRANSIT_DURING".equals(parser.getName())) {
                        this._TRANSIT_DURING = parser.nextText();
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