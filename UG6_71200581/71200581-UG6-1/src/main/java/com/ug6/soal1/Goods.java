package com.ug6.soal1;

public class Goods {
    private String code;
    private String name;
    private int quantity;
    private double price;


    public Goods(){

    }

    public Goods(String code, String name){
        this.name = name;
        this.code = code
    }

    public Goods(String code, String name, int quantity, double price){
        this.code = code;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }



}
