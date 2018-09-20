package com.patterns.strategy;

/**
 * @author atsikhamirau on 20.09.2018
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Dog: " + new Dog().tryToFly());
        System.out.println("Bird: " + new Bird().tryToFly());
    }

}
