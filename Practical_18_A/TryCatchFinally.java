package Practical_18_A;

public class TryCatchFinally {

	public static void main(String[] args) {
		try {
			int a = 9, b = 0, c;
			c = a/b;
			System.out.println(c);
		} catch(ArithmeticException  e) {
			System.out.println("Exception Occur");
		}
		finally {
			System.out.println("This is finally block...");
		}
	}
}
