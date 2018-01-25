package com.urvin.hotel.HotelMgmt.controller;

import com.urvin.hotel.HotelMgmt.domain.Hotel;
import com.urvin.hotel.HotelMgmt.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    private static HotelController ourInstance = new HotelController();

    public static HotelController getInstance() {
        return ourInstance;
    }

    private HotelController() {
    }

    @GetMapping("/")
    public List<Hotel> getAllHotels() {
        return this.hotelService.getAllHotels();
    }

    @PutMapping
    public void addHotel(@RequestBody Hotel hotel) {
        this.hotelService.addHotel(hotel);
    }

    @PostMapping
    public void updateHotel(@RequestBody Hotel hotel) {
        this.hotelService.updateHotel(hotel);
    }

    @DeleteMapping("/{id}")
    public void deleteHotel(@PathVariable String id) {
        this.hotelService.deleteHotel(id);
    }

    @GetMapping("/{id}")
    public Hotel getHotelById(@PathVariable("id") String id) {
        return this.hotelService.getHotelById(id);
    }

    @GetMapping("/price/{maxPrice}")
    public List<Hotel> getHotelsByMaxPrice(@PathVariable("maxPrice") int maxPrice) {
        return this.hotelService.getHotelsLessThan(maxPrice);
    }
}
