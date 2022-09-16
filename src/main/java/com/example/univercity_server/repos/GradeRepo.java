package com.example.univercity_server.repos;

import com.example.univercity_server.models.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepo extends JpaRepository<Grade, Long> {
}
