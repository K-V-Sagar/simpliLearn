
public class callByVal {
	
	public void display() {
		System.out.println("This function is called by value!");
	}
	
	public static void main(String[] args) {
		
		callByVal obj = new callByVal();
		obj.display();
		
	}

}
