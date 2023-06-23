package practical_11;

public class SuperKeyword extends Parent {
	
	/*
	 Extending parent class and calling both value variables using this and super keyword. 
	 */
	
	int value = 20;
	void show(int value) 
	{
		System.out.println(this.value);
		System.out.println(super.value);
	}
	
	public static void main(String[] args) {
		
		SuperKeyword superKey = new SuperKeyword();
		superKey.show(30);
	}
	
}
