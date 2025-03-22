package exceptionshandson.flightbooking;

import java.util.ArrayList;
import java.util.Arrays;

public class FlightBookingExample {
    public static void main(String[] args) {
        Flight f1 = new Flight(new ArrayList<Integer>(Arrays.asList(3,6,12,7,5)));
        
        try {
            // trying to book seat 6 which is avilable
            f1.bookSeat(6);
        } catch (InvalidSeatException e) {
            System.out.println(e.getMessage());
        }
        try {
            // trying to book 45 which is not available in list
            f1.bookSeat(45);
        } catch (InvalidSeatException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Try to book seat number 6 again
            f1.bookSeat(6);
        } catch (InvalidSeatException e) {
            System.out.println(e.getMessage());
        }


    }
}
