package com.ug5a.soal1;

public class TransPay {
    private String nama;
    private long saldo;





    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }
    public String getNama(){
        return this.nama;
    }
    public long getSaldo() {
        return this.saldo;
    }
    public void topUp(long tambahSaldo){
        if (tambahSaldo < 0) {
            System.out.println("Nominal saldo anda tidak valid, harus lebih dari 0");
        } else {
            this.saldo += tambahSaldo;
            System.out.println("TOP UP anda berhasil sebesar " + tambahSaldo);
        }
    }
    public void bayar(int jumlah, Keyboard keyboard){
        if (jumlah < 0) {
            System.out.println("Input Jumlah tidak sesuai");
        } else {
            if (jumlah * keyboard.getHarga() > this.saldo) {
                System.out.println("Pembayaran gagal! Saldo anda Kurang!");
            } else {
                System.out.println("Pembayaran sukses! silahkan mengambil "+ keyboard.getMerkModel() + "di counter");
            }
        }
        this.saldo -= (jumlah * keyboard.getHarga());
    }


}


