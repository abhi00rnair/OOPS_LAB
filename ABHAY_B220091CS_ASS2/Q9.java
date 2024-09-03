import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Teacher {
    int teacherId;
    String teacherName;

    public Teacher(int teacherId, String teacherName) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
    }
}
class Student {
    int rollNumber;
    String fullName;
    double height;
    double weight;
    Teacher assignedTeacher;

    public Student(int rollNumber, String fullName, double height, double weight, Teacher assignedTeacher) {
        this.rollNumber = rollNumber;
        this.fullName = fullName;
        this.height = height;
        this.weight = weight;
        this.assignedTeacher = assignedTeacher;
    }

    public String toString() {
        return "Roll Number: " + rollNumber +
               "\nFull Name: " + fullName +
               "\nHeight: " + height +
               "\nWeight: " + weight +
               "\nAssigned Teacher: " + assignedTeacher.teacherName + "\n";
    }
}


public class Q9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher(1, "Mr. Sabu"));
        teachers.add(new Teacher(2, "Ms. Jaya"));
        teachers.add(new Teacher(3, "Dr. Babu"));

        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter the number of students to add: ");
        int numberOfStudents = scanner.nextInt();

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter roll number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            System.out.print("Enter full name: ");
            String fullName = scanner.nextLine();

            System.out.print("Enter height: ");
            double height = scanner.nextDouble();

            System.out.print("Enter weight: ");
            double weight = scanner.nextDouble();

            System.out.println("Available teachers:");
            for (Teacher teacher : teachers) {
                System.out.println(teacher.teacherId + ". " + teacher.teacherName);
            }

            System.out.print("Choose a teacher by ID: ");
            int teacherId = scanner.nextInt();
            Teacher assignedTeacher = null;

            for (Teacher teacher : teachers) {
                if (teacher.teacherId == teacherId) {
                    assignedTeacher = teacher;
                    break;
                }
            }

            if (assignedTeacher != null) {
                students.add(new Student(rollNumber, fullName, height, weight, assignedTeacher));
                System.out.println(fullName + " has been added to the student list.");
            } else {
                System.out.println("Invalid teacher ID!");
            }
        }

        // Sort students by height
        Collections.sort(students, Comparator.comparingDouble(student -> student.height));

        System.out.println("\nAll students sorted by height:");
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Student Names and their Assigned Teachers:");
        for (Student student : students) {
            System.out.println(student.fullName + " - " + student.assignedTeacher);
        }

        scanner.close();
    }
}
