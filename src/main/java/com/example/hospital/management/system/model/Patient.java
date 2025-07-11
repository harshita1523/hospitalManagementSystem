package com.example.hospital.management.system.model;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Patient {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private String email;

    private String disease;

    private LocalDate admissionDate;

    @ManyToOne
    @JoinColumn(name="doctor_id")
    private Doctor doctor;

}
