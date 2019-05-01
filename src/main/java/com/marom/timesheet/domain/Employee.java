package com.marom.timesheet.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Employee {

    @Id
    private long employeeId;
    private long managerEmployeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String employeeCode;
}
