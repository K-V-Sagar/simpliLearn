package throwsDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throwsDemo {
	
	// checked exceptions
	void readFile() throws FileNotFoundException {
		FileInputStream obj = new FileInputStream("C:\\javafsd\\files\\test1.txt");
	}
	
	public static void main(String[] args) {

		throwsDemo obj = new throwsDemo();
		try {
		obj.readFile();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not Found!!!");
		}
		finally {
			System.out.println("Bye!");
		}
	}
}
