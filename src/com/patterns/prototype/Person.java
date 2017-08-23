package com.patterns.prototype;

/**
 * Created by AbhishekH on 8/11/17.
 */
public interface Person extends Cloneable{

    Person clone() throws CloneNotSupportedException;
}
