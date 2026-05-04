package com.example;

class TestingTask extends Task {
    public TestingTask(String name, int difficulty) {
        super(name, difficulty);
    }

    @Override
    public int execute(Workable worker) {
        return worker.work() - difficulty / 2;
    }
}