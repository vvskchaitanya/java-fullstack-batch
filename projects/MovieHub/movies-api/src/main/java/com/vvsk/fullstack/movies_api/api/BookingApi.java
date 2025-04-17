package com.vvsk.fullstack.movies_api.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vvsk.fullstack.movies_api.dto.Booking;
import com.vvsk.fullstack.movies_api.service.BookingService;

@RestController
@RequestMapping("/bookings")
@CrossOrigin(origins = "http://localhost:4200")
public class BookingApi {

    @Autowired
    BookingService service;



    @PostMapping
    public Booking addMovie(@RequestBody Booking booking) {
        return service.createBooking(booking);
    }

}
