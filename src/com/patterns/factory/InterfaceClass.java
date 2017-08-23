package com.patterns.factory;

/**
 * Created by AbhishekH on 7/25/17.
 */
public interface InterfaceClass {

     void helloMe();

    default void tryMe() {
        newStaticMethod();
        System.out.println("Try Me!");
    }


    static void newStaticMethod() {
        System.out.println("New Static method");
    }
}
