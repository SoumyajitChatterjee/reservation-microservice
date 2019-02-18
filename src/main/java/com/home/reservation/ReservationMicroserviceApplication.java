package com.home.reservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan("com.home.reservation")
@EnableJpaRepositories("com.home.reservation.repository")
public class ReservationMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationMicroserviceApplication.class, args);
	}

}
