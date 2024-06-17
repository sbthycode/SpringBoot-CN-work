package com.example.hotel.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.hotel.model.Hotel;

@Service
public class HotelService {
	
	List<Hotel> hotelList = new ArrayList<>();
	Map<String,Hotel> hotelMap = new HashMap<>();
	public void createHotel(Hotel hotel) {
		hotelList.add(hotel);
		hotelMap.put(hotel.getId(), hotel);
		
	}
	public Hotel getHotelById(String hotelId) {
		return hotelMap.get(hotelId);
	}
}
