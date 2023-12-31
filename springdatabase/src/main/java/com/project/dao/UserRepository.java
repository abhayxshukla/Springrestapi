package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
