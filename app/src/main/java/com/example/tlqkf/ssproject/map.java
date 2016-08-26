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


public class map extends AppCompatActivity {
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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

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
            this.finish();
            overridePendingTransition(R.anim.huwa,R.anim.hau);
            startActivity(intent);
        }
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
                this.finish();
                c=0;
                overridePendingTransition(R.anim.huwa,R.anim.hau);
                break;
            case R.id.button8:
                startActivity(intent2);
                this.finish();
                c=0;
                overridePendingTransition(R.anim.huwa,R.anim.hau);
                break;
            case R.id.button11:
                startActivity(intent1);
                this.finish();

                c=0;overridePendingTransition(R.anim.huwa,R.anim.hau);
                break;
            case R.id.button10:
                c=0;startActivity(intent);
                this.finish();
                overridePendingTransition(R.anim.huwa,R.anim.hau);
                break;
            case R.id.button13:
                c=0;startActivity(intent4);
                this.finish();
                overridePendingTransition(R.anim.huwa,R.anim.hau);
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
