package com.example.roadtestings1.Density;

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

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.roadtestings1.MovableFloatingActionButton;
import com.example.roadtestings1.R;

import java.io.File;
import java.io.FileOutputStream;

public class DensityOutputActivity extends AppCompatActivity {

    TextView a3, b3, c3, d3, e3, f3, g3, h3, i3, j3, k3, l3, z3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.density_output);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        z3 = findViewById(R.id.z3);

        a3 = findViewById(R.id.a3);
        b3 = findViewById(R.id.b3);
        c3 = findViewById(R.id.c3);
        d3 = findViewById(R.id.d3);
        e3 = findViewById(R.id.e3);
        f3 = findViewById(R.id.f3);
        g3 = findViewById(R.id.g3);
        h3 = findViewById(R.id.h3);
        i3 = findViewById(R.id.i3);
        j3 = findViewById(R.id.j3);
        k3 = findViewById(R.id.k3);
        l3 = findViewById(R.id.l3);

        Intent intent = getIntent();
        String sample = "Sample at KM " + intent.getStringExtra("a2");
        z3.setText(sample);
        a3.setText(intent.getStringExtra("b2"));
        b3.setText(intent.getStringExtra("c2"));
        c3.setText(intent.getStringExtra("d2"));
        d3.setText(intent.getStringExtra("e2"));
        e3.setText(intent.getStringExtra("f2"));
        f3.setText(intent.getStringExtra("g2"));
        g3.setText(intent.getStringExtra("h2"));
        h3.setText(intent.getStringExtra("i2"));
        i3.setText(intent.getStringExtra("j2"));
        j3.setText(intent.getStringExtra("k2"));
        k3.setText(intent.getStringExtra("l2"));
        l3.setText(intent.getStringExtra("m2"));

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

