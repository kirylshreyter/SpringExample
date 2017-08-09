package com.kirylshreyter.springexample.services.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kirylshreyter.springexample.entities.User;
import com.kirylshreyter.springexample.repositories.UserRepository;
import com.kirylshreyter.springexample.services.UserService;


@Service
public class UserServiceImpl extends AbstractEntityServiceImpl<User> implements UserService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findFirst10ByOrderByScoreDesc() {
		LOGGER.info("Selected first 10 scores.");
		return userRepository.findFirst10ByOrderByScoreDesc();
	}

}
