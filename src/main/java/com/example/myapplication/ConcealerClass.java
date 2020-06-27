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
    Animation zoom_in;
    ImageView background_image;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.concealer_page);

        zoom_in = AnimationUtils.loadAnimation(this, R.anim.slide_down);
        background_image = findViewById(R.id.background);
        background_image.setAnimation(zoom_in);

        ImageView home = findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ConcealerClass.this, DashBoard.class));
            }
        });
        //calendar button action
    }
}
