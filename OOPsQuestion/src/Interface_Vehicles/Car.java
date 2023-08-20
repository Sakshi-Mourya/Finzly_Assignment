package Interface_Vehicles;

public class Car implements vehicles {
	
	public void start() {
		System.out.println("Car starting.....");
	}
	
	public void accelerate() {
		System.out.println("Car accelerating....");
	}
	
	public void brake() {
		System.out.println("Car braking....");
	}
}
