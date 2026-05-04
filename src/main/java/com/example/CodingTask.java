package com.example;

class CodingTask extends Task {
    public CodingTask(String name, int difficulty) {
        super(name, difficulty);
    }

    @Override
    public int execute(Workable worker) {
        return worker.work() - difficulty;
    }
}
