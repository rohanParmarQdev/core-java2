package practical_6;

public class BreakStatement {

	public static void main(String[] args) {
		/*
		   This program demonstrates the usage of 'continue' and 'break' statements in a loop.
		*/
		for(int i=1; i<=10; i++)
		{
			if(i == 5) {
				continue;
			}
			System.out.println(i);
			if(i == 7) {
				break;
			}
		}
	}
	
}
