package Employee;

public class Room {
	
	private int roomNumber;
    private double price;
    boolean isAvailable;
    
	public Room(int roomNumber, double price) {
		super();
		this.roomNumber = roomNumber;
		this.price = price;
		this.isAvailable = true;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "Room [roomNumber=" + roomNumber + ", price=" + price + ", isAvailable=" + isAvailable + "]";
	}
    
    

}