package com.dicoding.githubuser.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.dicoding.githubuser.R;
import com.dicoding.githubuser.adapter.AdapterList;
import com.dicoding.githubuser.model.ModelList;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private List<ModelList> mList;
    private AdapterList adapter;
    //the recyclerview
    private RecyclerView recyclerView;
    private static final int TIME_LIMIT = 1500;
    private static long backPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        mList = new ArrayList<>();
//        mList.add(
////                new ModelList(
////
////                ));


        adapter = new AdapterList(this, mList);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        if (TIME_LIMIT + backPressed > System.currentTimeMillis()){
            super.onBackPressed();
        }else {
            Toast.makeText(getApplicationContext(),"Press once again to exit", Toast.LENGTH_SHORT).show();
        }
        backPressed =System.currentTimeMillis();
    }
}