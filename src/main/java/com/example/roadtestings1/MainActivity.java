package com.example.roadtestings1;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.ActivityCompat;

import com.example.roadtestings1.Density.DensityInputActivity;
import com.example.roadtestings1.Gradation.InsideGradationActivity;

public class MainActivity extends AppCompatActivity {

    AppCompatButton gradation, density;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE},
                PackageManager.PERMISSION_GRANTED);

        gradation = findViewById(R.id.gradation);
        density = findViewById(R.id.density);

        gradation.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), InsideGradationActivity.class);
            startActivity(intent);
        });

        density.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), DensityInputActivity.class);
            startActivity(intent);
        });
    }
}
