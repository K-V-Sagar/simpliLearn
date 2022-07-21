package abstraction;

public class testBMW {
	
	public static void main(String[] args) {
		
		BMW3Series obj1 = new BMW3Series();
		obj1.accelerate();
		obj1.commonFunc();
		System.out.println("-------------------");
		BMW5Series obj2 = new BMW5Series();
		obj2.accelerate();
		obj2.commonFunc();

	}

}
