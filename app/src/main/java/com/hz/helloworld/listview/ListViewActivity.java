package com.hz.helloworld.listview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.hz.helloworld.R;

public class ListViewActivity extends AppCompatActivity {

    ListView mListview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        mListview = findViewById(R.id.lv_1);
        mListview.setAdapter(new MyListAdapter(this));
    }
}
