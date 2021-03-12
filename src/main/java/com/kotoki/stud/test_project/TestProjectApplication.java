package com.kotoki.stud.test_project;

import com.kotoki.stud.test_project.account_information.Account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.kotoki.stud.test_project.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class TestProjectApplication {


	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(TestProjectApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	private void testJpaMethods() {

		System.out.println(userService.findByLogin("Anton_Antoxa"));
	}
}
