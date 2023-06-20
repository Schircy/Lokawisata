package com.lokawisata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class KulinerActivity extends FragmentActivity {

    // Deklarasi Waktu Click Listener
    public final long delay = 250;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner);

        // TODO: Tambahkan: android:clickable="true"
        //                  android:focusable="true"
        //                  android:focusableInTouchMode="true"
        //       pada Layout XML untuk Setiap Item
        //       Supaya item nya bisa Di Click, Fokus/Terpilih, dan Fokus saat di Sentuh/Pointing
        //       Bisa menggunakan metode lain dengan Menggunakan:
        //       1. Deklarasikan ID Itemnya
        //       2. Item yang sudah terdeklarasi bisa tambahkan:
        //          contoh: cardView1.setClickable(true);   //Default: false
        //       Bisa tambahkan "set" lain, jika diperlukan

        // Deklarasi ID
        ImageView back = findViewById(R.id.viewBack);
        CardView cardView1 = findViewById(R.id.cvKuliner1);
        CardView cardView2 = findViewById(R.id.cvKuliner2);
        CardView cardView3 = findViewById(R.id.cvKuliner3);
        CardView cardView4 = findViewById(R.id.cvKuliner4);
        CardView cardView5 = findViewById(R.id.cvKuliner5);
        CardView cardView6 = findViewById(R.id.cvKuliner6);
        CardView cardView7 = findViewById(R.id.cvKuliner7);
        CardView cardView8 = findViewById(R.id.cvKuliner8);

        // Deklarasi Animasi jika Dipilih/Tidak terpilih
        Animator unSelectedAnimator = AnimatorInflater.loadAnimator(this,R.animator.unselected_item);
        Animator selectedAnimator = AnimatorInflater.loadAnimator(this,R.animator.selected_item);

        // Back Listener
        back.setOnFocusChangeListener((v, hasFocus) -> {    // Listener untuk Animasi saat di fokuskan
            if (hasFocus){
                selectedAnimator.setTarget(v);  // Jika Item terpilih, Gambar akan Membesar
                selectedAnimator.start();
            }
            else {
                unSelectedAnimator.setTarget(v);    // Jika Item tidak terpilih, akan kembali ke semula
                unSelectedAnimator.start();
            }
        });

        // Listener Jika di Click
        back.setOnClickListener(v -> {

            // Set Animasi jika di Click di API khusus v23 keatas untuk ImageView
            // Berganti Warna Foreground saat di Click
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                back.setForeground(getResources().getDrawable(R.color.white40));
            }

            // Waktu Delay Animasi Click untuk menghilang
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                new Handler().postDelayed(() -> back.setForeground(null),delay);
            }

            // Ganti Activity
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        });

        // Untuk Kebawahnya kode nya mirip seperti diatas untuk Listener" lain
        // Dengan perbedaan tidak ada khusus API v23 Keatas

        // Card View 1 Listener
        cardView1.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selectedAnimator.setTarget(v);
                selectedAnimator.start();
            }
            else {
                unSelectedAnimator.setTarget(v);
                unSelectedAnimator.start();
            }
        });
        cardView1.setOnClickListener(v -> {
            cardView1.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView1.setForeground(null),delay);

            Intent intent = new Intent(this,DetailActivity.class);
            startActivity(intent);
        });

        // Card View 2 Listener
        cardView2.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selectedAnimator.setTarget(v);
                selectedAnimator.start();
            } else {
                unSelectedAnimator.setTarget(v);
                unSelectedAnimator.start();
            }
        });
        cardView2.setOnClickListener(v -> {
            cardView2.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView2.setForeground(null),delay);
        });

        // Card View 3 Listener
        cardView3.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selectedAnimator.setTarget(v);
                selectedAnimator.start();
            } else {
                unSelectedAnimator.setTarget(v);
                unSelectedAnimator.start();
            }
        });
        cardView3.setOnClickListener(v -> {
            cardView3.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView3.setForeground(null),delay);
        });

        // Card View 4 Listener
        cardView4.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selectedAnimator.setTarget(v);
                selectedAnimator.start();
            } else {
                unSelectedAnimator.setTarget(v);
                unSelectedAnimator.start();
            }
        });
        cardView4.setOnClickListener(v -> {
            cardView4.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView4.setForeground(null),delay);
        });

        // Card View 5 Listener
        cardView5.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selectedAnimator.setTarget(v);
                selectedAnimator.start();
            } else {
                unSelectedAnimator.setTarget(v);
                unSelectedAnimator.start();
            }
        });
        cardView5.setOnClickListener(v -> {
            cardView5.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView5.setForeground(null),delay);
        });

        // Card View 6 Listener
        cardView6.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selectedAnimator.setTarget(v);
                selectedAnimator.start();
            } else {
                unSelectedAnimator.setTarget(v);
                unSelectedAnimator.start();
            }
        });
        cardView6.setOnClickListener(v -> {
            cardView6.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView6.setForeground(null),delay);
        });

        // Card View 7 Listener
        cardView7.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selectedAnimator.setTarget(v);
                selectedAnimator.start();
            } else {
                unSelectedAnimator.setTarget(v);
                unSelectedAnimator.start();
            }
        });
        cardView7.setOnClickListener(v -> {
            cardView7.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView7.setForeground(null),delay);
        });

        // Card View 8 Listener
        cardView8.setOnFocusChangeListener((v, hasFocus) -> {
            if (hasFocus){
                selectedAnimator.setTarget(v);
                selectedAnimator.start();
            } else {
                unSelectedAnimator.setTarget(v);
                unSelectedAnimator.start();
            }
        });
        cardView8.setOnClickListener(v -> {
            cardView8.setForeground(getResources().getDrawable(R.color.white40));

            new Handler().postDelayed(() -> cardView8.setForeground(null),delay);
        });
    }
}