package com.example.univercity_server.repos;

import com.example.univercity_server.models.AudienceModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AudienceRepo extends JpaRepository<AudienceModel, Long> {
}
