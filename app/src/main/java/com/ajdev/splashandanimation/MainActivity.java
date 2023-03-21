package com.ajdev.splashandanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imgv;
        //imgv = findViewById(R.id);

        Animation rotat = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
       // imgv.startAnimation(rotat);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(mainIntent);
                finish();
            }
        }, 5000); // 3 seconds

    }
}