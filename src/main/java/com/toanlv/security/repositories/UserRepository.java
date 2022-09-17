package com.toanlv.security.repositories;

import java.util.Optional;

import com.toanlv.security.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    Optional<UserEntity> getUserEntityByUserName(String userName);
}
