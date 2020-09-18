package com.hz.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hz.helloworld.listview.ListViewActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTextView;
    private Button mBtnButton;
    private Button mBtnTextEdit;
    private Button mBtnRadioButton;
    private Button mBtnCheckbox;
    private Button mBtnImageView;
    private Button mBtnListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView = findViewById(R.id.btn_textview);
        mBtnButton = findViewById(R.id.btn_button);
        mBtnTextEdit = findViewById(R.id.btn_textedit);
        mBtnRadioButton = findViewById(R.id.btn_radio_button);
        mBtnCheckbox = findViewById(R.id.btn_check_box);
        mBtnImageView = findViewById(R.id.btn_image_view);
        mBtnListView = findViewById(R.id.btn_listview);
        SetListeners();
    }

    private void SetListeners(){
        OnClick onClick = new OnClick();
        mBtnButton.setOnClickListener(onClick);;
        mBtnRadioButton.setOnClickListener(onClick);
        mBtnTextView.setOnClickListener(onClick);
        mBtnTextEdit.setOnClickListener(onClick);
        mBtnCheckbox.setOnClickListener(onClick);
        mBtnImageView.setOnClickListener(onClick);
        mBtnListView.setOnClickListener(onClick);
    }

    private class OnClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            Intent intent;
            switch (v.getId()){
                case R.id.btn_radio_button:
                    intent = new Intent(MainActivity.this, RadioButtonActivity.class);
                    break;
                case R.id.btn_textview:
                    intent = new Intent(MainActivity.this, TextViewActivity.class);
                    break;
                case R.id.btn_textedit:
                    intent = new Intent(MainActivity.this, TextEditActivity.class);
                    break;
                case R.id.btn_button:
                    intent = new Intent(MainActivity.this, BtnActivity.class);
                    break;
                case R.id.btn_check_box:
                    intent = new Intent(MainActivity.this, CheckBoxActivity.class);
                    break;
                case R.id.btn_image_view:
                    intent = new Intent(MainActivity.this, ImageViewActivity.class);
                    break;
                case R.id.btn_listview:
                    intent = new Intent(MainActivity.this, ListViewActivity.class);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + v.getId());
            }
            startActivity(intent);
        }
    }
}