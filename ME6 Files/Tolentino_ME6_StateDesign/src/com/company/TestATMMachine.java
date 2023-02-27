package com.company;

public class TestATMMachine {

    public static void main(String[] args){

        ATMMachine atmMachine = new ATMMachine();

        atmMachine.insertCard();

        atmMachine.ejectCard();

        atmMachine.insertCard();

        atmMachine.insertPin(9876);

        atmMachine.requestCash(3000);

        atmMachine.insertCard();

        atmMachine.insertPin(9876);

    }
}