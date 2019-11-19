package edu.gatech.adc.adc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.google.android.material.button.MaterialButton;

public class CurrentBirthInfoActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_birth_info);

        Spinner birthLocations = findViewById(R.id.plannedBirthLocationSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.planned_birth_locations, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        birthLocations.setAdapter(adapter);

        MaterialButton previousBirthActivity = findViewById(R.id.next_button_cur_birth_info);
        previousBirthActivity.setOnClickListener(view -> openPreviousBirthInfoActivity());
        //String location = birthLocations.getSelectedItem().toString();

        MaterialButton prevButton = findViewById(R.id.prev_button_cur_birth_info);
        prevButton.setOnClickListener(view -> openEmergencyContactActivity());
    }

    @Override
    public void onBackPressed() {
        openEmergencyContactActivity();
    }

    private void openPreviousBirthInfoActivity() {
        Intent intent = new Intent(this, PreviousBirthInfoActivity.class);
        startActivity(intent);
    }

    private void openEmergencyContactActivity () {
        Intent intent = new Intent(this, EmergencyContactsActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}
