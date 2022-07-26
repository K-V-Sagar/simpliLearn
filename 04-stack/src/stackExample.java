

import java.util.Stack; //importing stack
import java.util.Scanner; //importing scanner to take user inputs


public class stackExample {

	public static void main(String[] args) {
		int i=1;
		String userString;
		
		//creating obj for input of class Scanner
		Scanner sc = new Scanner(System.in); 
		//creating obj of type Stack that can take String inputs ****LIFO*****
		Stack<String> stackobj = new Stack<String>(); 
		
		//adding elements to stack
		stackobj.push("First");
		stackobj.push("Second");
		stackobj.push("Third");
		stackobj.push("Fourth");
		stackobj.push("Fifth");
		System.out.println("The Stack is : \n"+stackobj+"\n");
		
		// checking if string is a part of the stack
		System.out.println("Enter a string : ");
		userString=sc.next();
		if(stackobj.search(userString)!=-1) {
			System.out.println("Given string "+userString+" exitsts in the stack!\n");
		}
		else {
			System.out.println("Given string "+userString+" does not exitst in the stack!\n");
		}
		
		//printing top element in the stack (LIFO)
		System.out.println("The top element is : "+stackobj.peek()+"\n");
		
		//popping elements from the stack
		stackobj.pop();
		stackobj.pop();
		System.out.println("Stack after popping 2 elements : "+stackobj+"\n");
		
		//popping elements until stack is empty
		while(!stackobj.empty()){
			stackobj.pop();
			System.out.println("Stack after pop "+i+" is : "+stackobj);
		}
	}
	
}
