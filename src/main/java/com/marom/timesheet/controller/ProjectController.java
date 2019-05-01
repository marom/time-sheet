package com.marom.timesheet.controller;

import com.marom.timesheet.repository.ProjectRepository;
import com.marom.timesheet.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

    private ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/projects")
    public String getProjects(Model model) {
        model.addAttribute("projects", projectService.getAllProjects());
        return "project/listAll";
    }
}
