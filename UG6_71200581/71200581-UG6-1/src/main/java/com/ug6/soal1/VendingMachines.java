package com.ug6.soal1;

import java.util.ArrayList;

public class VendingMachines {
    private String code;
    private int capacity;
    private int usedCapacity;
    private ArrayList<Goods> goods;
    private ArrayList<double> acceptanceBalance;
    private double consumerMoney;

    public class VendingMachine(){

    }

    public class VendingMachine(String code, int capacity){
        this.code = code;
        this.capacity = capacity;
    }

    public class VendingMachine(String code, int capacity, Goods goods, double accpetanceBalanced){
        this.code = code;
        this capacity = capacity;
        this.goods = goods;
        this.acceptanceBalance = accpetanceBalanced;

    }



}




