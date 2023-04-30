package com.example.XMLParseTest.controller;

import com.example.XMLParseTest.ParseRoom;
import com.example.XMLParseTest.dto.RoomDTO;
import com.example.XMLParseTest.entity.Facility;
import com.example.XMLParseTest.entity.Room;
import com.example.XMLParseTest.repository.FacilityRepository;
import com.example.XMLParseTest.repository.RoomRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("rooms")
public class RoomController {

    private final RoomRepository roomRepository;
    private final FacilityRepository facilityRepository;

    public RoomController(RoomRepository roomRepository, FacilityRepository facilityRepository) {
        this.roomRepository = roomRepository;
        this.facilityRepository = facilityRepository;
    }

    @Scheduled(cron = "0 40 * ? * *")
    @PatchMapping("updateRooms")
    public ResponseEntity<String> updateRooms() throws ParserConfigurationException, IOException, SAXException {
        ParseRoom parseRoom = new ParseRoom();
        List<RoomDTO> rooms = parseRoom.parse();
        for (RoomDTO room: rooms) {
            Room oldRoom = roomRepository.findById(room.getId()).orElseThrow();
            oldRoom.setDescription(room.getDescription());
            oldRoom.setPricePerNight(room.getPricePerNight());
            oldRoom.setNumberOfPlaces(room.getNumberOfPlaces());
            roomRepository.save(oldRoom);
        }
        return new ResponseEntity<>("asdasd",HttpStatus.ACCEPTED);
    }
}
