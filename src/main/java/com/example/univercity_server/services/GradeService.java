package com.example.univercity_server.services;

import com.example.univercity_server.models.Grade;
import com.example.univercity_server.models.helpers.GradeEnum;
import com.example.univercity_server.repos.GradeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeService {
    @Autowired
    GradeRepo gradeRepo;

    public void creatGrade(){
        Grade grade = new Grade();
        grade.setGradeEnum(GradeEnum.FIRST);
        grade.setNumber(0);

        gradeRepo.save(grade);
    }
}
