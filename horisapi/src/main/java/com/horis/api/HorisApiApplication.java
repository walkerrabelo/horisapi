package com.horis.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@SpringBootApplication
@EnableSpringDataWebSupport
public class HorisApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HorisApiApplication.class, args);
		System.out.println("Active and Running!");
	}

}
