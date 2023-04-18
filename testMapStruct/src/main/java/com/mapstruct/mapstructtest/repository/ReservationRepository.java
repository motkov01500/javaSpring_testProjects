package com.mapstruct.mapstructtest.repository;

import com.mapstruct.mapstructtest.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Integer> {
}
