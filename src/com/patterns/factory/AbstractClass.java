package com.patterns.factory;

/**
 * Created by AbhishekH on 7/25/17.
 */
public abstract class AbstractClass {

    AbstractClass(){
        super();
    }

    private String name;

    abstract void tryMe();

    public void hello() {
        System.out.println("Hello World!");
    }

    private void helloMe() {
        System.out.println("Hello from me");
    }
}
