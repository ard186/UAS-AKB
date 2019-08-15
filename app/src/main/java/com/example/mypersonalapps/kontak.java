package com.example.mypersonalapps;
/*Nama : Afif Rizky Darmawan
NIM  : 10116168
KELAS : AKB-IF4
Tanggal Pengerjaan : 12 Agustus 2019*/

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class kontak extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_kontak, container, false);

        return view;
    }
}