package com.project.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	Optional<User> findByUsername(String username);
}
