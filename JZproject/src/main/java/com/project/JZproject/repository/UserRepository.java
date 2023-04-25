package com.project.JZproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.JZproject.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    User findById(long id);
    User findByUserNameAndPassword(String userName, String password);
} 