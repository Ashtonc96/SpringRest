package com.ashton.SpringRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashton.SpringRest.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
