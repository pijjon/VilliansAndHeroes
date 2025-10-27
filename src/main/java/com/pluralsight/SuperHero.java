package com.pluralsight;

public class SuperHero extends SuperPerson{

    public SuperHero(String name, int health, int powerLevel){
        //since the parent knows what to do with this data, pass it to the parent constructor
        super(name, health);

        //deal with the custom hero stuff
        this.experiencePoints = powerLevel;
    }

}
