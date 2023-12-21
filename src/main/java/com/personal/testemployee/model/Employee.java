package com.personal.testemployee.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;

    private Integer age;
    private String department;
    private String email;

    @Column(name="employment_date")
    private Date employmentDate;
    private String title;

    @Column(name = "employee_id")
    private String employeeId;
}
