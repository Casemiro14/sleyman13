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

import com.example.Doctor.Appointmnt.Model.Patients;
import com.example.Doctor.Appointmnt.Repository.Patientsrepository;
import com.example.Doctor.Appointmnt.Exception.ResourceNotFoundException;;

@CrossOrigin
@RestController
@RequestMapping("/api/patients")
public class PatientsController{
    @Autowired
    public  Patientsrepository patientsrepository;

    @GetMapping("/")
    public List<Patients> getAllPatients(){
        return patientsrepository.findAll();
    }

    @PostMapping("/")
    public Patients add_Patients(@RequestBody Patients patients){
        return patientsrepository.save(patients);
    }

      //update patients
      @PutMapping("/{id}")
      public ResponseEntity<Patients> updatePatients(@PathVariable long id, @RequestBody Patients patients)
      {
          Patients pt = patientsrepository.findById(id)
          .orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
          pt.setAddress(patients.getAddress());
          pt.setContact(patients.getContact());
          pt.setDate(patients.getDate());
          pt.setEmail(patients.getEmail());
          pt.setFname(patients.getFname());
          pt.setGender(patients.getGender());
          pt.setLname(patients.getLname());
          pt.setPassword(patients.getPassword());
          pt.setStatus(patients.getStatus());
          Patients staf = patientsrepository.save(pt);
          return ResponseEntity.ok(staf);
      }

      //get staff by id
    @GetMapping("/{id}")
    public ResponseEntity<Patients> getPatientId(@PathVariable long id)
    {
        Patients stf = patientsrepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
        return ResponseEntity.ok(stf);
    }

    //delete staff
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String,Boolean>> deleteStaff(@PathVariable long id)
    {
        Patients stf = patientsrepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Invalid Id"));
        patientsrepository.delete(stf);

        Map<String,Boolean> response = new HashMap<>();
        response.put("Deleted",Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}