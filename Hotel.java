import java.sql.Date;
import java.util.ArrayList;

class Hotel extends Building {

    private String hotelName;
    private double rate;
    private ArrayList<Person> owners;
    private ArrayList<Room> rooms;

    public Hotel() {
        super();
    }

    public Hotel(String hotelName, ArrayList<Person> hotelOwners, int yearOfBuilt, int floors, double rate) {

        super(yearOfBuilt, floors);
        this.hotelName = hotelName;
        this.owners = hotelOwners;
        this.rate = rate;
        this.rooms = new ArrayList<>();
    }

    public String getHotelName() {
        return hotelName;
    }

    public ArrayList<Person> getOwners() {
        return owners;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public void setOwners(ArrayList<Person> owners) {
        this.owners = owners;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public Room getRoom(int roomNo) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNo) {
                return room;
            }
        }
        return null;
    }

    public void addOwner(Person owner) {
        owners.add(owner);
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int reserve(int roomNo, Date startDate, Date endDate, Person guest) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNo) {
                return room.reserve(startDate, endDate, guest);
            }
        }
        return 0;
    }

    public boolean cancel(int reservationNo) {
        for (Room room : rooms) {
            for (Reservation res : room.getReservations()) {
                if (res.getReservationNumber() == reservationNo) {
                    room.cancel(reservationNo);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Hotel " + hotelName + ", " + rate + "." + "\nHotel Owners: " + owners + "\nRooms: \n" + rooms;
    }
}
