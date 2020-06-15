package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class AddNewMakeup extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.add_new_makeup);
        LinearLayout councealer = findViewById(R.id.counceler_btn);
        LinearLayout foundation = findViewById(R.id.foundation_btn);
        LinearLayout lipstick = findViewById(R.id.lipstick_btn);
        LinearLayout lipgloss = findViewById(R.id.lipgloss_btn);
        LinearLayout browPencil = findViewById(R.id.brow_btn);
        LinearLayout mascara = findViewById(R.id.mascara_btn);
        LinearLayout eyeshadow = findViewById(R.id.eyeshadow_btn);
        LinearLayout blush = findViewById(R.id.blush_btn);
        LinearLayout poweder = findViewById(R.id.powder_btn);


        councealer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AddNewMakeup.this, ConcealerClass.class));
            }
        });
    }
}
