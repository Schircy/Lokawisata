package com.lokawisata;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.fragment.app.FragmentActivity;

public class DetailActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Deklarasi id item
        ImageView back = findViewById(R.id.viewBack);

        // Click Listener
        back.setOnClickListener(v -> {
            // Pindah Activity
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        });
    }
}