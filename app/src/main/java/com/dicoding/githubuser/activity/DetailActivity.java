package com.dicoding.githubuser.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.dicoding.githubuser.R;
import com.dicoding.githubuser.model.ModelList;

public class DetailActivity extends AppCompatActivity {

    private TextView tv_username, tv_follower, tv_following, tv_company, tv_bio, tv_name;
    private ImageView iv_avatar;
    private ModelList modelList;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        binding();
        modelList = getIntent().getExtras().getParcelable("extra_list");
        if (modelList != null){
//            Bundle bundle = getIntent().getExtras();
            tv_username.setText(modelList.getUSERNAME());
            tv_follower.setText(modelList.getFOLLOWER());
            tv_following.setText(modelList.getFOLLOWING());
            tv_company.setText(modelList.getCOMPANY());
            tv_bio.setText(modelList.getBIO());
            tv_name.setText(modelList.getNAME());
//            Glide.with(this).load(modelList.getAVATAR()).into(iv_avatar);
//            modelList = getIntent().getExtras().getParcelable("img_list");
//            if (modelList != null){
//                Bundle bundle = getIntent().getExtras();
//
//            }
        }
//        if (getIntent().getExtras()!=null){
//            Bundle bundle = getIntent().getExtras();
//            iv_avatar.setImageResource(bundle.getInt("img_list"));
//        }

    }
    private void binding(){
        tv_username = findViewById(R.id.tv_username);
        tv_follower = findViewById(R.id.tv_follower);
        tv_following = findViewById(R.id.tv_following);
        tv_company = findViewById(R.id.tv_company);
        tv_bio = findViewById(R.id.tv_bio);
        tv_name = findViewById(R.id.tv_name);
        iv_avatar = findViewById(R.id.iv_photo);

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}