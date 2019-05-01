package com.marom.timesheet.controller;

import com.marom.timesheet.repository.ProjectRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {

    private ProjectRepository projectRepository;

    public ProjectController(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }


    @GetMapping("/projects")
    public String getProjects(Model model) {
        model.addAttribute("projects", projectRepository.findAll());
        return "project/listAll";
    }
}
