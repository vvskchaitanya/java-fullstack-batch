import java.util.ArrayList;
import java.util.Arrays;

import com.vvs.fullstack.flightbooking.exceptions.InvalidSeatException;
import com.vvs.fullstack.flightbooking.model.Flight;

public class App {
    public static void main(String[] args) {

        ArrayList<Integer> seats = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6, 7, 8));

        Flight flight1 = new Flight(seats);

        // Try to book seat number 2
        try {
            flight1.bookSeat(2);
        } catch (InvalidSeatException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Try to book seat number 10
            flight1.bookSeat(10);
        } catch (InvalidSeatException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Try to book seat number 2 again
            flight1.bookSeat(2);
        } catch (InvalidSeatException e) {
            System.out.println(e.getMessage());
        }

    }
}
