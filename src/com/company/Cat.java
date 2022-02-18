package com.company;

public class Cat {

    private String name;
    private int age; //months
    private double cost;


    public Cat(String name, int age, double cost){
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
        return this.name;
    }

    //set age
    public void setAge(int age){
        this.age = age;
    }

    //get age
    public int getAge(){
        return this.age;
    }

    //set cost
    public void setCost(double cost){
        this.cost = cost;
    }

    //get cost
    public double getCost(){
        return this.cost;
    }

}
