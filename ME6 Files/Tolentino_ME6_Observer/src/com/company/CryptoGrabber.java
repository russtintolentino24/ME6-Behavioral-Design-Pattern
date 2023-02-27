package com.company;

import java.util.ArrayList;


public class CryptoGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double BitCoinPrice;
    private double DogePrice;
    private double SLPPrice;

    public CryptoGrabber(){


        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver) {


        observers.add(newObserver);

    }

    public void unregister(Observer deleteObserver) {


        int observerIndex = observers.indexOf(deleteObserver);


        System.out.println("Observer " + (observerIndex+1) + " deleted");


        observers.remove(observerIndex);

    }

    public void notifyObserver() {

        for(Observer observer : observers){

            observer.update(BitCoinPrice, DogePrice, SLPPrice);

        }
    }


    public void setBitCoinPrice(double newBitCoinPrice){

        this.BitCoinPrice = newBitCoinPrice;

        notifyObserver();

    }

    public void setDogePrice(double newDogePrice){

        this.DogePrice = newDogePrice;

        notifyObserver();

    }

    public void setSLPPrice(double newSLPPrice){

        this.SLPPrice = newSLPPrice;

        notifyObserver();

    }

}