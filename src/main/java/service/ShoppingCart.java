package service;

import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double totalCostNoDiscount() {
        double sum = 0;
        for (Food food : items) {
            sum += food.calculateCost();
        }
        return sum;
    }

    public double totalCostWithDiscount() {
        double sum = 0;
        for (Food food : items) {
            double discountPercent = food.getDiscount() / 100;
            sum += food.calculateCost() * (1 - discountPercent);
        }
        return sum;
    }

    public double vegetarianCostNoDiscount() {
        double sum = 0;
        for (Food food : items) {
            if (food.isVegetarian()) {
                sum += food.calculateCost();
            }
        }
        return sum;
    }
}