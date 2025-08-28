package lec_6;
import java.util.ArrayList;
import java.util.Scanner;
public class B4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> toDoList = new ArrayList<>();
        int choice;
        do {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add a new task");
            System.out.println("2. View all tasks");
            System.out.println("3. Remove a task by index");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the task to add: ");
                    String task = scanner.nextLine();
                    toDoList.add(task);
                    System.out.println("Task added.");
                }

                case 2 -> {
                    System.out.println("Your To-Do List:");
                    for (int i = 0; i < toDoList.size(); i++) {
                        System.out.println(i + ": " + toDoList.get(i));
                    }
                }

                case 3 -> {
                    System.out.print("Enter the index of the task to remove: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < toDoList.size()) {
                        toDoList.remove(index);
                        System.out.println("Task removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                }

                case 4 -> System.out.println("Exiting To-Do List Manager. Goodbye!");

                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }
}
