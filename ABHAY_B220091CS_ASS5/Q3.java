import java.util.Scanner;


interface ShapeArea {
    double area(double size);  
}

class Circle implements ShapeArea {
    private static final double PI = 3.14;  
    @Override
    public double area(double radius) {
        return PI * radius * radius;
    }
}


class Square implements ShapeArea {

    @Override
    public double area(double side) {
        return side * side;
    }
}

public class Q3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shapeName = scanner.nextLine();

        System.out.print("Enter the value (radius for Circle, side for Square): ");
        double size = scanner.nextDouble();

        ShapeArea shape = null; 

        if (shapeName.equalsIgnoreCase("Circle")) {
            shape = new Circle();  
        } else if (shapeName.equalsIgnoreCase("Square")) {
            shape = new Square();  
        } else {
            System.out.println("Invalid shape name");
            System.exit(0);
        }
        double area = shape.area(size);
        System.out.println("The area of the " + shapeName + " is: " + area);

        scanner.close();
    }
}
