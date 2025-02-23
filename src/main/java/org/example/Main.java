package org.example;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Task> tasks = new PriorityQueue<>();

        Scanner scanner = new Scanner(System.in);

        int current_id = 0;
        int exit = 0;

        while (exit != 1) {

            System.out.println("1. Show tasks");
            System.out.println("2. Get next task");
            System.out.println("3. Add task");
            System.out.println("4. Delete highest-priority task");
            System.out.println("5. Delete task by its ID");
            System.out.println("6. Exit");

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
                    delete_task_by_id(scanner, tasks);
                    break;
                case 6:
                    exit = 1;
                    break;
                default:
                    System.out.println("Wrong input. Try again");
                    break;
            }

        }

    }

    private static void delete_task_by_id(Scanner scanner, PriorityQueue<Task> tasks) {

        Iterator<Task> iterator = tasks.iterator();
        PriorityQueue<Task> temp_tasks = new PriorityQueue<>();

        int inp_id = 0;
        inp_id = Integer.parseInt(scanner.nextLine());

        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.id != inp_id) {
                temp_tasks.add(task);
            }
        }
        tasks.clear();
        tasks.addAll(temp_tasks);

    }

    private static void create_task(Scanner scanner, PriorityQueue<Task> tasks, int current_id) {
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