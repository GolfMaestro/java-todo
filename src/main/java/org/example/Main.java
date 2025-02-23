package org.example;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Task> tasks = new PriorityQueue<>();

        //tasks.add(new Task("Task 1", "Do job", true, 4));
        //tasks.add(new Task("Task 2", "Go for a walk", true, 1));

        Scanner scanner = new Scanner(System.in);

        int current_id = 0;
        int exit = 0;

        while (exit != 1) {

            System.out.println("1. Show tasks");
            System.out.println("2. Get next task");
            System.out.println("3. Add task");
            System.out.println("4. Delete highest-priority task");
            System.out.println("5. Exit");

            int action = 0;

            action = Integer.parseInt(scanner.nextLine());

            switch (action) {
                case 1:
                    tasks.forEach(Task::show_task);
                    break;
                case 2:
                    tasks.peek().show_task();
                    break;
                case 3:
                    create_task(scanner, tasks, current_id);
                    current_id = current_id + 1;
                    break;
                case 4:
                    tasks.poll();
                    break;
                case 5:
                    exit = 1;
                    break;
                default:
                    System.out.println("Wrong input. Try again");
                    break;
            }

        }

    }
    public static void create_task(Scanner scanner, PriorityQueue<Task> tasks, int current_id) {
        System.out.println("Enter name:");
        String name1 = scanner.nextLine();
        System.out.println("Enter description:");
        String description1 = scanner.nextLine();
        System.out.println("Enter priority");
        int priority = Integer.parseInt(scanner.nextLine());

        Task task1 = new Task(name1, description1, priority, current_id);
        tasks.add(task1);
    }

}