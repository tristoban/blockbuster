package com.buster.blockbuster.model;

import java.util.List;

public class Manager {

    private Long id;
    private String name;
    private String lastName;
    private Double salary;
    private List<Employee> team;
    private Manager manager;

    public Manager(Long id, String name, String lastName, Double salary, List<Employee> team, Manager manager) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.team = team;
        this.manager = manager;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<Employee> getTeam() {
        return team;
    }

    public void setTeam(List<Employee> team) {
        this.team = team;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", team=" + team +
                ", manager=" + manager +
                '}';
    }
}
