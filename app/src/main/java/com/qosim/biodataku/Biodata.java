package com.qosim.biodataku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        Animation anim_clockwise = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        ImageView logo_launcher = findViewById(R.id.logo_launcher);

        anim_clockwise.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(getApplicationContext(), InputActivity.class));
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        logo_launcher.startAnimation(anim_clockwise);
    }
}


