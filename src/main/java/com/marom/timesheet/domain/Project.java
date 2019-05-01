package com.marom.timesheet.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectCode;
    private String name;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees = new ArrayList<>();
}
