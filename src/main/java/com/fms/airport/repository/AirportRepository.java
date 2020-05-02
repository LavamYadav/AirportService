package com.fms.airport.repository;
import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository

import com.fms.airport.dto.Airport;

public interface AirportRepository extends CrudRepository<Airport, String>
{
}
