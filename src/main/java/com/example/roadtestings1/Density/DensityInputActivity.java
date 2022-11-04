package com.example.roadtestings1.Density;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.roadtestings1.Gradation.GSB.Gradation_1.Gradation1OutputActivity;
import com.example.roadtestings1.MainActivity;
import com.example.roadtestings1.R;

import java.text.DecimalFormat;
import java.util.Objects;

public class DensityInputActivity extends AppCompatActivity {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static final DecimalFormat df1 = new DecimalFormat("0.000");

    AppCompatButton toTable;
    EditText x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.density_input);

        Objects.requireNonNull(getSupportActionBar()).setTitle("Density");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        x1 = findViewById(R.id.location);
        x2 = findViewById(R.id.w1);
        x3 = findViewById(R.id.w2);
        x4 = findViewById(R.id.w3);
        x5 = findViewById(R.id.w4);
        x6 = findViewById(R.id.w5);
        x7 = findViewById(R.id.density_input);
        x8 = findViewById(R.id.volume);
        x9 = findViewById(R.id.w);
        x10 = findViewById(R.id.bulk);
        x11 = findViewById(R.id.fieldDry);
        x12 = findViewById(R.id.labDensity);
        x13 = findViewById(R.id.relative);

        x2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                OnTextChanged();
            }
        });

        x3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                OnTextChanged();
            }
        });

        x5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                OnTextChanged();
            }
        });

        x7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                OnTextChanged();
            }
        });

        x9.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                OnTextChanged();
            }
        });

        x11.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                OnTextChanged();
            }
        });

        x12.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                OnTextChanged();
            }
        });

        toTable = findViewById(R.id.toTable);

        toTable.setOnClickListener(v -> {

            if (TextUtils.isEmpty(x1.getText().toString()) ||
                    TextUtils.isEmpty(x2.getText().toString()) ||
                    TextUtils.isEmpty(x3.getText().toString()) ||
                    TextUtils.isEmpty(x5.getText().toString()) ||
                    TextUtils.isEmpty(x7.getText().toString()) ||
                    TextUtils.isEmpty(x9.getText().toString()) ||
                    TextUtils.isEmpty(x11.getText().toString()) ||
                    TextUtils.isEmpty(x12.getText().toString())
            ) {
                Toast.makeText(this, "Input Field can't be empty", Toast.LENGTH_SHORT).show();
            } else {

                Intent intent = new Intent(getApplicationContext(), DensityOutputActivity.class);
                intent.putExtra("a2", x1.getText().toString());
                intent.putExtra("b2", x2.getText().toString());
                intent.putExtra("c2", x3.getText().toString());
                intent.putExtra("d2", x4.getText().toString());
                intent.putExtra("e2", x5.getText().toString());
                intent.putExtra("f2", x6.getText().toString());
                intent.putExtra("g2", x7.getText().toString());
                intent.putExtra("h2", x8.getText().toString());
                intent.putExtra("i2", x9.getText().toString());
                intent.putExtra("j2", x10.getText().toString());
                intent.putExtra("k2", x11.getText().toString());
                intent.putExtra("l2", x12.getText().toString());
                intent.putExtra("m2", x13.getText().toString());
                startActivity(intent);
            }
        });
    }

    private void OnTextChanged() {
        if (!TextUtils.isEmpty(x2.getText().toString()) && !TextUtils.isEmpty(x3.getText().toString())) {
            int a = Integer.parseInt(x2.getText().toString());
            int b = Integer.parseInt(x3.getText().toString());
            x4.setText(String.valueOf(a - b));
        }

        if (!TextUtils.isEmpty(x4.getText().toString()) && !TextUtils.isEmpty(x5.getText().toString())) {
            int a = Integer.parseInt(x4.getText().toString());
            int b = Integer.parseInt(x5.getText().toString());
            x6.setText(String.valueOf(a - b));
        }

        if (!TextUtils.isEmpty(x6.getText().toString()) && !TextUtils.isEmpty(x7.getText().toString())) {
            double a = Double.parseDouble(x6.getText().toString());
            double b = Double.parseDouble(x7.getText().toString());
            double c = a / b;
            x8.setText(df.format(c));
        }

        if (!TextUtils.isEmpty(x8.getText().toString()) && !TextUtils.isEmpty(x9.getText().toString())) {
            double a = Double.parseDouble(x8.getText().toString());
            double b = Double.parseDouble(x9.getText().toString());
            double c = b / a;
            x10.setText(df1.format(c));
        }

        if (!TextUtils.isEmpty(x11.getText().toString()) && !TextUtils.isEmpty(x12.getText().toString())) {
            double a = Double.parseDouble(x11.getText().toString());
            double b = Double.parseDouble(x12.getText().toString());
            double c =a * 100.00 / b;
            x13.setText(df.format(c));
        }
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(myIntent);
        return true;
    }
}
