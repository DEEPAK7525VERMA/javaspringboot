package com.deepak.youtube.Springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);

		Ninja ninja = new Naruto();
		ninja.fight();
	}

	@Bean
	public CommandLineRunner demo(UserRepository repo) {
		return args -> {
			User u = new User("Naruto", "naruto@leaf.com");
			repo.save(u);
			System.out.println("User saved to DB!");
		};
	}
}
