package package1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.io.FileReader;

public class fileTest {
	
	
	//creating a new file
	private static void createFile() throws IOException {
        File file = new File("c:/javafsd/testFile9.txt");
        
        if (file.createNewFile()){
          System.out.println("File is created!");
        }else{
          System.out.println("File already exists.");
        }
		 
	}
	
	
	// Writing in to a file using Filewriter
	private static void writeFile() throws IOException{
		
          FileWriter writer = new FileWriter("c:/javafsd/testFile9.txt");
          writer.write("Hello!");
          writer.close(); 
         
    }
	
	
	// reading a file using scanner
	private static void readFile() throws FileNotFoundException {
	
		Scanner scanner = new Scanner(new File("c:/javafsd/testFile9.txt"));
        while(scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
	}
	
	
	// appending a file
	private static void appFile() throws IOException {
		
		String textToAppend = " How are you?";
		Path path = Paths.get("c:/javafsd/testFile9.txt");
		Files.write(path, textToAppend.getBytes(), StandardOpenOption.APPEND); 
	}
	
	
	//main method
	public static void main(String[] args) throws IOException{
		createFile();
		writeFile();
		readFile();
		appFile();
		System.out.println("-------------- After appending ----------");
		readFile();
	}
	
}
