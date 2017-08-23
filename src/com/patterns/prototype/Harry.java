package com.patterns.prototype;

/**
 * Created by AbhishekH on 8/11/17.
 */
public class Harry implements Person{

    @Override
    public String toString() {
        return "HARRY";
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Harry)super.clone();
    }
}
