package Inheritance_Polymorphism;

public class zoo {
	public static void main(String[] args) {
		Animal a1 = new Animal("xys",30);
		a1.makeSound();
		
		
	//	Lion l1 = new Lion("abc",41);
	//	l1.makeSound();
		
	//	Elephant e1 = new Elephant("pqr", 11);
	//	e1.makeSound();
		
	//	Giraffe g1 = new Giraffe("fgh",45);
	//	g1.makeSound();
		
		//Dynamic Binding
		
		Animal l1 = new Lion("abc",41);
		l1.makeSound();
		
		Animal e1 = new Elephant("pqr", 11);
		e1.makeSound();
		
		Animal g1 = new Giraffe("fgh",45);
		g1.makeSound();
		
	}
}

