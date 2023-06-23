package Practical_15_Single_Inheritance;

public class Dogs extends Animals {

	/*
	 * Dogs class is extending Animal class.
	 */
	void bark() {
		System.out.println("Barking...");
	}
	public static void main(String[] args) {
		Dogs dog = new Dogs();
		dog.eat();
		dog.bark();
		dog.run();
	}
}
