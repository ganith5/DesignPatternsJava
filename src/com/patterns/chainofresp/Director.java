package com.patterns.chainofresp;

/**
 * Created by AbhishekH on 8/13/17.
 */
public class Director extends PurchasePower {
    @Override
    protected String getRole() {
        return "Director";
    }

    @Override
    protected double getAllowable() {
        return BASE * 20;
    }
}
