package MethodOverriding_Overloading;
import java.util.Date;
public class Room {

	private int roomNumber;
	private static int capacity;
	private int priceperNight;
	
	public Room(int roomNumber, int capacity, int priceperNight) {
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.priceperNight = priceperNight;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public static int getCapacity() {
		return capacity;
	}

	public static void setCapacity(int capacity) {
		Room.capacity = capacity;
	}

	public int getPriceperNight() {
		return priceperNight;
	}

	public void setPriceperNight(int priceperNight) {
		this.priceperNight = priceperNight;
	}
	
	public boolean isavailability() {
		if(capacity > 0) 
			return true;
		else 
			return false;
	}
	public void makeReservation() {
		if (isavailability()) {
			 System.out.println("Room " + roomNumber + " reserved.");
			 capacity--;
        } 
		else {
            System.out.println("No Empty Room");
		}
	}
	 public void makeReservation(Date checkIn, Date checkOut) {
		 
	        if (isavailability()) {
	        	capacity--;
	            System.out.println("Room " + roomNumber + " reserved from day " + checkIn + " to day " + checkOut + ".");
	        }
	        else {
	            System.out.println("No Empty Room");
	        }
	    }
	 public String toString() {
			return "Room roomNumber = "  + roomNumber +", pricePerNight= " + priceperNight + " ";
		}

}
