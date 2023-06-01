package com.example.demo.model;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Secretary extends User {
    
    @ManyToOne
    private Doctor doctor;
    
    @OneToMany(mappedBy = "secretary")
    private List<Patient> patients;
    
    @OneToMany(mappedBy = "secretary")
    private List<Appointment> appointments;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}

