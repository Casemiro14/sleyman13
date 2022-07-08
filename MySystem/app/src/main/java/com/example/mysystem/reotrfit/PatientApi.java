package com.example.mysystem.reotrfit;

import com.example.mysystem.model.Patients;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PatientApi {

    @GET("/patients/get-all")
    Call<List<Patients>> getAllPatients();

    @POST("/api/patients/")
    Call<Patients> save(@Body Patients patients);
}
