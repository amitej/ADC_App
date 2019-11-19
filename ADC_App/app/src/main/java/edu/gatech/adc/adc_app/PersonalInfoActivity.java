package edu.gatech.adc.adc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class PersonalInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

        MaterialButton nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(view -> openEmergencyContactsActivity());
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private void openEmergencyContactsActivity() {
        Intent intent = new Intent(this, EmergencyContactsActivity.class);
        startActivity(intent);
    }
}
