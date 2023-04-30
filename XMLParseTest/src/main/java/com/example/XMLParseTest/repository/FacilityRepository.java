package com.example.XMLParseTest.repository;

import com.example.XMLParseTest.entity.Facility;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacilityRepository extends JpaRepository<Facility,Integer> {
}
