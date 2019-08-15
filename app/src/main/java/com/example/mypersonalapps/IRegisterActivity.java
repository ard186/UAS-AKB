package com.example.mypersonalapps;
/*Nama : Afif Rizky Darmawan
NIM  : 10116168
KELAS : AKB-IF4
Tanggal Pengerjaan : 12 Agustus 2019*/

public interface IRegisterActivity {

    void checkInputan();
    boolean cekPassword(String Password, String confirmPassword);
    boolean cekUser(String Username);

}