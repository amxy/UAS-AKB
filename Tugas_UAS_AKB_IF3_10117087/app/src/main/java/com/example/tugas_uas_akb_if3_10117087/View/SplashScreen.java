package com.example.tugas_uas_akb_if3_10117087.View;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


import com.example.tugas_uas_akb_if3_10117087.MainActivity;
import com.example.tugas_uas_akb_if3_10117087.R;

/** NIM : 10117087
   Nama : AhmadMaula
   Kelas : IF-3
 **/



public class SplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3010L); //3000 L = 3 detik

    }
}
