package com.example.myteacher;




import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;





public class Educational_level_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.educational_level_layout);
    }

    public void education1(View v) {
        Intent intent = new Intent(Educational_level_activity.this, Primary_class_activity.class);
        startActivity(intent);

    }

    public void education2(View v) {
        Intent intent = new Intent(Educational_level_activity.this, middle_class_activity.class);
        startActivity(intent);
    }

    public void education3(View v) {
        Intent intent = new Intent(Educational_level_activity.this, High_class_activity.class);
        startActivity(intent);
    }

    //search bar and the three dots
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==R.id.profile){
        Intent intent = new Intent(Educational_level_activity.this, profile_interface_activity.class);
        startActivity(intent);}

        if(item.getItemId()==R.id.logout){
            Intent intent = new Intent(Educational_level_activity.this, LoginActivity.class);
            startActivity(intent);}
        return super.onOptionsItemSelected(item);
    }


    /*//search bar
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        final Context co = this;
       searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Toast.makeText(co, query, Toast.LENGTH_LONG).show();

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        return true;
    }*/
}
