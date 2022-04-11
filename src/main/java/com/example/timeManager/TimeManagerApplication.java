package com.example.timeManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class TimeManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeManagerApplication.class, args);
	}

}
