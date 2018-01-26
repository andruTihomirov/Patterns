package com.patterns.factory;

public abstract class EnemyShip {

    private String name;
    private double damage;

    public void followHeroShip() {
        System.out.println(name + "is following the hero");
    }

    public void displayEnemyShip() {
        System.out.println(name + "display enemy ship");
    }

    public void enemyShipShoots() {
        System.out.println(name + "attack and does " + damage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
