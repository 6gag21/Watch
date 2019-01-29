package com.example.aca.watch.widget;

import android.content.Context;

import android.graphics.Canvas;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.aca.watch.R;

import java.util.Calendar;



public class WatchView extends LinearLayout {

    private DigitView dv1;
    private DigitView dv2;
    private DigitView dv3;
    private DigitView dv4;
    private TextView dotsView;



    public WatchView(Context context) {
        this(context,null);

    }

    public WatchView(Context context, @Nullable AttributeSet attrs) {
       this(context, attrs,0);
    }

    public WatchView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.view_watch, this, true);
        dv1 = findViewById(R.id.dv_1);
        dv2 = findViewById(R.id.dv_2);
        dv3 = findViewById(R.id.dv_3);
        dv4 = findViewById(R.id.dv_4);
        dotsView = findViewById(R.id.dots_view);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

               setTime();


                if (dotsView.getVisibility() == View.VISIBLE){
                    dotsView.setVisibility(INVISIBLE);
                }else {
                    dotsView.setVisibility(VISIBLE);
                }

                handler.postDelayed(this, 500);
            }
        }, 500);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        super.onLayout(changed, l, t, r, b);
    }

        private void setTime() {

        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        dv1.setNumber(hour/10);
        dv2.setNumber(hour%10);

        dv3.setNumber(minute/10);
        dv4.setNumber(minute%10);

    }



}
