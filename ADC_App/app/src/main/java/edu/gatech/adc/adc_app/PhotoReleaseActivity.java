package edu.gatech.adc.adc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class PhotoReleaseActivity extends AppCompatActivity {

    private MaterialButton prevButton;
    private MaterialButton reviewAndSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_release);

        prevButton = findViewById(R.id.prev_button_photo_release);
        prevButton.setOnClickListener(view -> openDoulaQuestionsActivity());

        reviewAndSubmit = findViewById(R.id.reviewAndSubmit);
        reviewAndSubmit.setOnClickListener(view -> openReviewAndSubmit());
    }

    @Override
    public void onBackPressed() {
        openDoulaQuestionsActivity();
    }

    private void openDoulaQuestionsActivity() {
        Intent intent = new Intent(this, DoulaQuestionsActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private void openReviewAndSubmit() {
        Intent intent = new Intent(this, InformationConfirmation.class);
        startActivity(intent);
    }
}
