import java.sql.Date;

class Reservation {
    private Date startDate, endDate;
    private double pricePerNight;
    private Person guest;
    private static int reservationNumber = 10001;

    public Reservation(Date startDate, Date endDate, double pricePerNight, Person guest) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerNight = pricePerNight;
        this.guest = guest;
        reservationNumber++;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public boolean available(Date startDate, Date endDate) {
        return this.startDate.compareTo(startDate) <= 0 && this.endDate.compareTo(endDate) >= 0;
    }

    @Override
    public String toString() {
        return "Reservation Number: " +
                reservationNumber +
                ". From " + startDate +
                " To: " + endDate +
                ", Guest: " + guest +
                ", $" + pricePerNight + " per night.";
    }
}
