package packageA;

public class publicClassA {
	public void displayPublic() {
		System.out.println("Public method of Package A -> Public Class");
	}
	public static void main(String[] args) {
		System.out.println("Package A -> Public Class");
		
		defaultClassA obj1 = new defaultClassA();
		obj1.display2();
		//below throws error because display1() is a private method 
		//obj1.display1();
		publicClassA obj2 = new publicClassA();
		obj2.displayPublic();
	}
}
