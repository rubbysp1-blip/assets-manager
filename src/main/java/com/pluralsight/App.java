package com.pluralsight;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        House house = new House();
        house.setCondition(2);
        house.setSquareFoot(1800);
        house.setLotSize(6000);
        System.out.printf("%,.2f\n", house.getValue());

        Vehicle vehicle = new Vehicle();
        vehicle.setOriginalCost(BigDecimal.valueOf(20000));
        vehicle.setYear(2024);
        System.out.printf("%,.2f\n", vehicle.getValue());

        Vehicle vehicle2 = new Vehicle();
        vehicle.setOriginalCost(BigDecimal.valueOf(20000));
        vehicle.setYear(1990);
        System.out.printf("%,.2f\n", vehicle.getValue());
    }
}
