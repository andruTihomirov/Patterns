package com.patterns.strategy;

/**
 * @author atsikhamirau on 20.09.2018
 */
public abstract class Animal {

    private Flys flyingType;

    public String tryToFly() {
        return flyingType.fly();
    }

    public void setFlyingType(Flys flyingType) {
        this.flyingType = flyingType;
    }
}
