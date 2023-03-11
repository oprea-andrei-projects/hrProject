package com.hrproject.myProject;

import com.hrproject.myProject.model.Person;
import com.hrproject.myProject.repo.PersonRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.Properties;


@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PersonRepo personRepo){

		return args -> {


			personRepo.save(new Person("Andrei","Oprea", "andrei@mail.com","mypass",22));



		};
	}



}
