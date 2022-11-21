package com.keturahedwards.cleanskin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;


public class DashBoard extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dash_board);
        //image buttons
        ImageView makeup = findViewById(R.id.makeup_page);
        ImageView skincare = findViewById(R.id.skin_care_page);
        ImageView cruelty = findViewById(R.id.cruelty_free);
        ImageView parabenFree = findViewById(R.id.paraben_free);
        ImageView recycle = findViewById(R.id.recycle);

        makeup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoard.this, AddNewMakeup.class));
            }
        });
        skincare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoard.this, AddNewSkinCare.class));
            }
        });
        cruelty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoard.this, CrueltyFree.class));
            }
        });
        parabenFree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoard.this, ParabenFree.class));
            }
        });
        recycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashBoard.this, Recycle.class));
            }
        });
    }
}