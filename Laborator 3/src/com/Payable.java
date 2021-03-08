package com;

public interface Payable {


    /**
     * Interfata pentru clasele Hotel, Museum impreuna cu metodele respective
     * @param price
     */
    void setPrice(int price);
    void getPrice();
    void showLocationTime();
    void addLocationTime(String location, Integer time);

}