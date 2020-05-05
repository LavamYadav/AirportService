package com.fms.repository;
import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository
import org.springframework.stereotype.Repository;

import com.fms.airport.dto.Airport;

@Repository
public interface AirportRepository extends CrudRepository<Airport, String>
{
}
