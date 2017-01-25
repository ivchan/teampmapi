package com.teammgr.teampm.repositories;

import com.teammgr.teampm.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Created by ivanchan on 25/1/2017.
 */

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
}
