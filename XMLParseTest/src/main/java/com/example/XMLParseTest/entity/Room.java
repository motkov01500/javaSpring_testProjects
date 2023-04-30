package com.example.XMLParseTest.entity;

import javax.persistence.*;

import java.util.*;

@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "number_of_places", nullable = false)
    private int numberOfPlaces;

    @Column(name = "price_per_night", nullable = false)
    private double pricePerNight;

    @Column(name = "description")
    private String description;

    @ManyToMany
    @JoinTable(name = "room_facility",
            joinColumns = {@JoinColumn(name = "room_id")},
            inverseJoinColumns = {@JoinColumn(name = "facility_id")})
    private Set<Facility> facilities;

    //region getters
    public int getId() {
        return id;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public String getDescription() {
        return description;
    }

    public Set<Facility> getFacilities() {
        return facilities;
    }
    //endregion

    //region setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNumberOfPlaces(int numberOfPlaces) {
        this.numberOfPlaces = numberOfPlaces;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFacilities(Set<Facility> facilities) {
        this.facilities = facilities;
    }

    //endregion


    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", numberOfPlaces=" + numberOfPlaces +
                ", pricePerNight=" + pricePerNight +
                ", description='" + description + '\'' +
                ", facilities=" + facilities +
                '}';
    }
}