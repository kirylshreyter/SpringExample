package com.kirylshreyter.springexample.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kirylshreyter.springexample.entities.User;
import com.kirylshreyter.springexample.services.UserService;

@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> loadScores() {
		List<User> resultList = userService.findFirst10ByOrderByScoreDesc();
		return new ResponseEntity<List<User>>(resultList, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<User> saveScore(@RequestBody User user) {
		System.out.println(user);
		user = userService.save(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

}
