package com.example.rishithrayaldandevenkata.finalproject;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rishithrayaldandevenkata on 11/25/17.
 */

public class UserFragment extends Fragment {
    String TAG = "User Fragment";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        Log.d(TAG, "Fragment Overridden");
        Log.d(TAG, "OnCreate Method called");
        Log.d(TAG, "Inflater_Returned");
        return inflater.inflate(R.layout.user_fragment, container, false);
    }
}
