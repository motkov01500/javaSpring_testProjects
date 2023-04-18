package com.mapstruct.mapstructtest.controller;

import com.mapstruct.mapstructtest.dto.GuestInformationDTO;
import com.mapstruct.mapstructtest.dto.GuestInformationFullNameDTO;
import com.mapstruct.mapstructtest.entity.GuestInformation;
import com.mapstruct.mapstructtest.mapper.GuestInformationMapper;
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
    private final GuestInformationMapper guestInformationMapper;

    public GuestInformationController(GuestInformationRepository guestInformationRepository, GuestInformationMapper guestInformationMapper) {
        this.guestInformationRepository = guestInformationRepository;
        this.guestInformationMapper = guestInformationMapper;
    }

    @GetMapping("getAllGuests")
    public ResponseEntity<List<GuestInformationFullNameDTO>> getGuests() {
        List<GuestInformationFullNameDTO> allGuests = guestInformationRepository.findAll().stream()
                .map(guestInformationMapper::guestInformationToFullNameDTO)
                .toList();

        return new ResponseEntity<>(allGuests, HttpStatus.OK);
    }
}
