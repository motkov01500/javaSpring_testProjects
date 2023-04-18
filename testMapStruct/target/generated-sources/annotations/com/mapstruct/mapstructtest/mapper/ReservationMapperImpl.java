package com.mapstruct.mapstructtest.mapper;

import com.mapstruct.mapstructtest.dto.GuestInformationDTO;
import com.mapstruct.mapstructtest.dto.ReservationDTO;
import com.mapstruct.mapstructtest.entity.GuestInformation;
import com.mapstruct.mapstructtest.entity.Reservation;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-18T08:57:01+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.2 (Homebrew)"
)
@Component
public class ReservationMapperImpl implements ReservationMapper {

    @Override
    public ReservationDTO reservationToReservationDTO(Reservation reservation) {
        if ( reservation == null ) {
            return null;
        }

        ReservationDTO reservationDTO = new ReservationDTO();

        reservationDTO.setCheckInDate( reservation.getCheckInDate() );
        reservationDTO.setCheckOutDate( reservation.getCheckOutDate() );
        reservationDTO.setGuestInformations( guestInformationSetToGuestInformationDTOSet( reservation.getGuestInformations() ) );

        afterMapping( reservationDTO );

        return reservationDTO;
    }

    protected GuestInformationDTO guestInformationToGuestInformationDTO(GuestInformation guestInformation) {
        if ( guestInformation == null ) {
            return null;
        }

        GuestInformationDTO guestInformationDTO = new GuestInformationDTO();

        guestInformationDTO.setFirstName( guestInformation.getFirstName() );
        guestInformationDTO.setLastName( guestInformation.getLastName() );

        return guestInformationDTO;
    }

    protected Set<GuestInformationDTO> guestInformationSetToGuestInformationDTOSet(Set<GuestInformation> set) {
        if ( set == null ) {
            return null;
        }

        Set<GuestInformationDTO> set1 = new LinkedHashSet<GuestInformationDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( GuestInformation guestInformation : set ) {
            set1.add( guestInformationToGuestInformationDTO( guestInformation ) );
        }

        return set1;
    }
}
