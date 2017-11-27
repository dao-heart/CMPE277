package com.example.rishithrayaldandevenkata.finalproject;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    String Type;
    String User;
    String TAG ="Fragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Intent in = getIntent();
        User = in.getStringExtra("Type");

        if(User.toString().equals("User") ){
            FragmentManager fm1 = getFragmentManager();
            Log.d(TAG, "Fragment Manager Created");
            FragmentTransaction ft0 = fm1.beginTransaction();
            Log.d(TAG, "Fragment Transaction Started");
            UserFragment uf = new UserFragment();
            Log.d(TAG, "User Fragment Object Created");
            ft0.replace(R.id.second_activity,uf);
            ft0.commit();
            Toast.makeText(getApplicationContext(),"User Fragment Activated", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "Fragment User is created");
        }
        else{
            Log.d(TAG, "Entered the Fragment Activity");
            Log.d(TAG, "Overridden Admin Fragment Button");
            FragmentManager fm2 = getFragmentManager();
            Log.d(TAG, "Fragment Manager Created");
            FragmentTransaction ft1 = fm2.beginTransaction();
            Log.d(TAG, "Fragment Transaction Started");
            LibrarianFragment af = new LibrarianFragment();
            ft1.replace(R.id.second_activity, af);
            ft1.commit();
            Toast.makeText(getApplicationContext(),"Librarian Fragment Activated", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "Fragment librarian is created");
        }


    }
}
