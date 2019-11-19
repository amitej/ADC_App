package edu.gatech.adc.adc_app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class EmergencyContactsActivity extends AppCompatActivity {
    private MaterialButton prevButton;
    private MaterialButton nextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contacts);

        nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(view -> openCurrentBirthInfoActivity());

        prevButton = findViewById(R.id.prev_button);
        prevButton.setOnClickListener(view -> openPersonalInfoActivity());
    }

    @Override
    public void onBackPressed() {
        openPersonalInfoActivity();
    }

    private void openPersonalInfoActivity() {
        Intent intent = new Intent(this, PersonalInfoActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private void openCurrentBirthInfoActivity() {
        Intent intent = new Intent(this, CurrentBirthInfoActivity.class);
        startActivity(intent);
    }
}
