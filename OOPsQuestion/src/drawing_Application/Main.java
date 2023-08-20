package drawing_Application;

public class Main {

	public static void main(String[] args) {
		
		Circle c = new Circle(2);
		System.out.println("The area of Circle : "+c.CalculateArea());
		System.out.println("The Perimeter of Circle : "+ c.CalculatePerimeter());
		
		Rectangle r = new Rectangle(2,4);
		System.out.println("\nThe area of Rectangle : "+r.CalculateArea());
		System.out.println("The Perimeter of Rectangle : "+r.CalculatePerimeter());
		
		Triangle t = new Triangle(3,4,5);
		System.out.println("\nThe area of Triangle : "+t.CalculateArea());
		System.out.println("The Perimeter of Triangle : "+t.CalculatePerimeter());
		
	}

}
