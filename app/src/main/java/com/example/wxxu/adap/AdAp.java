package com.example.wxxu.adap;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.wxxu.Main2Activity;
import com.example.wxxu.R;
import com.example.wxxu.bean.Bean;

import java.util.List;

public class AdAp extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Bean> bean;
    Oncli oncli;

    public void setOncli(Oncli oncli) {
        this.oncli = oncli;
    }

    public AdAp(List<Bean> bean) {
        this.bean = bean;
    }
    public interface Oncli{
        void getonli(String url);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.one, null);

            return new ViewH1(inflate);

        } else if (viewType == 1) {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.two, null);
            return new ViewH1(inflate);

        } else {
            View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.three, null);
            return new ViewH1(inflate);

        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        int itemViewType = getItemViewType(position);
        if (itemViewType == 0) {
            final ViewH1 viewH1= (ViewH1) holder;
            viewH1.tv.setText(bean.get(position).getMiaoshu());
            Glide.with(viewH1.iv.getContext()).load(bean.get(position).getBiaoti()).into(viewH1.iv);
            viewH1.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    oncli.getonli(bean.get(position).getUrl());
                }
            });

        } else if (itemViewType == 1) {
            ViewH2 viewH2= (ViewH2) holder;
            viewH2.tv.setText(bean.get(position).getMiaoshu());
            Glide.with(viewH2.iv.getContext()).load(bean.get(position).getBiaoti()).into(viewH2.iv);
            viewH2.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    oncli.getonli(bean.get(position).getUrl());
                }
            });

        } else {
            ViewH3 viewH3= (ViewH3) holder;
            viewH3.tv.setText(bean.get(position).getMiaoshu());
            Glide.with(viewH3.iv.getContext()).load(bean.get(position).getBiaoti()).into(viewH3.iv);
            viewH3.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    oncli.getonli(bean.get(position).getUrl());
                }
            });
        }
    }

    @Override
    public int getItemCount() {
        return bean.size();
    }

    @Override
    public int getItemViewType(int position) {
        int title = bean.get(position).getTitle();
        if (title == 0) {
            return 0;
        } else if (title == 1) {
            return 1;
        } else {
            return 2;
        }

    }

    public class ViewH1 extends RecyclerView.ViewHolder{
        ImageView iv;
        TextView tv;
        public ViewH1(View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.iv);
            tv=itemView.findViewById(R.id.tv);
        }
    }
    public class ViewH2 extends RecyclerView.ViewHolder{
        ImageView iv;
        TextView tv;
        public ViewH2(View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.iv);
            tv=itemView.findViewById(R.id.tv);
        }
    }
    public class ViewH3 extends RecyclerView.ViewHolder{
        ImageView iv;
        TextView tv;
        public ViewH3(View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.iv);
            tv=itemView.findViewById(R.id.tv);
        }
    }
}
