package com.johanes14.utsjohanes.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.johanes14.utsjohanes.R;

public class LingkaranFragment extends Fragment {
    EditText edJari;
    Button btnHitung_L;
    TextView txt_hsl_L;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lingkaran, container, false);
        edJari = view.findViewById(R.id.edJari);
        btnHitung_L = view.findViewById(R.id.btnHitung_L);
        txt_hsl_L = view.findViewById(R.id.txt_hsl_L);

        btnHitung_L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double jari =Double.parseDouble(edJari.getText().toString());
                if(jari%7==0){
                    int luas = (int) (22 * jari * jari)/7;
                    int keliling = (int) (2 * 22 * jari)/7;
                    txt_hsl_L.setText("Luas 22/7 = " + luas + " dan Keliing = " + keliling);
                }else{
                    int luas = (int) (3.14 * jari * jari);
                    int keliling = (int) (2 * 3.14 * jari);
                    txt_hsl_L.setText("Luas 3.14 = " + luas +" dan Keliling = " + keliling);
                }
            }
        });

        return view;
    }
}