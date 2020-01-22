package com.cgi.cinema.cinemaapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = { "com.cgi.cinema.dao"})
public class CinemaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CinemaAppApplication.class, args);
	}

}
