package com.example.test.Payroll;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    public String name;
    public int salary;
    public @Id @GeneratedValue Long employeeId;

    public Employee() {
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

//    public Employee(String name, int salary, Long employeeId) {
//        this.name = name;
//        this.salary = salary;
//        this.employeeId = employeeId;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
}
