package com.example.hospital.management.system.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hospital.management.system.model.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, UUID> {}