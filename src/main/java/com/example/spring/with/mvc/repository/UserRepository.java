package com.example.spring.with.mvc.repository;

import com.example.spring.with.mvc.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
