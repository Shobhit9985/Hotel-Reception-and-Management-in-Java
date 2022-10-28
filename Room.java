import java.sql.Date;
import java.util.ArrayList;

class Room {
    enum RoomType {
        SINGLE, DOUBLE, STUDIO, SUITE
    }

    private RoomType roomType;
    private double price;
    private double roomSize;
    private int floorNumber;
    private int roomNumber;
    private String description;
    private boolean isVacant;
    private ArrayList<Reservation> reservations;

    public Room(RoomType roomType, double price, double roomSize, int floorNumber, int roomNumber, String description) {
        this.roomType = roomType;
        this.price = price;
        this.roomSize = roomSize;
        this.floorNumber = floorNumber;
        this.roomNumber = roomNumber;
        this.description = description;
        isVacant = true;
        reservations = new ArrayList<>();
    }

    public double getPrice() {
        return price;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public boolean getVacancyStatus() {
        return isVacant;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int reserve(Date startDate, Date endDate, Person guest) {
        if (isVacant) {
            reservations.add(new Reservation(startDate, endDate, price, guest));
            return roomNumber;
        }
        return 0;
    }

    public void cancel(int reservationNumber) {
        for (Reservation reservation : reservations) {
            if (reservation.getReservationNumber() == reservationNumber) {
                reservations.remove(reservationNumber);
            }
        }
    }

    public String status() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reservation list of room number: ").append(roomNumber).append(": ");
        if (isVacant) {
            sb.append("Vacant.");
        } else {
            sb.append("Not Vacant.");
        }
        for (Reservation reservation : reservations) {
            sb.append("\n").append(reservation);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return roomType + ", price=$" + price + ", Size=" + roomSize +
                ", Number=" + roomNumber + ", Floor=" + floorNumber +
                ", " + "Description: " + description;
    }
}