package com.lokawisata;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.widget.Button;

import androidx.annotation.Nullable;

public class MainActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Deklarasi ID
        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);
        Button button3 = findViewById(R.id.btn3);
        Button button4 = findViewById(R.id.btn4);
        Button button5 = findViewById(R.id.btn5);

        // Click Listener - Pindah Activity Button 1 - 5
        button1.setOnClickListener(v -> {
            Intent intent = new Intent(this, BahariActivity.class);
            startActivity(intent);
            finish();
        });

        button2.setOnClickListener(v -> {
            Intent intent = new Intent(this, BudayaActivity.class);
            startActivity(intent);
            finish();
        });

        button3.setOnClickListener(v -> {
            Intent intent = new Intent(this, AgroActivity.class);
            startActivity(intent);
            finish();
        });

        button4.setOnClickListener(v -> {
            Intent intent = new Intent(this, KulinerActivity.class);
            startActivity(intent);
            finish();
        });

        button5.setOnClickListener(v -> {
            Intent intent = new Intent(this, CagarAlamActivity.class);
            startActivity(intent);
            onDestroy();
        });

    }
}
