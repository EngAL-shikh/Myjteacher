package com.example.myteacher;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class P5_class_cg_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p5_class_cg_layout);
    }
    public void book17(View v){
        Intent intent=new Intent(P5_class_cg_activity.this,P5_class_cg_activity.class);
        startActivity(intent);
    }
    public void book18(View v){
        Intent intent=new Intent(P5_class_cg_activity.this,P5_class_cg_activity.class);
        startActivity(intent);
    }
    public void book19(View v){
        Intent intent=new Intent(P5_class_cg_activity.this,P5_class_cg_activity.class);
        startActivity(intent);
    }
    public void book20(View v){
        Intent intent=new Intent(P5_class_cg_activity.this,P5_class_cg_activity.class);
        startActivity(intent);
    }
    public void book21(View v){
        Intent intent=new Intent(P5_class_cg_activity.this,P5_class_cg_activity.class);
        startActivity(intent);
    }
    public void book22(View v){
        Intent intent=new Intent(P5_class_cg_activity.this,P5_class_cg_activity.class);
        startActivity(intent);
    }
    public void book23(View v){
        Intent intent=new Intent(P5_class_cg_activity.this,P5_class_cg_activity.class);
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
            Intent intent = new Intent(P5_class_cg_activity.this, profile_interface_activity.class);
            startActivity(intent);}

        if(item.getItemId()==R.id.logout){
            Intent intent = new Intent(P5_class_cg_activity.this, LoginActivity.class);
            startActivity(intent);}
        return super.onOptionsItemSelected(item);
    }
}