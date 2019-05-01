package com.marom.timesheet.domain;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Project {

    private String projectCode;
    private String name;
}
