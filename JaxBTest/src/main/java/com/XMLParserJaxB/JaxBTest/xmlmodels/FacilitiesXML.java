package com.XMLParserJaxB.JaxBTest.xmlmodels;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "facilities")
@XmlAccessorType(XmlAccessType.FIELD)
public class FacilitiesXML {

    @XmlElement(name = "facility")
    private List<FacilityXML> facilityXMLList = new ArrayList<>();

    public List<FacilityXML> getFacilityXMLList() {
        return facilityXMLList;
    }

    public void setFacilityXMLList(List<FacilityXML> facilityXMLList) {
        this.facilityXMLList = facilityXMLList;
    }

    @Override
    public String toString() {
        return String.format("element 0 is: %s",getFacilityXMLList().get(0).getId());
    }
}
