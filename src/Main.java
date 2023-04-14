public class Main {
    public static void main(String[] args) {
        BookingManager bookings = new BookingManager();
        bookings.addBooking("H",10,5,1.5);
        bookings.addBooking("P",15,5,2);
        System.out.println(bookings.displayBooking());
    }
}