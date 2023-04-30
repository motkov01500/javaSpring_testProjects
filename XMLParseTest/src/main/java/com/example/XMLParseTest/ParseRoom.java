package com.example.XMLParseTest;

import com.example.XMLParseTest.dto.RoomDTO;
import com.example.XMLParseTest.entity.Room;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParseRoom extends DefaultHandler {

    public List<RoomDTO> parse() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = builder.parse("input.txt");
        List<RoomDTO> rooms = new ArrayList<>();

        NodeList elements = doc.getElementsByTagName("Room");
        for (int i = 0; i< elements.getLength() ; i++){
            RoomDTO room = new RoomDTO();
            NodeList RoomTag = doc.getElementsByTagName("Room");
            Node roomId = RoomTag.item(i).getAttributes().item(0);
            room.setId(Integer.parseInt(roomId.getTextContent()));

            NodeList numberOfPlacesTag = doc.getElementsByTagName("numberOfPlaces");
            Node numberOfPlaces = numberOfPlacesTag.item(i);
            room.setNumberOfPlaces(Integer.parseInt(numberOfPlaces.getTextContent()));

            NodeList pricePerNightTag = doc.getElementsByTagName("pricePerNight");
            Node pricePerNight = pricePerNightTag.item(i);
            room.setPricePerNight(Double.parseDouble(pricePerNight.getTextContent()));

            NodeList descriptionTag = doc.getElementsByTagName("description");
            Node description = descriptionTag.item(i);
            room.setDescription(description.getTextContent());
            rooms.add(room);
        }
        return rooms;
    }
}
