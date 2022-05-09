package com.userdemo.userservice.repository;

import com.userdemo.userservice.model.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    User findByUserId(Long userId);

    
}
