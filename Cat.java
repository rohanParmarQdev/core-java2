package Practical_15_Hierarchical_Inheritance;

/*
 * subclass inheriting from Animal
 * */
public class Cat extends Animal{

	void meow() {
		System.out.println("Meowing...");
	}
	
	public static void main(String[] args) {
		Cat cat=new Cat();  
		cat.meow();  
		cat.eat(); 
		cat.run();
	}
	
}