import java.util.*;

interface OrderStudents {
    void OrderByRollno(List<Student> students);    
    void OrderByName(List<Student> students);
}

class Student implements OrderStudents {
    private String name;
    private int rollno;
    private String address;

    public Student(String name, int rollno, String address) {
        this.name = name;
        this.rollno = rollno;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getRollno() {
        return rollno;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public void OrderByRollno(List<Student> students) {
        Collections.sort(students, Comparator.comparingInt(Student::getRollno)); 
        System.out.println("Sorted by Roll Number:");
        for (Student student : students) {
            System.out.println(student.getRollno() + " " + student.getName() + " " + student.getAddress());
        }
    }

    @Override
    public void OrderByName(List<Student> students) {
        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println("Sorted by Name:");
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getRollno() + " " + student.getAddress());
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student " + (i + 1) + " (Name RollNo Address):");
            String name = scanner.next();
            int rollno = scanner.nextInt();
            String address = scanner.next();
            students.add(new Student(name, rollno, address));
        }

        Student studentObj = new Student("", 0, "");

        studentObj.OrderByRollno(students);

        studentObj.OrderByName(students);

        scanner.close();
    }
}
