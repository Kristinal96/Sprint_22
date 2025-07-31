package org.example;

import model.*;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты продуктов
        Food meat = new Meat(5, 100);              // Мясо: 5 кг по 100 руб/кг
        Food redApples = new Apple(10, 50, Colour.RED);       // Красные яблоки: 10 кг по 50 руб/кг
        Food greenApples = new Apple(8, 60, Colour.GREEN);    // Зелёные яблоки: 8 кг по 60 руб/кг

        Food[] foods = {meat, redApples, greenApples};

        // Создаем корзину
        ShoppingCart shoppingCart = new ShoppingCart(foods);

        System.out.printf("Общая сумма без скидки: %.2f%n", shoppingCart.totalCostNoDiscount());
        System.out.printf("Общая сумма со скидкой: %.2f%n", shoppingCart.totalCostWithDiscount());
        System.out.printf("Сумма вегетарианских продуктов без скидки: %.2f%n", shoppingCart.vegetarianCostNoDiscount());
    }
}