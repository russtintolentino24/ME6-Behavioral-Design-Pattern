package com.company;


public class CryptoObserver implements Observer {

    private double BitCoinPrice;
    private double DogePrice;
    private double SLPPrice;


    private static int observerIDTracker = 0;


    private int observerID;


    private Subject CryptoGrabber;

    public CryptoObserver(Subject cryptoGrabber){


        this.CryptoGrabber = cryptoGrabber;


        this.observerID = ++observerIDTracker;


        System.out.println("New Observer " + this.observerID);


        cryptoGrabber.register(this);

    }


    public void update(double BitCoinPrice, double DogePrice, double SLPPrice) {

        this.BitCoinPrice = BitCoinPrice;
        this.DogePrice = DogePrice;
        this.SLPPrice = SLPPrice;

        printThePrices();

    }

    public void printThePrices(){

        System.out.println(observerID + "\nBitCoin: " + BitCoinPrice + "\nDoge: " +
                DogePrice + "\nSLP: " + SLPPrice + "\n");

    }

}