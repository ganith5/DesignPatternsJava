package com.patterns.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AbhishekH on 8/11/17.
 */
public class Factory {

    public static final Map<String, Person> prototypes = new HashMap<String,Person>();

    static {
        prototypes.put("tom", new Tom());
        prototypes.put("harry", new Harry());
    }

    public static Person getPrototype(String type) throws CloneNotSupportedException {
        return prototypes.get(type).clone() ;
    }
}
