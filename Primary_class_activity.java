package com.example.myteacher;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Primary_class_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.primary_class_layout);
    }
    public void class1(View v){
        Intent intent=new Intent(Primary_class_activity.this,P1_class_cg_activity.class);
        startActivity(intent);
    }
    public void class2(View v){
        Intent intent=new Intent(Primary_class_activity.this,P2_class_cg_activity.class);
        startActivity(intent);
    }
    public void class3(View v){
        Intent intent=new Intent(Primary_class_activity.this,P3_class_cg_activity.class);
        startActivity(intent);
    }
    public void class4(View v){
        Intent intent=new Intent(Primary_class_activity.this,P4_class_cg_activity.class);
        startActivity(intent);
    }
    public void class5(View v){
        Intent intent=new Intent(Primary_class_activity.this,P5_class_cg_activity.class);
        startActivity(intent);
    }
    public void class6(View v){
        Intent intent=new Intent(Primary_class_activity.this,P6_class_cg_activity.class);
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
            Intent intent = new Intent(Primary_class_activity.this, profile_interface_activity.class);
            startActivity(intent);}

        if(item.getItemId()==R.id.logout){
            Intent intent = new Intent(Primary_class_activity.this, LoginActivity.class);
            startActivity(intent);}
        return super.onOptionsItemSelected(item);
    }
}