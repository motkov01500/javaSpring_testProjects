package com.mapstruct.mapstructtest.controller;

import com.mapstruct.mapstructtest.dto.ReservationDTO;
import com.mapstruct.mapstructtest.mapper.GuestInformationMapper;
import com.mapstruct.mapstructtest.mapper.ReservationMapper;
import com.mapstruct.mapstructtest.repository.ReservationRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("reservations")
public class ReservationController {

    private final ReservationRepository reservationRepository;
    private final ReservationMapper reservationMapper;
    private final GuestInformationMapper guestInformationMapper;

    public ReservationController(ReservationRepository reservationRepository, ReservationMapper reservationMapper, GuestInformationMapper guestInformationMapper) {
        this.reservationRepository = reservationRepository;
        this.reservationMapper = reservationMapper;
        this.guestInformationMapper = guestInformationMapper;
    }

    @GetMapping("getAll")
    public ResponseEntity<List<ReservationDTO>> getAllReservations() {
        List<ReservationDTO> allReservations = reservationRepository.findAll()
                .stream()
                .map(reservationMapper::reservationToReservationDTO)
                .toList();
        return new ResponseEntity<>(allReservations, HttpStatus.OK);
    }
 }
