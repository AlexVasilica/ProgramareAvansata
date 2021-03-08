package com;

import java.util.HashMap;
import java.util.Map;

public class Museum implements Visitable, Payable {
    private String name;
    private int price;
    private int hourStart;
    private Map<String, Integer> times = new HashMap<>();

    Museum(String nameCity){
        this.name = nameCity;
    }

    /**
     * Parcurgem cheile mapei si afisam cheia + valoarea
     */
    public void showLocationTime() {
        for (String key : times.keySet()) {
            System.out.println(name + " -> " + key + " : " + times.get(key));
        }
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void getPrice(){
        System.out.println(this.price);
    }

    /**
     * Setam o ora de deschidere a hotelului.
     * @param hourOpen
     */
    public void setHourOpen(int hourOpen){
        this.hourStart = hourOpen;
    }
    public void getHour(){
        System.out.println(this.hourStart);
    }

    /**
     * Adaugam o locatia si costul unei locatii
     * @param location
     * @param time
     */
    public void addLocationTime(String location, Integer time){
        times.put(location, time);
    }
}