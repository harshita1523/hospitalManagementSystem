package com.example.hospital.management.system.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hospital.management.system.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment,UUID> {
    
}
