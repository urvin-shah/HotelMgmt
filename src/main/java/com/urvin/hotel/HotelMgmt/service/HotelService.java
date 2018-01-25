package com.urvin.hotel.HotelMgmt.service;

import com.urvin.hotel.HotelMgmt.domain.Hotel;
import com.urvin.hotel.HotelMgmt.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> getAllHotels() {
        return this.hotelRepository.findAll();
    }

    public void addHotel(Hotel hotel) {
        this.hotelRepository.insert(hotel);
    }

    public void updateHotel(Hotel hotel){
        this.hotelRepository.save(hotel);
    }

    public  void deleteHotel(String id) {
        this.hotelRepository.delete(id);
    }

    public Hotel getHotelById(String id) {
        return this.hotelRepository.findById(id);
    }

    public List<Hotel> getHotelsLessThan(int maxPrice) {
        return  this.hotelRepository.findByPricePerNightLessThan(maxPrice);
    }
}
