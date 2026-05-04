package com.example;

class Manager extends Employee {
    public Manager(String name, int skill, double baseSalary) {
        super(name, skill, baseSalary);
    }

    @Override
    public int work() {
        return skill + 3;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + skill * 700;
    }
}