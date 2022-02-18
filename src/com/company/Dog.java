package com.company;

public class Dog {

    private String name;
    private int age; //months
    private double cost;


    public Dog(String name, int age, double cost){
        this.name = name;
        this.age = age;
        this.cost = cost;
    }


    //set name
    public void setName(String name){
        this.name = name;
    }

    //get name
    public String getName(){
        return name;
    }

    //set age
    public void setAge(int age){
        this.age = age;
    }

    //get age
    public int getAge(){
        return age;
    }

    //set cost
    public void setCost(double cost){
        this.cost = cost;
    }

    //get cost
    public double getCost(){
        return cost;
    }


}
