import java.util.*;
import java.util.stream.Collectors;

class Fruit {
    String name;
    double price;

    Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Customer {
    String name;
    String fruitBought;

    Customer(String name, String fruitBought) {
        this.name = name;
        this.fruitBought = fruitBought;
    }
}

public class Q15 {
    public static void main(String[] args) {
        List<Fruit> fruits = List.of(
                new Fruit("Apple", 100),
                new Fruit("Banana", 30),
                new Fruit("Mango", 120),
                new Fruit("Orange", 80)
        );

        List<Customer> customers = List.of(
                new Customer("John", "Apple"),
                new Customer("Mary", "Banana"),
                new Customer("Tom", "Apple"),
                new Customer("Sara", "Mango"),
                new Customer("Mike", "Orange"),
                new Customer("John", "Mango")
        );

        Map<String, Double> fruitPrices = fruits.stream()
                .collect(Collectors.toMap(fruit -> fruit.name, fruit -> fruit.price));

        Map<String, Long> fruitSalesCount = customers.stream()
                .collect(Collectors.groupingBy(customer -> customer.fruitBought, Collectors.counting()));

        Map<String, Double> totalSales = fruitSalesCount.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue() * fruitPrices.get(entry.getKey())
                ));

        totalSales.forEach((fruit, totalAmount) -> 
                System.out.println(fruit + " earned: " + totalAmount + " units."));
    }
}
