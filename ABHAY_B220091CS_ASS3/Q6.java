import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    String name;
    int id;
    String major;

    Student(String name, int id, String major) {
        this.name = name;
        this.id = id;
        this.major = major;
    }
}
class Professor {
    String name;
    int id;
    String dept;

    Professor(String name, int id, String dept) {
        this.name = name;
        this.id = id;
        this.dept = dept;
    }
}
class Department {
    String departName;
    List<Professor> professors;
    List<Student> students;

    Department(String name) {
        this.departName = name;
        this.professors = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getDepartName() {
        return departName;
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Professor> getProfessors() {
        return professors;
    }

    public List<Student> getStudents() {
        return students;
    }
}

class University {
    String name;
    List<Department> departments;

    University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }
}
public class Q6 {
    private static University u1 = new University("NIT Calicut");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("University Management System Menu:");
            System.out.println("1. Add Department");
            System.out.println("2. Add Professor");
            System.out.println("3. Add Student");
            System.out.println("4. List Departments");
            System.out.println("5. List Professors in a Department");
            System.out.println("6. List Students in a Department");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addDepartment();
                    break;
                case 3:
                    addStudent();
                    break;
                case 4:
                    listDepartments();
                    break;
                case 5:
                    listProfessorsInDepartment();
                    break;
                case 6:
                    listStudentsInDepartment();
                    break;
                case 7:
                    return;
            }
        }
    }

    private static void addDepartment() {
        System.out.print("Enter department name: ");
        String name = scanner.nextLine();
        u1.addDepartment(new Department(name));
        System.out.println("Department added successfully.");
    }

    private static void addStudent() {
        System.out.print("Enter department name: ");
        String deptName = scanner.nextLine();
        Department dept = findDepartment(deptName);
        if (dept != null) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter student major: ");
            String major = scanner.nextLine();
            dept.addStudent(new Student(name, id, major));
            System.out.println("Student added successfully.");
        }
    }

    private static void listDepartments() {
        System.out.println("Departments:");
        for (Department dept : u1.getDepartments()) {
            System.out.println(dept);
        }
    }

    private static void listProfessorsInDepartment() {
        System.out.print("Enter department name: ");
        String deptName = scanner.nextLine();
        Department dept = findDepartment(deptName);
        if (dept != null) {
            System.out.println("Professors in " + deptName);
            for (Professor prof : dept.getProfessors()) {
                System.out.println(prof);
            }
        }
    }

    private static void listStudentsInDepartment() {
        System.out.print("Enter department name: ");
        String deptName = scanner.nextLine();
        Department dept = findDepartment(deptName);
        if (dept != null) {
            System.out.println("Students in " + deptName);
            for (Student stu : dept.getStudents()) {
                System.out.println(stu);
            }
        }
    }

    private static Department findDepartment(String name) {
        for (Department dept : u1.getDepartments()) {
            if (dept.getDepartName().equals(name)) {
                return dept;
            }
        }
        return null;
    }
}
