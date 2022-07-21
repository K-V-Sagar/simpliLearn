package abstraction;

public abstract class BMW {
	
	void commonFunc() {
		System.out.println("Inside commonFunc() method");
	}
	
	abstract void accelerate(); // this method has to be overridden in child classes

}
