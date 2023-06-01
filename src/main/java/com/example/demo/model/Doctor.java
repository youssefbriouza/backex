package com.example.demo.model;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Doctor extends User {
    
    @OneToMany(mappedBy = "doctor")
    private List<Patient> patients;
    
    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;
    
    @OneToMany(mappedBy = "doctor")
    private List<Secretary> secretaries;

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

    public List<Secretary> getSecretaries() {
        return secretaries;
    }

    public void setSecretaries(List<Secretary> secretaries) {
        this.secretaries = secretaries;
    }
}
