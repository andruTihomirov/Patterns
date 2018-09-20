package com.patterns.strategy;

/**
 * @author atsikhamirau on 20.09.2018
 */
public class Dog extends Animal {

    public Dog() {
        setFlyingType(new CantFly());
    }

}
