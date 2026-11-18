package com.pluralsight;

import java.math.BigDecimal;

public class Cash extends Asset{
    private BigDecimal cash;

    public Cash(String description, String dateAcquired, BigDecimal originalCost, BigDecimal cash) {
        super(description, dateAcquired, originalCost);
        this.cash = cash;
    }

    @Override
    public BigDecimal getValue(){
        return getOriginalCost();
    }
}
