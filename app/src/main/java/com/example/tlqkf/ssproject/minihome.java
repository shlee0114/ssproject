package com.example.tlqkf.ssproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by tlqkf on 2016-07-24.
 */
public class minihome extends AppCompatActivity {
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
            this.finish();
            overridePendingTransition(R.anim.huwa,R.anim.hau);
            startActivity(intent);
        }
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.minihome);
        button = (Button) findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button15);
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
        Button Ga_Zun_Ho_T = (Button) findViewById(R.id.ga_zun_ho_T);
        Button Gang_man_hei_T = (Button) findViewById(R.id.gang_man_hei_T);
        Button kim_sun_sang_T = (Button) findViewById(R.id.kim_sun_sang_T);
        Button kim_young_kuk_T = (Button) findViewById(R.id.kim_young_kuk_T);
        Button pak_un_guyng_T = (Button) findViewById(R.id.pak_un_gung_T);
        Button sin_so_young_T = (Button) findViewById(R.id.sin_so_young_T);
        Button lee_mee_za_T = (Button) findViewById(R.id.lee_mee_za_T);
        Button lee_min_zu_T = (Button) findViewById(R.id.lee_min_zu_T);
        Button lee_buyng_chan_T = (Button) findViewById(R.id.lee_bung_chang_T);
        Button lee_young_kuk_T = (Button) findViewById(R.id.lee_young_kuk_T);
        Button chei_un_young = (Button) findViewById(R.id.choe_un_young_T);
        Button hwang_bo_hyun_T = (Button) findViewById(R.id.hoang_bo_huyn_T);
        Button hwang_han_mo_T = (Button) findViewById(R.id.haong_han_mo_T);
        Gang_man_hei_T.setOnClickListener(T);
        Ga_Zun_Ho_T.setOnClickListener(T);
        kim_sun_sang_T.setOnClickListener(T);
        kim_young_kuk_T.setOnClickListener(T);
        pak_un_guyng_T.setOnClickListener(T);
        sin_so_young_T.setOnClickListener(T);
        lee_mee_za_T.setOnClickListener(T);
        lee_buyng_chan_T.setOnClickListener(T);
        lee_min_zu_T.setOnClickListener(T);
        lee_young_kuk_T.setOnClickListener(T);
        chei_un_young.setOnClickListener(T);
        hwang_bo_hyun_T.setOnClickListener(T);
        hwang_han_mo_T.setOnClickListener(T);
    }

    Button.OnClickListener T =new Button.OnClickListener()
    {

        public void onClick (View v){
            Intent i = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.sdh.hs.kr/group/index.do?groupNo=411421"));
            Intent E = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.sdh.hs.kr/group/index.do?groupNo=32853"));
            Intent w = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.sdh.hs.kr/group/index.do?groupNo=32900"));
            Intent e = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.sdh.hs.kr/group/index.do?groupNo=32879"));
            Intent t = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.sdh.hs.kr/group/index.do?groupNo=377361"));
            Intent g = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.sdh.hs.kr/group/index.do?groupNo=377363"));
            Intent q = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.sdh.hs.kr/group/index.do?groupNo=32904"));
            Intent fq = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.sdh.hs.kr/group/index.do?groupNo=32899"));
            Intent r = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.sdh.hs.kr/group/index.do?groupNo=32892"));
            Intent fe = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.sdh.hs.kr/group/index.do?groupNo=32885"));
            Intent Ewe = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.sdh.hs.kr/group/index.do?groupNo=32905"));
            Intent dEwe = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.sdh.hs.kr/group/index.do?groupNo=32876"));
            Intent Ewwe = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://www.sdh.hs.kr/group/index.do?groupNo=377374"));


            switch (v.getId()) {
                case R.id.ga_zun_ho_T:
                    startActivity(i);
                    overridePendingTransition(R.anim.huwa,R.anim.hau);
                    break;
                case R.id.gang_man_hei_T:
                    startActivity(E);
                    overridePendingTransition(R.anim.huwa,R.anim.hau);
                    break;
                case R.id.kim_sun_sang_T:
                    startActivity(w);
                    overridePendingTransition(R.anim.huwa,R.anim.hau);
                    break;
                case R.id.kim_young_kuk_T:
                    startActivity(e);
                    overridePendingTransition(R.anim.huwa,R.anim.hau);
                    break;
                case R.id.pak_un_gung_T:
                    startActivity(t);
                    overridePendingTransition(R.anim.huwa,R.anim.hau);
                    break;
                case R.id.sin_so_young_T:
                    startActivity(g);
                    overridePendingTransition(R.anim.huwa,R.anim.hau);
                    break;
                case R.id.lee_mee_za_T:
                    startActivity(q);
                    overridePendingTransition(R.anim.huwa,R.anim.hau);
                    break;
                case R.id.lee_min_zu_T:
                    startActivity(fq);
                    overridePendingTransition(R.anim.huwa,R.anim.hau);
                    break;
                case R.id.lee_bung_chang_T:
                    startActivity(r);
                    overridePendingTransition(R.anim.huwa,R.anim.hau);
                    break;
                case R.id.lee_young_kuk_T:
                    startActivity(fe);
                    overridePendingTransition(R.anim.huwa,R.anim.hau);
                    break;
                case R.id.choe_un_young_T:
                    startActivity(Ewe);
                    overridePendingTransition(R.anim.huwa,R.anim.hau);

                    break;
                case R.id.hoang_bo_huyn_T:
                    startActivity(dEwe);
                    overridePendingTransition(R.anim.huwa,R.anim.hau);
                    break;
                case R.id.haong_han_mo_T:
                    startActivity(Ewwe);
                    overridePendingTransition(R.anim.huwa,R.anim.hau);
                    break;

            }

        }

    };
    public void onClick(View v) {
        Intent intent = new Intent(this, minihome.class);
        Intent intent2 = new Intent(this, club.class);
        Intent intent1 = new Intent(this, map.class);
        Intent intent3 = new Intent(this, MainActivity.class);
        Intent intent4=new Intent(this,road_view.class);
        if (slide_open) {
            fd9.setClickable(false);
            mhp.setClickable(false);
            mp.setClickable(false);
            club.setClickable(false);
            rv.setClickable(false);
            slme.setVisibility(View.GONE);
            slme.setClickable(false);
            slme.startAnimation(slideright);
            c--;
        } else {
            fd9.setClickable(true);
            mhp.setClickable(true);
            mp.setClickable(true);
            club.setClickable(true);
            rv.setClickable(true);
            slme.setClickable(true);
            slme.setVisibility(View.VISIBLE);
            slme.startAnimation(slideleft);
        c++;
        }
        switch (v.getId()) {
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
                overridePendingTransition(R.anim.huwa,R.anim.hau);
                startActivity(intent);
                this.finish();
                break;
            case R.id.button13:
                startActivity(intent4);
                overridePendingTransition(R.anim.huwa,R.anim.hau);
                this.finish();
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
