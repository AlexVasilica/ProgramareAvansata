package com;

public class Main {
    public static void main(String[] args) {
        Source src1 = new Source(SourceType.FACTORY, "S1");
        Source src2 = new Source(SourceType.WAREHOUSE, "S2");
        Source src3 = new Source(SourceType.WAREHOUSE, "S3");

        Destination destination1 = new Destination("D1");
        Destination destination2 = new Destination("D1");
        Destination destination3 = new Destination("D1");


        Problem problem1 = new Problem(3);
        src1.setSupply(20);
        src2.setSupply(35);
        src3.setSupply(25);

        destination1.setDemand(20);
        destination2.setDemand(25);
        destination3.setDemand(25);
    }
}
