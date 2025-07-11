package com.example.hospital.management.system.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.management.system.model.Doctor;
import com.example.hospital.management.system.service.DoctorService;


@RestController
@RequestMapping("/api/doctors")
public class DoctorController {
    private final DoctorService docService;

    public DoctorController(DoctorService docService){
        this.docService=docService;
    }

    @GetMapping
    public List<Doctor> getAllDoctors() {
        return docService.getAllDoctors();
    }
    
    @PostMapping
    public Doctor saveDoctor(@RequestBody Doctor doctor) {
        return docService.saveDoctor(doctor);
    }

    @GetMapping("/{id}")
    public Doctor getDocById(@PathVariable UUID id) {
        return docService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctor(@PathVariable UUID id) {
        docService.deleteDoctor(id);
    }

}
