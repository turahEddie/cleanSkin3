package com.keturahedwards.cleanskin;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AddNewMakeup extends AppCompatActivity  {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.add_new_makeup);
        final LinearLayout councealer = findViewById(R.id.concealer_btn);
        LinearLayout foundation = findViewById(R.id.foundation_btn);
        LinearLayout lipstick = findViewById(R.id.lipstick_btn);
        LinearLayout lipgloss = findViewById(R.id.lipgloss_btn);
        LinearLayout browPencil = findViewById(R.id.browPencil_btn);
        LinearLayout mascara = findViewById(R.id.mascara_btn);
        LinearLayout eyeshadow = findViewById(R.id.eyeshadow_btn);
        LinearLayout blush = findViewById(R.id.blush_btn);
        LinearLayout powder = findViewById(R.id.powder_btn);
        ImageView home = findViewById(R.id.home);
        Button add = findViewById(R.id.add);

        //return home
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddNewMakeup.this, DashBoard.class));
            }
        });
        //calender button---------------------------------------------------------------------

//onCLick for the makeup -----------------------------------------------------------------------------------------
        councealer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddNewMakeup.this, ConcealerClass.class));
            }
        });
        foundation.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(AddNewMakeup.this, FoundationClass.class));
            }
        });
        lipstick.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                startActivity(new Intent(AddNewMakeup.this, LipstickClass.class));
            }
        });
        lipgloss.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(AddNewMakeup.this, LipGloss.class));
            }
        });
        browPencil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(AddNewMakeup.this, BrowPencil.class));
            }
        });
        mascara.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               startActivity(new Intent(AddNewMakeup.this, Mascara.class));
            }
        });
        eyeshadow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(AddNewMakeup.this, Eyeshadow.class));
            }
        });
        blush.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               startActivity(new Intent(AddNewMakeup.this, Blush.class));
            }
        });
        powder.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(AddNewMakeup.this, Powder.class));
            }
        });
    }
}
