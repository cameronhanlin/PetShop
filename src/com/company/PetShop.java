package com.company;

import java.util.Scanner;


public class PetShop {

    public static void main(String[] args) {
	/*
	Create a new project in InteliJ named Pets
    Rename your Main file to PetShop(right-click -> Refactor -> Rename…)
    Create 2 new classes
    One class should be called Dog
    One class should be called Cat
    Each class should have at 3 properties
    name
    age
    1 more of your choosing
    Each class should have accessor methods for each property
    In Petshop create two instances of each animal type
    Set values for each property
    Print a statement to the console saying “We have the following animals available: ” followed by property values
    (name, age, etc)of each instance of Dog and Cat.
    Bonus: Ask the user to pick the name of the animal that they want to purchase
    and check if that is one of the 4 animal’s names. Tell the user whether the name is not a valid choice.
	 */

        Scanner scan = new Scanner(System.in);

        Dog dog1 = new Dog("Fido", 3, 70.0);
        Dog dog2 = new Dog("Tucker", 2, 100.0);
        Cat cat1 = new Cat("Mittens", 12, 1.0);
        Cat cat2 = new Cat("Fluffy", 5, 2.0);

        String nameToSee = "XXXX";


        System.out.println("We have the following animals available: ");
        System.out.println(dog1.getName()+" is a "+dog1.getAge()+" month old dog, that costs $"+dog1.getCost());
        System.out.println(dog2.getName()+" is a "+dog2.getAge()+" month old dog, that costs $"+dog2.getCost());
        System.out.println(cat1.getName()+" is a "+cat1.getAge()+" month old cat, that costs $"+cat1.getCost());
        System.out.println(cat2.getName()+" is a "+cat2.getAge()+" month old cat, that costs $"+cat2.getCost());
        System.out.print("What name of pet would you like to see? ");
        nameToSee = scan.nextLine();

        nameToSee = nameToSee.toLowerCase();
        nameToSee = nameToSee.substring(0,1).toUpperCase()+nameToSee.substring(1);

        for(int i=1;i<3;i++){
            System.out.println("\b");
        }

        if(nameToSee.equals(dog1.getName()) || nameToSee.equals(dog2.getName()))
            System.out.println("Excellent Choice.");
        else if(nameToSee.equals(cat1.getName()) || nameToSee.equals((cat2.getName())))
            System.out.println("Good news! Our cats are terrible and almost free!");
        else
            System.out.println("We dont have that pet here");

    }
}
