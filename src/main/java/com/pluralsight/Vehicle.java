package com.pluralsight;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle() {
        super();
    }

    public Vehicle(String description, String dateAcquired, BigDecimal originalCost) {
        super(description, dateAcquired, originalCost);
    }

    @Override
    public BigDecimal getValue(){
        LocalDateTime localDateTime = LocalDateTime.now();
        int yearsOld = localDateTime.getYear() - this.year;
        BigDecimal value;
        if(yearsOld <= 3){
            value = getOriginalCost().multiply(BigDecimal.valueOf(1 - (yearsOld * .03)));
        }
        else if(yearsOld <= 6){
            value = getOriginalCost().multiply(BigDecimal.valueOf(1 - (yearsOld * .06)));
        }
        else if(yearsOld <= 10){
            value = getOriginalCost().multiply(BigDecimal.valueOf(1 - (yearsOld * .09)));
        }
        else{
            value = BigDecimal.valueOf(1000);
        }
         return value;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
