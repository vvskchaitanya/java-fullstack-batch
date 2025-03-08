package com.vvs.fullstack.flightbooking.exceptions;

import java.util.List;

public class InvalidSeatException extends Exception{

    public InvalidSeatException(Integer seatNumber, List<Integer> availableSeats){
        super("Seat Number "+seatNumber+" Not Available, please choose from below list \n"+availableSeats);
    }
}
