package com.cgi.cinema.cinemaapp;

import com.cgi.cinema.services.CinemaAppInitializerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@Configuration
@ComponentScan("com.cgi.cinema.*")
@EnableJpaRepositories(basePackages = {"com.cgi.cinema.*"})
@EntityScan("com.cgi.cinema.*")
@EnableAutoConfiguration
public class CinemaAppApplication implements CommandLineRunner {

	@Autowired
	private CinemaAppInitializerService cinemaAppInitializerService;

	public static void main(String[] args) {
		SpringApplication.run(CinemaAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		cinemaAppInitializerService.initVilles();
		cinemaAppInitializerService.initCinemas();
		cinemaAppInitializerService.initSalles();
		cinemaAppInitializerService.initPlaces();
		cinemaAppInitializerService.initSeances();
		cinemaAppInitializerService.initCategories();
		cinemaAppInitializerService.initFilms();
		cinemaAppInitializerService.initProjections();
		cinemaAppInitializerService.initTickets();
	}
}
