import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;

import static model.constants.Colour.APPLE_COLOR_GREEN;
import static model.constants.Colour.APPLE_COLOR_RED;

public class Main {
    public static void main(String[] args){
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, APPLE_COLOR_RED);
        Apple greenApple = new Apple(8, 60, APPLE_COLOR_GREEN);

        Food[] foodArray = {meat, redApple, greenApple};

        ShoppingCart.getSumWithDiscount(foodArray);
        ShoppingCart.getSumWithoutDiscount(foodArray);
        ShoppingCart.getVegeterianSumWithoutDiscount(foodArray);
    }
}