public class Main {
    public static void main(String[] args) {
        BookingManager bookings = new BookingManager();
        bookings.addBooking("H",10,5,1.5);
        bookings.addBooking("P",15,5,2);
        System.out.println(bookings.displayBooking());
        bookings.specBooking(5);
        bookings.specBooking(2);
        bookings.cancelBooking(2);
        System.out.println("_________________________________________________________________");
        System.out.println(bookings.displayBooking());
    }
}