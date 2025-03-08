package exceptionshandson.flightbooking;


import java.util.List;

public class Flight {
    private List<Integer> availableSeats;

    public Flight(List<Integer> availableSeats) {
        this.availableSeats = availableSeats;
    }

    public List<Integer> getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(List<Integer> availableSeats) {
        this.availableSeats = availableSeats;
    }

    public boolean bookSeat(int seat) throws InvalidSeatException{
        if(availableSeats.contains(seat)){
            System.out.println("Booked seat successfully with seat number "+seat);
            availableSeats.remove(availableSeats.indexOf(seat));
            return true;
        }
        else{
            throw new InvalidSeatException(seat,availableSeats);
        }
    }

}
