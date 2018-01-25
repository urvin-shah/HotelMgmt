package com.urvin.hotel.HotelMgmt.domain;

import lombok.Data;

@Data
public class Review {
    private String username;
    private int rating;
    private boolean approved;

    protected Review() {}

    public Review(String username, int rating, boolean approved) {
        this.username = username;
        this.rating = rating;
        this.approved = approved;
    }
}
