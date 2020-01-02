package com.dscproject.cantinplusplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashAct extends AppCompatActivity {
    Animation fade_in;
    ImageView app_logo;
    TextView app_title, app_subtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Load Animation
        fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        //Load Element
        app_logo = findViewById(R.id.app_logo);
        app_title = findViewById(R.id.app_title);
        app_subtitle = findViewById(R.id.app_subtitle);

        app_logo.startAnimation(fade_in);
        app_title.startAnimation(fade_in);
        app_subtitle.startAnimation(fade_in);

        //Setting timer untuk 2 detik
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
            //Merubah activity ke activity lain
            Intent gotosignin = new Intent(SplashAct.this, SignInAct.class);
            startActivity(gotosignin);
            finish();
            }
        }, 2000); //2000ms = 2s
    }
}
