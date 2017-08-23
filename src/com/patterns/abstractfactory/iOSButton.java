package com.patterns.abstractfactory;

/**
 * Created by AbhishekH on 7/27/17.
 */
public class iOSButton implements Button{
    @Override
    public void paint() {
        System.out.println("Called paint for iOS button");
    }
}
