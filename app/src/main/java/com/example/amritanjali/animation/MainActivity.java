package com.example.amritanjali.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void  zoom(View View){
        ImageView i=(ImageView)findViewById(R.id.i);
        Animation a1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.myanimation);
        i.startAnimation(a1);

    }

    public void clockwise(View view) {
        ImageView i=(ImageView)findViewById(R.id.i);
        Animation a1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.clockwise);
        i.startAnimation(a1);

    }
    public void Fade(View view) {
        ImageView i=(ImageView)findViewById(R.id.i);
        Animation a1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
        i.startAnimation(a1);
    }
    public void blink(View view) {
        ImageView i=(ImageView)findViewById(R.id.i);
        Animation a1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        i.startAnimation(a1);
    }
    public void slide(View view) {
        ImageView i=(ImageView)findViewById(R.id.i);
        Animation a1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
        i.startAnimation(a1);
    }
    public void move(View view) {
        ImageView i=(ImageView)findViewById(R.id.i);
        Animation a1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        i.startAnimation(a1);

    }

}
