class Vehicle {
    public void start() {
        System.out.println("Vehicle started");
    }
}

class Car extends Vehicle {
    public void start() {
        super.start();
        System.out.println("Car started");
    }
}

class ElectricCar extends Car {
    public void start() {
        super.start();
        System.out.println("Electric car started");
    }
}

class Tesla extends ElectricCar {
    public void start() {
        super.start();
        System.out.println("Tesla started");
    }
}
public class Q6{
    public static void main(String[] args) {
        Tesla t1=new Tesla();
        t1.start();
    }
}
