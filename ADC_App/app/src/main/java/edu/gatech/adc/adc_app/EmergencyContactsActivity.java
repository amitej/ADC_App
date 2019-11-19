package edu.gatech.adc.adc_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class EmergencyContactsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_contacts);

        MaterialButton nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(view -> openCurrentBirthInfoActivity());

        MaterialButton prevButton = findViewById(R.id.prev_button);
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
