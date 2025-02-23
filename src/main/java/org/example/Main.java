package org.example;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Task> tasks = new PriorityQueue<>();

        tasks.add(new Task("Task 1", "Do job", true, 4));
        tasks.add(new Task("Task 2", "Go for a walk", true, 1));

        while (!tasks.isEmpty()) {
            tasks.poll().show_task();
            System.out.println("\n---------------------");
        }
        
    }
}