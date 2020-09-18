package com.hz.helloworld.listview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.hz.helloworld.R;

public class MyListAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mLayoutInflater;

    public MyListAdapter(Context context){
        mContext = context;
        mLayoutInflater = LayoutInflater.from(mContext);
    }
    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class ViewHolder{
        public ImageView iv;
        public TextView tvTitle, tvDay, tvContent;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (convertView == null){
//            Log.d("debug", "here");
            convertView = mLayoutInflater.inflate(R.layout.layout_list_item, null);
            holder = new ViewHolder();
            holder.iv = convertView.findViewById(R.id.iv_1);
            holder.tvTitle = convertView.findViewById(R.id.lt_tv_1);
            holder.tvDay = convertView.findViewById(R.id.lt_tv_2);
            holder.tvContent = convertView.findViewById(R.id.lt_tv_3);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder) convertView.getTag();
        }
        Glide.with(mContext).load("https://lh6.ggpht.com/9SZhHdv4URtBzRmXpnWxZcYhkgTQurFuuQ8OR7WZ3R7fyTmha77dYkVvcuqMu3DLvMQ=w300").into(holder.iv);
        holder.tvTitle.setText("这是题目");
        holder.tvDay.setText("2011-1-2");
        holder.tvContent.setText("这是内容");

        return convertView;
    }
}