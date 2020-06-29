package com.pratap.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratap.flightreservation.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
