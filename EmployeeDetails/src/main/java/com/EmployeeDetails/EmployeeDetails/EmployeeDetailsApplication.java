package com.EmployeeDetails.EmployeeDetails;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDetailsApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(EmployeeRepository repository) {
		return args -> {
			Employee employee = new Employee("Vignan", "Kurme","vignan@allianz.com",Gender.MALE,"845654",WorkLocation.PUNE);
			repository.insert(employee);
		};
		
	}

}
