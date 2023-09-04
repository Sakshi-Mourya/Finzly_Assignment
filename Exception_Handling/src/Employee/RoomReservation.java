package Employee;

import java.sql.Date;

public class RoomReservation extends Reservation {
    private String roomType;

    public RoomReservation(int reservationId, Guest guest, Date reservationDate, String roomType) {
        super(reservationId, guest, reservationDate);
        this.roomType = roomType;
    }

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	
}
