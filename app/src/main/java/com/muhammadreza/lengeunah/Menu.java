package com.muhammadreza.lengeunah;

public class Menu {
    private int mFoto;
    private String mNama;
    private String mHarga;

    public Menu(int foto, String nama, String harga) {
        this.mFoto = foto;
        this.mNama = nama;
        this.mHarga = harga;
    }

    public int getmFoto() {
        return mFoto;
    }

    public String getmNama() {
        return mNama;
    }

    public String getmHarga() {
        return mHarga;
    }
}