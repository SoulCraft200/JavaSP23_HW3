/**
 * Saves booking data,setters,getters, calculates cost and return info in string format
 */
public class Booking implements Comparable<Booking>{
    private String bookingType;
    private static int bookingId;
    private int numDays;
    private double dayCost;

    /**
     * Instantiates a new Booking.
     *
     * @param bookingType the booking type
     * @param numDays     the num days
     * @param dayCost     the day cost
     */
    public Booking(String bookingType, int numDays, double dayCost) {
        this.bookingType = bookingType;
        this.numDays = numDays;
        this.dayCost = dayCost;
        bookingId++;
    }

    /**
     * Gets booking type.
     *
     * @return the booking type
     */
    public String getBookingType() {
        return bookingType;
    }

    /**
     * Sets booking type.
     *
     * @param bookingType the booking type
     */
    public void setBookingType(String bookingType) {
        this.bookingType = bookingType;
    }

    /**
     * Gets num days.
     *
     * @return the num days
     */
    public int getNumDays() {
        return numDays;
    }

    /**
     * Sets num days.
     *
     * @param numDays the num days
     */
    public void setNumDays(int numDays) {
        this.numDays = numDays;
    }

    /**
     * Gets day cost.
     *
     * @return the day cost
     */
    public double getDayCost() {
        return dayCost;
    }

    /**
     * Sets day cost.
     *
     * @param dayCost the day cost
     */
    public void setDayCost(double dayCost) {
        this.dayCost = dayCost;
    }

    /**
     * Get id int.
     *
     * @return the int
     */
    public static int getId() {
        return bookingId;
    }

    /**
     * Get cost double.
     *
     * @return the double
     */
    public double getCost() {
        return numDays * dayCost;
    }

    public String toString() {
        return String.format("%-10d%-10d%-10.2f", bookingId, numDays, dayCost);
    }

    @Override
    public int compareTo(Booking booking) {
        return Double.compare(this.getCost(),booking.getCost());
    }

    /**
     * Compare to int cost.
     *
     * @param booking the booking
     * @return the int
     */

}