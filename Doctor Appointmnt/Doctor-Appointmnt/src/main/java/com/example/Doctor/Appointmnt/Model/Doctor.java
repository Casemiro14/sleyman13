package com.example.Doctor.Appointmnt.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

  
    private String name;
  
    private long age;
  
    private String address;
  
    private String contactNo;
 
    private String email;

    private String gender;
 
    private String specialist;
  
    private Date dob;

    private String status;

    public Doctor() {
    }

    public Doctor(long id, String name, long age, String address, String contactNo, String email, String gender, String specialist,
            Date dob, String status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactNo = contactNo;
        this.email = email;
        this.gender = gender;
        this.specialist = specialist;
        this.dob = dob;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

}
