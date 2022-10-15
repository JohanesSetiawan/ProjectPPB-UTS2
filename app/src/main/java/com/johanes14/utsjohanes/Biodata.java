package com.johanes14.utsjohanes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Biodata extends AppCompatActivity {
    LinearLayout telp, alamat, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        telp = findViewById(R.id.telpon);
        alamat = findViewById(R.id.alamat);
        email = findViewById(R.id.email);

        telp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wa = new Intent (Intent.ACTION_VIEW);
                String url = "https://wa.me/6285155299706";
                wa.setData(Uri.parse(url));
                startActivity(wa);
            }
        });

        alamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://plus.codes/6P4GXCQH+R5P");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:")); // only email apps should handle this
                intent.putExtra(Intent.EXTRA_EMAIL, "111202113467@mhs.dinus.ac.id");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Halo.");
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}