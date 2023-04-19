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
            bookings.add(new PavilionBooking("PavilionBooking",numDays,dayCost,extra));
        }
    }
    public String cancelBooking(int iD){
        int pos = 0;
        boolean found = false;
        while(pos < bookings.size() && !found){
            //bookings.get(pos).getId()== Id
            Booking temp;
            if(bookings.get(pos).getBookingType().equals("HallBooking")){
                temp = bookings.get(pos);
            }
            if(temp.getiD()== iD){
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
        while(pos < bookings.size() && !found){
            //bookings.get(pos).getId()== Id
            if(bookings.get(pos).getId()== iD){
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
