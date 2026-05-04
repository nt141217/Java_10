package com.example;

abstract class Employee implements Workable, Payable {
    protected String name;
    protected int skill;
    protected double baseSalary;

    public Employee(String name, int skill, double baseSalary) {
        this.name = name;
        this.skill = skill;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }
}