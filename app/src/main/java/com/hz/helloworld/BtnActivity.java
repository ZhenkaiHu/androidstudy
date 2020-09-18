package com.hz.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BtnActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn);
        btn = findViewById(R.id.btn_1);

        MyListener myListener = new MyListener();
        btn.setOnClickListener(myListener);
    }
//    public void onClick(View v)
//    {
//        Toast.makeText(getApplicationContext(),"点我了", Toast.LENGTH_SHORT).show();
//    }
    public class MyListener implements View.OnClickListener {
        @Override
        public void onClick (View v) {
            Toast.makeText(getApplicationContext(),"点我了", Toast.LENGTH_SHORT).show();
        }
    }
}