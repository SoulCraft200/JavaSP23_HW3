/**
 * Booking Subclass with different getCost formula.
 */
public class HallBooking extends Booking{
    private double rate;
    private int iD;


    /**
     * Instantiates a new Hall booking.
     *
     * @param bookingType the booking type
     * @param numDays     the num days
     * @param dayCost     the day cost
     * @param rate        the rate
     */
    public HallBooking(String bookingType, int numDays, double dayCost, double rate) {
        super(bookingType, numDays, dayCost);
        this.rate = rate;
        iD = getId();
    }

    /**
     * Gets rate.
     *
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * Sets rate.
     *
     * @param rate the rate
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    @Override
    public double getCost() {
        return super.getCost() - ((rate/100.0) * super.getCost());
    }

    @Override
    public String toString() {
        return String.format("%-20s%-10s%-15s%-20s%-10s","BookingType","ID","numOfDays","singleDayCost","Booking Cost\n")+
                "-".repeat(90)+"\n"+ String.format("%-20s%-10d%-15d%-20.2f%-10.2f",getBookingType(),iD,getNumDays(),getDayCost(),getCost());
    }
}
