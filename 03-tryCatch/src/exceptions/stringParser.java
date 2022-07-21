package exceptions;

public class stringParser {
	
	public static void main(String[] args) {
		String s = "10";
		int a =Integer.parseInt(s);
		System.out.println("String 10 converted to int "+a);
		System.out.println("--------------");
		//exception handling
		try {
		String s1 = "abc";
		int a1 =Integer.parseInt(s1);
		System.out.println("String abc converted to int "+a1);
		}
		catch(java.lang.NumberFormatException e) {
			System.out.println("Cannot parseInt String to Integer!!!");
		}
	}

}
