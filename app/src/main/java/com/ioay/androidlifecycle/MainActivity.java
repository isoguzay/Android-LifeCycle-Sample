package com.ioay.androidlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("MainActivity", "onCreate running!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("MainActivity", "onStart running!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("MainActivity", "onResume running!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("MainActivity", "onPause running!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("MainActivity", "onStop running!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("MainActivity", "onDestroy running!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("MainActivity", "onRestart running!");
    }
}
