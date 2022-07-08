package com.example.mysystem.model;


public class Patients {
    private String email;
    private String fname;
    private String lname;
    private String gender;
    private String contact;
    private String status;
    private String address;


    public Patients() {
    }


    public Patients( String email, long password, String fname, String lname, String gender,
                    String contact, String status, String address) {

        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.contact = contact;
        this.status = status;
        this.address = address;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
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

    @Override
    public String toString() {
        return "Patients{" +
                ", email='" + email + '\'' +
                ", lname='" + lname + '\'' +
                ", fname='" + fname + '\'' +
                ", gender='" + gender + '\'' +
                ", contact='" + contact + '\'' +
                ", status='" + status + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


}
