package com.example.univercity_server.repos;

import com.example.univercity_server.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepo extends JpaRepository<Group, Long> {
    Group findByNumber(String number);
}
