package com.mapstruct.mapstructtest.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "checkin_date", nullable = false)
    private LocalDate checkInDate;

    @Column(name = "checkout_date", nullable = false)
    private LocalDate checkOutDate;

    @Column(name = "res_confirmation", nullable = false)
    private boolean resConfirmation;

    @Column(name = "num_adults")
    private Integer numAdults;

    @Column(name = "num_children")
    private Integer numChildren;

    @ManyToMany
    @JoinTable(name = "reservation_guestinformation",
            joinColumns = {@JoinColumn(name = "reservation_id")},
            inverseJoinColumns = {@JoinColumn(name = "guestinformation_id")})
    private Set<GuestInformation> guestInformations;

    public int getId() {
        return id;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public boolean isResConfirmation() {
        return resConfirmation;
    }

    public Integer getNumAdults() {
        return numAdults;
    }

    public Integer getNumChildren() {
        return numChildren;
    }

    public Set<GuestInformation> getGuestInformations() {
        return guestInformations;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setNumAdults(Integer numAdults) {
        this.numAdults = numAdults;
    }

    public void setNumChildren(Integer numChildren) {
        this.numChildren = numChildren;
    }

    public void setResConfirmation(boolean resConfirmation) {
        this.resConfirmation = resConfirmation;
    }

    public void setGuestInformations(Set<GuestInformation> guestInformations) {
        this.guestInformations = guestInformations;
    }

    public void setId(int id) {
        this.id = id;
    }
}