package com.example.roadtestings1.Gradation;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.roadtestings1.Gradation.GSB.GradationTypesActivity;
import com.example.roadtestings1.Gradation.WMM.GRBInputActivity;
import com.example.roadtestings1.MainActivity;
import com.example.roadtestings1.R;

import java.util.Objects;

public class InsideGradationActivity extends AppCompatActivity {

    AppCompatButton gsb, wmm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gradation_types);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Gradation");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        gsb = findViewById(R.id.gsb);
        wmm = findViewById(R.id.wmm);

        gsb.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), GradationTypesActivity.class);
            startActivity(intent);
        });

        wmm.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), GRBInputActivity.class);
            startActivity(intent);
        });
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(myIntent);
        return true;
    }
}
