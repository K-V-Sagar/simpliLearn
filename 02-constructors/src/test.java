//parameterised constructor

public class test {

	test(){
		System.out.println("Pritning using the default constructor!");
	}
	
	test(int a){
		System.out.println("Printing using the parametrised constructor");
	}
	
	public static void main(String[] args) {
		
		test obj = new test();
		System.out.println("---------------");
		test obj1 =new test(2);
		
	}
	
}
