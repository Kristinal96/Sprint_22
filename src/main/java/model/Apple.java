package model;

import model.constants.Colour;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true); // фрукты являются вегетарианскими
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.RED)) {
            return 60; // скидка 60%
        }
        return 0;
    }
}