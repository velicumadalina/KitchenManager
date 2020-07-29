package com.codecool.kitchen;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Random;

public class OpenRestaurant {
    ArrayList<Employee> currentEmployees = new ArrayList<>();
    Random random = new Random();

    public OpenRestaurant() {

    }

    public ArrayList<Employee> getCurrentEmployees() {
        return currentEmployees;
    }

    void hireEmployee(Employee employee) {
        currentEmployees.add(employee);
    }

    void simulateAWorkingDay(int hours) {
        for (int i = 0; i < hours; i++) {
            System.out.println("BEGINNING OF HOUR " + i);
            for (Employee employee : currentEmployees) {
                if (employee instanceof Cook) {
                    employee.work();
                }
                if (employee instanceof Chef) {
                    ((Chef) employee).setNeedsIngredient(random.nextBoolean());
                    if (((Chef) employee).isNeedsIngredient()) {
                        ((Chef) employee).cook();
                        Ingredients ingredientNeeded = ((Chef) employee).getIngredientNeeded();
                        for (Employee emp : currentEmployees) {
                            if (emp instanceof KitchenHelper) {
                                ((KitchenHelper) emp).giveIngredient(ingredientNeeded);
                            }
                        }
                    } else {
                        ((Chef) employee).insultHelpers();
                    }
                }

            }
            System.out.println("END OF HOUR " + i);
            KitchenHelper.setIsIngredientGiven(false);
        }
    }


}
