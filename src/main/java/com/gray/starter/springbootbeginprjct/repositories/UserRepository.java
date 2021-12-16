package com.gray.starter.springbootbeginprjct.repositories;

import com.gray.starter.springbootbeginprjct.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findByUsername(String username);
}
