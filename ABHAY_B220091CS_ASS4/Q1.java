import java.util.*;
class Product {
    String name;

    Product(String name) {
        this.name = name;
    }

    String func() {
        return name;
    }

    @Override
    public String toString() {
        return func();
    }
}

class Electronics extends Product {
    int warranty;

    Electronics(String name, int warranty) {
        super(name);
        this.warranty = warranty;
    }

    @Override
    String func() {
        return name + warranty ;
    }
}

class Clothing extends Product {
    int size;

    Clothing(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    String func() {
        return name + size;
    }
}
class Inventory<T> {
    ArrayList<T> arr;

    Inventory() {
        arr = new ArrayList<>();
    }

    void addproduct(T t1) {
        arr.add(t1);
    }

    void removeproduct(T t1) {
        Iterator<T> it = arr.iterator();
        while (it.hasNext()) {
            if (it.next().equals(t1)) {
                it.remove();
                break; 
            }
        }
    }

    void Listall() {
        for (T it : arr) {
            System.out.println(it);
        }
    }
}

// Main class
public class Q1 {
    public static void main(String[] args) {
        // Inventory of Electronics
        Inventory<Electronics> I1 = new Inventory<>();
        Electronics e1 = new Electronics("Laptop", 2);
        Electronics e2 = new Electronics("Mobile", 1);
        I1.addproduct(e1);
        I1.addproduct(e2);
        I1.removeproduct(e1);
        I1.Listall();

        // Uncomment to create an inventory of Clothing
        // Inventory<Clothing> I2 = new Inventory<>();
        // Clothing c1 = new Clothing("T-Shirt", 42);
        // Clothing c2 = new Clothing("Jeans", 34);
        // I2.addproduct(c1);
        // I2.addproduct(c2);
        // I2.Listall();
    }
}
