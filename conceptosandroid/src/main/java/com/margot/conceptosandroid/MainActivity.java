package com.margot.conceptosandroid;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("myLog", "OnCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e("myLog", "OnStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e("myLog", "OnResume");

        int orientation=this.getResources().getConfiguration().orientation;

        Integer suma = 0;

        if(orientation= Configuration.ORIENTATION_PORTRAIT){
            for (int i = 0; i < 101 ; i++) {
                suma = suma + i;
            }
            Log.e("myLog", suma);
        }
        else{

        }

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("myLog", "OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("myLog", "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("myLog", "OnDestroy");
    }

    @Override
    protected void onRestart() {
        Log.e("myLog", "OnRestart");
        super.onRestart();
    }

    public void click(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }


}
