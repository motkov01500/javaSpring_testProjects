package com.mapstruct.mapstructtest.mapper;

import com.mapstruct.mapstructtest.dto.ReservationDTO;
import com.mapstruct.mapstructtest.entity.Reservation;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ReservationMapper {

    ReservationDTO reservationToReservationDTO(Reservation reservation);

    @AfterMapping
    default void afterMapping(@MappingTarget ReservationDTO reservationDTO) {
        reservationDTO.getGuestInformations().forEach(guest->guest.setFullName(guest.getFirstName() + " " + guest.getLastName()));
    }
}
