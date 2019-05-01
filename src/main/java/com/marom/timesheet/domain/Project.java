package com.marom.timesheet.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Project {

    @Id
    @GeneratedValue
    private Long id;
    private String projectCode;
    private String name;

    @ManyToOne (
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
