package exceptions;

public class arrayIndex {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		System.out.println("a[] at index 0 : "+a[0]);
		System.out.println("a[] at index 0 : "+a[2]);
		System.out.println("a[] at index 0 : "+a[3]);
		System.out.println("--------------");
		//exception handling
		try {
		System.out.println("a[] at index 0 : "+a[10]);
		}
		catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of index!!!");
		}
	}
	
}
