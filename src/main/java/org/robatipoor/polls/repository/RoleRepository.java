package org.robatipoor.polls.repository;

import java.util.Optional;

import org.robatipoor.polls.model.Role;
import org.robatipoor.polls.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * RoleRepository
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}