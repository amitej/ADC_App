package edu.gatech.adc.adc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class InformationConfirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_confirmation);


        MaterialButton submit = findViewById(R.id.submit);
        submit.setOnClickListener(view -> openRequestSent());

        MaterialButton edit = findViewById(R.id.edit);
        edit.setOnClickListener(view -> openPersonalInfo());
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, PhotoReleaseActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private void openRequestSent() {
        Intent intent = new Intent(this, RequestSent.class);
        startActivity(intent);
    }

    private void openPersonalInfo() {
        Intent intent = new Intent(this, PersonalInfoActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

}
