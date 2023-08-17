package Inheritance_Polymorphism;

public class Lion extends Animal{

	public Lion(String name, int age) {
		super(name, age);
	}

	public void makeSound() {
		System.out.println("Lion Sound");
	}

}
