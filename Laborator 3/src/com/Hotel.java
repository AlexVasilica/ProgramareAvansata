package com;
import java.util.*;

import java.util.HashMap;

public class Hotel implements Payable{
    private String name;
    private int price;
    private Map<String, Integer> times = new HashMap<>();

    Hotel(String nameCity){
        this.name = nameCity;
    }
    /**
     * Adaugam o locatie si costul unei locatii
     */
    public void addLocationTime(String location, Integer time){
        times.put(location, time);
    }
    /**
     * Parcurgem toate cheile mapei
     */
    public void showLocationTime() {
        for (String key : times.keySet()) {
            System.out.println(name + " -> " + key + " : " + times.get(key));
        }
        /**
         * Afisam cheia + valoare din Map.
         */
    }

    /**
     * Setam pretul pentru Hotel
     * @param price
     */

    public void setPrice(int price){
        this.price = price;
    }
    public void getPrice(){
        System.out.println(this.price);
    }


}