package com.ratnesh.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ratnesh.ms.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
