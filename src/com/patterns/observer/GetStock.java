package com.patterns.observer;

import java.text.DecimalFormat;

public class GetStock implements Runnable {

    private int startTime;
    private String stock;
    private double price;

    private Subject stockGrabber;

    public GetStock(Subject stockGrabber, int startTime, String stock, double price) {
        this.stockGrabber = stockGrabber;
        this.startTime = startTime;
        this.stock = stock;
        this.price = price;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // do nothing
            }

            double randNum = (Math.random() * (0.6)) - .03;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            price = Double.valueOf(decimalFormat.format(price + randNum).replace(",", "."));
            if (stock.equals("IBM")) {
                ((StockGrabber) stockGrabber).setIbmPrice(price);
            }
            if (stock.equals("APPLE")) {
                ((StockGrabber) stockGrabber).setIbmPrice(price);
            }
            if (stock.equals("GOOGLE")) {
                ((StockGrabber) stockGrabber).setIbmPrice(price);
            }

            System.out.println(stock + ": " + decimalFormat.format(price + randNum)
                    + " " + decimalFormat.format(randNum));
        }
    }
}
