package com.example.backendsoringcloud.dao;

import com.example.backendsoringcloud.entities.Sensitivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This interface represents the repository of the Sensitivity Entity
 */
@Repository
public interface SensitivityRepository extends JpaRepository<Sensitivity, Integer> {
}
