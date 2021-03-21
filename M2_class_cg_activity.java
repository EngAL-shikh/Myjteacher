package com.example.myteacher;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;

import java.lang.reflect.Field;

public class M2_class_cg_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m2_class_cg_layout);
    }
    public void book39(View v){
        Intent intent=new Intent(M2_class_cg_activity.this,M2_class_cg_activity.class);
        startActivity(intent);
    }

    public void book40(View v){
        Intent intent=new Intent(M2_class_cg_activity.this,M2_class_cg_activity.class);
        startActivity(intent);
    }

    public void book41(View v){
        Intent intent=new Intent(M2_class_cg_activity.this,M2_class_cg_activity.class);
        startActivity(intent);
    }

    public void book42(View v){
        Intent intent=new Intent(M2_class_cg_activity.this,M2_class_cg_activity.class);
        startActivity(intent);
    }

    public void book43(View v){
        Intent intent=new Intent(M2_class_cg_activity.this,M2_class_cg_activity.class);
        startActivity(intent);
    }

    public void book44(View v){
        Intent intent=new Intent(M2_class_cg_activity.this,M2_class_cg_activity.class);
        startActivity(intent);
    }

    public void book45(View v){
        Intent intent=new Intent(M2_class_cg_activity.this,M2_class_cg_activity.class);
        startActivity(intent);
    }

    public void book46(View v){
        Intent intent=new Intent(M2_class_cg_activity.this,M2_class_cg_activity.class);
        startActivity(intent);
    }

    //three dots
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.three_dots,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.profile){
            Intent intent = new Intent(M2_class_cg_activity.this, profile_interface_activity.class);
            startActivity(intent);}

        if(item.getItemId()==R.id.logout){
            Intent intent = new Intent(M2_class_cg_activity.this, LoginActivity.class);
            startActivity(intent);}
        return super.onOptionsItemSelected(item);
    }



}