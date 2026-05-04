package com.example;

import java.util.ArrayList;
import java.util.List;

class Project {
    private String name;
    private List<Workable> workers = new ArrayList<>();
    private List<Task> tasks = new ArrayList<>();

    public Project(String name) {
        this.name = name;
    }

    public void addWorker(Workable worker) {
        workers.add(worker);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void runProject() {
        System.out.println("Project: " + name);

        for (Task task : tasks) {
            System.out.println("Task: " + task.getName());

            for (Workable worker : workers) {
                int result = task.execute(worker);
                System.out.println("Result: " + result);
            }
        }
    }
}