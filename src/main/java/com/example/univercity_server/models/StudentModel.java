package com.example.univercity_server.models;

import com.example.univercity_server.models.helpers.GradeEnum;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student")
public class StudentModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "student_name")
    String name;

    @Column(name = "student_last_name")
    String lastName;

    @OneToOne
    @JoinColumn(name = "group_number")
    Group group;
}
