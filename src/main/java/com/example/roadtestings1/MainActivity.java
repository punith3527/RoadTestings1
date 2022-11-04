package com.example.roadtestings1;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.ActivityCompat;

import com.example.roadtestings1.Density.DensityInputActivity;
import com.example.roadtestings1.Gradation.GSB.Gradation_1.Gradation1InputActivity;
import com.example.roadtestings1.Gradation.GSB.Gradation_3.Gradation3InputActivity;
import com.example.roadtestings1.Gradation.GSB.Gradation_5.Gradation5InputActivity;
import com.example.roadtestings1.Gradation.WMM.GRBInputActivity;

public class MainActivity extends AppCompatActivity {

    AppCompatButton gradation, density, gsb, wmm, gradation1, gradation3, gradation5;
    ConstraintLayout insideGradation, insideGsb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_new);

        insideGradation = findViewById(R.id.insideGradation);
        insideGradation.setVisibility(View.GONE);

        insideGsb = findViewById(R.id.insideGsb);
        insideGsb.setVisibility(View.GONE);

        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.READ_EXTERNAL_STORAGE},
                PackageManager.PERMISSION_GRANTED);

        gradation = findViewById(R.id.gradation);
        density = findViewById(R.id.density);

        gradation.setOnClickListener(v -> {
            if (insideGradation.isShown()) {
                insideGradation.setVisibility(View.GONE);
                insideGsb.setVisibility(View.GONE);
            } else {
                insideGradation.setVisibility(View.VISIBLE);
            }
        });

        gsb = findViewById(R.id.gsb);
        gsb.setOnClickListener(view -> {
            if (insideGsb.isShown()) {
                insideGsb.setVisibility(View.GONE);
            } else {
                insideGsb.setVisibility(View.VISIBLE);
            }
        });

        gradation1 = findViewById(R.id.gradation1);
        gradation3 = findViewById(R.id.gradation3);
        gradation5 = findViewById(R.id.gradation5);

        gradation1.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Gradation1InputActivity.class);
            startActivity(intent);
        });

        gradation3.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Gradation3InputActivity.class);
            startActivity(intent);
        });

        gradation5.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Gradation5InputActivity.class);
            startActivity(intent);
        });

        wmm = findViewById(R.id.wmm);
        wmm.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), GRBInputActivity.class);
            startActivity(intent);
        });

        density.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), DensityInputActivity.class);
            startActivity(intent);
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }
}
