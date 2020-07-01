package com.example.obspec;

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
    public void onScannerClick(View v){
        Intent i = new Intent(getApplicationContext(),scanActivityMenu.class);
        startActivity(i);
    }
    public void onARClick(View v){
        Intent i = new Intent(getApplicationContext(),arMenuActivity.class);
        startActivity(i);
    }
}