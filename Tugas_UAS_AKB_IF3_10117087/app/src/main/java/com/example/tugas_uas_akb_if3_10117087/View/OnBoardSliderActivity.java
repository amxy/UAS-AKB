package com.example.tugas_uas_akb_if3_10117087.View;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.example.tugas_uas_akb_if3_10117087.MainActivity;
import com.example.tugas_uas_akb_if3_10117087.R;
import com.hololo.tutorial.library.Step;
import com.hololo.tutorial.library.TutorialActivity;

/** NIM : 10117087
   Nama : AhmadMaula
   Kelas : IF-3
 **/


public class OnBoardSliderActivity extends TutorialActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        addFragment(new Step.Builder().setTitle("Travel List")
                .setContent("displays a list of tourist destinations")
                .setBackgroundColor(Color.parseColor("#0d132b")) // int background color
                .setDrawable(R.drawable.sac) // int top drawable
                .build());
        addFragment(new Step.Builder().setTitle("Travel Description")
                .setContent("About the Destination")
                .setBackgroundColor(Color.parseColor("#1e2d34")) // int background color
                .setDrawable(R.drawable.dvc) // int top drawable
                .build());
        addFragment(new Step.Builder().setTitle("Find the Location")
                .setContent("Visit easily")
                .setBackgroundColor(Color.parseColor("#00c8b7")) // int background color
                .setDrawable(R.drawable.csf) // int top drawable
                .build());
        setCancelText("Skip");

    }

    @Override
    public void finishTutorial() {
        super.finishTutorial();
        Intent intent = new Intent(OnBoardSliderActivity.this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void currentFragmentPosition(int position) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
