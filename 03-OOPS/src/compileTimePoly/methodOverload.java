package compileTimePoly;

public class methodOverload {

	int area(int a) {
		return (a*a);
	}
	
	int area(int a, int b) {
		return (a*b);
	}
	
	public static void main(String[] args) {
		
		methodOverload obj= new methodOverload();
		System.out.println("Area of sqaure: "+obj.area(2));
		System.out.println("Area of rectangle: "+obj.area(2,4));
	}
	
	// *********************************************************
	// overloading is compile time and overriding is rum time polymorphism 
	
}
