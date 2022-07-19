package package1;

public class testArrays {

	public static void main(String[] args) {
		int i=0;
		// 1D array
		int a[]= {1,2,3,4,5};
		while( i<5) {
			System.out.println(a[i]);
			i++;
		}
		
		
		// 2D array
		char c[][]= {{'a','b','c'},{'@','#','$'}};
		System.out.println("Row 1 length: "+c[0].length);
	}
	
}
