package drawing_Application;

public class Triangle implements Shape{
	
	private int base;
	private int height;
	private int side;
	
	public Triangle(int base, int height, int side) {
		super();
		this.base = base;
		this.height = height;
		this.side = side;
	}
	

	@Override
	public double CalculateArea() {
		
		return 0.5*base*height;
	}

	@Override
	public double CalculatePerimeter() {
		
		return side+base+side;
		
	}
	

	

}
