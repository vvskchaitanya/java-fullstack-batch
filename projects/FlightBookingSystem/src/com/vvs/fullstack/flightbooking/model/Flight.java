package com.vvs.fullstack.flightbooking.model;

import java.util.Arrays;
import java.util.List;

import com.vvs.fullstack.flightbooking.exceptions.InvalidSeatException;

public class Flight {

    private List<Integer> availableSeats;

    public Flight(List<Integer> availableSeats){
        this.availableSeats = availableSeats;
    }

    public boolean bookSeat(Integer seatNumber) throws InvalidSeatException{
        if(availableSeats.contains(seatNumber)){
            System.out.println("Seat number " +seatNumber+" has been booked successfully");
            this.availableSeats.remove(availableSeats.indexOf(seatNumber));
            return true;
        }else{
            throw new InvalidSeatException(seatNumber, availableSeats);
        }
    }

}
