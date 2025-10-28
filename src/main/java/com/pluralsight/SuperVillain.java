package com.pluralsight;

public class SuperVillain extends SuperPerson   {

    public SuperVillain(String name, int health, int evilPoints) {
        super(name, health);

        this.experiencePoints = evilPoints;
    }


}
