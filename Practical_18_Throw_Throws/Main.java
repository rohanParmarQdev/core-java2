package Practical_18_Throw_Throws;

public class Main {

	public static void main(String[] args) {
		ReadAndWrite read = new ReadAndWrite();
		try {
			read.readFile();
			System.out.println("File is found");
		} catch (Exception e) {
			System.out.println("File not found");
		}
		System.out.println("Rest of the code...");
	}
}