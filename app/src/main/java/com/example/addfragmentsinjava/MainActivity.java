package com.example.addfragmentsinjava;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBarActivity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Myfragment frag=new Myfragment();
        android.app.FragmentManager manager= getFragmentManager();    
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.my_layout,frag,"harshit");
        transaction.commit();
    }

}