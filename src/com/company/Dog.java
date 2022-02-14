package com.company;

public class Dog {

    private String name;
    private int age; //months
    private double cost;


    //set name
    public void setName(String newName){
        name = newName;
    }

    //get name
    public String getName(){
        return name;
    }

    //set age
    public void setAge(int newAge){
        age = newAge;
    }

    //get age
    public int getAge(){
        return age;
    }

    //set cost
    public void setCost(double newCost){
        cost = newCost;
    }

    //get cost
    public double getCost(){
        return cost;
    }


}
