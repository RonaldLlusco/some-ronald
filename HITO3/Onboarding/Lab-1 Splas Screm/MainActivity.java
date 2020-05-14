package com.example.splashanimationparking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView logo;
    public TextView txtb,txtc,txtn1,txt2;
    public Animation ani,ani2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inilogo();
        initializeAnimation();

        createAnmationForLogo();

        //------new activity
        final Intent i = new Intent(this,calculadora.class);
        //-----
        Thread timer = new Thread(){
            public void run()
            {
                try{
                    sleep(5000);
                }catch (InterruptedException x)
                {
                    x.printStackTrace();
                }
                finally {
                        startActivity(i);
                        finish();
                }
            }
        };
        timer.start();


    }
    public void initializeAnimation() {
        txtb= findViewById(R.id.textbien);
        txtc=findViewById(R.id.txtcar);
      //  txtn1=findViewById(R.id.tvNumber1);
        ani = AnimationUtils.loadAnimation(this, R.anim.animationlogo);
        ani2 = AnimationUtils.loadAnimation(this,R.anim.animation2);
    }

    private void createAnmationForLogo() {

        txtb.startAnimation(ani);
        txtc.startAnimation(ani2);
        //txtn1.startAnimation(ani2);
    }
    private  void inilogo()
    {
        logo=findViewById(R.id.imgLogo);
        logo.animate().translationY(-600).setDuration(1200).setStartDelay(300);

    }




}
