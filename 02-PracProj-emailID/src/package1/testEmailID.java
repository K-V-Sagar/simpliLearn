package package1;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.Scanner;

public class testEmailID {

	public static void main(String[] args) {
		
		boolean flag=false;
		int choice;
		int c;
		boolean b;
		int index;
		Scanner sc = new Scanner(System.in);
		// creating linked list object
		LinkedList<String> obj = new LinkedList<String>();
		
		do {
			System.out.println("***************** MAIN MENU *******************");
			System.out.println("Choose\n1 to Add email-ID\n2 to Search email-ID");
			System.out.println("3 to Display all email-IDs\n4 to Exit");
			System.out.println("-----------------");
			System.out.println("Enter you choice: ");
			choice=sc.nextInt();
			
			switch(choice) {
			
			case 1 :
				
				System.out.println("------------------ ADD MENU -----------------");
				System.out.println("Enter email-ID:");
				String mail= sc.next();
				obj.add(mail);
				System.out.println("Do you want to try again? \nEnter 1 for Yes and 0 for No");
				c=sc.nextInt();
				if(c==1) {
					//obj.add(mail);
					flag=true;
					break;
				}
				else {
					System.out.println("****************** TERMINATED ******************");
					System.out.println("******************* THANK YOU ******************");
					flag=false;
					break;
				}
				
				
			case 2: 
				
				System.out.println("------------------ SEARCH MENU -----------------");
				System.out.println("Enter the email-ID to be searched:");
				String mail2 = sc.next();
				b = obj.contains(mail2);
				if(b==true) {
					index=obj.indexOf(mail2);
					System.out.println("-----------------");
					System.out.println(" email-ID found at :"+index);
					System.out.println("-----------------");
				}
				else {
					System.out.println("email-ID not found!!!\n");
				}
				System.out.println("Do you want to try again? \nEnter 1 for Yes and 0 for No");
				c=sc.nextInt();
				if(c==1) {
					flag=true;
					break;
				}
				else {
					System.out.println("****************** TERMINATED ******************");
					System.out.println("******************* THANK YOU ******************");
					flag=false;
					break;
				}
				
				
			case 3 :
				
				System.out.println("--------------- Printing all email_IDs -----------------");
				Iterator itr = obj.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
				System.out.println("Do you want to try again? \nEnter 1 for Yes and 0 for No");
				c=sc.nextInt();
				if(c==1) {
					flag=true;
					break;
				}
				else {
					System.out.println("****************** TERMINATED ******************");
					System.out.println("******************* THANK YOU ******************");
					flag=false;
					break;
				}
				
			case 4 :
				
				System.out.println("****************** TERMINATED ******************");
				System.out.println("******************* THANK YOU ******************");
				flag=false;
				break;
				
				
			default :
				
				System.out.println("Wrong choice selected!!!");
				System.out.println("Try again.\n\ns");
				System.out.println("Do you want to try again? \n Enter 1 for Yes and 0 for No");
				c=sc.nextInt();
				if(c==1) {
					flag=true;
					break;
				}
				else {
					System.out.println("****************** TERMINATED ******************");
					System.out.println("******************* THANK YOU ******************");
					flag=false;
					break;
				}
			
			}
			
		}
		while(flag==true);
	}
	
}
