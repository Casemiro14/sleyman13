package com.example.mysystem;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mysystem.model.Patients;
import com.example.mysystem.reotrfit.PatientApi;
import com.example.mysystem.reotrfit.RetrofitService;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.logging.Level;
import java.util.logging.Logger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PatientsForm extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        initializeComponents();
    }

//    private void initializeComponents()
//    {
//        TextInputEditText pemail = findViewById(R.id.form_textFieldEmail);
//        TextInputEditText pfname = findViewById(R.id.form_textFieldFname);
//        TextInputEditText plname = findViewById(R.id.form_textFieldLname);
//        TextInputEditText pgender = findViewById(R.id.form_textFieldGender);
//        TextInputEditText pcontact = findViewById(R.id.form_textFieldContact);
//        TextInputEditText pstatus = findViewById(R.id.form_textFieldStatus);
//        MaterialButton paddress = findViewById(R.id.form_textFieldAddress);
//        MaterialButton buttonSave = findViewById(R.id.form_buttonSave);
//
//        RetrofitService retrofitService = new RetrofitService();
//        PatientApi patientApi = retrofitService.getRetrofit().create(PatientApi.class);
//
//        buttonSave.setOnClickListener(view ->
//        {
//            String email = String.valueOf(pemail.getText());
//            String fname = String.valueOf(pfname.getText());
//            String lname = String.valueOf(plname.getText());
//            String gender = String.valueOf(pgender.getText());
//            String contact = String.valueOf(pcontact.getText());
//            String status = String.valueOf(pstatus.getText());
//            String address = String.valueOf(paddress.getText());
//
//            Patients patients = new Patients();
//            patients.setEmail(email);
//            patients.setFname(fname);
//            patients.setLname(lname);
//            patients.setGender(gender);
//            patients.setContact(contact);
//            patients.setStatus(status);
//            patients.setAddress(address);
//
//            patientApi.save(patients)
//                .enqueue(new Callback<Patients>() {
//                    @Override
//                    public void onResponse(Call<Patients> call, Response<Patients> response) {
//                        Toast.makeText(PatientsForm.this, "Save successful!", Toast.LENGTH_SHORT).show();
//
//                    }
//
//                    @Override
//                    public void onFailure(Call<Patients> call, Throwable t) {
//                        Toast.makeText(PatientsForm.this, "Save failed!!!", Toast.LENGTH_SHORT).show();
//                        Logger.getLogger(PatientsForm.class.getName()).log(Level.SEVERE, "Error occurred", t);
//
//                    }
//                });
//
//        });
//
//    }
}
