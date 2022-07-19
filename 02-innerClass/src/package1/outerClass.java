package package1;

public class outerClass {

	public void display() {
		class ininClass{
			public void inprintit() {
				System.out.println("Class inside function is printing!");
			}
		}
		System.out.println("Outer Class pritning!");
		//creating object for class inside function
		ininClass objin = new ininClass();
		objin.inprintit();
	}
	
	class innerClass{
		public void printit() {
			System.out.println("Inner Class printing");
		}
	}
	
	public static void main(String[] args) {
		
		outerClass objo = new outerClass();
		objo.display();
		System.out.println("------------------");
		// creating object of inner class
		outerClass.innerClass obji = objo.new innerClass(); 
		obji.printit();
		
		
	}
	
}
