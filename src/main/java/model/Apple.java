package model;

import static model.constants.Colour.APPLE_COLOR_RED;
import static model.constants.Discount.DISCOUNT_FOR_RED_APPLE;
import static model.constants.Discount.NO_DISCOUNT;

public class Apple extends Food implements Discountable {
    String colour;

    public String getColour() {
        return colour;
    }

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount(String...colour){
        if (colour.equals(APPLE_COLOR_RED))
            return DISCOUNT_FOR_RED_APPLE;
        else return NO_DISCOUNT;
    }
}