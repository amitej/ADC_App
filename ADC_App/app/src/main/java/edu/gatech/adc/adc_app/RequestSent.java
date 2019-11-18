package edu.gatech.adc.adc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class RequestSent extends AppCompatActivity {

    private MaterialButton returnHome;

    private void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_sent);

        returnHome = findViewById(R.id.return_Home);
        returnHome.setOnClickListener(view -> openMainActivity());
    }


}
