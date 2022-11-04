package com.example.roadtestings1.Gradation.GSB.Gradation_5;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.roadtestings1.MainActivity;
import com.example.roadtestings1.R;

import java.util.Objects;

public class Gradation5InputActivity extends AppCompatActivity {

    AppCompatButton calculate;
    EditText x1, x2, x3, x4, x5, x6, x7, x8, x9, z1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gradation_input);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Grade - 5");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        x1 = findViewById(R.id.input75_00);
        x2 = findViewById(R.id.input53);
        x3 = findViewById(R.id.input26_5);
        x4 = findViewById(R.id.input9_5);
        x5 = findViewById(R.id.input4_75);
        x6 = findViewById(R.id.input2_36);
        x7 = findViewById(R.id.input0_85);
        x8 = findViewById(R.id.input0_425);
        x9 = findViewById(R.id.input75);
        z1 = findViewById(R.id.chainge);

        calculate = findViewById(R.id.calculate);

        calculate.setOnClickListener(v -> {

            if (TextUtils.isEmpty(x1.getText().toString()) ||
                    TextUtils.isEmpty(x2.getText().toString()) ||
                    TextUtils.isEmpty(x3.getText().toString()) ||
                    TextUtils.isEmpty(x4.getText().toString()) ||
                    TextUtils.isEmpty(x5.getText().toString()) ||
                    TextUtils.isEmpty(x6.getText().toString()) ||
                    TextUtils.isEmpty(x7.getText().toString()) ||
                    TextUtils.isEmpty(x8.getText().toString()) ||
                    TextUtils.isEmpty(x9.getText().toString()) ||
                    TextUtils.isEmpty(z1.getText().toString())
            ) {
                Toast.makeText(this, "Input Field can't be empty", Toast.LENGTH_SHORT).show();
            } else {
                Intent intent = new Intent(getApplicationContext(), Gradation5OutputActivity.class);
                intent.putExtra("a2", x1.getText().toString());
                intent.putExtra("b2", x2.getText().toString());
                intent.putExtra("c2", x3.getText().toString());
                intent.putExtra("d2", x4.getText().toString());
                intent.putExtra("e2", x5.getText().toString());
                intent.putExtra("f2", x6.getText().toString());
                intent.putExtra("g2", x7.getText().toString());
                intent.putExtra("h2", x8.getText().toString());
                intent.putExtra("i2", x9.getText().toString());
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
