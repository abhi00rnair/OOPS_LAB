class Employee {
    private String name;
    private double salary;
    private int age;
    private static int count = 0;

    Employee(String name, double salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        count++;
    }

    String getName() {
        return name;
    }

    double getSalary() {
        return salary;
    }

    int getAge() {
        return age;
    }

    void raiseSalary(double increment) {
        this.salary += increment;
    }

    static int getEmployeeCount() {
        return count;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

class Analyst extends Employee {
    private String specialization;

    Analyst(String name, double salary, int age, String specialization) {
        super(name, salary, age);
        this.specialization = specialization;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Specialization: " + specialization);
    }
}

class Salesperson extends Employee {
    private String region;

    Salesperson(String name, double salary, int age, String region) {
        super(name, salary, age);
        this.region = region;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Region: " + region);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 50000.0, 30);
        Analyst analyst1 = new Analyst("Alice", 60000.0, 28, "Data Analysis");
        Salesperson salesperson1 = new Salesperson("Bob", 45000.0, 32, "Northwest");

        System.out.println("Employee Info:");
        emp1.display();
        System.out.println("\nAnalyst Info:");
        analyst1.display();
        System.out.println("\nSalesperson Info:");
        salesperson1.display();

        emp1.raiseSalary(10000);
        analyst1.raiseSalary(5000);
        salesperson1.raiseSalary(7000);

        System.out.println("\nAfter Raise in Employee Info:");
        emp1.display();
        System.out.println("\nAfter Raise in Analyst Info:");
        analyst1.display();
        System.out.println("\nAfter Raise in Salesperson Info:");
        salesperson1.display();
        System.out.println("\nTotal number of employees: " + Employee.getEmployeeCount());
    }
}
