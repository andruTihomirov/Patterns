package com.patterns.observer;

import java.util.List;
import java.util.ArrayList;

public class StockGrabber implements Subject {

    private List<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        int observerIndex = observers.indexOf(observer);
        observers.remove(observerIndex);
        System.out.println("Observer [" + observerIndex + "] deleted");
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update(ibmPrice, applePrice, googlePrice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObserver();
    }
}
