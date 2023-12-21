package com.personal.testemployee.service;

import com.personal.testemployee.model.Employee;
import com.personal.testemployee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired

    EmployeeRepository employeeRepository;

    public ResponseEntity<List<Employee>> getEmployees(){
//        List<Employee> employees = employeeRepository.findAll();
//        try {
//            return new ResponseEntity<>(employees, HttpStatus.OK);
//        }
        try {
           return new ResponseEntity<>(employeeRepository.findAll(),HttpStatus.OK);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<String> createEmployee(Employee employee){
        employeeRepository.save(employee);
        try {
            return new ResponseEntity<>("SUCCESS",HttpStatus.CREATED);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return new  ResponseEntity<>("ERROR",HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Employee>> getEmployeeByEmployeeID(String employee_id) {
        try {
            return new ResponseEntity<>(employeeRepository.getEmployeeByEmployeeId(employee_id),HttpStatus.OK);
        } catch (Exception e){
             e.printStackTrace();
        }
        return new ResponseEntity<>()
    }

//    public ResponseEntity<String> updateEmployee(){
//
//    }
}

