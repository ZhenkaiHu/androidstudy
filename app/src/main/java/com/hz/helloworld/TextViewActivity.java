package com.hz.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {
    private TextView tv_4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        tv_4 = findViewById(R.id.tv_4);
//        tv_4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
//        tv_4.getPaint().setAntiAlias(true);
        tv_4.setText(Html.fromHtml("<u>안녕하세요</u>"));
    }
}