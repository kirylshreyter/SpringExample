package com.kirylshreyter.springexample.services;

import java.util.List;

import com.kirylshreyter.springexample.entities.User;

public interface UserService extends AbstractEntityService<User> {
	
	List<User> findFirst10ByOrderByScoreDesc();
	
}
