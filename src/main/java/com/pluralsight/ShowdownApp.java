package com.pluralsight;

public class ShowdownApp {

    public static void main(String[] args) {

        // create 2 super people
        SuperPerson hero = new SuperHero("Deku", 100, 56);
        SuperPerson villain = new SuperVillain("Dabi", 100, 60);

        duel(hero, villain);

    }


    public static void duel(SuperPerson fighter1, SuperPerson fighter2) {
        SuperPerson attacker;
        SuperPerson defender;
        if (fighter1.getHealth() == 0 || fighter2.getHealth() == 0) {
            System.out.println("Unable to duel. One or more fighters already down.");
            return;
        } else if (fighter1.getExperiencePoints() > fighter2.getHealth()) {
            attacker = fighter1;
            defender = fighter2;
            System.out.println(fighter1 + " makes the first move!");
        } else {
            attacker = fighter2;
            defender = fighter1;
            System.out.println(fighter2 + " makes the first move!");
        }

        for (int i = 1; fighter1.getHealth() > 0 && fighter2.getHealth() > 0; i++) {
            System.out.println("Turn " + i + ":");
            attacker.attack(defender);
            if (defender.isAlive()) {
                SuperPerson temp = attacker;
                attacker = defender;
                defender = temp;
            }
            else {
                System.out.println(attacker.getName() + " has defeated " + defender.getName());
            }
        }

    }


}
