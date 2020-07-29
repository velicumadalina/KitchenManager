package com.codecool.kitchen;

import java.util.ConcurrentModificationException;
import java.util.Random;

public class Kitchen {

    public static void main(String[] args) throws ConcurrentModificationException {
        OpenRestaurant restaurant = new OpenRestaurant();
        employ(restaurant);
        restaurant.simulateAWorkingDay(8);
    }

    private static void employ(OpenRestaurant restaurant) {
        Chef chef = new Chef("Gordon Ramsay", 15031966);
        restaurant.hireEmployee(chef);
        KitchenHelper helper1 = new KitchenHelper("Jane", 25011995);
        restaurant.hireEmployee(helper1);
        KitchenHelper helper2 = new KitchenHelper("Jake", 30051994);
        restaurant.hireEmployee(helper2);
        KitchenHelper helper3 = new KitchenHelper("Mike", 25051995);
        restaurant.hireEmployee(helper3);
        Cook cook1 = new Cook("Marco", 23031987);
        restaurant.hireEmployee(cook1);
        Cook cook2 = new Cook("Stephanie", 12021985);
        restaurant.hireEmployee(cook2);

    }
}
