package com.stecam.piantaggio.piantaggio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PiantaggioApplication implements CommandLineRunner {

	@Autowired
	UserRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(PiantaggioApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		User userino = new User("Gianni",44);
		repository.save(userino);
	}
}

