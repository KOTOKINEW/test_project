package com.kotoki.stud.test_project;

import com.kotoki.stud.test_project.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.kotoki.stud.test_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import java.sql.SQLOutput;

@SpringBootApplication
public class TestProjectApplication {


	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	private void testJpaMethods() {
//			User user = new User();
//			user.setEmail("someEmail@gmail.com");
//			user.setName("Smith");
//			user.setPhone("1234");
//			userService.createUsers(user);
//			User user1 = new User();
//			user1.setName("Jon Dorian");
//			user1.setEmail("gmailEmail@gmail.com");
//			user1.setPhone("4321");
//			userService.createUsers(user1);
		userService.deleteUserByNameEqualsAndIdEquals("Jon Dorian", 7);
		System.out.println(userService.findAll());
	}
}
