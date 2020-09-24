package com.hz.helloworld.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hz.helloworld.R;

public class LinearRecycleViewAdapter extends RecyclerView.Adapter<LinearRecycleViewAdapter.LinearViewHolder> {
    private Context mContext;
    private OnItemClickListener mOnItemClickListener;
    public LinearRecycleViewAdapter(Context context, OnItemClickListener onItemClickListener){
        this.mContext = context;
        this.mOnItemClickListener = onItemClickListener;
    }
    @NonNull
    @Override
    public LinearRecycleViewAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_linear_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LinearRecycleViewAdapter.LinearViewHolder holder, final int position) {
        holder.mTv.setText("Position: "+position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnItemClickListener.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 30;
    }

    public class LinearViewHolder extends RecyclerView.ViewHolder {
        private TextView mTv;
        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            this.mTv = itemView.findViewById(R.id.tv);
        }
    }

    public interface OnItemClickListener{
        void onClick(int pos);
    }
}
