package com.company;

public class Main {

    public static void main(String[] args) {
        Cat catOne = new Cat("Adolf", "M", 4, "Polydactyl", "Black");
        catOne.setNewYears(catOne, 2);
        System.out.println(catOne.toString());
        catOne.theVoiceOfTheCat();
        catOne.slepp();
        // Cat catTwo = new Cat("Shani","F",4,"Unknown","White and Black");
        //catTwo.print();
        //catTwo.slepp();
    }
}
