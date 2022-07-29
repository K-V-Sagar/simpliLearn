package package1;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class virtualRepo {
	
	static Set<String> file = new TreeSet<>();
	
	public static void main(String[] args){
		
		
		file.add("Honda.txt");
		file.add("Toyota.txt");
		file.add("Isuzu.txt");
		file.add("Hyundai.txt");
		file.add("Subaru.txt");
		boolean flag = false;
		boolean flag1 = false;
		int c;
		do {
			//---------------MENU--------------------
			System.out.println("**********************************************************");
			System.out.println("----------------------------------------------------------");
			System.out.println("                      LockedMe.com                        ");
			System.out.println("----------------------------------------------------------");
			System.out.println("**********************************************************");
			System.out.println("------------------Developed by K V Sagar------------------");
			System.out.println("\n\n");
			System.out.println("----------------------------------------------------------");
			System.out.println("                       MAIN MENU                          ");
			System.out.println("----------------------------------------------------------");
			System.out.println("\n");
			System.out.println("1. Display the current files names in ascending order.");
			System.out.println("2. Add / Delete / Search a file.");
			System.out.println("3. Exit.");
			System.out.println("Enter your choice: ");
			Scanner sc = new Scanner(System.in);
			try {
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1: 
				disp();
				System.out.println("Do you want to try again? \n Enter 1 for Yes and 0 for No");
				c=sc.nextInt();
				if(c==1) {
					flag=true;
					System.out.println("\n\n");
					break;
				}
				else {
					System.out.println("************************* TERMINATED ************************");
					System.out.println("************************** THANK YOU ************************");
					flag=false;
					break;
				}
				
				
			case 2:
				do {
					
					System.out.println("----------------------------------------------------------");
					System.out.println("                Add / Delete / Search MENU                ");
					System.out.println("----------------------------------------------------------");
					System.out.println("\n");
					System.out.println("1. Add a new file to the existing directory.");
					System.out.println("2. Delete a file from the existing directory.");
					System.out.println("3. Search a file in the existing directory.");
					System.out.println("4. Go back to the Main Menu.");
					System.out.println("Enter your choice: ");
					try {
					int subChoice = sc.nextInt();
					switch(subChoice) {
					
					case 1:
						System.out.println("Enter the file name that you want to add: ");
						String fname = sc.next();
						addFile(fname);
						//more chances
						System.out.println("Do you want to try again? \n Enter 1 for Yes and 0 for No");
						c=sc.nextInt();
						if(c==1) {
							flag1=true;
							System.out.println("\n\n");
							break;
						}
						else {
							flag1 = false;
							System.out.println("Going back to Main Menu...\n\n");
							break;
						}
						
						
					case 2:
						System.out.println("Enter the file name that has to be deleted: ");
						String fname1 = sc.next();
						delFile(fname1);
						//more chances
						System.out.println("Do you want to try again? \n Enter 1 for Yes and 0 for No");
						c=sc.nextInt();
						if(c==1) {
							flag1=true;
							System.out.println("\n\n");
							break;
						}
						else {
							flag1 = false;
							System.out.println("Going back to Main Menu...\n\n");
							break;
						}
						
						
					case 3:
						System.out.println("Enter the file name that has to be searched: ");
						String fname2 = sc.next();
						searchFile(fname2);
						//more chances
						System.out.println("Do you want to try again? \n Enter 1 for Yes and 0 for No");
						c=sc.nextInt();
						if(c==1) {
							flag1=true;
							System.out.println("\n\n");
							break;
						}
						else {
							flag1 = false;
							System.out.println("Going back to Main Menu...\n\n");
							break;
						}
					
						
					case 4:
						flag1 = false;
						System.out.println("Going back to Main Menu...\n\n");
						break;
						
					default :
						System.out.println("Wrong choice selected!!!");
						System.out.println("Do you want to try again? \nEnter 1 for Yes and 0 for No");
						c=sc.nextInt();
						if(c==1) {
							flag1=true;
							System.out.println("\n\n");
							break;
						}
						else {
							flag1 = false;
							System.out.println("Going back to Main Menu...\n\n");
							break;
						}	
					}
					}
					catch(InputMismatchException e) {
						System.out.println("Enter only a number!!!");
						System.out.println("Going back to Main Menu...\n\n");
						flag1=false;
			 			//break;
						
					}
					
				}
				
				while(flag1==true);
				flag=true;
				break;
				
			case 3:
				
				System.out.println("************************* TERMINATED ************************");
				System.out.println("************************** THANK YOU ************************");
				flag=false;
				break;
				
			default :
				System.out.println("Wrong choice selected!!!");
				System.out.println("Do you want to try again? \nEnter 1 for Yes and 0 for No");
				c=sc.nextInt();
				if(c==1) {
					flag=true;
					System.out.println("\n\n");
					break;
				}
				else {
					System.out.println("************************* TERMINATED ************************");
					System.out.println("************************** THANK YOU ************************");
					flag=false;
					break;
				}	
				
			}
			}
			catch(InputMismatchException e) {
				System.out.println("Enter only a number!!!\n");
				flag=true;
	 			System.out.println("\n\n");
				
			}
		}
		while(flag==true);
	}
	
	// Displaying in ascending order
	public static void disp() {
		System.out.println("The files in ascending order are as follows: \n"+file);
		System.out.println("\n\n");
	}
	
	//add file method
	public static void addFile(String fname) {
		if((file.contains(fname)==true)) {
			System.out.println("File already exists!");
			System.out.println("-------------------------------");
		}
		else {
			file.add(fname);
		}
	}
	
	//case sensitive file delete method
	public static void delFile(String fname) {
		if((file.contains(fname)==true)) {
			file.remove(fname);
		}
		else {
			System.out.println("File not found!");
		}
	}
	
	//case sensitive file search method
	public static void searchFile(String fname) {
		if((file.contains(fname)==true)){
			System.out.println("File found!");
		}
		else {
			System.out.println("File not found!");
		}
	}
	
}