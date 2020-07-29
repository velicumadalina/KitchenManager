package com.codecool.kitchen;

import java.util.Random;

public class Chef extends Employee implements CookingInterface {
    Random random = new Random();
    boolean needsIngredient = false;
    Ingredients ingredientNeeded;
    boolean hasKnifeSet = false;

    public Chef(String name, int birthday) {
        this.name = name;
        this.birthday = birthday;
        this.salary = 10000;
        hasKnifeSet = true;
        gotKnifeSet();
        payTax();
    }


    public void gotKnifeSet() {
        if (hasKnifeSet) {
            System.out.println("Chef " + name + " received their knife set!");
        } else {
            System.out.println("There has been an error, Chef " + name + " didn't receive a knife set!");
        }
    }


    void work() {
        needsIngredient = random.nextBoolean();
        cook();
    }

    public void cook() {
        pickIngredientNeeded();
        System.out.println("GIVE ME " + ingredientNeeded + " RIGHT NOW!!!");

    }


    public void pickIngredientNeeded() {
        ingredientNeeded = Ingredients.values()[random.nextInt(Ingredients.values().length)];
        System.out.println("Chef " + name + " needs " + ingredientNeeded + "!");

    }

    public void insultHelpers() {
        String[] insults = {"WHAT ARE YOU? AN IDIOT SANDWICH!", "LOOK AT THIS MEAT! IT'S RAAAAAW!", "YOU DONKEYS!"};
        System.out.println(insults[random.nextInt(insults.length)]);
    }

    public boolean isNeedsIngredient() {
        return needsIngredient;
    }

    public void setNeedsIngredient(boolean b) {
        needsIngredient = b;
    }

    public Ingredients getIngredientNeeded() {
        return ingredientNeeded;
    }


}
