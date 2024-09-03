import java.util.*;

class Task {
    int priority;
    String program;
}

class TaskComparator implements Comparator<Task> {
    @Override
    public int compare(Task t1, Task t2) {
        return Integer.compare(t1.priority, t2.priority);
    }
}

public class Q12 {
    PriorityQueue<Task> pq = new PriorityQueue<>(new TaskComparator());
    Scanner my = new Scanner(System.in);

    public static void main(String[] args) {
        Q12 taskManager = new Q12();
        taskManager.run();
    }

    public void run() {
        while (true) {
            System.out.println("\nSelect an operation:");
            int option = my.nextInt();

            switch (option) {
                case 1:
                    addTask();
                    break;
                case 2:
                    processTask();
                    break;
                case 3:
                    displayTask();
                    break;
                case 4:
                    exit();
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    public void addTask() {
        System.out.println("Add task with their priority and description");
        System.out.print("Enter priority: ");
        int value = my.nextInt();
        my.nextLine(); // Consume the newline character
        String program = my.nextLine();

        Task task1 = new Task();
        task1.priority = value;
        task1.program = program;
        pq.add(task1);
        System.out.println("Task added: " + program + " with priority " + value);
    }

    public void processTask() {
        if (!pq.isEmpty()) {
            Task task = pq.poll(); 
            System.out.println("Processing task: " + task.program + " with priority " + task.priority);
        } else {
            System.out.println("No tasks to process.");
        }
    }

    public void displayTask() {
        if (!pq.isEmpty()) {
            System.out.println("Current tasks in the queue:");
            for (Task task : pq) {
                System.out.println("Task: " + task.program + ", Priority: " + task.priority);
            }
        } else {
            System.out.println("No tasks in the queue.");
        }
    }

    public void exit() {
        System.out.println("Exiting Task Manager.");
        System.exit(0);
    }
}
