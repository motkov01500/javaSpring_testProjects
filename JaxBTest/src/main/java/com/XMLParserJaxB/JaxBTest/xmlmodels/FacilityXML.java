package com.XMLParserJaxB.JaxBTest.xmlmodels;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "facility")
@XmlAccessorType(XmlAccessType.FIELD)
public class FacilityXML {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
