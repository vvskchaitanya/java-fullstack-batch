package com.vvsk.fullstack.movies_api.service;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vvsk.fullstack.movies_api.dto.Booking;
import com.vvsk.fullstack.movies_api.entity.BookingEntity;
import com.vvsk.fullstack.movies_api.mapper.BookingMapper;
import com.vvsk.fullstack.movies_api.repository.BookingRepository;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    BookingMapper mapper = Mappers.getMapper(BookingMapper.class);

    // Add methods to handle booking operations, such as creating, updating, and deleting bookings
    
    public Booking createBooking(Booking booking) {
        // Convert Booking DTO to BookingEntity and save it to the database
        BookingEntity bookingEntity = mapper.toEntity(booking);
        bookingRepository.save(bookingEntity);
        return booking;
    }

}
