package com.kirylshreyter.springexample.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kirylshreyter.springexample.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findFirst10ByOrderByScoreDesc();

}
