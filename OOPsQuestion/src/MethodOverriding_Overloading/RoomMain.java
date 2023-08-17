package MethodOverriding_Overloading;

import java.util.Date;

public class RoomMain {
	
	public static void main(String[] args) {
		
		Room r1 = new Room(303,2,4000);
		
		r1.makeReservation();
		//System.out.println("Capacity : "+r1.getCapacity());
		
		Room r2 = new Room(101,1,3000);
		
		r2.makeReservation(new Date(), new Date());
		System.out.println("Capacity : "+r1.getCapacity());
		
		r1.makeReservation();
	}
}
