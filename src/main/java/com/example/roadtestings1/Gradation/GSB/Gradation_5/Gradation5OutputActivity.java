package com.example.roadtestings1.Gradation.GSB.Gradation_5;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.WindowManager;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.roadtestings1.MovableFloatingActionButton;
import com.example.roadtestings1.R;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;

public class Gradation5OutputActivity extends AppCompatActivity {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    String a1, b1, c1, d1, e1, f1, g1, h1, i1;
    String a6, b6, c6, d6, e6, f6, g6, h6, i6;
    double a7, b7, c7, d7, e7, f7, g7, h7, i7;
    String a8, b8, c8, d8, e8, f8, g8, h8, i8;

    int a2, b2, c2, d2, e2, f2, g2, h2, i2;
    int a3, b3, c3, d3, e3, f3, g3, h3, i3;

    double a4, a5,
            b4, b5,
            c4, c5,
            d4, d5,
            e4, e5,
            f4, f5,
            g4, g5,
            h4, h5,
            i4, i5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_output);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        a1 = "75.00";
        b1 = "53.00";
        c1 = "26.5";
        d1 = "9.5";
        e1 = "4.75";
        f1 = "2.36";
        g1 = "0.85";
        h1 = "0.425";
        i1 = "75μ";

        Intent intent = getIntent();
        a2 = Integer.parseInt(intent.getStringExtra("a2"));
        b2 = Integer.parseInt(intent.getStringExtra("b2"));
        c2 = Integer.parseInt(intent.getStringExtra("c2"));
        d2 = Integer.parseInt(intent.getStringExtra("d2"));
        e2 = Integer.parseInt(intent.getStringExtra("e2"));
        f2 = Integer.parseInt(intent.getStringExtra("f2"));
        g2 = Integer.parseInt(intent.getStringExtra("g2"));
        h2 = Integer.parseInt(intent.getStringExtra("h2"));
        i2 = Integer.parseInt(intent.getStringExtra("i2"));

        a3 = a2;
        b3 = a3 + b2;
        c3 = b3 + c2;
        d3 = c3 + d2;
        e3 = d3 + e2;
        f3 = e3 + f2;
        g3 = f3 + g2;
        h3 = g3 + h2;
        i3 = h3 + i2;

        a4 = a3 * 100.0 / i3;
        b4 = b3 * 100.0 / i3;
        c4 = c3 * 100.0 / i3;
        d4 = d3 * 100.0 / i3;
        e4 = e3 * 100.0 / i3;
        f4 = f3 * 100.0 / i3;
        g4 = g3 * 100.0 / i3;
        h4 = h3 * 100.0 / i3;
        i4 = i3 * 100.0 / i3;

        a5 = 100 - a4;
        b5 = 100 - b4;
        c5 = 100 - c4;
        d5 = 100 - d4;
        e5 = 100 - e4;
        f5 = 100 - f4;
        g5 = 100 - g4;
        h5 = 100 - h4;
        i5 = 100 - i4;

        a6 = "100";
        b6 = "80-100";
        c6 = "55-90";
        d6 = "35-65";
        e6 = "25-50";
        f6 = "10-20";
        g6 = "2-10";
        h6 = "0-5";
        i6 = "0";

        a7 = b7 = c7 = d7 = e7 = f7 = g7 = h7 = i7 = 0;
        a8 = b8 = c8 = d8 = e8 = f8 = g8 = h8 = i8 = null;

        if (a5 < 100) {
            a7 = 100 - a5;
            a8 = "O/s";
        }

        if (b5 < 80) {
            b7 = 80 - b5;
            b8 = "O/s";
        } else if (b5 > 100) {
            b7 = b5 - 100;
            b8 = "U/s";
        }

        if (c5 < 55) {
            c7 = 55 - c5;
            c8 = "O/s";
        } else if (c5 > 90) {
            c7 = c5 - 90;
            c8 = "U/s";
        }

        if (d5 < 35) {
            d7 = 35 - d5;
            d8 = "O/s";
        } else if (d5 > 65) {
            d7 = d5 - 65;
            d8 = "U/s";
        }

        if (e5 < 25) {
            e7 = 25 - e5;
            e8 = "O/s";
        } else if (e5 > 50) {
            e7 = e5 - 50;
            e8 = "U/s";
        }

        if (f5 < 10) {
            f7 = 10 - f5;
            f8 = "O/s";
        } else if (f5 > 20) {
            f7 = f5 - 20;
            f8 = "U/s";
        }

        if (g5 < 2) {
            g7 = 2 - g5;
            g8 = "O/s";
        } else if (g5 > 10) {
            g7 = g5 - 10;
            g8 = "U/s";
        }

        if (h5 > 5) {
            h7 = h5 - 5;
            h8 = "U/s";
        }

        if (i5 > 0) {
            i7 = i5 - 5;
            i8 = "U/s";
        }

        TextView A1 = findViewById(R.id.a1);
        A1.setText(a1);

        TextView A2 = findViewById(R.id.a2);
        A2.setText(String.valueOf(a2));

        TextView A3 = findViewById(R.id.a3);
        A3.setText(String.valueOf(a3));

        TextView A4 = findViewById(R.id.a4);
        A4.setText(df.format(a4));

        TextView A5 = findViewById(R.id.a5);
        A5.setText(df.format(a5));

        TextView A6 = findViewById(R.id.a6);
        A6.setText(a6);

        TextView A7 = findViewById(R.id.a7);
        if (a7 == 0) {
            A7.setText(null);
        } else {
            A7.setText(df.format(a7));
        }

        TextView A8 = findViewById(R.id.a8);
        A8.setText(a8);

        TextView B1 = findViewById(R.id.b1);
        B1.setText(b1);

        TextView B2 = findViewById(R.id.b2);
        B2.setText(String.valueOf(b2));

        TextView B3 = findViewById(R.id.b3);
        B3.setText(String.valueOf(b3));

        TextView B4 = findViewById(R.id.b4);
        B4.setText(df.format(b4));

        TextView B5 = findViewById(R.id.b5);
        B5.setText(df.format(b5));

        TextView B6 = findViewById(R.id.b6);
        B6.setText(b6);

        TextView B7 = findViewById(R.id.b7);
        if (b7 == 0) {
            B7.setText(null);
        } else {
            B7.setText(df.format(b7));
        }


        TextView B8 = findViewById(R.id.b8);
        B8.setText(b8);

        TextView C1 = findViewById(R.id.c1);
        C1.setText(c1);

        TextView C2 = findViewById(R.id.c2);
        C2.setText(String.valueOf(c2));

        TextView C3 = findViewById(R.id.c3);
        C3.setText(String.valueOf(c3));

        TextView C4 = findViewById(R.id.c4);
        C4.setText(df.format(c4));

        TextView C5 = findViewById(R.id.c5);
        C5.setText(df.format(c5));

        TextView C6 = findViewById(R.id.c6);
        C6.setText(c6);

        TextView C7 = findViewById(R.id.c7);
        if (c7 == 0) {
            C7.setText(null);
        } else {
            C7.setText(df.format(c7));
        }

        TextView C8 = findViewById(R.id.c8);
        C8.setText(c8);

        TextView D1 = findViewById(R.id.d1);
        D1.setText(d1);

        TextView D2 = findViewById(R.id.d2);
        D2.setText(String.valueOf(d2));

        TextView D3 = findViewById(R.id.d3);
        D3.setText(String.valueOf(d3));

        TextView D4 = findViewById(R.id.d4);
        D4.setText(df.format(d4));

        TextView D5 = findViewById(R.id.d5);
        D5.setText(df.format(d5));

        TextView D6 = findViewById(R.id.d6);
        D6.setText(d6);

        TextView D7 = findViewById(R.id.d7);
        if (d7 == 0) {
            D7.setText(null);
        } else {
            D7.setText(df.format(d7));
        }

        TextView D8 = findViewById(R.id.d8);
        D8.setText(d8);

        TextView E1 = findViewById(R.id.e1);
        E1.setText(e1);

        TextView E2 = findViewById(R.id.e2);
        E2.setText(String.valueOf(e2));

        TextView E3 = findViewById(R.id.e3);
        E3.setText(String.valueOf(e3));

        TextView E4 = findViewById(R.id.e4);
        E4.setText(df.format(e4));

        TextView E5 = findViewById(R.id.e5);
        E5.setText(df.format(e5));

        TextView E6 = findViewById(R.id.e6);
        E6.setText(e6);

        TextView E7 = findViewById(R.id.e7);
        if (e7 == 0) {
            E7.setText(null);
        } else {
            E7.setText(df.format(e7));
        }

        TextView E8 = findViewById(R.id.e8);
        E8.setText(e8);

        TextView F1 = findViewById(R.id.f1);
        F1.setText(f1);

        TextView F2 = findViewById(R.id.f2);
        F2.setText(String.valueOf(f2));

        TextView F3 = findViewById(R.id.f3);
        F3.setText(String.valueOf(f3));

        TextView F4 = findViewById(R.id.f4);
        F4.setText(df.format(f4));

        TextView F5 = findViewById(R.id.f5);
        F5.setText(df.format(f5));

        TextView F6 = findViewById(R.id.f6);
        F6.setText(f6);

        TextView F7 = findViewById(R.id.f7);
        if (f7 == 0) {
            F7.setText(null);
        } else {
            F7.setText(df.format(f7));
        }

        TextView F8 = findViewById(R.id.f8);
        F8.setText(f8);

        TextView G1 = findViewById(R.id.g1);
        G1.setText(g1);

        TextView G2 = findViewById(R.id.g2);
        G2.setText(String.valueOf(g2));

        TextView G3 = findViewById(R.id.g3);
        G3.setText(String.valueOf(g3));

        TextView G4 = findViewById(R.id.g4);
        G4.setText(df.format(g4));

        TextView G5 = findViewById(R.id.g5);
        G5.setText(df.format(g5));

        TextView G6 = findViewById(R.id.g6);
        G6.setText(g6);

        TextView G7 = findViewById(R.id.g7);
        if (g7 == 0) {
            G7.setText(null);
        } else {
            G7.setText(df.format(g7));
        }

        TextView G8 = findViewById(R.id.g8);
        G8.setText(g8);

        TextView H1 = findViewById(R.id.h1);
        H1.setText(h1);

        TextView H2 = findViewById(R.id.h2);
        H2.setText(String.valueOf(h2));

        TextView H3 = findViewById(R.id.h3);
        H3.setText(String.valueOf(h3));

        TextView H4 = findViewById(R.id.h4);
        H4.setText(df.format(h4));

        TextView H5 = findViewById(R.id.h5);
        H5.setText(df.format(h5));

        TextView H6 = findViewById(R.id.h6);
        H6.setText(h6);

        TextView H7 = findViewById(R.id.h7);
        if (h7 == 0) {
            H7.setText(null);
        } else {
            H7.setText(df.format(h7));
        }

        TextView H8 = findViewById(R.id.h8);
        H8.setText(h8);

        TextView I1 = findViewById(R.id.i1);
        I1.setText(i1);

        TextView I2 = findViewById(R.id.i2);
        I2.setText(String.valueOf(i2));

        TextView I3 = findViewById(R.id.i3);
        I3.setText(String.valueOf(i3));

        TextView I4 = findViewById(R.id.i4);
        I4.setText(df.format(i4));

        TextView I5 = findViewById(R.id.i5);
        I5.setText(df.format(i5));

        TextView I6 = findViewById(R.id.i6);
        I6.setText(i6);

        TextView I7 = findViewById(R.id.i7);
        if (i7 == 0) {
            I7.setText(null);
        } else {
            I7.setText(df.format(i7));
        }

        TextView I8 = findViewById(R.id.i8);
        I8.setText(i8);

        TextView Z1 = findViewById(R.id.z1);
        String chiange = intent.getStringExtra("z1");
        Z1.setText(String.format("Chiange at Km %s", chiange));

        TextView Z2 = findViewById(R.id.z2);
        Z2.setText(String.format("Weight :: %s gms", i3));

        MovableFloatingActionButton movableFloatingActionButton = findViewById(R.id.fab);
        movableFloatingActionButton.setOnClickListener(v -> buttonScreenshot());

    }

    public void buttonScreenshot() {

        TableLayout view1 = findViewById(R.id.table);

        Bitmap bitmap = Bitmap.createBitmap(view1.getWidth(), view1.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        view1.draw(canvas);
        String fileName = System.currentTimeMillis() + ".jpg";
        File fileScreenshot = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),
                fileName);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileScreenshot);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            Toast.makeText(this, "File saved to downloads", Toast.LENGTH_SHORT).show();
            fileOutputStream.close();
        } catch (Exception e) {
            Log.e(TAG, e.toString());
        }
    }
}
