package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    ImageView iv1;
    ImageView iv2;
    ImageView iv3;
    ImageView iv4;
    ImageView iv5;
    ImageView iv6;
    ImageView iv7;
    ImageView iv8;
    ImageView iv9;
    ImageView iv10;
    ImageView iv11;
    ImageView iv12;
    int count=0;
    int a=78;
    int b=2;
    int c=3;
    int d=4;
    int e=5;
    int f=6;
    int g=7;
    int h=8;
    int i=9;
    int j=10;
    int k=11;
    int l=12;
    boolean boo = false;
    boolean boo1 = false;
    boolean boo2 = false;
    boolean boo3 = false;
    boolean boo4 = false;
    boolean boo5 = false;
    boolean boo6 = false;
    boolean boo7 = false;
    boolean boo8 = false;
    boolean boo9 = false;
    boolean boo10 = false;
    boolean boo11 = false;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView) findViewById(R.id.iv);
        iv1 = (ImageView) findViewById(R.id.iv1);
        iv2 = (ImageView) findViewById(R.id.iv2);
        iv3 = (ImageView) findViewById(R.id.iv3);
        iv4 = (ImageView) findViewById(R.id.iv4);
        iv5 = (ImageView) findViewById(R.id.iv5);
        iv6 = (ImageView) findViewById(R.id.iv6);
        iv7 = (ImageView) findViewById(R.id.iv7);
        iv8 = (ImageView) findViewById(R.id.iv8);
        iv9 = (ImageView) findViewById(R.id.iv9);
        iv10 = (ImageView) findViewById(R.id.iv10);
        iv11 = (ImageView) findViewById(R.id.iv11);

        iv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                boo = !boo;
                if (boo==true) {

                    iv.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    a=1;

                }
                else if (boo==false) {

                    iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a = 0;
                }
                if(a==b){
                    a=54687;
                    b=21354;
                    count++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv.setVisibility(View.GONE);
                            iv7.setVisibility(View.GONE);
                        }
                    },1000);
                    if(count==6){
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                final Intent mainIntent = new Intent(MainActivity.this, Activity2.class);
                                startActivity(mainIntent);
                                finish();        // 當跳到另一 Activity 時，讓 MainActivity 結束。
                                // 這樣可以避免使用者按 back 後，又回到該 activity。
                            }
                        }, 2000);
                    }
                    //iv.setVisibility(View.GONE);
                    //iv1.setVisibility(View.GONE);
                }
                if(a==c){
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    boo=false;
                    c=3;
                    boo2=false;
                }
                if(a==d){
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    boo=false;
                    d=4;
                    boo3=false;
                }
                if(a==e){
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    boo=false;
                    e=5;
                    boo4=false;
                }
                if(a==f){
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    boo=false;
                    f=6;
                    boo5=false;
                }
                if(a==g){
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    boo=false;
                    g=7;
                    boo6=false;
                }
                if(a==h){
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    boo=false;
                    h=8;
                    boo7=false;
                }
                if(a==i){
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    boo=false;
                    i=9;
                    boo8=false;
                }
                if(a==j){
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    boo=false;
                    j=10;
                    boo9=false;
                }
                if(a==k){
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    boo=false;
                    k=11;
                    boo10=false;
                }if(a==l){
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    l=12;
                    boo=false;
                    boo11=false;
                }


            }
        });
        iv7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v7) {
                // TODO Auto-generated method stub
                boo1 = !boo1;
                if (boo1==true) {

                    iv7.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    b=1;


                }
                else if(boo1==false) {

                    iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    b=10;
                }
                if(a==b){
                    a=54687;
                    b=21354;
                    count++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv.setVisibility(View.GONE);
                            iv7.setVisibility(View.GONE);
                        }
                    },1000);
                    if(count==6){
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                final Intent mainIntent = new Intent(MainActivity.this, Activity2.class);
                                startActivity(mainIntent);
                                finish();        // 當跳到另一 Activity 時，讓 MainActivity 結束。
                                // 這樣可以避免使用者按 back 後，又回到該 activity。
                            }
                        }, 2000);
                    }
                    //iv.setVisibility(View.GONE);
                    //iv1.setVisibility(View.GONE);

                }
                if(b==c){
                    iv7.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    b=2;
                    c=3;
                    boo1=false;
                    boo2=false;
                }
                if(b==d){
                    iv7.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    b=2;
                    d=4;
                    boo1=false;
                    boo3=false;
                }
                if(b==e){
                    iv7.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    b=2;
                    e=5;
                    boo1=false;
                    boo4=false;
                }
                if(b==f){
                    iv7.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    b=2;
                    f=6;
                    boo1=false;
                    boo5=false;
                }
                if(b==g){
                    iv7.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    b=2;
                    g=7;
                    boo1=false;
                    boo6=false;
                }
                if(b==h){
                    iv7.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    b=2;
                    h=8;
                    boo1=false;
                    boo7=false;
                }
                if(b==i){
                    iv7.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    b=2;
                    i=9;
                    boo1=false;
                    boo8=false;
                }
                if(b==j){
                    iv7.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    b=2;
                    j=10;
                    boo1=false;
                    boo9=false;
                }
                if(b==k){
                    iv7.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    b=2;
                    k=11;
                    boo1=false;
                    boo10=false;
                }
                if(b==l){
                    iv7.setImageDrawable(getResources().getDrawable(R.drawable.cat));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    b=2;
                    l=12;
                    boo1=false;
                    boo11=false;
                }


            }
        });

        iv1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v1) {
                // TODO Auto-generated method stub
                boo2 = !boo2;
                if (boo2==true) {

                    iv1.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    c = 1;

                }
                else if (boo2==false) {

                    iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    c = 54456;
                }
                if(c==d){
                    c=5821;
                    d=65478;
                    count++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv1.setVisibility(View.GONE);
                            iv9.setVisibility(View.GONE);
                        }
                    },1000);
                    if(count==6){
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                final Intent mainIntent = new Intent(MainActivity.this, Activity2.class);
                                startActivity(mainIntent);
                                finish();        // 當跳到另一 Activity 時，讓 MainActivity 結束。
                                // 這樣可以避免使用者按 back 後，又回到該 activity。
                            }
                        }, 2000);
                    }
                    //iv.setVisibility(View.GONE);
                    //iv1.setVisibility(View.GONE);
                }
                if(c==a){
                    iv1.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    c=3;
                    boo2=false;
                    boo=false;
                }
                if(c==b){
                    iv1.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    b=2;
                    boo2=false;
                    boo1=false;
                }
                if(c==e){
                    iv1.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    e=5;
                    boo2=false;
                    boo4=false;
                }
                if(c==f){
                    iv1.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    f=6;
                    boo2=false;
                    boo5=false;
                }
                if(c==g){
                    iv1.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    g=7;
                    boo2=false;
                    boo6=false;
                }
                if(c==h){
                    iv1.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    h=8;
                    boo2=false;
                    boo7=false;
                }
                if(c==i){
                    iv1.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    i=9;
                    boo2=false;
                    boo8=false;
                }
                if(c==j){
                    iv1.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    j=10;
                    boo2=false;
                    boo9=false;
                }
                if(c==k){
                    iv1.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    k=11;
                    boo2=false;
                    boo10=false;
                }
                if(c==l){
                    iv1.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    k=12;
                    boo2=false;
                    boo11=false;
                }



            }
        });

        iv9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v9) {
                // TODO Auto-generated method stub
                boo3 = !boo3;
                if (boo3==true) {

                    iv9.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    d = 1;

                }
                else if (boo3==false) {

                    iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    d = 654;
                }
                if(c==d){
                    c=5821;
                    d=65478;
                    count++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv1.setVisibility(View.GONE);
                            iv9.setVisibility(View.GONE);
                        }
                    },1000);
                    if(count==6){
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                final Intent mainIntent = new Intent(MainActivity.this, Activity2.class);
                                startActivity(mainIntent);
                                finish();        // 當跳到另一 Activity 時，讓 MainActivity 結束。
                                // 這樣可以避免使用者按 back 後，又回到該 activity。
                            }
                        }, 2000);
                    }
                    //iv.setVisibility(View.GONE);
                    //iv1.setVisibility(View.GONE);
                }
                if(d==a){
                    iv9.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    a=78;
                    d=4;
                    boo=false;
                    boo3=false;
                }
                if(d==b){
                    iv9.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    b=2;
                    d=4;
                    boo1=false;
                    boo3=false;
                }
                if(d==e){
                    iv9.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    e=5;
                    d=4;
                    boo4=false;
                    boo3=false;
                }
                if(d==f){
                    iv9.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    f=6;
                    d=4;
                    boo5=false;
                    boo3=false;
                }
                if(d==g){
                    iv9.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    g=7;
                    d=4;
                    boo6=false;
                    boo3=false;
                }
                if(d==h){
                    iv9.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    h=8;
                    d=4;
                    boo7=false;
                    boo3=false;
                }
                if(d==i){
                    iv9.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    i=9;
                    d=4;
                    boo8=false;
                    boo3=false;
                }
                if(d==j){
                    iv9.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    j=10;
                    d=4;
                    boo9=false;
                    boo3=false;
                }
                if(d==k){
                    iv9.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    k=11;
                    d=4;
                    boo10=false;
                    boo3=false;
                }
                if(d==l){
                    iv9.setImageDrawable(getResources().getDrawable(R.drawable.pig));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    l=12;
                    d=4;
                    boo11=false;
                    boo3=false;
                }


            }
        });

        iv2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v2) {
                // TODO Auto-generated method stub
                boo4 = !boo4;
                if (boo4==true) {

                    iv2.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    e = 1;

                }
                else if (boo4==false) {

                    iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    e = 21378;
                }
                if(e==f){
                    e=25222;
                    f=33633;
                    count++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv2.setVisibility(View.GONE);
                            iv3.setVisibility(View.GONE);
                        }
                    },1000);
                    if(count==6){
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                final Intent mainIntent = new Intent(MainActivity.this, Activity2.class);
                                startActivity(mainIntent);
                                finish();        // 當跳到另一 Activity 時，讓 MainActivity 結束。
                                // 這樣可以避免使用者按 back 後，又回到該 activity。
                            }
                        }, 2000);
                    }
                    //iv.setVisibility(View.GONE);
                    //iv1.setVisibility(View.GONE);
                }
                if(e==a){
                    iv2.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    e=5;
                    a=78;
                    boo4=false;
                    boo=false;
                }
                if(e==b){
                    iv2.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    e=5;
                    b=2;
                    boo4=false;
                    boo1=false;
                }
                if(e==c){
                    iv2.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    e=5;
                    c=3;
                    boo4=false;
                    boo2=false;
                }
                if(e==d){
                    iv2.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    e=5;
                    d=4;
                    boo4=false;
                    boo3=false;
                }
                if(e==g){
                    iv2.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    e=5;
                    g=7;
                    boo4=false;
                    boo6=false;
                }
                if(e==h){
                    iv2.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    e=5;
                    h=8;
                    boo4=false;
                    boo7=false;
                }
                if(e==i){
                    iv2.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    e=5;
                    i=9;
                    boo4=false;
                    boo8=false;
                }
                if(e==j){
                    iv2.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    e=5;
                    j=10;
                    boo4=false;
                    boo9=false;
                }
                if(e==k){
                    iv2.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    e=5;
                    k=11;
                    boo4=false;
                    boo10=false;
                }
                if(e==l){
                    iv2.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    e=5;
                    l=12;
                    boo4=false;
                    boo11=false;
                }


            }
        });

        iv3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v3) {
                // TODO Auto-generated method stub
                boo5 = !boo5;
                if (boo5==true) {

                    iv3.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    f = 1;

                }
                else if (boo5==false) {

                    iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    f = 98725156;
                }
                if(e==f){
                    e=25222;
                    f=33633;
                    count++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv2.setVisibility(View.GONE);
                            iv3.setVisibility(View.GONE);
                        }
                    },1000);
                    if(count==6){
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                final Intent mainIntent = new Intent(MainActivity.this, Activity2.class);
                                startActivity(mainIntent);
                                finish();        // 當跳到另一 Activity 時，讓 MainActivity 結束。
                                // 這樣可以避免使用者按 back 後，又回到該 activity。
                            }
                        }, 2000);
                    }
                    //iv.setVisibility(View.GONE);
                    //iv1.setVisibility(View.GONE);
                }
                if(f==a){
                    iv3.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    f=6;
                    a=78;
                    boo5=false;
                    boo=false;
                }
                if(f==b){
                    iv3.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    f=6;
                    b=2;
                    boo5=false;
                    boo1=false;
                }
                if(f==c){
                    iv3.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    f=6;
                    c=3;
                    boo5=false;
                    boo2=false;
                }if(f==d){
                    iv3.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    f=6;
                    d=4;
                    boo5=false;
                    boo3=false;
                }if(f==g){
                    iv3.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    f=6;
                    g=7;
                    boo5=false;
                    boo6=false;
                }
                if(f==h){
                    iv3.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    f=6;
                    h=8;
                    boo5=false;
                    boo7=false;
                }
                if(f==i){
                    iv3.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    f=6;
                    i=9;
                    boo5=false;
                    boo8=false;
                }
                if(f==j){
                    iv3.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    f=6;
                    j=10;
                    boo5=false;
                    boo9=false;
                }
                if(f==k){
                    iv3.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    f=6;
                    k=11;
                    boo5=false;
                    boo10=false;
                }
                if(f==l){
                    iv3.setImageDrawable(getResources().getDrawable(R.drawable.dpg));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    f=6;
                    l=12;
                    boo5=false;
                    boo11=false;
                }

            }
        });
        iv4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v4) {
                // TODO Auto-generated method stub
                boo6 = !boo6;
                if (boo6==true) {

                    iv4.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    g = 1;

                }
                else if (boo6==false) {

                    iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    g = 4568;
                }
                if(g==h){
                    g=99699;
                    h=44544;
                    count++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv4.setVisibility(View.GONE);
                            iv6.setVisibility(View.GONE);
                        }
                    },1000);
                    if(count==6){
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                final Intent mainIntent = new Intent(MainActivity.this, Activity2.class);
                                startActivity(mainIntent);
                                finish();        // 當跳到另一 Activity 時，讓 MainActivity 結束。
                                // 這樣可以避免使用者按 back 後，又回到該 activity。
                            }
                        }, 2000);
                    }
                    //iv.setVisibility(View.GONE);
                    //iv1.setVisibility(View.GONE);
                }
                if(g==a){
                    iv4.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    g=7;
                    a=78;
                    boo6=false;
                    boo=false;
                }
                if(g==b){
                    iv4.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    g=7;
                    b=2;
                    boo6=false;
                    boo1=false;
                }
                if(g==c){
                    iv4.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    g=7;
                    c=3;
                    boo6=false;
                    boo2=false;
                }
                if(g==d){
                    iv4.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    g=7;
                    d=4;
                    boo6=false;
                    boo3=false;
                }
                if(g==e){
                    iv4.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    g=7;
                    e=5;
                    boo6=false;
                    boo4=false;
                }
                if(g==f){
                    iv4.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    g=7;
                    f=6;
                    boo6=false;
                    boo5=false;
                }
                if(g==i){
                    iv4.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    g=7;
                    i=9;
                    boo6=false;
                    boo8=false;
                }
                if(g==j){
                    iv4.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    g=7;
                    j=10;
                    boo6=false;
                    boo9=false;
                }
                if(g==k){
                    iv4.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    g=7;
                    k=11;
                    boo6=false;
                    boo10=false;
                }
                if(g==l){
                    iv4.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    g=7;
                    l=12;
                    boo6=false;
                    boo11=false;
                }

            }
        });
        iv6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v6) {
                // TODO Auto-generated method stub
                boo7 = !boo7;
                if (boo7==true) {

                    iv6.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    h = 1;

                }
                else if (boo7==false) {

                    iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    h = 7892;
                }
                if(g==h){
                    g=99699;
                    h=44544;
                    count++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv4.setVisibility(View.GONE);
                            iv6.setVisibility(View.GONE);
                        }
                    },1000);
                    if(count==6){
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                final Intent mainIntent = new Intent(MainActivity.this, Activity2.class);
                                startActivity(mainIntent);
                                finish();        // 當跳到另一 Activity 時，讓 MainActivity 結束。
                                // 這樣可以避免使用者按 back 後，又回到該 activity。
                            }
                        }, 2000);
                    }
                    //iv.setVisibility(View.GONE);
                    //iv1.setVisibility(View.GONE);
                }
                if(h==a){
                    iv6.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    h=8;
                    a=78;
                    boo7=false;
                    boo=false;
                }
                if(h==b){
                    iv6.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    h=8;
                    b=2;
                    boo7=false;
                    boo1=false;
                }
                if(h==c){
                    iv6.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    h=8;
                    c=3;
                    boo7=false;
                    boo2=false;
                }
                if(h==d){
                    iv6.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    h=8;
                    d=4;
                    boo7=false;
                    boo3=false;
                }
                if(h==e){
                    iv6.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    h=8;
                    e=5;
                    boo7=false;
                    boo4=false;
                }
                if(h==f){
                    iv6.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    h=8;
                    f=6;
                    boo7=false;
                    boo5=false;
                }
                if(h==i){
                    iv6.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    h=8;
                    i=9;
                    boo7=false;
                    boo8=false;
                }
                if(h==j){
                    iv6.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    h=8;
                    j=10;
                    boo7=false;
                    boo9=false;
                }
                if(h==k){
                    iv6.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    h=8;
                    k=11;
                    boo7=false;
                    boo10=false;
                }
                if(h==l){
                    iv6.setImageDrawable(getResources().getDrawable(R.drawable.e));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    h=8;
                    l=12;
                    boo7=false;
                    boo11=false;
                }


            }
        });

        iv5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v5) {
                // TODO Auto-generated method stub
                boo8 = !boo8;
                if (boo8==true) {

                    iv5.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    i = 1;

                }
                else if (boo8==false) {

                    iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    i = 654567987;
                }
                if(i==j){
                    i=82841;
                    j=78778;
                    count++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv5.setVisibility(View.GONE);
                            iv10.setVisibility(View.GONE);
                        }
                    },1000);
                    if(count==6){
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                final Intent mainIntent = new Intent(MainActivity.this, Activity2.class);
                                startActivity(mainIntent);
                                finish();        // 當跳到另一 Activity 時，讓 MainActivity 結束。
                                // 這樣可以避免使用者按 back 後，又回到該 activity。
                            }
                        }, 2000);
                    }
                    //iv.setVisibility(View.GONE);
                    //iv1.setVisibility(View.GONE);
                }
                if(i==a){
                    iv5.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    i=9;
                    a=78;
                    boo8=false;
                    boo=false;
                }
                if(i==b){
                    iv5.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    i=9;
                    b=2;
                    boo8=false;
                    boo1=false;
                }
                if(i==c){
                    iv5.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    i=9;
                    c=3;
                    boo8=false;
                    boo2=false;
                }
                if(i==d){
                    iv5.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    i=9;
                    d=4;
                    boo8=false;
                    boo3=false;
                }
                if(i==e){
                    iv5.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    i=9;
                    e=5;
                    boo8=false;
                    boo4=false;
                }
                if(i==f){
                    iv5.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    i=9;
                    f=6;
                    boo8=false;
                    boo5=false;
                }
                if(i==g){
                    iv5.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    i=9;
                    g=7;
                    boo8=false;
                    boo6=false;
                }
                if(i==h){
                    iv5.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    i=9;
                    h=8;
                    boo8=false;
                    boo7=false;
                }
                if(i==k){
                    iv5.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    i=9;
                    k=11;
                    boo8=false;
                    boo10=false;
                }
                if(i==l){
                    iv5.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    i=9;
                    k=12;
                    boo8=false;
                    boo11=false;
                }


            }
        });

        iv10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v10) {
                // TODO Auto-generated method stub
                boo9 = !boo9;
                if (boo9==true) {

                    iv10.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    j = 1;

                }
                else if (boo9==false) {

                    iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    j = 6579878;
                }
                if(i==j){
                    i=82841;
                    j=78778;
                    count++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv5.setVisibility(View.GONE);
                            iv10.setVisibility(View.GONE);
                        }
                    },1000);
                    if(count==6){
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                final Intent mainIntent = new Intent(MainActivity.this, Activity2.class);
                                startActivity(mainIntent);
                                finish();        // 當跳到另一 Activity 時，讓 MainActivity 結束。
                                // 這樣可以避免使用者按 back 後，又回到該 activity。
                            }
                        }, 2000);
                    }
                    //iv.setVisibility(View.GONE);
                    //iv1.setVisibility(View.GONE);
                }
                if(j==a){
                    iv10.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    j=10;
                    a=78;
                    boo9=false;
                    boo=false;
                }
                if(j==b){
                    iv10.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    j=10;
                    b=2;
                    boo9=false;
                    boo1=false;
                }
                if(j==c){
                    iv10.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    j=10;
                    c=3;
                    boo9=false;
                    boo2=false;
                }
                if(j==d){
                    iv10.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    j=10;
                    d=4;
                    boo9=false;
                    boo3=false;
                }
                if(j==e){
                    iv10.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    j=10;
                    e=5;
                    boo9=false;
                    boo4=false;
                }
                if(j==f){
                    iv10.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    j=10;
                    f=6;
                    boo9=false;
                    boo5=false;
                }
                if(j==g){
                    iv10.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    j=10;
                    g=7;
                    boo9=false;
                    boo6=false;
                }
                if(j==h){
                    iv10.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    j=10;
                    h=8;
                    boo9=false;
                    boo7=false;
                }
                if(j==k){
                    iv10.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    j=10;
                    k=11;
                    boo9=false;
                    boo10=false;
                }
                if(j==l){
                    iv10.setImageDrawable(getResources().getDrawable(R.drawable.deer));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    j=10;
                    l=12;
                    boo9=false;
                    boo11=false;
                }


            }
        });

        iv8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v8) {
                // TODO Auto-generated method stub
                boo10 = !boo10;
                if (boo10==true) {

                    iv8.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    k = 1;

                }
                else if (boo10==false) {

                    iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    k = 65778;
                }
                if(k==l){
                    k=123654;
                    l=987456;
                    count++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv8.setVisibility(View.GONE);
                            iv11.setVisibility(View.GONE);
                        }
                    },1000);
                    if(count==6){
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                final Intent mainIntent = new Intent(MainActivity.this, Activity2.class);
                                startActivity(mainIntent);
                                finish();        // 當跳到另一 Activity 時，讓 MainActivity 結束。
                                // 這樣可以避免使用者按 back 後，又回到該 activity。
                            }
                        }, 2000);
                    }
                    //iv.setVisibility(View.GONE);
                    //iv1.setVisibility(View.GONE);
                }
                if(k==a){
                    iv8.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    k=11;
                    a=78;
                    boo10=false;
                    boo=false;
                }
                if(k==b){
                    iv8.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    k=11;
                    b=2;
                    boo10=false;
                    boo1=false;
                }
                if(k==c){
                    iv8.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    k=11;
                    c=3;
                    boo10=false;
                    boo2=false;
                }
                if(k==d){
                    iv8.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    k=11;
                    d=4;
                    boo10=false;
                    boo3=false;
                }
                if(k==e){
                    iv8.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    k=11;
                    e=5;
                    boo10=false;
                    boo4=false;
                }
                if(k==f){
                    iv8.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    k=11;
                    f=6;
                    boo10=false;
                    boo5=false;
                }
                if(k==g){
                    iv8.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    k=11;
                    g=7;
                    boo10=false;
                    boo6=false;
                }
                if(k==h){
                    iv8.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    k=11;
                    h=8;
                    boo10=false;
                    boo7=false;
                }
                if(k==i){
                    iv8.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    k=11;
                    i=9;
                    boo10=false;
                    boo8=false;
                }
                if(k==j){
                    iv8.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv8.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    k=11;
                    j=10;
                    boo10=false;
                    boo9=false;
                }
            }
        });

        iv11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v11) {
                // TODO Auto-generated method stub
                boo11 = !boo11;
                if (boo11==true) {

                    iv11.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    l = 1;

                }
                else if (boo11==false) {

                    iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    l = 67778;
                }
                if(k==l){
                    k=123654;
                    l=987456;
                    count++;
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv8.setVisibility(View.GONE);
                            iv11.setVisibility(View.GONE);
                        }
                    },1000);
                    if(count==6){
                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                final Intent mainIntent = new Intent(MainActivity.this, Activity2.class);
                                startActivity(mainIntent);
                                finish();        // 當跳到另一 Activity 時，讓 MainActivity 結束。
                                // 這樣可以避免使用者按 back 後，又回到該 activity。
                            }
                        }, 2000);
                    }
                    //iv.setVisibility(View.GONE);
                    //iv1.setVisibility(View.GONE);
                }
                if(l==a){
                    iv11.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    l=12;
                    a=78;
                    boo11=false;
                    boo=false;
                }
                if(l==b){
                    iv11.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv7.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    l=12;
                    b=2;
                    boo11=false;
                    boo1=false;
                }
                if(l==c){
                    iv11.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    l=12;
                    c=3;
                    boo11=false;
                    boo2=false;
                }
                if(l==d){
                    iv11.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv9.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    l=12;
                    d=4;
                    boo11=false;
                    boo3=false;
                }
                if(l==e){
                    iv11.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv2.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    l=12;
                    e=5;
                    boo11=false;
                    boo4=false;
                }
                if(l==f){
                    iv11.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv3.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    l=12;
                    f=6;
                    boo11=false;
                    boo5=false;
                }
                if(l==g){
                    iv11.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv4.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    l=12;
                    g=7;
                    boo11=false;
                    boo6=false;
                }
                if(l==h){
                    iv11.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv6.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    l=12;
                    h=8;
                    boo11=false;
                    boo7=false;
                }
                if(l==i){
                    iv11.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv5.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    l=12;
                    i=9;
                    boo11=false;
                    boo8=false;
                }
                if(l==j){
                    iv11.setImageDrawable(getResources().getDrawable(R.drawable.bird));
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            iv11.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                            iv10.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                        }
                    },1000);

                    //iv.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    //iv1.setImageDrawable(getResources().getDrawable(R.drawable.xiaoxiong));
                    l=12;
                    j=10;
                    boo11=false;
                    boo9=false;
                }
            }
        });




    }
}
