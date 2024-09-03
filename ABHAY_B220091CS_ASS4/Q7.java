class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String departmentName;

    public Manager(String name, double salary, String departmentName) {
        super(name, salary);
        this.departmentName = departmentName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department Name: " + departmentName);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
public class Q7{
    public static void main(String[] args) {
        Manager m1=new Manager("n1",120000,"cse");
        Developer d1=new Developer("n2",150000,"c++");
        m1.displayDetails();
        d1.displayDetails();
    }
}