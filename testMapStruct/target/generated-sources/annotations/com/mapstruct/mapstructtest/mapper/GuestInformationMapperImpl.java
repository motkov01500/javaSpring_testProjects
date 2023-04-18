package com.mapstruct.mapstructtest.mapper;

import com.mapstruct.mapstructtest.dto.GuestInformationDTO;
import com.mapstruct.mapstructtest.dto.GuestInformationFullNameDTO;
import com.mapstruct.mapstructtest.entity.GuestInformation;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-18T08:57:01+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.2 (Homebrew)"
)
@Component
public class GuestInformationMapperImpl implements GuestInformationMapper {

    @Override
    public GuestInformationDTO guestInformationToDTO(GuestInformation guestInformation) {
        if ( guestInformation == null ) {
            return null;
        }

        GuestInformationDTO guestInformationDTO = new GuestInformationDTO();

        guestInformationDTO.setFirstName( guestInformation.getFirstName() );
        guestInformationDTO.setLastName( guestInformation.getLastName() );

        return guestInformationDTO;
    }

    @Override
    public GuestInformation DTOtoGuestInformation(GuestInformationDTO guestInformationDTO) {
        if ( guestInformationDTO == null ) {
            return null;
        }

        GuestInformation guestInformation = new GuestInformation();

        return guestInformation;
    }

    @Override
    public GuestInformationFullNameDTO guestInformationToFullNameDTO(GuestInformation guestInformation) {
        if ( guestInformation == null ) {
            return null;
        }

        GuestInformationFullNameDTO guestInformationFullNameDTO = new GuestInformationFullNameDTO();

        guestInformationFullNameDTO.setId( guestInformation.getId() );

        guestInformationFullNameDTO.setFullName( guestInformation.getFirstName() + guestInformation.getLastName() );

        return guestInformationFullNameDTO;
    }
}
