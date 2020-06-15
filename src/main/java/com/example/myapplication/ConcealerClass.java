package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ConcealerClass extends AppCompatActivity {
    //variable
    Animation slide_down;
    ImageView background_image;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.concealer_page);

        slide_down = AnimationUtils.loadAnimation(this, R.anim.slide_down);
        background_image = findViewById(R.id.background_image);
        background_image.setAnimation(slide_down);

        ImageView home= findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ConcealerClass.this, DashBoard.class));
            }
        });
    }
}
