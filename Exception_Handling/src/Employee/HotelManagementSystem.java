package Employee;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class HotelManagementSystem {

	 private List<Guest> guests = new ArrayList<>();
	    private List<Reservation> reservations = new ArrayList<>();
	    private List<Room> rooms = new ArrayList<>();

	    // Room management
	    public void addRoom(Room room) {
	        rooms.add(room);
	    }

	    public Room findAvailableRoom(String roomType) throws RoomNotFoundException {
	        for (Room room : rooms) {
	            if (room.getClass().getSimpleName().equals(roomType) && room.isAvailable) {
	                return room;
	            }
	        }
	        throw new RoomNotFoundException("No available " + roomType + " found.");
	    }

	    public void bookRoom(Room room, Guest guest, Date reservationDate) {
	        room.setAvailable(false);
	        reservations.add(new RoomReservation(reservations.size() + 1, guest, reservationDate, room.getClass().getSimpleName()));
	    }

	    // Guest management
	    public void addGuest(Guest guest) {
	        guests.add(guest);
	    }

	    // Reservation management
	    public void makeReservation(String guestName, String guestEmail, String roomType, Date reservationDate)
	            throws InvalidReservationException {
	        try {
	            Guest guest = new Guest(guestName, guestEmail);
	            addGuest(guest);

	            Room room = findAvailableRoom(roomType);
	            bookRoom(room, guest, reservationDate);

	            System.out.println("Reservation successful: " + roomType + " room booked for " + guestName);
	        } catch (RoomNotFoundException e) {
	            throw new InvalidReservationException(e.getMessage());
	        }
	    }

	    public static void main(String[] args) {
	        HotelManagementSystem hotelSystem = new HotelManagementSystem();

	        // Example usage
	        hotelSystem.addRoom(new StandardRoom(101));
	        hotelSystem.addRoom(new DeluxeRoom(201));

	        try {
	            hotelSystem.makeReservation("sakshi", "sakshi@gmail.com", "StandardRoom", new Date(0));
	            hotelSystem.makeReservation("priya", "priya@.com", "DeluxeRoom", new Date(0));
	            //hotelSystem.makeReservation("harish", "harish@.com", "SuiteRoom", new Date(0));
	            
	        } catch (InvalidReservationException e) {
	            System.err.println("Error: " + e.getMessage());
	        }
	    }
	}