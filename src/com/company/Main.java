package com.company;

public class Main {



    public static void main(String[] args) {
   // Cat catOne = new Cat();
    Cat catOne = new Cat("Adolf","M",4,"Polydactyl","Black");
        catOne.setNewYears(catOne,2);
   // Cat catTwo = new Cat("Shani","F",4,"Unknown","White and Black");


    catOne.print();
    catOne.theVoiceOfTheCat();
    catOne.slepp();
    //catTwo.print();
    //catTwo.slepp();
    }
}
