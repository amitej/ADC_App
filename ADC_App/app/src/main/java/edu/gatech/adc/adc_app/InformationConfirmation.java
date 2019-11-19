package edu.gatech.adc.adc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class InformationConfirmation extends AppCompatActivity {

    private MaterialButton submit;
    private MaterialButton edit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_confirmation);


        submit = findViewById(R.id.submit);
        submit.setOnClickListener(view -> openRequestSent());

 /*
       edit = findViewById(R.id.edit);
        edit.setOnClickListener(view -> openPersonalInfo());
*/
    }

    private void openRequestSent() {
        Intent intent = new Intent(this, RequestSent.class);
        startActivity(intent);
    }

//    private void openPersonalInfo() {
//        Intent intent = new Intent(this, RequestSent.class);
//        startActivity(intent);
//    }

}
