package edu.gatech.adc.adc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class PhotoReleaseActivity extends AppCompatActivity {

    private MaterialButton prevButton;
    private MaterialButton finishButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_release);

        prevButton = findViewById(R.id.prev_button_photo_release);
        prevButton.setOnClickListener(view -> openDoulaQuestionsActivity());

        finishButton = findViewById(R.id.finish_button_photo_release);
        finishButton.setOnClickListener(view -> openMainActivity());
    }

    @Override
    public void onBackPressed() {
        openDoulaQuestionsActivity();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private void openDoulaQuestionsActivity() {
        Intent intent = new Intent(this, DoulaQuestionsActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
