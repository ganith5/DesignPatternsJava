package com.patterns.prototype;

/**
 * Created by AbhishekH on 8/11/17.
 */
public class Tom implements Person {

    @Override
    public String toString() {
        return "TOM";
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Tom) super.clone();
    }
}
