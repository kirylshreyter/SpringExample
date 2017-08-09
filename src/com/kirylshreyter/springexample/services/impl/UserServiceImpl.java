package com.kirylshreyter.springexample.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kirylshreyter.springexample.entities.User;
import com.kirylshreyter.springexample.repositories.UserRepository;
import com.kirylshreyter.springexample.services.UserService;

@Service
public class UserServiceImpl extends AbstractEntityServiceImpl<User> implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findFirst10ByOrderByScoreDesc() {
		return userRepository.findFirst10ByOrderByScoreDesc();
	}

}
