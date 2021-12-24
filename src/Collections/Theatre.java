package Collections;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new LinkedList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
               Seat seat = new Seat(row + String.format("%02d", seatNum));
               seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats,requestedSeat, null);
        if (foundSeat >= 0 ){
            return seats.get(foundSeat).reserve();
        } else{
            System.out.println("There is not seat " + seatNumber);
            return false;
        }
    }

    public void getSeats(){
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    private class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(@NotNull Theatre.Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            }else {
                return false;
            }
        }

        public boolean cancel(){
           if(this.reserved){
               this.reserved = false;
               System.out.println("The reservation of seat " + seatNumber + " has been cancelled");
               return true;
           }else{
               return false;
           }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }



}
