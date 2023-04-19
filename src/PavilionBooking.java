/**
 * Booking Subclass with different getCost formula.
 */
public class PavilionBooking extends Booking{
    private double secNum;
    private int iD;
    /**
     * Instantiates a new Pavilion booking.
     *
     * @param bookingType the booking type
     * @param numDays     the num days
     * @param dayCost     the day cost
     * @param secNum      the sec num
     */
    public PavilionBooking(String bookingType, int numDays, double dayCost, double secNum) {
        super(bookingType, numDays, dayCost);
        this.secNum = secNum;
        iD = getId();
    }

    /**
     * Gets sec num.
     *
     * @return the sec num
     */
    public double getSecNum() {
        return secNum;
    }

    /**
     * Sets sec num.
     *
     * @param secNum the sec num
     */
    public void setSecNum(int secNum) {
        this.secNum = secNum;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    @Override
    public double getCost() {
        return super.getCost() + (secNum * 10 * getNumDays());
    }

    @Override
    public String toString() {
        return String.format("%-20s%-10s%-15s%-20s%-20s%-10s","BookingType","ID","numOfDays","singleDayCost","numSections","Booking Cost\n")+
                "-".repeat(100)+"\n"+String.format("%-20s%-10d%-15d%-20.2f%-20.0f%-10.2f", getBookingType(),iD,getNumDays(),getDayCost(),getSecNum(), getCost());
    }

}
