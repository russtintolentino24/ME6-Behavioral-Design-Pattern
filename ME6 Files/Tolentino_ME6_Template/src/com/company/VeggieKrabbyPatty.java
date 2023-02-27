package com.company;

public class VeggieKrabbyPatty extends KrabbyPatty {

    String[] veggiesUsed = { "Lettuce,", "Tomatoes,", "Caramelized Onions,", "Red Pepper" };
    String[] condimentsUsed = { "Oil,", "Ketchup" };

    boolean customerWantsMeat() { return false; }
    boolean customerWantsCheese() { return false; }

    public void addVegetables(){

        System.out.print("Adding the Vegetables: ");

        for (String vegetable : veggiesUsed){

            System.out.print(vegetable + " ");

        }

    }

    public void addCondiments(){

        System.out.print("Adding the Condiments: ");

        for (String condiment : condimentsUsed){

            System.out.print(condiment + " ");

        }

    }

    void addMeat() {}

    void addCheese() {}


}