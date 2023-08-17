package Inheritance_Polymorphism;

public class Animal {

	private String name;
	private int age;
	
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void makeSound() {
		System.out.println("Animal Sound...");
	}
}
