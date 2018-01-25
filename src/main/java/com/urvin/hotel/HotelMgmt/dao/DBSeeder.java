package com.urvin.hotel.HotelMgmt.dao;

import com.urvin.hotel.HotelMgmt.domain.Address;
import com.urvin.hotel.HotelMgmt.domain.Hotel;
import com.urvin.hotel.HotelMgmt.domain.Review;
import com.urvin.hotel.HotelMgmt.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DBSeeder implements CommandLineRunner {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public void run(String... strings) throws Exception {
        Hotel rangSagar = new Hotel(
                "Rang Sagar",
                100,
                new Address("Ahmedabad","India"),
                Arrays.asList(
                        new Review("Urvin",7,false),
                        new Review("Jimmy",8,true),
                        new Review("Harshal",6,true)
                )
        );
        Hotel rangTarang = new Hotel(
                "Rang Tarang",
                300,
                new Address("Ahmedabad","India"),
                Arrays.asList(
                        new Review("Riyal",7,false),
                        new Review("Hitesh",8,true),
                        new Review("Vivek",6,true)
                )
        );
        Hotel riversitePark = new Hotel(
                "Riverside Park",
                200,
                new Address("Ahmedabad","India"),
                Arrays.asList(
                        new Review("Ajay",7,false),
                        new Review("Vishal",8,true),
                        new Review("Harshal",6,true)
                )
        );

        // Delete all hotels if available
        this.hotelRepository.deleteAll();
        List<Hotel> hotels = Arrays.asList(rangSagar,rangTarang,riversitePark);
        this.hotelRepository.save(hotels);
    }
}
