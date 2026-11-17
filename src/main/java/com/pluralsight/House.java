package com.pluralsight;

import java.math.BigDecimal;

public class House extends Asset{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    @Override
    public BigDecimal getValue(){
        BigDecimal price = new BigDecimal("0");
        if(condition == 1){
            price = BigDecimal.valueOf((180 * squareFoot) + (lotSize * 0.25));
        }
        if(condition == 2){
            price = BigDecimal.valueOf(130 * squareFoot + (lotSize * 0.25));
        }
        if(condition == 3){
            price = BigDecimal.valueOf(90 * squareFoot + (lotSize * 0.25));
        }
        if(condition == 4){
            price = BigDecimal.valueOf(80 * squareFoot + (lotSize * 0.25));
        }
        return price;
    }

    public House() {
        super();
    }

    public House(String description, String dateAcquired, BigDecimal originalCost) {
        super(description, dateAcquired, originalCost);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
}
