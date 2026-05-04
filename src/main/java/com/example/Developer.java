package com.example;

class Developer extends Employee {
    public Developer(String name, int skill, double baseSalary) {
        super(name, skill, baseSalary);
    }

    @Override
    public int work() {
        return skill * 2;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + skill * 500;
    }
}