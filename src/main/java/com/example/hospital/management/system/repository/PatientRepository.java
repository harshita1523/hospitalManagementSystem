package com.example.hospital.management.system.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hospital.management.system.model.Patient;

public interface PatientRepository extends JpaRepository <Patient, UUID> {
    
}
