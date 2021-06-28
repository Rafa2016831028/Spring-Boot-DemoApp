package com.example.test.Payroll;
public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(Long id) {
        super("COULD NOT FIND EMPLOYEE"+id);
    }
}
