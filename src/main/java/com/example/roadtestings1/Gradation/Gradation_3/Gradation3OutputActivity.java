package com.example.roadtestings1.Gradation.Gradation_3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.roadtestings1.MovableFloatingActionButton;
import com.example.roadtestings1.R;

import java.io.File;
import java.io.FileOutputStream;
import java.text.DecimalFormat;

import androidx.appcompat.app.AppCompatActivity;

import static android.content.ContentValues.TAG;

public class Gradation3OutputActivity extends AppCompatActivity {
  private static final DecimalFormat df = new DecimalFormat("0.00");

  String a1, b1, c1, d1;
  String a6, b6, c6, d6;
  double a7, b7, c7, d7;
  String a8, b8, c8, d8;

  int a2, b2, c2, d2;
  int a3, b3, c3, d3;

  double a4, a5,
    b4, b5,
    c4, c5,
    d4, d5;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.table_output);

    TableRow row9 = findViewById(R.id.row9);
    row9.setVisibility(View.GONE);

    View view10 = findViewById(R.id.view10);
    view10.setVisibility(View.GONE);

    TableRow row8 = findViewById(R.id.row8);
    row8.setVisibility(View.GONE);

    View view9 = findViewById(R.id.view9);
    view9.setVisibility(View.GONE);

    TableRow row7 = findViewById(R.id.row7);
    row7.setVisibility(View.GONE);

    View view8 = findViewById(R.id.view8);
    view8.setVisibility(View.GONE);

    TableRow row6 = findViewById(R.id.row6);
    row6.setVisibility(View.GONE);

    View view7 = findViewById(R.id.view7);
    view7.setVisibility(View.GONE);

    TableRow row5 = findViewById(R.id.row5);
    row5.setVisibility(View.GONE);

    View view6 = findViewById(R.id.view6);
    view6.setVisibility(View.GONE);

    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
      WindowManager.LayoutParams.FLAG_FULLSCREEN);

    if (getSupportActionBar() != null) {
      getSupportActionBar().hide();
    }

    a1 = "53.00";
    b1 = "26.5";
    c1 = "4.75";
    d1 = "75μ";

    Intent intent = getIntent();
    a2 = Integer.parseInt(intent.getStringExtra("a2"));
    b2 = Integer.parseInt(intent.getStringExtra("b2"));
    c2 = Integer.parseInt(intent.getStringExtra("c2"));
    d2 = Integer.parseInt(intent.getStringExtra("d2"));

    a3 = a2;
    b3 = a3 + b2;
    c3 = b3 + c2;
    d3 = c3 + d2;

    a4 = a3 * 100.0 / d3;
    b4 = b3 * 100.0 / d3;
    c4 = c3 * 100.0 / d3;
    d4 = d3 * 100.0 / d3;

    a5 = 100 - a4;
    b5 = 100 - b4;
    c5 = 100 - c4;
    d5 = 100 - d4;

    a6 = "100";
    b6 = "55-75";
    c6 = "10-30";
    d6 = "0-5";

    a7 = b7 = c7 = d7 = 0;
    a8 = b8 = c8 = d8 = null;

    if (a5 < 100) {
      a7 = 100 - a5;
      a8 = "O/s";
    }

    if (b5 < 55) {
      b7 = 55 - b5;
      b8 = "O/s";
    } else if (b5 > 75) {
      b7 = b5 - 75;
      b8 = "U/s";
    }

    if (c5 < 10) {
      c7 = 10 - c5;
      c8 = "O/s";
    } else if (c5 > 30) {
      c7 = c5 - 30;
      c8 = "U/s";
    }

    if (d5 > 5) {
      d7 = d5 - 5;
      d8 = "U/s";
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

    TextView Z1 = findViewById(R.id.z1);
    String chiange = intent.getStringExtra("z1");
    Z1.setText(String.format("Chiange at Km %s", chiange));

    TextView Z2 = findViewById(R.id.z2);
    Z2.setText(String.format("Weight :: %s gms", d3));

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

