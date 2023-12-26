package com.personal.testemployee.repository;

import com.personal.testemployee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    List<Employee> getEmployeeByEmployeeId(String employee_id);

    String deleteEmployeeByEmployeeId(String employee_id);

//    String deleteEmployeeByEmployeeID(String employee_id){
//        return
//    }
}
