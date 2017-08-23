package com.patterns.chainofresp;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by AbhishekH on 8/13/17.
 */
public class CheckingAuthority {

    public static void main(String[] args) {
        Manager manager = new Manager();
        Director director = new Director();
        VicePresident vicePresident = new VicePresident();
        President president = new President();

        manager.setSuccessor(director);
        director.setSuccessor(vicePresident);
        vicePresident.setSuccessor(president);

        try {
            while (true) {
                System.out.println("Enter the amount > ");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                manager.processRequest(new PurchaseRequest("General", d));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
