package model.service;

import model.Food;
import model.Meat;

public class ShoppingCart {
    Food[] foodArray;

    public ShoppingCart(Food[] foodArray) {
        this.foodArray = foodArray;
    }

    public static double getSumWithoutDiscount(Food[] foodArray) {
        double sumWithoutDiscount = 0;
        for (Food food : foodArray) {
            sumWithoutDiscount += food.getPrice() * food.getAmount();
        }
        return sumWithoutDiscount;
    }

    public static double getSumWithDiscount(Food[] foodArray) {
        double sumWithDiscount = 0;
        for (Food food : foodArray) {
            if (food instanceof Meat) {
                sumWithDiscount = sumWithDiscount + food.getPrice() * food.getAmount();
            }
//            else if (food.){

            }
        }
        return sumWithDiscount;
    }

    public static double getVegeterianSumWithoutDiscount(Food[] foodArray) {
        double vegeterianSumWithDiscount = 0;
        for (Food food : foodArray) {
            if (food.getIsVegeterian()) {
                vegeterianSumWithDiscount += food.getPrice() * food.getAmount();
            }
        }
        return vegeterianSumWithDiscount;
    }
}
