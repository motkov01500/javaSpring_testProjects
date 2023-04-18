package com.mapstruct.mapstructtest.mapper;

import com.mapstruct.mapstructtest.dto.GuestInformationDTO;
import com.mapstruct.mapstructtest.dto.GuestInformationFullNameDTO;
import com.mapstruct.mapstructtest.entity.GuestInformation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GuestInformationMapper {

    GuestInformationDTO guestInformationToDTO(GuestInformation guestInformation);
    GuestInformation DTOtoGuestInformation(GuestInformationDTO guestInformationDTO);
    @Mapping(target = "fullName", expression = "java(guestInformation.getFirstName() + guestInformation.getLastName())")
    GuestInformationFullNameDTO guestInformationToFullNameDTO(GuestInformation guestInformation);
}
