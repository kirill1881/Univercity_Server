package com.example.univercity_server.repos;

import com.example.univercity_server.models.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentModel, Long> {
}
