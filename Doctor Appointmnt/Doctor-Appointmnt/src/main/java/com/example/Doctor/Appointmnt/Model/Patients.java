package com.example.Doctor.Appointmnt.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Patients")
public class Patients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private long password;
    @Column(name = "fname")
    private String fname;
    @Column(name = "lname")
    private String lname;
    @Column(name = "date")
    private Date date;
    @Column(name = "gender")
    private String gender;
    @Column(name = "contact")
    private String contact;
    @Column(name = "status")
    private String status;
    @Column(name = "address")
    private String address;

    
    public Patients() {
    }


    public Patients(long id, String email, long password, String fname, String lname, Date date, String gender,
            String contact, String status, String address) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.fname = fname;
        this.lname = lname;
        this.date = date;
        this.gender = gender;
        this.contact = contact;
        this.status = status;
        this.address = address;
    }


    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public long getPassword() {
        return password;
    }


    public void setPassword(long password) {
        this.password = password;
    }


    public String getFname() {
        return fname;
    }


    public void setFname(String fname) {
        this.fname = fname;
    }


    public String getLname() {
        return lname;
    }


    public void setLname(String lname) {
        this.lname = lname;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getContact() {
        return contact;
    }


    public void setContact(String contact) {
        this.contact = contact;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public String getAddress() {
        return address;
    }


    public void setAddress(String address) {
        this.address = address;
    }

    
}
