package com.dicoding.githubuser.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dicoding.githubuser.R;
import com.dicoding.githubuser.activity.DetailActivity;
import com.dicoding.githubuser.model.ModelList;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.AdapterViewHolder> {
    Context context;
    List<ModelList> mList;


    public adapter(Context context, List<ModelList> mList) {
        this.context = context;
        this.mList = mList;

    }

    @NonNull
    @Override
    public adapter.AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_item,parent,false);
        return new AdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.AdapterViewHolder holder, int position) {
        final ModelList list = mList.get(position);

//        holder.bind(list);
        holder.tv_username.setText(list.getUSERNAME());
        holder.tv_follower.setText(list.getFOLLOWER());
        holder.iv_photo.setImageDrawable(context.getResources().getDrawable(list.getAVATAR()));
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), DetailActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("img_list",list.getAVATAR());
                intent.putExtra("extra_list",list);
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    class AdapterViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_username, tv_follower;
        private ImageView iv_photo;
        private LinearLayout item;
        AdapterViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_username = itemView.findViewById(R.id.tv_username);
            tv_follower = itemView.findViewById(R.id.tv_followers);
            iv_photo = itemView.findViewById(R.id.iv_photo);
            item = itemView.findViewById(R.id.item);
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(context, DetailActivity.class);
//                    intent.putExtra("extra_list", mList);
//                    context.startActivity(intent);
//                }
//            });
        }
        private void bind(final ModelList model){
            tv_username.setText(model.getUSERNAME());
            tv_follower.setText(model.getFOLLOWER());
        }
    }
}
