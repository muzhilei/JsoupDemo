package com.example.a28062.jsoupts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 28062 on 2018/4/16.
 */

public class NewAdapter extends BaseAdapter {
    private List<MyBean> newsList;
    private View view;
    private Context mContext;
    private ViewHolder viewHolder;

    public NewAdapter(Context mContext,List<MyBean> obj){
        this.mContext = mContext;
        this.newsList = obj;
    }

    @Override
    public int getCount() {
        return newsList.size();
    }

    @Override
    public Object getItem(int position) {return newsList.get(position);}


    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.news_item, null);
            viewHolder = new ViewHolder();
            viewHolder.newsTitle = (TextView) view.findViewById(R.id.item_1);
            viewHolder.newsDesc = (TextView)view.findViewById(R.id.item_2);
            viewHolder.newsTime = (TextView)view.findViewById(R.id.item_3);
            viewHolder.newsImage = (TextView) view.findViewById(R.id.item_4);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.newsTitle.setText(newsList.get(position).getTitle());
        viewHolder.newsDesc.setText(newsList.get(position).getDetail());
        viewHolder.newsTime.setText(newsList.get(position).getDetailUrl());
        viewHolder.newsImage.setText(newsList.get(position).getImageUrl());
        return view;
    }

    class ViewHolder{
        TextView newsImage;
        TextView newsTitle;
        TextView newsDesc;
        TextView newsTime;
    }

}
