package com.example.edu.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class SecondActivity extends AppCompatActivity {

    final String TAG = "States";
    final String ACTIVITY = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG,ACTIVITY + " onCreate()");

        ((Button)findViewById(R.id.buttonSecond)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),ThirdActivity.class);
                startActivity(intent);
            }
        });
    }


   @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,ACTIVITY + " onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,ACTIVITY + " onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,ACTIVITY + " onResume()");
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,ACTIVITY + " onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,ACTIVITY + " onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,ACTIVITY + " onDestroy()");
    }


}
