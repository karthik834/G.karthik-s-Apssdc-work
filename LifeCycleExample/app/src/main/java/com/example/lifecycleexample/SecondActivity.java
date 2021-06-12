package com.example.lifecycleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i("APSSDC","SecondActivityCreated");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("APSSDC","SecondActivityCreated");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("APSSDC","SecondActivityResumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("APSSDC","SecondActivitypaused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("APSSDC","SecondActivitystopped");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("APSSDC","SecondActivityrestarted");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("APSSDC","SecondActivityDestroyed");
    }
}