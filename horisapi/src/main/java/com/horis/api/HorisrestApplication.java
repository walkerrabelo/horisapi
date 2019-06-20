package com.horis.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HorisrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HorisrestApplication.class, args);
		System.out.println("Active and Running!");
	}

}
