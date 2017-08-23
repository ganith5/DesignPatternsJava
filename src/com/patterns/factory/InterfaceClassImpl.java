package com.patterns.factory;

/**
 * Created by AbhishekH on 7/25/17.
 */
public class InterfaceClassImpl implements InterfaceClass {
    @Override
    public void helloMe() {
        newStaticMethod();
        System.out.println("hello me" +
                "1" +
                "2");
    }


    public static void newStaticMethod() {
        System.out.println("New Static method in sub class");
    }

//    @Override
//    public  void tryMe() {
//        System.out.println("Try Me in class impl");
//    }
}
