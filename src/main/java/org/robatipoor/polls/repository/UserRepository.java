package org.robatipoor.polls.repository;

import org.robatipoor.polls.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UserRepository
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    
}