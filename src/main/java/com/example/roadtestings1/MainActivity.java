package com.example.roadtestings1;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

import com.example.roadtestings1.GRB.GRBInputActivity;
import com.example.roadtestings1.Gradation.GradationTypesActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.app.ActivityCompat;

public class MainActivity extends AppCompatActivity {

  AppCompatButton gradation, grb;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.gradation_types);

    ActivityCompat.requestPermissions(this,
      new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,
        Manifest.permission.READ_EXTERNAL_STORAGE},
      PackageManager.PERMISSION_GRANTED);

    gradation = findViewById(R.id.gradation);
    grb = findViewById(R.id.grb);

    gradation.setOnClickListener(v -> {
      Intent intent = new Intent(getApplicationContext(), GradationTypesActivity.class);
      startActivity(intent);
    });

    grb.setOnClickListener(v -> {
      Intent intent = new Intent(getApplicationContext(), GRBInputActivity.class);
      startActivity(intent);
    });
  }
}
