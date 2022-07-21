package inheritance;

public class childClass extends parentClass1 {
	
	childClass(){
		System.out.println("Child Class: "+this);
	}
	
	public void f3() {
		System.out.println("Child Class called!");
		parentClass1 obj1 = new parentClass1();
		obj1.f1();
	}

}
