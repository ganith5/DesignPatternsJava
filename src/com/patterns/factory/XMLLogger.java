package com.patterns.factory;

/**
 * Created by AbhishekH on 7/24/17.
 */
public class XMLLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("Log messages to XML File");
    }
}
