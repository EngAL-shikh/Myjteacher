package com.example.myteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class profile_interface_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_interface_layout);
    }

    public void enter(View v){
        Intent intent=new Intent(profile_interface_activity.this,Educational_level_activity.class);
        startActivity(intent);

    }

}