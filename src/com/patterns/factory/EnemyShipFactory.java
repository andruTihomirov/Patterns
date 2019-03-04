package com.patterns.factory;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String shipType) {
        switch (shipType) {
            case "U":
                return new UFOEnemyShip();
            case "R":
                return new RocketEnemyShip();
            case "B":
                return new BigUFOEnemyShip();
        }
        return null;
    }

}
