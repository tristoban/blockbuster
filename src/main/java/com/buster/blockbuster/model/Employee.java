package com.buster.blockbuster.model;

public class Employee {
    private Integer id;
    private String name;
    private String lastName;
    private Double salary;
    private Manager manager;

    public Employee(Integer id, String name, String lastName, Double salary, Manager manager) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", manager=" + manager +
                '}';
    }
}
