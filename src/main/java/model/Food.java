package model;

public abstract class Food implements Discountable {
    private int amount;     // Количество продукта в килограммах
    private double price;   // Цена за килограмм
    private boolean isVegetarian; // Флаг, показывающий, является ли продукт вегетарианским

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double calculateCost() {
        return amount * price;
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}