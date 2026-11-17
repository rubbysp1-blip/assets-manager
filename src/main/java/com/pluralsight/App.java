package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        House house = new House();
        house.setCondition(2);
        house.setSquareFoot(1800);
        house.setLotSize(6000);
        System.out.printf("%,.2f\n", house.getValue());

        House house2 = new House("house", "2026", new BigDecimal("20000"), "1234 street", 2, 1800,6000);

        System.out.println(house2.getValue());

        Vehicle vehicle = new Vehicle();
        vehicle.setOriginalCost(BigDecimal.valueOf(20000));
        vehicle.setYear(2018);
        vehicle.setMakeModel("Toyota");
        System.out.printf("%,.2f\n", vehicle.getValue());

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setOriginalCost(BigDecimal.valueOf(20000));
        vehicle2.setYear(1990);
        vehicle2.setMakeModel("chevy");
        System.out.printf("%,.2f\n", vehicle2.getValue());

        Vehicle vehicle3 = new Vehicle("car", "2024", new BigDecimal("20000"), "Honda", 2020, 200000);
        System.out.println(vehicle3.getValue());

        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(new House("my house", "2026", new BigDecimal("20000"), "1234 street", 2, 1800, 5000));
        assets.add(new House("sister's house", "2026", new BigDecimal("30000"), "1235 street", 2, 2500, 8000));
        assets.add(new Vehicle("my car", "2024", new BigDecimal("35000"), "Honda", 2020, 200000));
        assets.add(new Vehicle("sister's car", "2026", new BigDecimal("60000"), "Mercedes", 2026, 80000));

        for (Asset asset : assets){
            System.out.println("\nDescription: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Paid: " + asset.getOriginalCost());
            System.out.println("Value: " + asset.getValue());

            if(asset instanceof House house1){
                System.out.println("House Address: " + house1.getAddress());
            }
            if(asset instanceof Vehicle vehicle1){
                System.out.println("Year of Vehicle: " + vehicle1.getYear());
                System.out.println("Make/Model of Vehicle: " + vehicle1.getMakeModel());
            }
        }


    }
}
