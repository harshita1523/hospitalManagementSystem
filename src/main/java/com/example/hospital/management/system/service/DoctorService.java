package com.example.hospital.management.system.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.hospital.management.system.model.Doctor;
import com.example.hospital.management.system.repository.DoctorRepository;

@Service
public class DoctorService {
    private final DoctorRepository repo;

    public DoctorService(DoctorRepository repo) {
        this.repo = repo;
    }

    //get 
    public List<Doctor> getAllDoctors() {
        return repo.findAll();
    }
    //post 
    public Doctor saveDoctor(Doctor doc) {
        return repo.save(doc);
    }
    //find by id
    public Doctor findById(UUID id) {
        return repo.findById(id).orElse(null);
    }
    //delete
    public void deleteDoctor(UUID id) {
        repo.deleteById(id);
    }
    

}
