package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.example.myapplication.utils.appConstant;

public class MainActivity extends AppCompatActivity {

    LinearLayout mbtn1, mbtn2, mbtn3, mbtn4, mbtn5, mbtn6, mbtn7, mbtn8, mbtn9;
    Button mbtn_send;
    EditText met_user, met_email;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mbtn_send =findViewById(R.id.btn_send);
        met_user=findViewById(R.id.et_user);
        met_email=findViewById(R.id.et_email);
        mbtn1=findViewById(R.id.btn1);
        mbtn_send.setOnClickListener(v->{
            String text1=met_user.getText().toString();
            String text2=met_email.getText().toString();
            Intent mIntent =new Intent(MainActivity.this, NewActivity.class);
            mIntent.putExtra(appConstant.TEXT_User, text1);
            mIntent.putExtra(appConstant.TEXT_Email, text2);
            startActivity(mIntent);





        });

        mbtn1.setOnClickListener(v->{


        });
    }
}
