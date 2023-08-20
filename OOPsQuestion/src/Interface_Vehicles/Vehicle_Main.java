package Interface_Vehicles;

public class Vehicle_Main {

	public static void main(String[] args) {
		
		vehicles car = new Car();
		car.start();
		car.accelerate();
		car.brake();
		
		vehicles motorcycle = new Motorcycle();
		motorcycle.start();
		motorcycle.accelerate();
		motorcycle.brake();
		
		
	}
}
