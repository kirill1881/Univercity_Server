package com.example.univercity_server.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "student_lesson")
@Data
public class LessonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "time")
    long time;

    @Column(name = "lesson_name")
    String name;

    @OneToMany
    @JoinColumn(name = "group_number")
    List<Group> groups;

    @OneToOne
    @JoinColumn(name = "number")
    AudienceModel audienceModel;
}
