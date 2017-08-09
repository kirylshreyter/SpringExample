package com.kirylshreyter.springexample.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kirylshreyter.springexample.entities.User;
import com.kirylshreyter.springexample.services.UserService;

@RestController
@RequestMapping("/scores")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<User>> loadScores() {
		List<User> resultList = userService.findFirst10ByOrderByScoreDesc();
		return new ResponseEntity<List<User>>(resultList, HttpStatus.OK);
	}

}
