package com.patterns.chainofresp;

/**
 * Created by AbhishekH on 8/13/17.
 */
public class Manager extends PurchasePower {
    @Override
    protected String getRole() {
        return "Manager";
    }

    @Override
    protected double getAllowable() {
        return BASE * 10;
    }
}
