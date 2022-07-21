package exceptions;

public class nullPointer {
	
	public static void main(String[] args) {
		
		String s = "Sagar";
		int a = s.length();
		System.out.println("Length of "+s+" is :"+a);
		System.out.println("-------------------");
		//exception handling
		try {
		String s1 = null;
		int a1 = s1.length();
		System.out.println("Length of "+s1+" is :"+a1);
		}
		catch(java.lang.NullPointerException e) {
			System.out.println("String is null!!!");
		}
	}

}
