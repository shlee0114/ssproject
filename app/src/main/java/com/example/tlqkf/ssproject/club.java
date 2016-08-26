package com.example.tlqkf.ssproject;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.health.UidHealthStats;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ViewFlipper;
import android.view.View.OnClickListener;

public class
club extends Activity implements OnClickListener {
    int A = 1;
    int b = 0;
    int c = 0;
    int d = 0;
    ViewFlipper view;
    boolean slide_open = false;
     boolean explanation = false;
    Animation slideleft,slideright,explanation_left,explanation_right;
    RelativeLayout slme;
    LinearLayout game,space,ubi,AGK,oche,CO_sing,band,ebenesel,dron,AR_VR,IOT,_3d_print;
    Button button,button2,mhp,mp,club,rv,fd9,left,right;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.club);
        CO_sing = (LinearLayout)findViewById(R.id.CO_sing);
        band = (LinearLayout)findViewById(R.id.band);
        ebenesel = (LinearLayout)findViewById(R.id.ebenesel);
        dron = (LinearLayout)findViewById(R.id.drone);
        AR_VR = (LinearLayout)findViewById(R.id.AR_VR);
        IOT = (LinearLayout)findViewById(R.id.IOT);
        _3d_print = (LinearLayout)findViewById(R.id._3D_print);
        oche = (LinearLayout)findViewById(R.id.oche);
            AGK = (LinearLayout)findViewById(R.id.AGK);
            game = (LinearLayout)findViewById(R.id.game);
            space = (LinearLayout)findViewById(R.id.space);
            ubi = (LinearLayout)findViewById(R.id.ubi);
        left = (Button) findViewById(R.id.Btn1);
        right = (Button) findViewById(R.id.Btn2);
        left.setText("4차산업동아리");
        right.setText("비전공동아리");
        view = (ViewFlipper)findViewById(R.id.viewFlipper1);
        left.setOnClickListener(this);
        right.setOnClickListener(this);
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
        explanation_left = AnimationUtils.loadAnimation(this,R.anim.explanation_left);
        explanation_right = AnimationUtils.loadAnimation(this,R.anim.explanation_right);
        SlidingPageAnimationListener animListener = new SlidingPageAnimationListener();
        slideleft.setAnimationListener(animListener);
        slideright.setAnimationListener(animListener);
        explanation_right.setAnimationListener(animListener);
        explanation_left.setAnimationListener(animListener);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MainActivity.class);
        if (b >= 0) {
            b--;
            dron.startAnimation(explanation_right);
                    IOT.startAnimation(explanation_right);
            CO_sing.startAnimation(explanation_right);
                    band.startAnimation(explanation_right);
            ebenesel.startAnimation(explanation_right);
                    AR_VR.startAnimation(explanation_right);
            dron.setEnabled(false);
                    IOT.setEnabled(false);
            CO_sing.setEnabled(false);
                    band.setEnabled(false);
            ebenesel.setEnabled(false);
                    AR_VR.setEnabled(false);
            dron.setClickable(false);
                    IOT.setClickable(false);
            CO_sing.setClickable(false);
                    band.setClickable(false);
            ebenesel.setClickable(false);
                    AR_VR.setClickable(false);
            dron.setVisibility(View.GONE);
            IOT.setVisibility(View.GONE);
            CO_sing.setVisibility(View.GONE);
            band.setVisibility(View.GONE);
            ebenesel.setVisibility(View.GONE);
            AR_VR.setVisibility(View.GONE);
            oche.setVisibility(View.GONE);
            oche.setClickable(false);
            oche.startAnimation(explanation_right);
            oche.setEnabled(false);
            _3d_print.setEnabled(false);
            _3d_print.setVisibility(View.GONE);
            _3d_print.setClickable(false);
            _3d_print.startAnimation(explanation_right);
            game.setVisibility(View.GONE);
            game.setClickable(false);
            game.startAnimation(explanation_right);
            space.setVisibility(View.GONE);
            space.setClickable(false);
            space.startAnimation(explanation_right);
            ubi.setVisibility(View.GONE);
            ubi.setClickable(false);
            ubi.startAnimation(explanation_right);
            ubi.setEnabled(false);
            space.setEnabled(false);
            game.setEnabled(false);
            AGK.setVisibility(View.GONE);
            AGK.setClickable(false);
            AGK.startAnimation(explanation_right);
            AGK.setEnabled(false);
        } else if (c >= 1) {
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
            overridePendingTransition(R.anim.huwa,R.anim.hau);
startActivity(intent);
            this.finish();
        }
    }
    public void OnClick (View v) {
        Intent intent3 = new Intent(this, MainActivity.class);
        Intent intent = new Intent(this, minihome.class);
        Intent intent2 = new Intent(this, club.class);
        Intent intent1 = new Intent(this, map.class);
        Intent intent4 = new Intent(this, road_view.class);
        if (slide_open) {
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
            c--;
        }
        else {
            fd9.setClickable(true);
            mhp.setClickable(true);
            mp.setClickable(true);
            club.setClickable(true);
            rv.setClickable(true);
            slme.setClickable(true);
            slme.setVisibility(View.VISIBLE);
            slme.startAnimation(slideleft);
            slme.setEnabled(true);
            slide_open = true;
            c++;
        }
        switch (v.getId()) {

            case R.id.button9:
                startActivity(intent3);
                overridePendingTransition(R.anim.huwa,R.anim.hau);
                b=0;
                c=0;
                this.finish();
                break;
            case R.id.button8:
                startActivity(intent2);
                overridePendingTransition(R.anim.huwa,R.anim.hau);
                b=0;
                c=0;
                this.finish();
                break;
            case R.id.button11:
                startActivity(intent1);
                overridePendingTransition(R.anim.huwa,R.anim.hau);
                b=0;
                c=0;
                this.finish();
                break;
            case R.id.button10:
                startActivity(intent);
                b=0;
                c=0;
                overridePendingTransition(R.anim.huwa,R.anim.hau);
                this.finish();
                break;
            case R.id.button13:
                overridePendingTransition(R.anim.huwa,R.anim.hau);
                startActivity(intent4);
                b=0;
                c=0;
                this.finish();
                break;
        }
    }
    @Override
    public void onClick(View v) {
        if (v == right ) {
            //다음장면 전환 , 왼쪽이동 애니메이션
            view.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.push_right_in));
            view.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.push_right_out));
            view.showNext();
            if (A >= 3) {
                A = 1;
            } else if (A < 3)
            {
                A++;
            }
        }else if (v == left) {
            // 이전장면 전환 , 오른쪽이동 애니메이션
            view.setInAnimation(AnimationUtils.loadAnimation(this, R.anim.push_left_in));
            view.setOutAnimation(AnimationUtils.loadAnimation(this, R.anim.push_left_out));
            view.showPrevious();
            if (A <= 1) {
                A = 3;
            } else if (A > 1)
            {
                A--;
            }
        }
        if(A == 1) {
            left.setText("4차산업동아리");
            right.setText("비전공동아리");
        } else if (A == 2) {
            left.setText("전공동아리");
            right.setText("4차산업동아리");
        } else if (A == 3) {
            left.setText("비전공동아리");
            right.setText("전공동아리");
        }
    }
    public void ncl(View v){
        if(b >1)
            b=1;
        switch (v.getId()){
            case R.id.oche_:
                b=1;
                oche.setVisibility(View.VISIBLE);
                oche.setClickable(true);
                oche.startAnimation(explanation_left);
                oche.setEnabled(true);
                break;

            case R.id.CO_sing_:
                b=1;
                CO_sing.setVisibility(View.VISIBLE);
                CO_sing.setClickable(true);
                CO_sing.startAnimation(explanation_left);
                CO_sing.setEnabled(true);
                break;

            case R.id.band_:
                band.setEnabled(true);
                band.setVisibility(View.VISIBLE);
                band.setClickable(true);
                band.startAnimation(explanation_left);
                b++;
                break;
            case R.id.ebenesel_:
                ebenesel.setEnabled(true);
                ebenesel.setVisibility(View.VISIBLE);
                ebenesel.setClickable(true);
                ebenesel.startAnimation(explanation_left);
                b=1;
                break;
            case R.id.drone_:
                b=1;
                dron.setVisibility(View.VISIBLE);
                dron.setClickable(true);
                dron.startAnimation(explanation_left);
                dron.setEnabled(true);
                break;

            case R.id.AR_VR_:
                AR_VR.setVisibility(View.VISIBLE);
                AR_VR.setClickable(true);
                AR_VR.startAnimation(explanation_left);
                b=1;
                AR_VR.setEnabled(true);
                break;

            case R.id.IOT_:
                IOT.setEnabled(true);
                IOT.setVisibility(View.VISIBLE);
                IOT.setClickable(true);
                IOT.startAnimation(explanation_left);
                b=1;
                break;


            case R.id._3D_print_:
                _3d_print.setEnabled(true);
                _3d_print.setVisibility(View.VISIBLE);
                _3d_print.setClickable(true);
                _3d_print.startAnimation(explanation_left);
                b++;
                break;
            case R.id.game_:
                b++;
                game.setVisibility(View.VISIBLE);
                game.setClickable(true);
                game.startAnimation(explanation_left);
                game.setEnabled(true);
                break;

            case R.id.space_:
                space.setVisibility(View.VISIBLE);
                space.setClickable(true);
                space.startAnimation(explanation_left);
              b++;
                space.setEnabled(true);
                break;

            case R.id.ubi_:
                ubi.setEnabled(true);
                ubi.setVisibility(View.VISIBLE);
                ubi.setClickable(true);
                ubi.startAnimation(explanation_left);
                b++;
                break;
            case R.id.AGK_:
                AGK.setEnabled(true);
                AGK.setVisibility(View.VISIBLE);
                AGK.setClickable(true);
                AGK.startAnimation(explanation_left);
                b++;
                break;
        }
    }
    private class SlidingPageAnimationListener implements Animation.AnimationListener {
        public void onAnimationEnd(Animation animation){

        }
        @Override
        public void  onAnimationStart(Animation animation){
        }
        @Override
        public void onAnimationRepeat(Animation animation){
        }
    }

}
