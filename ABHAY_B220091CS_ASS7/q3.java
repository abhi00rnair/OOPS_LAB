
abstract class Employee {
    String name;
    int employeeID;
    int leaveDays;

    public Employee(String name, int employeeID, int leaveDays) {
        this.name = name;
        this.employeeID = employeeID;
        this.leaveDays = leaveDays;
    }

    public abstract double calculateSalary();
    public abstract double calculatePerformanceBonus(double performanceScore);
    //public abstract double  calculateleavdeduction(int y,double x);

}

class FullTimeEmployee extends Employee {
    String position;
    double baseSalary;

    public FullTimeEmployee(String name, int employeeID, String position, double baseSalary, int leaveDays) {
        super(name, employeeID, leaveDays);
        this.position = position;
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        double salary = baseSalary;
        salary -= leaveDays * 1500;
        return salary;
    }

    @Override
    public double calculatePerformanceBonus(double performanceScore) {
        if (performanceScore >= 90) {
            return baseSalary * 0.04;
        }
        return 0;
    }
}

class PartTimeEmployee extends Employee {
    int hoursWorked;
    double hourlyWage;

    public PartTimeEmployee(String name, int employeeID, int hoursWorked, double hourlyWage, int leaveDays) {
        super(name, employeeID, leaveDays);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public double calculateSalary() {
        int actualHoursWorked = hoursWorked - (leaveDays * 2);
        return actualHoursWorked * hourlyWage;
    }

    @Override
    public double calculatePerformanceBonus(double performanceScore) {
        if (performanceScore >= 85) {
            return calculateSalary() * .7;
        }
        return 0;
    }
}

public class q3{
    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice", 101, "Manager", 50000, 2);
        System.out.println("Full-Time Salary (Manager, after leave deduction): $" + fullTimeEmployee.calculateSalary());
        System.out.println("Full-Time Performance Bonus: $" + fullTimeEmployee.calculatePerformanceBonus(92));

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Bob", 102, 45, 20, 1);
        System.out.println("Part-Time Salary (with bonus, after leave deduction): $" + partTimeEmployee.calculateSalary());
        System.out.println("Part-Time Performance Bonus: $" + partTimeEmployee.calculatePerformanceBonus(87));
    }
}
