package com;

/**
 *  Destination class
 */
public class Destination {

    private String name;
    private int demand;

    Destination(String newName)
    {
        this.name = newName;
    }
    /**
     * setter for name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for name
     */
    public String getName() {
        return name;
    }

    /**
     * getter for demand
     */
    public int getDemand()
    {
        return demand;
    }

    /**
     * setter for demand
     */
    public void setDemand(int demand)
    {
        this.demand = demand;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "name='" + name + '\'' +
                ", demand=" + demand +
                '}';
    }
}
