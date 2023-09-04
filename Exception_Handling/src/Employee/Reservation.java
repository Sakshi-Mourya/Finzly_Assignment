package Employee;

import java.sql.Date;

public class Reservation {
	
	private int reservationId;
    private Guest guest;
    private Date reservationDate;
    
	public Reservation(int reservationId, Guest guest, Date reservationDate) {
		super();
		this.reservationId = reservationId;
		this.guest = guest;
		this.reservationDate = reservationDate;
	}

	public int getReservationId() {
		return reservationId;
	}

	public void setReservationId(int reservationId) {
		this.reservationId = reservationId;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	@Override
	public String toString() {
		return "Reservation [reservationId=" + reservationId + ", guest=" + guest + ", reservationDate="
				+ reservationDate + "]";
	}
    
	
    
}

