package com.patterns.chainofresp;

/**
 * Created by AbhishekH on 8/13/17.
 */
abstract class PurchasePower {

    protected PurchasePower successor;

    protected final static double BASE = 500;


    protected abstract String getRole();
    protected abstract double getAllowable();

    public void setSuccessor(PurchasePower successor){

        this.successor = successor;

    }

    public void processRequest(PurchaseRequest purchaseRequest) {

        if(purchaseRequest.getAmount() < getAllowable()) {
            System.out.println("Ok, I "+ getRole() + " will process");
        }else if(successor != null){
            successor.processRequest(purchaseRequest);
        }

    }





}
