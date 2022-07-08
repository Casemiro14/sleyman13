package com.example.Doctor.Appointmnt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Doctor.Appointmnt.Model.Doctor;

public interface Doctorrepository extends JpaRepository<Doctor,Long> {
    
}
