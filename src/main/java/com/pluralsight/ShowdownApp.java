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

    }

}
