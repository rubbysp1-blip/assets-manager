package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        //abstract

        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(new House("my house", "2026", new BigDecimal("20000"), "1234 street", 2, 1800, 5000));
        assets.add(new House("sister's house", "2026", new BigDecimal("30000"), "1235 street", 2, 2500, 8000));
        assets.add(new Vehicle("my car", "2024", new BigDecimal("35000"), "Honda", 2020, 200000));
        assets.add(new Vehicle("sister's car", "2026", new BigDecimal("60000"), "Mercedes", 2026, 80000));
        assets.add(new Cash("Work","2026-11-16", new BigDecimal("2000")));

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

        // You can explain why your Abstract Assets work wasn't in main until now, and what the
        // merge did
        //The abstract work was not in the main at first because it was done in a separate branch.
        //So, once the merge was done it inserted the changes that were made to the code.
    }
}
