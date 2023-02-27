package com.company;

public class SandwichSculptor {

    public static void main(String[] args){

        AmericanKrabbyPatty Patrick = new AmericanKrabbyPatty();

        Patrick.makeSandwich();

        System.out.println();

        VeggieKrabbyPatty Squidward = new VeggieKrabbyPatty();

        Squidward.makeSandwich();

    }

}