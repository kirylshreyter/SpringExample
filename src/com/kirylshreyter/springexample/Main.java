package com.kirylshreyter.springexample;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kirylshreyter.springexample.configuration.initializers.AppInitializer;
import com.kirylshreyter.springexample.entities.User;
import com.kirylshreyter.springexample.services.UserService;
import com.kirylshreyter.springexample.services.impl.UserServiceImpl;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppInitializer.class);
		UserService userService = context.getBean(UserServiceImpl.class);

		/*
		 * for (int i = 0; i < 20; i++) { User user = new User(); user.name =
		 * "test"; user.score = 20+i; user.date = new Date(); user =
		 * userService.save(user); }
		 */
		// user.name = "test";
		// user.score = 20;
		// user.date = new Date();
		// user = userService.save(user);
		// userService.delete(user);
		List<User> list = userService.findFirst10ByOrderByScoreDesc();
		for (User user2 : list) {
			System.out.println("______________");
			System.out.println("id>>>" + user2.id);
			System.out.println("name>>>" + user2.name);
			System.out.println("score>>>" + user2.score);
			System.out.println("date>>>" + user2.date);
			System.out.println("______________");
		}
		// userService.delete(userService.find(1));
		context.close();

	}

}
