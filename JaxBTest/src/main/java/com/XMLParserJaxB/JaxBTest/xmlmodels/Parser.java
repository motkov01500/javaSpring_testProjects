package com.XMLParserJaxB.JaxBTest.xmlmodels;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class Parser {

    public RoomsXML test() throws JAXBException {
        JAXBContext jaxbContext;
        File xmlFile = new File("RoomTest.xml");

        jaxbContext = JAXBContext.newInstance(RoomsXML.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        RoomsXML roomsXML = (RoomsXML) jaxbUnmarshaller.unmarshal(xmlFile);
        return roomsXML;
    }
}
