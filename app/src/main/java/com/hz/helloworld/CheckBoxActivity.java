package com.hz.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox mCb_1;
    private CheckBox mCb_2;
    private CheckBox mCb_3;
    private CheckBox mCb_4;
    private CheckBox mCb_5;
    private CheckBox mCb_6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        mCb_1 = findViewById(R.id.cb_1);
        mCb_2 = findViewById(R.id.cb_2);
        mCb_3 = findViewById(R.id.cb_3);
        mCb_4 = findViewById(R.id.cb_4);
        mCb_5 = findViewById(R.id.cb_5);
        mCb_6 = findViewById(R.id.cb_6);
        SetONCheckListener();
    }

    private void SetONCheckListener(){
        mCb_1.setOnCheckedChangeListener(new OnCheck());
        mCb_2.setOnCheckedChangeListener(new OnCheck());
        mCb_3.setOnCheckedChangeListener(new OnCheck());
        mCb_4.setOnCheckedChangeListener(new OnCheck());
        mCb_5.setOnCheckedChangeListener(new OnCheck());
        mCb_6.setOnCheckedChangeListener(new OnCheck());
    }

    private class OnCheck implements CompoundButton.OnCheckedChangeListener{
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            CheckBox cb = findViewById(compoundButton.getId());
            CharSequence str = cb.getText();
            Log.d("Log", b?(String)str+" Checked":(String)str+" UnChecked");
            Toast.makeText(CheckBoxActivity.this, b?(String)str+" Checked":(String)str+" UnChecked", Toast.LENGTH_SHORT).show();
        }
    }
}