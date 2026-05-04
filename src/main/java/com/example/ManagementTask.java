package com.example;

class ManagementTask extends Task {
    public ManagementTask(String name, int difficulty) {
        super(name, difficulty);
    }

    @Override
    public int execute(Workable worker) {
        return worker.work() + 1 - difficulty;
    }
}