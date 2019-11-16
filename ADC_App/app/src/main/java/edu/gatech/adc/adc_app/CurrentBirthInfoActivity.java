package edu.gatech.adc.adc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

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
        //String location = birthLocations.getSelectedItem().toString();
    }
}
