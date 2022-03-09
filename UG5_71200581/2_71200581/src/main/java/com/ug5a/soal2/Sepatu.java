package com.ug5a.soal2;

public class Sepatu {
    private String kode;
    private int nextNum;
    private String merkModel;
    private int ukuran;
    private long harga;
    private int stok;


    public Sepatu(String MerkModel, int Ukuran, long Harga, int Stok){
        merkModel = MerkModel;
        ukuran = Ukuran;
        harga = Harga;
        stok = Stok;

    }

    public String getKode() {
        return kode;
    }

    public String getMerkModel() {
        return merkModel;
    }

    public int getUkuran() {
        return ukuran;
    }

    public long getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }
}
