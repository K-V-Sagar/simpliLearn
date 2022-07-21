package exceptions;

import java.util.Scanner;

public class divByZero {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		//exception handling
		try {
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		d=a%b;
		System.out.println("Dividing "+a+ " / " +b);
		System.out.println("-------------------");
		System.out.println("Quotient: "+c);
		System.out.println("Remainder: "+d);
		}
		// java.lang.ArithmeticException is the class 
		// e is an object
		catch(java.lang.ArithmeticException e) {
			System.out.println("Cannot divide by zero!!!");
		}
	}
	
}
