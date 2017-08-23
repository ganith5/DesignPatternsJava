package com.patterns.abstractfactory;

/**
 * Created by AbhishekH on 7/27/17.
 */
public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.print("Called paint for windows button");
    }
}
