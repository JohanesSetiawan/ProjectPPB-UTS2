package com.johanes14.utsjohanes;

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

    public void Biodata(View view){
        Intent intent = new Intent(MainActivity.this, Biodata.class);
        startActivity(intent);
    }

    public void BangunDatar(View view){
        Intent intent = new Intent(MainActivity.this, BangunDatar.class);
        startActivity(intent);
    }

    public void MenuMakanan (View view){
        Intent intent = new Intent(MainActivity.this, MenuMakanan.class);
        startActivity(intent);
    }
}