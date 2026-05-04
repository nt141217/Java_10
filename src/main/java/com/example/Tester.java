package com.example;

class Tester extends Employee {
    public Tester(String name, int skill, double baseSalary) {
        super(name, skill, baseSalary);
    }

    @Override
    public int work() {
        return skill;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + skill * 300;
    }
}