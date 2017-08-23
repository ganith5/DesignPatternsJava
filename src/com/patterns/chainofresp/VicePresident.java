package com.patterns.chainofresp;

/**
 * Created by AbhishekH on 8/13/17.
 */
public class VicePresident extends PurchasePower {
    @Override
    protected String getRole() {
        return "Vice President";
    }

    @Override
    protected double getAllowable() {
        return BASE * 30;
    }
}
