import java.util.ArrayList;
import java.util.Collections;

public class BookingManager {
    private final ArrayList<Booking> bookings;

    public BookingManager(){
        bookings = new ArrayList<>();
    }

    public void addBooking(String type, int numDays, double dayCost, double extra){
        if (type.equalsIgnoreCase("h")){
            bookings.add(new HallBooking("HallBooking",numDays,dayCost,extra));
        }else {
            bookings.add(new HallBooking("PavilionBooking",numDays,dayCost,extra));
        }
    }
    public String cancelBooking(int iD){
        int pos = 0;
        boolean found = false;
        while(pos < bookings.size()-1 && !found){
            //bookings.get(pos).getId()== Id
            if(Booking.getId()== iD){
                found = true;
            }else {
                pos++;
            }
        }
        if (found){
            bookings.remove(pos);
            return "The following booking will be removed";
        }else {
            return "Either no bookings or no such booking .................";
        }


    }
    public StringBuilder displayBooking(){
        Collections.sort(bookings);
        StringBuilder res = new StringBuilder();
        for (Booking booking : bookings) {
            res.append(booking.toString()).append("\n");
        }
        return res;
    }

    public String specBooking(int iD){
        int pos = 0;
        boolean found = false;
        while(pos < bookings.size()-1 && !found){
            //bookings.get(pos).getId()== Id
            if(Booking.getId()== iD){
                found = true;
            }else {
                pos++;
            }
        }
        if (found){
            return bookings.get(pos).toString();
        }else {
            return "Either no bookings or no such booking .................";
        }
    }

}
