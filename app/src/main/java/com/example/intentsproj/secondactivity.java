package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class secondactivity extends AppCompatActivity {


       private EditText Number1;
       private EditText Number2;


    protected void onCreate(Bundle savedInstanceState, Object findviewid) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        Context context = getApplicationContext();
        //The context to use. Usually your Application or Activity object
        CharSequence message = "You just clicked the OK button";
        //Display string
        int duration = Toast.LENGTH_SHORT;
        //How long the toast message will lasts
        Toast toast = Toast.makeText(context, message, duration);
        toast.show();
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
    }
}



