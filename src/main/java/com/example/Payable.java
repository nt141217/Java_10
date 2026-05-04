package com.example;

import java.util.ArrayList;
import java.util.List;

interface Payable {
    double calculateSalary();
}

interface Workable {
    int work();
}

abstract class Task {
    protected String name;
    protected int difficulty;

    public Task(String name, int difficulty) {
        this.name = name;
        this.difficulty = difficulty;
    }

    public abstract int execute(Workable worker);

    public String getName() {
        return name;
    }
}
