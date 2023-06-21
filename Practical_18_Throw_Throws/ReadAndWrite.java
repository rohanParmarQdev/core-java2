package Practical_18_Throw_Throws;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadAndWrite {

	void readFile() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("E:\\tomacate.txt");
	}
}
