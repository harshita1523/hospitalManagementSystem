package com.example.hospital.management.system.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.management.system.model.Patient;
import com.example.hospital.management.system.service.PatientService;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    private final PatientService ps;

    public PatientController(PatientService ps) {
        this.ps = ps;
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return this.ps.getAllPatients();
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient p) {
        return this.ps.createPatient(p);
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable UUID id) {
        return this.ps.findByPatientId(id);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable UUID id,@RequestBody Patient patient) {
        return this.ps.updatePatient(id, patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable UUID id) {
        this.ps.deletePatient(id);
    }

}
