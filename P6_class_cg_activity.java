package com.example.myteacher;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class P6_class_cg_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p6_class_cg_layout);
    }
    public void book24(View v){
        Intent intent=new Intent(P6_class_cg_activity.this,P6_class_cg_activity.class);
        startActivity(intent);
    }
    public void book25(View v){
        Intent intent=new Intent(P6_class_cg_activity.this,P6_class_cg_activity.class);
        startActivity(intent);
    }
    public void book26(View v){
        Intent intent=new Intent(P6_class_cg_activity.this,P6_class_cg_activity.class);
        startActivity(intent);
    }
    public void book27(View v){
        Intent intent=new Intent(P6_class_cg_activity.this,P6_class_cg_activity.class);
        startActivity(intent);
    }
    public void book28(View v){
        Intent intent=new Intent(P6_class_cg_activity.this,P6_class_cg_activity.class);
        startActivity(intent);
    }
    public void book29(View v){
        Intent intent=new Intent(P6_class_cg_activity.this,P6_class_cg_activity.class);
        startActivity(intent);
    }
    public void book30(View v){
        Intent intent=new Intent(P6_class_cg_activity.this,P6_class_cg_activity.class);
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
            Intent intent = new Intent(P6_class_cg_activity.this, profile_interface_activity.class);
            startActivity(intent);}

        if(item.getItemId()==R.id.logout){
            Intent intent = new Intent(P6_class_cg_activity.this, LoginActivity.class);
            startActivity(intent);}
        return super.onOptionsItemSelected(item);
    }
}