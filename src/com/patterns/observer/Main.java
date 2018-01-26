package com.patterns.observer;

public class Main {

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setApplePrice(677.60);
        stockGrabber.setGooglePrice(676.40);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setApplePrice(677.60);
        stockGrabber.setGooglePrice(676.40);

        stockGrabber.unregister(observer1);

        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setApplePrice(677.60);
        stockGrabber.setGooglePrice(676.40);

        Runnable getIBM = new GetStock(stockGrabber, 2, "IBM", 197.00);
        Runnable getAPPLE = new GetStock(stockGrabber, 2, "APPLE", 197.00);
        Runnable getGOOGLE = new GetStock(stockGrabber, 2, "GOOGLE", 197.00);

        new Thread(getIBM).start();
        new Thread(getAPPLE).start();
        new Thread(getGOOGLE).start();

    }
}
