package exceptionshandson.flightbooking;

import java.util.List;

public class InvalidSeatException extends Exception{
    public InvalidSeatException(Integer seat, List<Integer>availableSeats){
        super("Seat number "+seat+" is not available for booking, please select from "+availableSeats);
    }

}
