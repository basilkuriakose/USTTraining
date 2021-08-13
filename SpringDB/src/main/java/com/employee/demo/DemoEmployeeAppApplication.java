package com.employee.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.employee.demo.service.EmployeeService;


@SpringBootApplication
public class DemoEmployeeAppApplication {
	@Autowired
	private EmployeeService employee;
	public static void main(String[] args) {
		SpringApplication.run(DemoEmployeeAppApplication.class, args);
	}

@Bean
public CommandLineRunner initDB()
{
	return (args) -> {
		this.employee.save(new com.employee.demo.domain.Employee(null,"john",23,"MCA"));
		//this.employee.save(new com.employee.demo.domain.Employee(null,"Basil",24,"MCA"));
	};
}

}