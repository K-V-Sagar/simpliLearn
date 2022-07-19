package package1;

import java.util.Scanner;
import java.io.*;

public class arithCalc {
	
	public static void main(String[] args) 
	{	
		boolean flag=false; 
		int input=0; 
		int c;
		int x1,x2,x3;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("******************** MAIN MENU ********************");
			System.out.println("Choose \n1 for Addition \n2 for Subtraction");
			System.out.println("3 for Multiplication \n4 for Division");
			System.out.println("5 to Exit");
			System.out.println("----------------------------------------------------");
			
			
			System.out.println("Enter you choice:");
			input = sc.nextInt();
			switch(input) {
			case 1 : 
				System.out.println("----------------- Addition ----------------");
				System.out.println("Do you want to add 2 numbers or 3 numbers?");
				int n =sc.nextInt();
				int sumRes=0;
				sumClass objs = new sumClass();
				if(n==2) {
					System.out.println("Enter two numbers:");
					x1=sc.nextInt();
					x2=sc.nextInt();
					sumRes=objs.sum(x1,x2);
					System.out.println("Sum: "+sumRes+"\n\n");
				}
				else if(n==3) {
					System.out.println("Enter three numbers:");
					x1=sc.nextInt();
					x2=sc.nextInt();
					x3=sc.nextInt();
					sumRes=objs.sum(x1, x2, x3);
					System.out.println("Sum: "+sumRes+"\n\n");
				}
				else {
					System.out.println("Cannot add more than 3 numbers!!!");
					System.out.println("Try again.\n\n");
					flag=true;
					break;
				}
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
				
				
				
			case 2 : 
				System.out.println("----------------- Subtraction ----------------");
				diffClass objd = new diffClass();
				System.out.println("Enter two numbers:");
				x1=sc.nextInt();
				x2=sc.nextInt();
				int diffRes = objd.diff(x1,x2);
				System.out.println("Difference: "+diffRes+"\n\n");
				System.out.println("---------------------------------------------------\n\n");
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
			
			
			
			case 3 : 
				System.out.println("----------------- MULTIPLICATION ----------------");
				productClass objm = new productClass();
		        System.out.println("Enter two numbers: ");
		    	x1=sc.nextInt();
		    	x2=sc.nextInt();
		    	int mulRes = objm.pro(x1,x2);
		    	System.out.println("Product: "+mulRes+"\n\n");
		    	System.out.println("---------------------------------------------------\n\n");
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
				
				
				
			case 4 :
				System.out.println("----------------- DIVISION ----------------");
				divClass objdiv = new divClass();
				System.out.println("Enter two numbers: ");
				x1=sc.nextInt();
				x2=sc.nextInt();
				System.out.println("Enter 1 to obatin Quotient and 2 to obtain Remainder");
				int i=sc.nextInt();
				
				try{
					if(i==1) {
						int divRes=objdiv.div(x1, x2);
						System.out.println("Quotient: "+divRes+"\n\n");		
					}
					else if(i==2){
						int divRes=objdiv.remainder(x1, x2);
						System.out.println("Remainder: "+divRes+"\n\n");
					}
					else {
						System.out.println("Wrong choice selected!!!");
						System.out.println("Try again.\n\n");
						flag=true;
						break;
					}
				}
				catch(java.lang.ArithmeticException e) {
					System.out.println("Cannot divide by zero!!!");
				}
				finally {
					System.out.println("---------------------------------------------------\n\n");
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
				
			
				
				
			case 5 :	
				System.out.println("****************** TERMINATED ******************");
				System.out.println("******************* THANK YOU ******************");
				flag=false;
				break;
				
			default :
				System.out.println("Wrong choice selected!!!");
				System.out.println("Try again.");
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
