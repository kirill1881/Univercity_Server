package com.example.univercity_server.controllers;

import com.example.univercity_server.repos.GradeRepo;
import com.example.univercity_server.services.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grade")
public class GradeController {
    @Autowired
    GradeService gradeService;

    @GetMapping("/add")
    public String createGrade(){
        try {
            gradeService.creatGrade();
            return "Ok";
        }catch (Exception e){
            return "error";
        }
    }
}
