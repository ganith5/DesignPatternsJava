package com.patterns.factory;

/**
 * Created by AbhishekH on 7/24/17.
 */
public interface Creator {

    static Logger createLogger(String name) {
        if(name.equalsIgnoreCase("xml")){
            return new XMLLogger();
        }
        return null;
    }

}
