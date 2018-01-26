package com.patterns.factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What type ship? (U / R / B)");

        String enemyShipType = null;
        if (scanner.hasNextLine()) {
            enemyShipType = scanner.nextLine();
        }

        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        EnemyShip enemyShip = enemyShipFactory.makeEnemyShip(enemyShipType);

        doStaffEnemyShip(enemyShip);

    }

    public static void doStaffEnemyShip(EnemyShip enemyShip) {
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }

}
