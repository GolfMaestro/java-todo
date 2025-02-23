package org.example;

public class Task implements Comparable<Task>{

    private final String name;
    private final String description;
    private final int priority;
    private final int id;

    public Task(String name, String description, int priority, int id) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.id = id;
    }

    @Override
    public int compareTo(Task task) {
        return this.priority - task.priority;
    }

    public void show_task() {
        System.out.printf("ID: %d\n", id);
        System.out.printf("NAME: %s\n", name);
        System.out.printf("DESCRIPTION: %s\n", description);
        System.out.printf("PRIORITY: %d\n", priority);
        System.out.println("---------------------\n");
    }

}
