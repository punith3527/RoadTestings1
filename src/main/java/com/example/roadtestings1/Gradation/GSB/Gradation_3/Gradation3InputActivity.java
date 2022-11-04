package com.example.roadtestings1.Gradation.GSB.Gradation_3;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.roadtestings1.MainActivity;
import com.example.roadtestings1.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class Gradation3InputActivity extends AppCompatActivity {

  AppCompatButton calculate;
  EditText x1, x2, x3, x4, z1;
  TextInputLayout z2, z3, z4, z5, z6;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.gradation_input);

    Objects.requireNonNull(getSupportActionBar()).setTitle("Grade - 3");

    getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    z2 = findViewById(R.id.input0_85Item);
    z2.setVisibility(View.GONE);

    z3 = findViewById(R.id.input75_00Item);
    z3.setVisibility(View.GONE);

    z4 = findViewById(R.id.input9_5Item);
    z4.setVisibility(View.GONE);

    z5 = findViewById(R.id.input2_36Item);
    z5.setVisibility(View.GONE);

    z6 = findViewById(R.id.input0_425Item);
    z6.setVisibility(View.GONE);

    x1 = findViewById(R.id.input53);
    x2 = findViewById(R.id.input26_5);
    x3 = findViewById(R.id.input4_75);
    x4 = findViewById(R.id.input75);
    z1 = findViewById(R.id.chainge);

    calculate = findViewById(R.id.calculate);

    calculate.setOnClickListener(v -> {

      if (TextUtils.isEmpty(x1.getText().toString()) ||
            TextUtils.isEmpty(x2.getText().toString()) ||
            TextUtils.isEmpty(x3.getText().toString()) ||
            TextUtils.isEmpty(x4.getText().toString()) ||
            TextUtils.isEmpty(z1.getText().toString())
      ) {
        Toast.makeText(this, "Input Field can't be empty", Toast.LENGTH_SHORT).show();
      } else {
        Intent intent = new Intent(getApplicationContext(), Gradation3OutputActivity.class);
        intent.putExtra("a2", x1.getText().toString());
        intent.putExtra("b2", x2.getText().toString());
        intent.putExtra("c2", x3.getText().toString());
        intent.putExtra("d2", x4.getText().toString());
        intent.putExtra("z1", z1.getText().toString());
        startActivity(intent);
      }
    });
  }

  public boolean onOptionsItemSelected(MenuItem item) {
    Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
    startActivity(myIntent);
    return true;
  }

  @Override
  public void onBackPressed() {
    super.onBackPressed();
    Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
    startActivity(myIntent);
  }
}
