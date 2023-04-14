package com.mapstruct.mapstructtest.controller;

import com.mapstruct.mapstructtest.entity.GuestInformation;
import com.mapstruct.mapstructtest.repository.GuestInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("guests")
public class GuestInformationController {

    private final GuestInformationRepository guestInformationRepository;

    @Autowired
    public GuestInformationController(GuestInformationRepository guestInformationRepository) {
        this.guestInformationRepository = guestInformationRepository;
    }

    @GetMapping("getAllGuests")
    public ResponseEntity<List<GuestInformation>> getGuests() {
        List<GuestInformation> allGuests = guestInformationRepository.findAll();

        return new ResponseEntity<>(allGuests, HttpStatus.OK);
    }
}
