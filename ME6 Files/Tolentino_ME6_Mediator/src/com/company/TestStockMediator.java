package com.company;

public class TestStockMediator{

    public static void main(String[] args){

        StockMediator nyse = new StockMediator();

        Forbes broker = new Forbes(nyse);

        WestSubEver broker2 = new WestSubEver(nyse);

        broker.saleOffer("AAPL", 100);
        broker.saleOffer("GOOG", 50);

        broker2.buyOffer("AAPL", 100);
        broker2.saleOffer("BTC", 10);

        broker.buyOffer("BTC", 10);
        //broker.buyOffer("BTC", 10);

        nyse.getstockOfferings();

    }

}