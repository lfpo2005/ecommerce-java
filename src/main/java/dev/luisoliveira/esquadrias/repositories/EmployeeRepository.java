package dev.luisoliveira.esquadrias.repositories;

import dev.luisoliveira.esquadrias.models.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeModel, UUID> {
    Boolean existsByEmail(String email);

    Boolean existsByFullName(String fullName);
}
