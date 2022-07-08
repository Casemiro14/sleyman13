package com.example.Doctor.Appointmnt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Doctor.Appointmnt.Model.Patients;

public interface Patientsrepository extends JpaRepository<Patients,Long> {
    
}
