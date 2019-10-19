package com.kodilla.hibernate.manytomany;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Company company() {
		return new Company();
	}
	@Bean
	public Employee employee () {
		return new Employee();
	}
}
