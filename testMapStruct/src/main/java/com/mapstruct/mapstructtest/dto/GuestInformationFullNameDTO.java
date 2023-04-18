package com.mapstruct.mapstructtest.dto;

public class GuestInformationFullNameDTO {

    private int id;
    private String fullName;

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setId(int id) {
        this.id = id;
    }
}
