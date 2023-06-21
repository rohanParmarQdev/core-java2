package Practical_18_Throw_Throws;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age : ");
	try {
		int age = scan.nextInt();
		
		if(age < 18) {
			throw new YongerAgeException("Invalide age");
		} else {
			System.out.println("Eligible for vote");
		}
		}catch(YongerAgeException e) {
			System.out.println("Exception Occour");
		}
	finally {
		scan.close();
		}
	}
}