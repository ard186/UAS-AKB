package com.example.mypersonalapps;
/*Nama : Afif Rizky Darmawan
NIM  : 10116168
KELAS : AKB-IF4
Tanggal Pengerjaan : 12 Agustus 2019*/

import java.util.List;

public interface FriendView {
    void onLoad(List<FriendModel>friend);
    void onSave();
    void onDelete();
    void onUpdate();
}
