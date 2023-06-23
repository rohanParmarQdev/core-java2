package Practical_15_MultiLevel_Inheritance;

public class ElectricCar extends Car {

	/*
	 * Subclass inheriting from Car 
	 */
	void charge() {
		System.out.println("The Electric Car is charged.");
	}
	
	public static void main(String[] args) {
		/*
		 * Main method is demonstrating multilevel inheritance
		 * */
		ElectricCar electricCar = new ElectricCar();
		electricCar.start();
		electricCar.accelerate();
		electricCar.charge();
		System.out.println("Program of Multi-Level Inheritance");
	}
	
}
