package com.urvin.hotel.HotelMgmt.repository;

import com.urvin.hotel.HotelMgmt.domain.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends MongoRepository<Hotel,String>{
    public Hotel findById(String id);
    public List<Hotel> findByPricePerNightLessThan(int maxPrice);
}
