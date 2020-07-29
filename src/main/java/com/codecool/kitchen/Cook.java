package com.codecool.kitchen;

public class Cook extends Employee implements CookingInterface {
    boolean hasKnifeSet;

    public Cook(String name, int birthday) {
        this.name = name;
        this.birthday = birthday;
        this.salary = 5500;
        this.hasKnifeSet = true;
        gotKnifeSet();
        payTax();
    }


    public void gotKnifeSet() {
        if (hasKnifeSet) {
            System.out.println("Cook " + name + " received their knife set!");
        } else {
            System.out.println("There has been an error, Cook " + name + " didn't receive a knife set!");
        }
    }

    void work() {
        cook();
    }

    public void cook() {
        System.out.println(name + " is cooking...");

    }


}
