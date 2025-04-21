package com.vvsk.fullstack.movies_api.mapper;

import org.mapstruct.Mapper;

import com.vvsk.fullstack.movies_api.dto.Booking;
import com.vvsk.fullstack.movies_api.entity.BookingEntity;

@Mapper
public interface BookingMapper {

    BookingEntity toEntity(Booking booking);
    Booking toDto(BookingEntity bookingEntity);

}
