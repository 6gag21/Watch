package com.example.aca.watch.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.example.aca.watch.R;

import java.util.Calendar;

public class DigitView extends View {

    private int mNumber;

    public void setNumber(int number) {
        this.mNumber = number;
    }

    private Paint mPaint = new Paint();
    public DigitView(Context context) {
        super(context);
    }

    public DigitView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        applyAttributes();
    }

    public DigitView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        applyAttributes();
    }

    private void applyAttributes(){
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(10f);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        drawNumber(mNumber,canvas);
    }

    public void drawNumber(int number,Canvas canvas){
            if(number == 0 | number == 4 | number == 5 | number == 6 | number == 8 | number == 9){
                canvas.drawLine(25f,30f,25f,110f,mPaint);
            }

            if(number == 0 | number == 2 | number == 6 | number == 8){
                canvas.drawLine(25f,120f,25f,200f,mPaint);
            }

            if(number == 0 | number == 2 | number == 3 | number == 5 | number == 6 | number == 8 | number == 9) {
            canvas.drawLine(30f,205f,110f,205f, mPaint);
            }

            if(number == 0 | number == 1 | number == 3 | number == 4 | number == 5 | number == 6 | number == 7 | number == 8 | number == 9) {
                canvas.drawLine(115f,200f,115f,120f, mPaint);
            }

            if(number == 0 | number == 1 | number == 2 | number == 3 | number == 4 | number == 7 | number == 8 | number == 9) {
            canvas.drawLine(115f,110f,115f,30f, mPaint);
            }

            if(number == 0 | number == 2 | number == 3 | number == 5 | number == 6 | number == 7 | number == 8 | number == 9) {
            canvas.drawLine(30f,25f,110f,25f, mPaint);
            }

            if(number == 2 | number == 3 | number == 4 | number == 5 | number == 6 | number == 8 | number == 9) {
            canvas.drawLine(30f,115f, 110f, 115f, mPaint);
            }

        invalidate();

    }



}
