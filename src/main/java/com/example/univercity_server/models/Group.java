package com.example.univercity_server.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "student_group")
@Data
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "number_of_students")
    int students;

    @Column(name = "group_number")
    int number;

    @OneToOne
    @JoinColumn(name = "grade")
    Grade grade;
}
