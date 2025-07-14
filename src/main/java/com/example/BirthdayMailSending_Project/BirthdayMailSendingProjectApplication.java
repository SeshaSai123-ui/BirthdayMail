package com.example.BirthdayMailSending_Project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BirthdayMailSendingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BirthdayMailSendingProjectApplication.class, args);
	}

}
