package practical_12;

public class StaticDemo {

	/*
	 This is Static Variable. 
	*/
	static int value ;
	
	/*
	  This is Static Method.  
	*/
	static void show()
	{
		System.out.println("This is Static Method");
	}
	
	/*
	  This is Static Block .
	*/
	static 
	{
		System.out.println("This is static block");
		value = 10;
	}
	
	public static void main(String[] args) {
		System.out.println(value + " is static variable");
		StaticDemo.show();
	}
	
}
