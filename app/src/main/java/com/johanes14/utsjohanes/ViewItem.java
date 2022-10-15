package com.johanes14.utsjohanes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewItem extends AppCompatActivity {
    ImageView imageView;
    TextView listData, listDesc, listPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_item);

        listData = findViewById(R.id.listMenu);
        listDesc = findViewById(R.id.listDesc);
        listPrice = findViewById(R.id.listPrice);
        imageView = findViewById(R.id.imageView);

        Intent intent = getIntent();
        String receiveMenu = intent.getStringExtra("menu");
        String receiveDesc = intent.getStringExtra("description");
        String receivePrice = intent.getStringExtra("price");
        int receiveImage = intent.getIntExtra("image",0);
        listData.setText(receiveMenu);
        listDesc.setText(receiveDesc);
        listPrice.setText(receivePrice);
        imageView.setImageResource(receiveImage);
    }
}