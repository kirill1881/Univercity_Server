package com.example.univercity_server.repos;

import com.example.univercity_server.models.LessonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepo extends JpaRepository<LessonModel, Long> {
}
