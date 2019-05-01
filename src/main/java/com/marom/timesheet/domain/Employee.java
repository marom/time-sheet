package com.marom.timesheet.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long employeeId;
    private Long managerEmployeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String employeeCode;

    @OneToMany (
            mappedBy = "employee",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Project> projects = new ArrayList<>();
}
