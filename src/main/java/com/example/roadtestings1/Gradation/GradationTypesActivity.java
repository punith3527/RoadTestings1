package com.example.roadtestings1.Gradation;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.roadtestings1.Gradation.Gradation_1.Gradation1InputActivity;
import com.example.roadtestings1.Gradation.Gradation_3.Gradation3InputActivity;
import com.example.roadtestings1.Gradation.Gradation_5.Gradation5InputActivity;
import com.example.roadtestings1.MainActivity;
import com.example.roadtestings1.R;

import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class GradationTypesActivity extends AppCompatActivity {

  AppCompatButton gradation1, gradation3, gradation5;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.gsb_types);

    Objects.requireNonNull(getSupportActionBar()).setTitle("Gradation");

    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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

  }

  public boolean onOptionsItemSelected(MenuItem item){
    Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
    startActivity(myIntent);
    return true;
  }
}
