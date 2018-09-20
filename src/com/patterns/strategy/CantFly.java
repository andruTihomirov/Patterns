package com.patterns.strategy;

/**
 * @author atsikhamirau on 20.09.2018
 */
public class CantFly implements Flys {

    @Override
    public String fly() {
        return "I can't fly";
    }
}
