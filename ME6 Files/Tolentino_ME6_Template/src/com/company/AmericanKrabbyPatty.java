package com.company;

public class AmericanKrabbyPatty extends KrabbyPatty {

    String[] meatUsed = { "Wagyu Ground Beef,", "Pepperoni,", "Bacon" };
    String[] cheeseUsed = { "Shredded Cheddar,", "Mozzarella,", "Bleu Cheese" };
    String[] veggiesUsed = { "Lettuce,", "Tomatoes,", "Caramelized Onions,", "Red Pepper" };
    String[] condimentsUsed = { "Oil,", "Ketchup" };

    public void addMeat(){

        System.out.print("Adding the Meat: ");

        for (String meat : meatUsed){

            System.out.print(meat + " ");

        }

    }

    public void addCheese(){

        System.out.print("Adding the Cheese: ");

        for (String cheese : cheeseUsed){

            System.out.print(cheese + " ");

        }

    }

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

}

