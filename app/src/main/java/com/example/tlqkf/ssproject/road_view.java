package com.example.tlqkf.ssproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class road_view extends AppCompatActivity {
    boolean slide_open = false;
    Animation slideleft;
    Animation slideright;
    RelativeLayout slme;
    Button button;
    Button button2;
    Button mhp;
    Button mp;
    Button club;
    Button rv;
    Button fd9;
    int c = 0 ;
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        if (c >= 1) {
            c--;
            fd9.setClickable(false);
            mhp.setClickable(false);
            mp.setClickable(false);
            club.setClickable(false);
            rv.setClickable(false);
            slme.setVisibility(View.GONE);
            slme.setClickable(false);
            slme.startAnimation(slideright);
            slme.setEnabled(false);
            slme.setVisibility(View.GONE);
            slme.setClickable(false);
            slide_open = false;

        }
        else{
            finish();
            overridePendingTransition(R.anim.huwa,R.anim.hau);
            startActivity(intent);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.road_view);
        button = (Button) findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button1);
        mhp = (Button)findViewById(R.id.button10);
        mp = (Button)findViewById(R.id.button11);
        club = (Button)findViewById(R.id.button8);
        rv = (Button)findViewById(R.id.button13);
        fd9 = (Button)findViewById(R.id.button9);
        slme = (RelativeLayout) findViewById(R.id.slme);
        slideleft = AnimationUtils.loadAnimation(this,R.anim.slide_left);
        slideright = AnimationUtils.loadAnimation(this,R.anim.slide_right);
        SlidingPageAnimationListener animListener = new SlidingPageAnimationListener();
        slideleft.setAnimationListener(animListener);
        slideright.setAnimationListener(animListener);
    }
    public void onClick(View v){
        Intent intent3 = new Intent(this, MainActivity.class);
        Intent intent=new Intent(this,minihome.class);
        Intent intent2=new Intent(this,club.class);
        Intent intent1=new Intent(this,map.class);
        Intent intent4=new Intent(this,road_view.class);
        if(slide_open){
            fd9.setClickable(false);
            mhp.setClickable(false);
            mp.setClickable(false);
            club.setClickable(false);
            rv.setClickable(false);
            slme.setVisibility(View.GONE);
            slme.setClickable(false);
            slme.startAnimation(slideright);
        c--;
        }
        else{
            c++;
            fd9.setClickable(true);
            mhp.setClickable(true);
            mp.setClickable(true);
            club.setClickable(true);
            rv.setClickable(true);
            slme.setClickable(true);
            slme.setVisibility(View.VISIBLE);
            slme.startAnimation(slideleft);
        }
        switch (v.getId()){
            case R.id.button9:
                startActivity(intent3);
                overridePendingTransition(R.anim.huwa,R.anim.hau);
                this.finish();
                break;
            case R.id.button8:
                startActivity(intent2);
                overridePendingTransition(R.anim.huwa,R.anim.hau);
                this.finish();
                break;
            case R.id.button11:
                startActivity(intent1);
                overridePendingTransition(R.anim.huwa,R.anim.hau);
                this.finish();
                break;
            case R.id.button10:
                startActivity(intent);
                overridePendingTransition(R.anim.huwa,R.anim.hau);
                this.finish();
                break;
            case R.id.button13:
                startActivity(intent4);
                this.finish();
                overridePendingTransition(R.anim.huwa,R.anim.hau);
                break;
        }
    }
    public void OnClick(View v){
        Intent intent=new Intent(this,minihome.class);
        Intent intent1=new Intent(this,map.class);
        Intent intent3=new Intent(this,club.class);
        Intent intent4=new Intent(this,road_view.class);
        switch (v.getId()){
            case R.id.button2:
                startActivity(intent);
                break;
            case R.id.button3:
                startActivity(intent1);
                break;
            case R.id.button5:
                startActivity(intent3);
                break;
            case R.id.button6:
                startActivity(intent4);
                break;
        }
    }

    private class SlidingPageAnimationListener implements Animation.AnimationListener {

        public void onAnimationEnd(Animation animation){
            if(slide_open) {
                slme.setEnabled(false);
                slme.setVisibility(View.GONE);
                slme.setClickable(false);
                slide_open = false;
            }else{
                slme.setEnabled(true);
                slme.setVisibility(View.VISIBLE);
                slme.setClickable(true);
                slide_open = true;
            }
        }
        @Override
        public void  onAnimationStart(Animation animation){
        }
        @Override
        public void onAnimationRepeat(Animation animation){

        }

    }
}