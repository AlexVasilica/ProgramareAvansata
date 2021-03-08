package com;

import java.util.ArrayList;
import java.util.List;


public class City implements Classifiable{
    private String name;
    /**
     * Folosim un Array pentru memorarea locurilor
     */
    private List<String> locations = new ArrayList<String>();

    City(String nameCity){
        this.name = nameCity;
    }
    /**
     * Functie pentru adaugare locatie in lista
     * @param place
     */
    public void addLocation(String place){
        locations.add(place);
    }
    /**
     * Parcurgem Array-ul si afisam locatiile
     */
    public void showLocation(){
        for(int i = 0; i < locations.size(); i ++){
            System.out.println(locations.get(i));
        }
    }

 }