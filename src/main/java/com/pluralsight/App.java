package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Asset asset = new House();
        House house = new House();
        house.setSquareFoot(1800);
        house.setLotSize(6000);
        System.out.println(asset.getValue());
    }
}
