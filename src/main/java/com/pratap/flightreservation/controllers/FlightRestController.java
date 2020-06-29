package com.pratap.flightreservation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pratap.flightreservation.entities.Flight;
import com.pratap.flightreservation.repos.FlightRepository;

@RestController
public class FlightRestController {
	
	@Autowired
	private FlightRepository flightRepository;
	
	@RequestMapping(value = "/flights", method = RequestMethod.GET)
	public List<Flight> findFlights(){
		return flightRepository.findAll();
	}

}
