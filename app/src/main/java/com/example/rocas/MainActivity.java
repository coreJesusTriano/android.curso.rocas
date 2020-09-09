package com.example.rocas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openActivityInfo(View view){
        Intent activInfo = new Intent(this, InfoActivity.class);
        startActivity(activInfo);
    }

    public void closeApp(View view){
        finish();
    }
}