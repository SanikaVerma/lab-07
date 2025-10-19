package com.example.androiduitesting;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityNameView = findViewById(R.id.city_name);
        Button backButton = findViewById(R.id.button_back);

        // Get city name from the Intent sent by MainActivity
        Intent intent = getIntent();
        String cityName = intent.getStringExtra("city_name");
        cityNameView.setText(cityName);

        // Back button goes back to MainActivity
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();  // closes ShowActivity and returns
            }
        });
    }
}
