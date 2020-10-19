package com.dicoding.githubuser.adapter;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
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
import com.dicoding.githubuser.activity.ListActivity;
import com.dicoding.githubuser.model.ModelList;

import java.util.List;

public class AdapterList extends RecyclerView.Adapter<AdapterList.ItemViewHolder> {
    private Context context;
    private List<ModelList> mList;


    public AdapterList(Context context, List<ModelList> mList) {
        this.context = context;
        this.mList = mList;

    }

    @NonNull
    @Override
    public AdapterList.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterList.ItemViewHolder holder, int position) {
        final ModelList list = mList.get(position);

        holder.tv_username.setText(list.getUSERNAME());
        holder.tv_follower.setText(list.getFOLLOWER());
        holder.iv_photo.setImageDrawable(context.getResources().getDrawable(list.getAVATAR()));
        holder.item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context.getApplicationContext(), DetailActivity.class);
                intent.putExtra("avatar",list.getAVATAR());
                intent.putExtra("name",list.getNAME());
                intent.putExtra("bio",list.getBIO());
                intent.putExtra("company",list.getCOMPANY());
                intent.putExtra("following",list.getFOLLOWING());
                intent.putExtra("username",list.getUSERNAME());
                intent.putExtra("follower",list.getFOLLOWER());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_username, tv_follower;
        private ImageView iv_photo;
        private LinearLayout item;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_username = itemView.findViewById(R.id.tv_username);
            tv_follower = itemView.findViewById(R.id.tv_follower);
            iv_photo = itemView.findViewById(R.id.iv_photo);
            item = itemView.findViewById(R.id.item);
        }
    }
}
