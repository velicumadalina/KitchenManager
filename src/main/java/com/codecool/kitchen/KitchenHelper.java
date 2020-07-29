package com.codecool.kitchen;

import java.util.ArrayList;
import java.util.Random;

public class KitchenHelper extends Employee {
    Random random = new Random();
    final int MAX_INDEX = 2;
    int count = random.nextInt(MAX_INDEX) + 1;
    ArrayList<Ingredients> ingredients = new ArrayList<>();
    boolean chefWantsIngredient;
    static boolean isIngredientGiven;

    public KitchenHelper(String name, int birthday) {
        this.name = name;
        this.birthday = birthday;
        this.salary = 2900;
        setIngredients(count);
        System.out.println(name + " has " + ingredients.toString());
        payTax();
    }

    void work() {
        System.out.println("Working in the kitchen");
    }

    public void setIngredients(int count) {
        for (int i = 0; i < count; i++) {
            ingredients.add(Ingredients.values()[random.nextInt(MAX_INDEX)]);
        }
    }

    void giveIngredient(Ingredients ingredient) {
        if (!isIngredientGiven) {
            if (ingredients.contains(ingredient)) {
                System.out.println(name + " says: HERE YOU GO, CHEF! THE " + ingredient);
                ingredients.remove(ingredient);
                System.out.println(name + " has " + ingredients.toString());
                setIsIngredientGiven(true);

            } else {
                System.out.println(name + " says: I DON'T HAVE ANY!");
                setIsIngredientGiven(false);
            }
        }
    }

    static void setIsIngredientGiven(boolean bool) {
        isIngredientGiven = bool;
    }

}
