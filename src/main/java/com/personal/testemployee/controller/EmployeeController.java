package com.personal.testemployee.controller;

import com.personal.testemployee.model.Employee;
import com.personal.testemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/all")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployees(){
        return employeeService.getEmployees();
    }

    @PostMapping("/employee/create")
    public ResponseEntity<String> createEmployee(@RequestBody Employee employee){
        return employeeService.createEmployee(employee);
    }

    @GetMapping("/employee/{employee_id}")
    public ResponseEntity<List<Employee>> getEmployeeByID(@RequestParam(name = "employee_id")){

    }

//    @PutMapping("/employee/update/{employee_id}")
//    public ResponseEntity<String> updateEmployee(@RequestBody Employee employee){
//        return employeeService.updateEmployee(employee);
//    }
}
