package org.example.msauthservice.repository;

import org.example.msauthservice.model.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
    // Custom queries if necessary
}
