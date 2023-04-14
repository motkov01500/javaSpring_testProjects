package com.mapstruct.mapstructtest.repository;

import com.mapstruct.mapstructtest.entity.GuestInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestInformationRepository extends JpaRepository<GuestInformation,Integer> {
}
