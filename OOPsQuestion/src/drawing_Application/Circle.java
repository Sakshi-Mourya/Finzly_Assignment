package drawing_Application;

public class Circle implements Shape{
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public double CalculateArea() {
		return Math.PI*radius*radius;
	}
	
	public double CalculatePerimeter() {
		return 2*Math.PI*radius;
	}

}
