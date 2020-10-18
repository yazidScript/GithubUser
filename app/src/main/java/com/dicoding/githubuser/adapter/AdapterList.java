package com.dicoding.githubuser.adapter;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.dicoding.githubuser.R;
import com.dicoding.githubuser.activity.ListActivity;
import com.dicoding.githubuser.model.ModelList;

import java.util.List;

public class AdapterList extends RecyclerView.Adapter<AdapterList.ItemViewHolder> {
    private Context context;
    private List<ModelList> mList;
    private ListActivity mListActivity;


    public AdapterList(Context context, List<ModelList> mList, Activity ListActivity) {
        this.context = context;
        this.mList = mList;
        this.mListActivity = (ListActivity) ListActivity;

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

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
