package com.example.a28062.jsoupts;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 28062 on 2018/4/16.
 */

public class NewsAdapter extends ArrayAdapter {
    private final int resourceId;

    public NewsAdapter(Context context, int TextViewresourceId, List<MyBean> obj){
        super(context,TextViewresourceId,obj);
        resourceId = TextViewresourceId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        MyBean jcodeInfo = (MyBean) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId,null);
        TextView title = (TextView)view.findViewById(R.id.item_1);
        TextView detail = (TextView)view.findViewById(R.id.item_2);
        TextView detailUrl = (TextView)view.findViewById(R.id.item_3);
        TextView imageUrl = (TextView)view.findViewById(R.id.item_4);
        title.setText(jcodeInfo.getTitle());
        detail.setText(jcodeInfo.getDetail());
        detailUrl.setText(jcodeInfo.getDetailUrl());
        imageUrl.setText(jcodeInfo.getImageUrl());
    return view;
    }
}
