package dao;

import entities.Sensitivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensitivityRepository extends JpaRepository<Sensitivity, Integer> {
}
