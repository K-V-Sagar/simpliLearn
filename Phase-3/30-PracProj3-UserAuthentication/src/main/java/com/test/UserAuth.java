package com.test;

import java.util.Scanner;

public class UserAuth {
	
	String email ;
	
	String password ;
	
	public String username()
	{
		email = "sagar@mail.com";
		return email;
	}
	
	public String pwd()
	{
		password = "sagar123";
		return password;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public boolean authentication() {
		
		boolean x;
		System.out.println("Enter Email: ");
		String EMAIL=sc.nextLine();
		System.out.println("Enter Password: ");
		String PASSWORD=sc.nextLine();
		if(( EMAIL.equals("sagar@mail.com") )&&( PASSWORD.equals("sagar123") )) {
			System.out.println("Login successful!");
			x=true;
		}
		else {
			System.out.println("Error, try again...");
			x=false;
		}
		return x;
	}
	
	public static void main(String[] args) {
		UserAuth ua = new UserAuth();
		ua.authentication();
		
	}

}