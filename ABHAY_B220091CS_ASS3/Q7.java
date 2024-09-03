class Vehicle { 
    String make;
    String model;
    int year;
    String color;
    int currentSpeed;

    Vehicle(String make, String model, int year, String color, int currentSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.currentSpeed = currentSpeed;
    }
}

class Car extends Vehicle {  
    int doorNo;
    double trunkCapacity;

    Car(String make, String model, int year, String color, int currentSpeed, int doorNo, double trunkCapacity) {
        super(make, model, year, color, currentSpeed);  
        this.doorNo = doorNo;
        this.trunkCapacity = trunkCapacity;
    }
  
}
class Bus extends Vehicle{
    int seatno;
    String routeno;
    boolean doubledeck;

    Bus(String make,String model,int year,String color,int currentSpeed,int seatno,String routeno, boolean doubledeck){
        super(make, model, year, color, currentSpeed);
        this.seatno=seatno;
        this.routeno=routeno;
        this.doubledeck=doubledeck;
    }
}

class suv extends Car{
    suv(String make, String model, int year, String color, int currentSpeed, int doorNo, double trunkCapacity){
        super(make, model, year, color, currentSpeed, doorNo, trunkCapacity);
    }
    void offroad(){
        System.out.println("offroad capability yes");
    }
    void engage4wd(){
        System.out.println("4wd engaged");
    }
}

class sedan extends Car{
    boolean luxury;
    sedan(String make, String model, int year, String color, int currentSpeed, int doorNo, double trunkCapacity,boolean luxury){
        super(make, model, year, color, currentSpeed, doorNo, trunkCapacity);
        this.luxury=luxury;
    }
    void activatemassage(){
        System.out.println("massage activated");
    }
}

class electriccar extends Car{
    int batterycapacity;

    electriccar(String make, String model, int year, String color, int currentSpeed, int doorNo, double trunkCapacity,int batterycapacity){
        super(make, model, year, color, currentSpeed, doorNo, trunkCapacity);
        this.batterycapacity=batterycapacity;
        }
}

class sportscar extends Car{
    int topspeed;

    sportscar(String make, String model, int year, String color, int currentSpeed, int doorNo, double trunkCapacity,int topspeed){
        super(make, model, year, color, currentSpeed, doorNo, trunkCapacity);
        this.topspeed=topspeed;
    }
}
public class Q7{
    public static void main(String[] args) {
        
    }
}