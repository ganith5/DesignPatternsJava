package com.patterns.chainofresp;

/**
 * Created by AbhishekH on 8/13/17.
 */
public class PurchaseRequest {

    private String purpose;

    private double amount;

    PurchaseRequest(String purpose, double amount) {
        this.purpose = purpose;
        this.amount = amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
