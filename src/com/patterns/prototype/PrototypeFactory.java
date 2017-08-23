package com.patterns.prototype;

/**
 * Created by AbhishekH on 8/11/17.
 */
public class PrototypeFactory {

    public static void main(String[] args) {
        Person person = null;
        try {
             person = Factory.getPrototype("harry");
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        }


        System.out.println("Person = " + person);
    }
}
