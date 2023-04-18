package com.mapstruct.mapstructtest.repository;

import com.mapstruct.mapstructtest.entity.GuestInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestInformationRepository extends JpaRepository<GuestInformation,Integer> {
}
