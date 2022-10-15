package com.johanes14.utsjohanes.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.johanes14.utsjohanes.R;

public class PersegiFragment extends Fragment {
    EditText edSisi;
    Button btnHitung_P;
    TextView txt_hsl_P;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_persegi, container, false);
        edSisi = view.findViewById(R.id.edSisi);
        btnHitung_P = view.findViewById(R.id.btnHitung_P);
        txt_hsl_P = view.findViewById(R.id.txt_hsl_P);

        //Button Hitung
        btnHitung_P.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double sisi =Double.parseDouble(edSisi.getText().toString());
                int luas = (int) (sisi * sisi);
                int keliling = (int) (4 * sisi);
                txt_hsl_P.setText("Luas: " +luas+ " dan Keliling: "+keliling);
            }
        });
        return view;
    }

}