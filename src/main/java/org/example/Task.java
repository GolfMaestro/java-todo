package org.example;

public class Task implements Comparable<Task>{

    private final String name;
    private final String description;
    private final boolean status;
    private final int priority;

    public Task(String name, String description, boolean status, int priority) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task task) {
        return task.priority - this.priority;
    }

    public void show_task() {
        System.out.printf("NAME: %s\n", name);
        System.out.printf("DESCRIPTION: %s\n", description);
        System.out.printf("STATUS: %b\n", status);
        System.out.printf("PRIORITY: %d", priority);
    }

}
