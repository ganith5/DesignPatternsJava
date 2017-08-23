package com.patterns.factory;

/**
 * Created by AbhishekH on 7/26/17.
 */
public class JavaMain {

    public static void main(String[] args) {

        InterfaceClass interfaceClass = new InterfaceClassImpl();

        interfaceClass.helloMe();

        interfaceClass.tryMe();

        InterfaceClass.newStaticMethod();
    }
}
