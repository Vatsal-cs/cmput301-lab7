package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityText = findViewById(R.id.text_city_name);
        Button backButton = findViewById(R.id.button_back);

        // Get city name passed from MainActivity
        Intent intent = getIntent();
        String cityName = intent.getStringExtra("city_name");
        cityText.setText(cityName);

        // Back button to return to MainActivity
        backButton.setOnClickListener(v -> finish());
    }
}
