package package1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class files {

	static Set<String> file = new TreeSet<>();
	
	// initially let there be 5 files as follows
	public static void main(String[] args) {
		files obj = new files();
		file.add("Honda.txt");
		file.add("Toyota.txt");
		file.add("Isuzu.txt");
		file.add("Hyundai.txt");
		file.add("Subaru.txt");
		obj.disp();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the file name that you want to add: ");
		String fname = sc.next();
		obj.addFile(fname);
		System.out.println("After adding file: ");
		obj.disp();
		
		System.out.println("Enter the file name that has to be deleted: ");
		String fname1 = sc.next();
		obj.delFile(fname1);
		System.out.println("After deleting file: ");
		obj.disp();
		
		System.out.println("Enter the file name that has to be searched: ");
		String fname2 = sc.next();
		obj.searchFile(fname2);
	}
	
	//print function
	public static void disp() {
		System.out.println("The files in ascending order are as follows: \n"+file);
	}
	
	//add file
	public static void addFile(String fname) {
		file.add(fname);
	}
	
	//delete file
	public static void delFile(String fname) {
		file.remove(fname);
	}
	
	//search file
	public void searchFile(String fname) {
		if((file.contains(fname)==true)){
			System.out.println("File found!");
		}
		else {
			System.out.println("File not found!");
		}
	}
}
