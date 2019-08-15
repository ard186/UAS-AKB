package com.example.mypersonalapps;
/*Nama : Afif Rizky Darmawan
NIM  : 10116168
KELAS : AKB-IF4
Tanggal Pengerjaan : 12 Agustus 2019*/

public interface MainPresenter {
    void save(FriendModel friend);
    void update(FriendModel friend);
    void delete(FriendModel friend);
    void load();
}
