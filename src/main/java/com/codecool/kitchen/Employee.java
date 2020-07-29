package com.codecool.kitchen;

public abstract class Employee {
    String name;
    int birthday;
    double salary;

    public void payTax() {
        System.out.println("The tax for the salary " + salary + " USD is " + (salary * 99) / 100 + " UDS.");
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getBirthday() {
        return birthday;
    }


    public void setBirthday(int bDay) {
        this.birthday = bDay;
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }


    abstract void work();


}
