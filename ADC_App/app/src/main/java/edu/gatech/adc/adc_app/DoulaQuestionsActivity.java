package edu.gatech.adc.adc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class DoulaQuestionsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doula_questions);

        MaterialButton prevButton = findViewById(R.id.prev_button_doulaQ);
        prevButton.setOnClickListener(view -> openPreviousBirthInfoActivity());

        MaterialButton nextButton = findViewById(R.id.next_button_doulaQ);
        nextButton.setOnClickListener(view -> openPhotoReleaseActivity());
    }

    @Override
    public void onBackPressed() {
        openPreviousBirthInfoActivity();
    }

    private void openPreviousBirthInfoActivity() {
        Intent intent = new Intent(this, PreviousBirthInfoActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private void openPhotoReleaseActivity() {
        Intent intent = new Intent(this, PhotoReleaseActivity.class);
        startActivity(intent);
    }
}
