package com.example.hotel.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.example.hotel.model.Hotel;

@Service
public class HotelService {
	
	List<Hotel> hotelList = new ArrayList<>();
	Map<String,Hotel> hotelMap = new HashMap<>();
	
	public void updateHotel (Hotel updatedHotel) {
		Hotel existingHotel= getHotelById(updatedHotel.getId()); 
		hotelList.remove(existingHotel);
		hotelList.add(updatedHotel);
		hotelMap.put(updatedHotel.getId(), updatedHotel);
	}
	
	public void createHotel(Hotel hotel) {
		hotelList.add(hotel);
		hotelMap.put(hotel.getId(), hotel);	
	}
	public Hotel getHotelById(String id) {
		if(ObjectUtils.isEmpty(hotelMap.get(id))) {
			throw new HotelNotFoundException("Hotel not found for id:"+id);
		}
		Hotel hotel = hotelMap.get(id);
		return hotel;
	}
}