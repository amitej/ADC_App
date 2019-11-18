package edu.gatech.adc.adc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class DoulaQuestionsActivity extends AppCompatActivity {

    private MaterialButton prevButton;
    private MaterialButton nextButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doula_questions);

        prevButton = findViewById(R.id.prev_button_doulaQ);
        prevButton.setOnClickListener(view -> openCurrentBirthInfoActivity());

        nextButton = findViewById(R.id.next_button_doulaQ);
        nextButton.setOnClickListener(view -> openPhotoReleaseActivity());
    }

    @Override
    public void onBackPressed() {
        openCurrentBirthInfoActivity();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private void openCurrentBirthInfoActivity() {
        Intent intent = new Intent(this, CurrentBirthInfoActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private void openPhotoReleaseActivity() {
        Intent intent = new Intent(this, PhotoReleaseActivity.class);
        startActivity(intent);
    }
}
