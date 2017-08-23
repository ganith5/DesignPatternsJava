package com.patterns.chainofresp;

/**
 * Created by AbhishekH on 8/13/17.
 */
public class President extends PurchasePower {
    @Override
    protected String getRole() {
        return "President";
    }

    @Override
    protected double getAllowable() {
        return BASE * 40;
    }
}
