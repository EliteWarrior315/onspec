package com.example.obspec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class scanActivityMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_menu);
    }
    public void plantscanClick(View v){
        Intent i = new Intent(getApplicationContext(),plantScan.class);
        startActivity(i);
    }
    public void animalScanClick(View v){
        Intent i = new Intent(getApplicationContext(),animalScanActivity.class);
        startActivity(i);
    }
    public void vehiclesScanClick(View v){
        Intent i = new Intent(getApplicationContext(),animalScanActivity.class);
        startActivity(i);
    }
    public void signboardScanClick(View v){
        Intent i = new Intent(getApplicationContext(),animalScanActivity.class);
        startActivity(i);
    }
    public void objectScanClick(View v){
        Intent i = new Intent(getApplicationContext(),animalScanActivity.class);
        startActivity(i);
    }
    public void fruitScanClick(View v){
        Intent i = new Intent(getApplicationContext(),animalScanActivity.class);
        startActivity(i);
    }
}