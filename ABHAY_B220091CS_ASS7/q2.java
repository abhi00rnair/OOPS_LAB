
abstract class User {
    String name;
    String email;
    String userID;

    public User(String name, String email, String userID) {
        this.name = name;
        this.email = email;
        this.userID = userID;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("UserID: " + userID);
    }

    public abstract void portalAccess();
}

class Student extends User {
    public Student(String name, String email, String userID) {
        super(name, email, userID);
    }
    @Override
    public void portalAccess() {
        System.out.println("Portal Access:");
        System.out.println("- Viewing online courses.");
        System.out.println("- Attending live session.");
        System.out.println("- Submitting assignments online.");
    }
}

class Faculty extends User {
    public Faculty(String name, String email, String userID) {
        super(name, email, userID);
    }

    @Override
    public void portalAccess() {
        System.out.println("Portal Access:");
        System.out.println("- Uploading course material.");
        System.out.println("- Conducting live online lecture.");
    }

    public void conductLiveSession() {
        System.out.println("Conducting live session.");
    }

    public void uploadCourseMaterial() {
        System.out.println("Uploading course material.");
    }

    public void uploadAssignment() {
        System.out.println("Uploading an online assignment for students.");
    }
}
public class q2 {
    public static void main(String[] args) {
        Student student = new Student("John Doe", "john@student.com", "STU001");
        Faculty faculty = new Faculty("Dr. Smith", "smith@university.com", "FAC001");

        student.portalAccess();

        System.out.println("\nFaculty Access");
        faculty.displayInfo();
        faculty.portalAccess();

        faculty.conductLiveSession();
        faculty.uploadCourseMaterial();
        faculty.uploadAssignment();
    }
}
