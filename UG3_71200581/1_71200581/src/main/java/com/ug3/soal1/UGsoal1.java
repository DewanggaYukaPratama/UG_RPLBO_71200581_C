package com.ug3.soal1;

import java.util.Scanner;
public class UGsoal1 {

    public static void main(String[] args) {

        System.out.println("===========\"Data Product\"==============");
        System.out.println("Masukkan Data Product Makanan Anda");
        Scanner a = new Scanner(System.in);
        System.out.print("Nama Makanan: ");
        String st1 = a.nextLine();

        System.out.print("Tanggal Kadaluarsa: ");
        String st2 = a.nextLine();

        System.out.print("Jumlah (quantity): ");
        int st3 = a.nextInt();

        System.out.print("Berat (Gram): ");
        int st4 = a.nextInt();

        System.out.println("===========\"Data Product\"==============");
        System.out.println("Nama Makanan = " + st1);
        System.out.println("Tanggal Kadaluarsa = " + st2);
        System.out.println("Jumlah(Quantity) = " + st3);
        System.out.println("Berat = " + st4 + ""+"gram");

    }
}