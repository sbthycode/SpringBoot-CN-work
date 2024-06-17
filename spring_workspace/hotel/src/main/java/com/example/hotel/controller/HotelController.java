package com.example.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotel.model.Hotel;
import com.example.hotel.service.HotelService;

@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	HotelService hotelService;
	
	@PostMapping("/create")
	public void createHotel(@RequestBody Hotel hotel) {
		hotelService.createHotel(hotel);
		return;
	}
	
	@GetMapping("/id/{hotelId}")
	public Hotel getHotel(@PathVariable String hotelId) {
		Hotel hotelRetured = hotelService.getHotelById(hotelId);
		return hotelRetured;
	}
	
	
	
}
