package edu.gatech.adc.adc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private MaterialButton requestDoula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        requestDoula = findViewById(R.id.request_doula_button);
        requestDoula.setOnClickListener(view -> openDoulaQuestionsActivity());
    }

//    private void openDoulaQuestionsActivity() {
//        Intent intent = new Intent(this, DoulaQuestionsActivity.class);
//        startActivity(intent);
//    }

    // only adding this to see what my page looks like on the phone
    // TODO: get rid of this later
    private void openDoulaQuestionsActivity() {
        Intent intent = new Intent(this, InformationConfirmation.class);
        startActivity(intent);
    }
}
