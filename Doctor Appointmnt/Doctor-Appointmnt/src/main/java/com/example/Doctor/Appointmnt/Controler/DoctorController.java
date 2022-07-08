package com.example.Doctor.Appointmnt.Controler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.Doctor.Appointmnt.Exception.ResourceNotFoundException;
import com.example.Doctor.Appointmnt.Model.Doctor;
import com.example.Doctor.Appointmnt.Repository.Doctorrepository;

@CrossOrigin
@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
    
    @Autowired
    public  Doctorrepository doctorrepository;

    @GetMapping("/")
    public List<Doctor> getAllDoctors(){
        return doctorrepository.findAll();
    }

    @PostMapping("/")
    public Doctor add_Doctor(@RequestBody Doctor doctor){
        return doctorrepository.save(doctor);
    }

    //update patients
    @PutMapping("/{id}")
    public ResponseEntity<Doctor> updateDoctor(@PathVariable long id, @RequestBody Doctor doctor)
    {
        Doctor dt = doctorrepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
        dt.setAddress(doctor.getAddress());
        dt.setContactNo(doctor.getContactNo());
        dt.setAge(doctor.getAge());
        dt.setEmail(doctor.getEmail());
        dt.setName(doctor.getName());
        dt.setGender(doctor.getGender());
        dt.setSpecialist(doctor.getSpecialist());
        dt.setDob(doctor.getDob());
        dt.setStatus(doctor.getStatus());
        Doctor staf = doctorrepository.save(dt);
        return ResponseEntity.ok(staf);
    }

      //get staff by id
      @GetMapping("/{id}")
      public ResponseEntity<Doctor> getDoctorId(@PathVariable long id)
      {
          Doctor stf = doctorrepository.findById(id)
          .orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
          return ResponseEntity.ok(stf);
      }
  
      //delete staff
      @DeleteMapping("/{id}")
      public ResponseEntity<Map<String,Boolean>> deleteDoctor(@PathVariable long id)
      {
          Doctor stf = doctorrepository.findById(id)
          .orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
          doctorrepository.delete(stf);
  
          Map<String,Boolean> response = new HashMap<>();
          response.put("Deleted",Boolean.TRUE);
          return ResponseEntity.ok(response);
      }
}
