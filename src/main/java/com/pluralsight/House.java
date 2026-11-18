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
        double lotValue = this.lotSize * 0.25;
        if(condition == 1){
            price = BigDecimal.valueOf(((180 * squareFoot)));
        }
        else if(condition == 2){
            price = BigDecimal.valueOf(130 * squareFoot);
        }
        else if(condition == 3){
            price = BigDecimal.valueOf(90 * squareFoot);
        }
        else if(condition == 4){
            price = BigDecimal.valueOf(80 * squareFoot);
        }
        price = price.add(BigDecimal.valueOf(lotValue));
        return price;
    }

    public House() {
        super();
    }

    public House(String description, String dateAcquired, BigDecimal originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
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
