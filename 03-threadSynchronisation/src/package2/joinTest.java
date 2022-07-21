package package2;

import java.util.Scanner;

public class joinTest extends Thread{
	
	// these vars are made static so they can be accessed directly using class name
	// else we have to use this keyword
	private static int n,sum;
	
	public static void main(String[] args) {
		System.out.println("---------------- Sum of first n numbers ---------");
		System.out.println("Enter a num: ");
		Scanner sc =new Scanner(System.in);
		joinTest.n=sc.nextInt();
		
		joinTest obj = new joinTest();
		obj.start(); //calls run()
		
		try {
			obj.join(); //joins sub thread and main thread 
			//main thread waits for sub thread to complete task
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Sum is:"+joinTest.sum);
	}
	
	@Override
	public void run() {
		for(int i=1;i<=joinTest.n;i++) {
			joinTest.sum = joinTest.sum + i;
		}
	}
}
