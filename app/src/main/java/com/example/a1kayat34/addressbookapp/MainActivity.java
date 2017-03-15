package com.example.a1kayat34.addressbookapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//Make menu appear
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }

    //when user selects item


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.add){

            return true;
        }
        if(item.getItemId()==R.id.save){

            return true;
        }
        if(item.getItemId()==R.id.search){

            return true;
        }
        if(item.getItemId()==R.id.load){

            return true;
        }
        //if nothing selected
        return false;
    }
}
