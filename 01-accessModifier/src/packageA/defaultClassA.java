package packageA;

public class defaultClassA {
	int a=10;
	
	private void display1() {
		System.out.println("Priting from private method of Package A -> Default Class");
		System.out.println("A : "+this.a);
	}
	
	public void display2() {
		System.out.println("Priting from public method of Package A -> Public Class");
		System.out.println("A : "+this.a);
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Package A -> Default Class");	
		defaultClassA obj = new defaultClassA();
		obj.display1();
		obj.display2();
		
	}
	
}
