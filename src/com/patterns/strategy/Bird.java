package com.patterns.strategy;

/**
 * @author atsikhamirau on 20.09.2018
 */
public class Bird extends Animal {

    public Bird() {
        setFlyingType(new ItFlys());
    }

}
