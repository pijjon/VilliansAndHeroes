package com.pluralsight;

public class ShowdownApp {

    public static void main(String[] args) {

        //create 2 super people
        SuperPerson eric =  new SuperPerson("Eric", 100);
        SuperPerson jazzyLi  = new SuperPerson("JazzyLi", 85);

        //print out the status of each SuperPerson
        System.out.println(eric.getStatus());
        System.out.println(jazzyLi.getStatus());

        //deal some damage
        eric.takeDamage(15);
        jazzyLi.takeDamage(5);

        //print out the status of each SuperPerson
        System.out.println(eric.getStatus());
        System.out.println(jazzyLi.getStatus());

        if(eric.isAlive()){
            System.out.println("Eric Lives!");
        }else{
            System.out.println("Eric is dead as hell");
        }

        if(jazzyLi.isAlive()){
            System.out.println("JazzyLi Lives!");
        }else{
            System.out.println("JazzyLi is dead as hell");
        }

        //make these SuperPeople fight each other
        eric.fight(jazzyLi);
        jazzyLi.fight(eric);

        //create a SuperHero form our class SuperHero that extends SuperPerson
        SuperHero myHero = new SuperHero("EricTheHero", 100, 25);


        myHero.fight(jazzyLi);

        //see what type of class eric is
        System.out.println("Eric is an instance of: " + eric.getClass());

        //see what type of class eric is
        System.out.println("EricTheHero is an instance of: " + myHero.getClass());

        //test the fighting stuff
        SuperHero hero1 = new SuperHero("SuperDude!", 100, 15);
        SuperHero hero2 = new SuperHero("SuperGirl!", 115, 25);

        //print some stats
        System.out.println("Before fighting " + hero1.getName() + " has " + hero1.getHealth() + " health");
        System.out.println("Before fighting " + hero2.getName() + " has " + hero2.getHealth() + " health");

        hero1.fight(hero2);
        hero2.fight(hero1);

        //print some stats
        System.out.println("After fighting " + hero1.getName() + " has " + hero1.getHealth() + " health");
        System.out.println("After fighting " + hero2.getName() + " has " + hero2.getHealth() + " health");

    }

}
