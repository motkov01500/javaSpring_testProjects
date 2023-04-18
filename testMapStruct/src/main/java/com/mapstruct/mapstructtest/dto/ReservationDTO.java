package com.mapstruct.mapstructtest.dto;

import java.time.LocalDate;
import java.util.Set;

public class ReservationDTO {

    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private Set<GuestInformationDTO> guestInformations;

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public Set<GuestInformationDTO> getGuestInformations() {
        return guestInformations;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setGuestInformations(Set<GuestInformationDTO> guestInformations) {
        this.guestInformations = guestInformations;
    }
}