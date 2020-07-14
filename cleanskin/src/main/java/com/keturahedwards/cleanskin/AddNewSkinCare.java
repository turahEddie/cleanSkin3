package com.keturahedwards.cleanskin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class AddNewSkinCare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_add_new_skin_care);

        LinearLayout cleanser = findViewById(R.id.cleanser_btn);
        LinearLayout cream = findViewById(R.id.cream_btn);
        LinearLayout facemask = findViewById(R.id.mask_btn);
        LinearLayout lotion = findViewById(R.id.lotion_btn);
        LinearLayout perfume = findViewById(R.id.perfume_btn);
        LinearLayout serum = findViewById(R.id.serum_btn);
        LinearLayout sunscreen = findViewById(R.id.sunscreen_btn);
        LinearLayout toner = findViewById(R.id.toner_btn);
        LinearLayout treatment = findViewById(R.id.treatment_btn);
        ImageView home = findViewById(R.id.home);
        Button add = findViewById(R.id.add);

        //return home
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddNewSkinCare.this, DashBoard.class));
            }
        });

        cleanser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddNewSkinCare.this, Cleanser.class));
            }
        });
        cream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddNewSkinCare.this, Cream.class));
            }
        });
        facemask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddNewSkinCare.this, Facemask.class));
            }
        });
        lotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddNewSkinCare.this, Lotion.class));
            }
        });
        perfume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddNewSkinCare.this, Perfume.class));
            }
        });
        serum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddNewSkinCare.this, Serum.class));
            }
        });
        sunscreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddNewSkinCare.this, Sunscreen.class));
            }
        });
        toner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddNewSkinCare.this, Toner.class));
            }
        });
        treatment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddNewSkinCare.this, Treatment.class));
            }
        });

    }
}