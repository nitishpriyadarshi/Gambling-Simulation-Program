package com.bridgelab;
// As a Gambler, would start with a stake of $100 every day and bet $1 every game.//
public class GamblingSimulation {
    //CONSTANTS for Gambling Game
    private static final int PER_DAY_STACK = 100;
    private static final int BET = 1;

    //Method to Show the Status of Gambler
    private static void showGamblerStatus() {
        System.out.println("Per Day Stack : $"+ PER_DAY_STACK);
        System.out.println("Bet Per Game : $"+ BET);
    }

    public static void main(String[] args) {
        //Starting Message for User
        System.out.println("Welcome to Gambling Simulation Problem.");

        //Shows the Initial Status of Gambler
        showGamblerStatus();
    }
}
