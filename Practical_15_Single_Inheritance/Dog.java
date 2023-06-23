package Practical_15_Single_Inheritance;

public class Dog extends Animal {

	/*
	 * Dog class is extending Animal class.
	 */
	void bark() {
		System.out.println("Barking...");
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.bark();
		dog.run();
	}
}
