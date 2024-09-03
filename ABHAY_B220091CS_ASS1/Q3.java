import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int n = my.nextInt();
        my.nextLine();
        Map<Integer, String> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            String name = my.nextLine();
            System.out.print("Enter the roll number of student " + (i + 1) + ": ");
            int rollNumber = my.nextInt();
            my.nextLine();
            mp.put(rollNumber, name);
        }

        List<Map.Entry<Integer, String>> studentList = new ArrayList<>(mp.entrySet());

        studentList.sort(Map.Entry.comparingByKey());

        System.out.println("Sorted list of students by roll number:");
        for (Map.Entry<Integer, String> entry : studentList) {
            System.out.println("Roll Number: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        my.close();
    }
}
