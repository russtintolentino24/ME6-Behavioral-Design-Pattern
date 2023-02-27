package com.company;

public class GrabCrypto{

    public static void main(String[] args){


        CryptoGrabber cryptoGrabber = new CryptoGrabber();


        CryptoObserver observer1 = new CryptoObserver(cryptoGrabber);

        cryptoGrabber.setBitCoinPrice(197.00);
        cryptoGrabber.setDogePrice(677.60);
        cryptoGrabber.setSLPPrice(676.40);

        CryptoObserver observer2 = new CryptoObserver(cryptoGrabber);

        cryptoGrabber.setBitCoinPrice(197.00);
        cryptoGrabber.setDogePrice(677.60);
        cryptoGrabber.setSLPPrice(676.40);


        // stockGrabber.unregister(observer2);

        cryptoGrabber.setBitCoinPrice(197.00);
        cryptoGrabber.setDogePrice(677.60);
        cryptoGrabber.setSLPPrice(676.40);


        Runnable getBitCoin = new GetTheCrypto(cryptoGrabber, 2, "BitCoin", 197.00);
        Runnable getDoge = new GetTheCrypto(cryptoGrabber, 2, "Doge", 677.60);
        Runnable getSLP = new GetTheCrypto(cryptoGrabber, 2, "SLP", 676.40);


        new Thread(getBitCoin).start();
        new Thread(getDoge).start();
        new Thread(getSLP).start();


    }

}