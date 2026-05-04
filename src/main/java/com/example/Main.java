package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Developer developer = new Developer("Anna", 8, 5000);
        Tester tester = new Tester("Piotr", 6, 4000);
        Manager manager = new Manager("Marta", 7, 7000);

        List<Employee> employees = new ArrayList<>();
        employees.add(developer);
        employees.add(tester);
        employees.add(manager);

        System.out.println("Salaries:");
        for (Employee e : employees) {
            System.out.println(e.getName() + ": " + e.calculateSalary());
        }

        Project project = new Project("Java System");

        project.addWorker(developer);
        project.addWorker(tester);
        project.addWorker(manager);

        project.addTask(new CodingTask("Implement login", 5));
        project.addTask(new TestingTask("Test payment system", 4));
        project.addTask(new ManagementTask("Plan sprint", 3));

        System.out.println();
        project.runProject();
    }
}