import model.Food;
import model.Meat;
import model.Apple;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты продуктов
        Food meat = new Meat(5, 100);           // Мясо: 5 кг по 100 руб/кг
        Food redApples = new Apple(10, 50, "red");      // Красные яблоки: 10 кг по 50 руб/кг
        Food greenApples = new Apple(8, 60, "green");   // Зеленые яблоки: 8 кг по 60 руб/кг

        // Формируем массив продуктов
        Food[] foods = {meat, redApples, greenApples};

        // Создаем корзину
        ShoppingCart shoppingCart = new ShoppingCart(foods);

        // Расчет и вывод результатов
        System.out.println("Общая сумма без скидки: " + shoppingCart.totalCostNoDiscount());
        System.out.println("Общая сумма со скидкой: " + shoppingCart.totalCostWithDiscount());
        System.out.println("Сумма вегетарианских продуктов без скидки: " + shoppingCart.vegetarianCostNoDiscount());
    }
}