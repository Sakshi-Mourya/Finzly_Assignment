package drawing_Application;

public class Rectangle implements Shape{
	
	private int length;
	private int breadth;
	
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public double CalculateArea() {
		
		return length*breadth;
	}
	@Override
	public double CalculatePerimeter() {
		
		return 2*(length+breadth);
	}	

}
