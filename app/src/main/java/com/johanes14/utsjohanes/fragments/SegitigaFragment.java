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

public class SegitigaFragment extends Fragment {
    EditText edAlas, edTinggi;
    TextView txt_hsl_S;
    Button btnHitung_S;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_segitiga, container, false);
        edAlas = view.findViewById(R.id.edAlas);
        edTinggi = view.findViewById(R.id.edTinggi);
        btnHitung_S = view.findViewById(R.id.btnHitung_S);
        txt_hsl_S = view.findViewById(R.id.txt_hsl_S);

        btnHitung_S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double alas = Double.parseDouble(edAlas.getText().toString());
                double tinggi = Double.parseDouble(edTinggi.getText().toString());
                double luas = (alas * tinggi) / 2;
                double keliling = (alas * 3);
                txt_hsl_S.setText("Luas: " +luas+ " dan Keliling: "+keliling);
            }
        });
        return view;
    }
}