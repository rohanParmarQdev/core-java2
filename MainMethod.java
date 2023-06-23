package Practical_18_Throws;

import java.io.FileNotFoundException;
/*
 * This is the main method for the accessing main files in our system. 
 * */
public class MainMethod {

	public static void main(String[] args) {
		/*
		 * Accessing file using Read File method
		 * */
		try {
			ReadAndWrite.readFile();
			System.out.println("File is found");
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
		System.out.println("Rest of the code...");
	}
}