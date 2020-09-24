package com.hz.helloworld.recycleview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.hz.helloworld.R;

public class LinearRecycleViewActivity extends AppCompatActivity {

    RecyclerView mRv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_recycle_view);

        mRv = findViewById(R.id.rv_main);
        mRv.setAdapter(new LinearRecycleViewAdapter(this, new LinearRecycleViewAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(LinearRecycleViewActivity.this, "click..."+pos, Toast.LENGTH_SHORT).show();
            }
        }));
        mRv.setLayoutManager(new LinearLayoutManager(LinearRecycleViewActivity.this));
        mRv.addItemDecoration(new MyDecoration());
    }

    public class MyDecoration extends RecyclerView.ItemDecoration{
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0, 0, 0, getResources().getDimensionPixelOffset(R.dimen.dividerHeight));
        }
    }
}