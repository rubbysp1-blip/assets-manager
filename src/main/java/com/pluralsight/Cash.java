package com.pluralsight;

import java.math.BigDecimal;

public class Cash extends Asset{
    private BigDecimal cash;

    public Cash(BigDecimal cash) {
        this.cash = cash;
    }

    @Override
    public BigDecimal getValue(){
        return cash;
    }
}
