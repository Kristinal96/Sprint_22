package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true); // Яблоки являются вегетарианскими
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED)) {
            return Discount.APPLE_RED_DISCOUNT_PERCENTAGE;
        }
        return 0;
    }
}