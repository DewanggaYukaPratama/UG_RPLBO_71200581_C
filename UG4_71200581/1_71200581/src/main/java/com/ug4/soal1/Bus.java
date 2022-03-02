package com.ug4.soal1;

import java.sql.Driver;
import java.util.ArrayList;


public class Bus {
    private String name;
    private Driver driver;
    private int CAPACITY;
    private final ArrayList<Passenger> passengers;
    private int usedCapacity;
    private final double fares;
    private double profit;
    private String[] ROUTE;

    public Bus (String namabus, Driver supirbus, int capacity, final ArrayList penumpangbus, int capacityterpakai,
                double tarif, double untung, String rute){
        name = namabus;
        driver = supirbus;
        CAPACITY = capacity;
        passengers = penumpangbus;
        usedCapacity = capacityterpakai;
        fares = tarif;
        profit = untung;

    }



}

