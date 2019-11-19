package edu.gatech.adc.adc_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.button.MaterialButton;

public class PreviousBirthInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_birth_info);

        MaterialButton previousBirthActivity = findViewById(R.id.prev_button_prev_birth_info);
        previousBirthActivity.setOnClickListener(view -> openCurrentBirthInfoActivity());

        MaterialButton nextButton = findViewById(R.id.next_button_prev_birth_info);
        nextButton.setOnClickListener(view -> openDoulaQuestionsActivity());
    }

    @Override
    public void onBackPressed() {
        openCurrentBirthInfoActivity();
    }

    private void openCurrentBirthInfoActivity() {
        Intent intent = new Intent(this, CurrentBirthInfoActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }

    private void openDoulaQuestionsActivity() {
        Intent intent = new Intent(this, DoulaQuestionsActivity.class);
        startActivity(intent);
    }
}
