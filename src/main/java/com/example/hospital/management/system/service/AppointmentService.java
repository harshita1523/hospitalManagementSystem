package com.example.hospital.management.system.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.hospital.management.system.model.Appointment;
import com.example.hospital.management.system.repository.AppointmentRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public Appointment createAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public List<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }

    public Appointment getAppointmentById(UUID id) {
        return appointmentRepository.findById(id).orElseThrow();
    }

    public Appointment updateAppointment(UUID id, Appointment updated) {
        Appointment a = getAppointmentById(id);
        a.setDate(updated.getDate());
        a.setStatus(updated.getStatus());
        a.setDoctor(updated.getDoctor());
        a.setPatient(updated.getPatient());
        return appointmentRepository.save(a);
    }

    public void deleteAppointment(UUID id) {
        appointmentRepository.deleteById(id);
    }
}
