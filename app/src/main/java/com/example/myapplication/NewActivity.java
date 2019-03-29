package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.utils.appConstant;

public class NewActivity extends AppCompatActivity {

    TextView mTv_user, mTv_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        mTv_email=findViewById(R.id.Tv_email);
        mTv_user=findViewById(R.id.Tv_user);
        Intent mIntent=getIntent();


        if (mIntent!=null ) {
            mTv_user.setText(mIntent.getStringExtra(appConstant.TEXT_User));
            mTv_email.setText(mIntent.getStringExtra(appConstant.TEXT_Email));


        }
    }
}
