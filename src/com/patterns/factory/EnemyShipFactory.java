package com.patterns.factory;

public class EnemyShipFactory {

    public EnemyShip makeEnemyShip(String shipType) {
        EnemyShip enemyShip = null;

        if (shipType.equals("U")) {
            enemyShip = new UFOEnemyShip();
        }
        else if (shipType.equals("R")) {
            enemyShip = new RocketEnemyShip();
        }
        else if (shipType.equals("B")) {
            enemyShip = new BigUFOEnemyShip();
        }

        return enemyShip;
    }

}
