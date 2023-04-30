package com.XMLParserJaxB.JaxBTest.xmlmodels;

import jakarta.xml.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@XmlRootElement(name = "Rooms")
@XmlAccessorType(XmlAccessType.FIELD)
public class RoomsXML {

    @XmlElement(name = "Room")
    private List<RoomXML> roomList = new ArrayList<>();

    public void setRoomList(List<RoomXML> roomList) {
        this.roomList = roomList;
    }

    public List<RoomXML> getRoomList() {
       return Collections.unmodifiableList(roomList);
    }

    @Override
    public String toString() {
        return "RoomsXML{" +
                "roomList=" + roomList.size() +
                '}';
    }
}
