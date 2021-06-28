package com.example.test.Payroll;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private  final EmployeeRepositary repositary;

    public EmployeeController(EmployeeRepositary repositary) {
        this.repositary = repositary;
    }

    @GetMapping("/employees")
    List<Employee> all() {
        return repositary.findAll();
    }

    @GetMapping("/employees/{id}")
    Employee getOneEmployee(@PathVariable Long id){
        return repositary.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee employee) {
        return repositary.save(employee);
    }
}
