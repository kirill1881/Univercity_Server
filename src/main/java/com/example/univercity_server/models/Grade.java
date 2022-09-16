package com.example.univercity_server.models;

import com.example.univercity_server.models.helpers.GradeEnum;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "student_grade")
@Data
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "grade")
    @Enumerated
    GradeEnum gradeEnum;

    @Column(name = "number_of_students")
    int number;
}
