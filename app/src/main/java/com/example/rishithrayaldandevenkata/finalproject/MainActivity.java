package com.example.rishithrayaldandevenkata.finalproject;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String TAG = "Android";
    Button b3;
    EditText email, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Activity is created");

            email = (EditText)findViewById(R.id.editText);
            password = (EditText)findViewById(R.id.editText2);
            b3 = (Button)findViewById(R.id.login);

            String User = email.getText().toString();
            String pass = password.getText().toString();
            Boolean a = User.contains("@sjsu.edu");
            Boolean b = pass.equals("admin");

            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String User = email.getText().toString();
                    String pass = password.getText().toString();
                    Boolean a = User.contains("@sjsu.edu");
                    Boolean b = pass.equals("admin");
                    if(a&&b){
                        Toast.makeText(getApplicationContext(),"Redirecting..",Toast.LENGTH_SHORT).show();
                        Intent in3 = new Intent(v.getContext(), SecondActivity.class);
                        in3.putExtra("Type", "Librarian");
                        startActivity(in3);
                    }
                    else if(email.getText().toString().equals("admin1")&& password.getText().toString().equals("admin1")){
                        Toast.makeText(getApplicationContext(),"Redirecting..",Toast.LENGTH_SHORT).show();
                        Intent in4 = new Intent(v.getContext(), SecondActivity.class);
                        in4.putExtra("Type", "User");
                        startActivity(in4);
                    }else{
                        Log.d(TAG, "Entered into else String");
                        Toast.makeText(getApplicationContext(),"Wrong Credentials", Toast.LENGTH_LONG).show();
                    }
                }
            });




    }

}
