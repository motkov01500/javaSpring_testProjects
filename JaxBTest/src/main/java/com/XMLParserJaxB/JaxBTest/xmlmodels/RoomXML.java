package com.XMLParserJaxB.JaxBTest.xmlmodels;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name = "Room")
@XmlAccessorType(XmlAccessType.FIELD)
public class RoomXML {

    @XmlAttribute
    private int id;
    private int numberOfPlaces;
    private int pricePerNight;
    private String description;
    @XmlElement(name = "facilities")
    private FacilitiesXML facilitiesXMLList;

    public int getId() {
        return id;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public String getDescription() {
        return description;
    }

    public FacilitiesXML getFacilitiesXMLList() {
        return facilitiesXMLList;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFacilitiesXMLList(FacilitiesXML facilitiesXMLList) {
        this.facilitiesXMLList = facilitiesXMLList;
    }

    @Override
    public String toString() {
        return "RoomXML{" +
                "id=" + id +
                ", numberOfPlaces=" + numberOfPlaces +
                ", pricePerNight=" + pricePerNight +
                ", description='" + description + '\'' +
                ", facilitiesXMLList=" + facilitiesXMLList +
                '}';
    }
}
