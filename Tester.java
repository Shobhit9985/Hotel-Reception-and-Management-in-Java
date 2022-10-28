/*
 * 
 * 
 * 
 * import java.lang.reflect.Array;
 * import java.sql.Date;
 * import java.time.Year;
 * import java.util.ArrayList;
 * 
 * import Room.RoomType;
 * 
 * //import Room.RoomType;
 * 
 * public class Tester {
 * 
 * public static void main(String[] args) {
 * 
 * String hotelName;
 * double hotelRating;
 * Year year;
 * int numFloors;
 * 
 * // Create a 3.5 stars hotel, named "Baba-Mama", built in 2018, with two
 * floors
 * // The owners' "firstname last name"'s of the hotel are "Ali Baba" and "Alice
 * // Mama".
 * 
 * hotelName = "Baba-Mama";
 * hotelRating = 3.5;
 * year = Year.now();
 * numFloors = 2;
 * 
 * ArrayList<Person> owners = new ArrayList<>();
 * 
 * owners.add(new Person("Ali", "Baba"));
 * owners.add(new Person("Alice", "Mama"));
 * 
 * // Hotel hotel1 = new Hotel(hotelName, owners, year, numFloors, 3.5);
 * 
 * // ArrayList<Room> rooms = new ArrayList<>();
 * 
 * // Adding some rooms to this new hotel
 * // SINGLE, price=$35.50, size=200, floor=1, number=101, description="Single
 * Room
 * // without view");
 * 
 * // rooms.add(SINGLE, 35.50, 200, 1, 101, "Single Room without view");
 * 
 * Room room101 = new Room(Room.RoomType.SINGLE, 35.50, 200, 1, 101,
 * "Single Room without view");
 * 
 * // Double, price=$50.50, size=350, floor=1, number=102, description="Double
 * Room
 * // without view");
 * 
 * Room room102 = new Room(Room.RoomType.DOUBLE, 50.50, 350, 1, 102,
 * "Double Room without view");
 * 
 * // Double, price=$55.00, size=400, floor=2, number=201, description="Double
 * Room
 * // with view");
 * 
 * Room room201 = new Room(Room.RoomType.DOUBLE, 55.00, 400, 2, 201,
 * "Double Room with view");
 * 
 * // Suite, price=80.00, size=500, floor=2, number=202, description="Suite Room
 * // with view and balcony");
 * 
 * Room room202 = new Room(Room.RoomType.SUITE, 80.00, 500, 2, 202,
 * "Suite Room with view and balcony");
 * 
 * // Show the hotel information, including its rooms
 * 
 * Hotel hot = new Hotel();
 * 
 * hot.toString();
 * 
 * // Reserve the room number 102 for "Joe Uncle", checkin March 6, 2021,
 * checkout
 * 
 * Person person1 = new Person("Joe", "Uncle");
 * 
 * Reservation reserve1 = new Reservation("2021-03-06", "2021-03-08",
 * room102.getPrice(), person1);
 * // March 8, 2021
 * // Print out the reservation result
 * 
 * reserve1.toString();
 * 
 * // Change the price of the room 102 to $52.00
 * 
 * room102.setPrice(52.00);
 * 
 * // Reserve the room number 102 for "Mike Brother", checkin April 2, 2021,
 * // checkout April 4, 2021
 * // Print out the reservation result
 * 
 * Person person2 = new Person("Mike", "Brother");
 * 
 * Reservation reserve2 = new Reservation(3, 8, room102.getPrice(), person2);
 * 
 * reserve1.toString();
 * 
 * // Reserve the room number 101 for "Maria Aunt", checkin May 27, 2021,
 * checkout
 * // May 28, 2021
 * // Print out the reservation result
 * 
 * Person person3 = new Person("Maria", "Aunt");
 * 
 * Reservation reserve3 = new Reservation(27, 28, room101.getPrice(), person3);
 * 
 * reserve1.toString();
 * 
 * // Reserve the room number 101 for "laura Sister", checkin May 25, 2021,
 * // checkout May 28, 2021
 * // Print out the reservation result
 * 
 * Person person4 = new Person("laura", "Sister");
 * 
 * Reservation reserve4 = new Reservation(25, 28, room101.getPrice(), person4);
 * 
 * reserve1.toString();
 * 
 * // Check in the room 102
 * room102.status();
 * 
 * // Cancel reservation number 10003 and show the cancellation result
 * 
 * room101.cancel(10003);
 * 
 * // Show all the statuses of all the rooms
 * room101.status();
 * room102.status();
 * room201.status();
 * room202.status();
 * 
 * }
 * }
 */

/*
 * 
 * 
 * 
 */