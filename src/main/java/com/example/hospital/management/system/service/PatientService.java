package com.example.hospital.management.system.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.hospital.management.system.model.Patient;
import com.example.hospital.management.system.repository.PatientRepository;

@Service
public class PatientService {
    private final PatientRepository repo;

    public PatientService(PatientRepository repo) {
        this.repo = repo;
    }

    public List<Patient> getAllPatients() {
        return this.repo.findAll();
    }

    public Patient createPatient(Patient p) {
        return repo.save(p);
    }

    public Patient findByPatientId(UUID id) {
        return repo.findById(id).orElse(null);
    }

    public Patient updatePatient(UUID id, Patient updatedPatient) {
        Patient existing = this.findByPatientId(id);
        existing.setName(updatedPatient.getName());
        existing.setEmail(updatedPatient.getEmail());
        existing.setDisease(updatedPatient.getDisease());
        existing.setAdmissionDate(updatedPatient.getAdmissionDate());
        existing.setDoctor(updatedPatient.getDoctor());
        return repo.save(existing);
    }

    public void deletePatient(UUID id) {
        repo.deleteById(id);
    }
}

