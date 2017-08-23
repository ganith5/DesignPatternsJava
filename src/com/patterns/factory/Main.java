package com.patterns.factory;

/**
 * Created by AbhishekH on 7/24/17.
 */
public class Main {
    public static void main(String[] args) {
        Logger logger = Creator.createLogger("xml");

        logger.log("Hello World!");
    }
}
