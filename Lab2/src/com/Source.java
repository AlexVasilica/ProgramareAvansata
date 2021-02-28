package com;

public class Source {
    private int supply;
    private String name;
    private SourceType type;

    Source(SourceType newType, String newName) {
        this.name = newName;
        this.type = newType;
    }

    /**
     *getter for Name
     */
    public String getName() {
        return name;
    }

    /**
     * setter for Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter for Supply
     */
    public int getSupply() {
        return supply;
    }

    /**
     * setter for Supply
     */
    public void setSupply(int newSupply) {
        this.supply = newSupply;
    }

    @Override
    public String toString() {
        return "Source{" +
                "supply=" + supply +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}
