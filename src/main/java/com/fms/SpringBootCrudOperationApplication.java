package com.fms;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fms.airport.dto.Airport;

@SpringBootApplication

public class SpringBootCrudOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCrudOperationApplication.class, args);
	}
	@Bean
	public List<Airport> getAllAirports() 
	{
	return getAllAirports();
	}
	
	@Bean
	public Airport getAirportById(String airportCode) 
	{
	return getAirportById(airportCode);
	}


}
