
public class methodOverloading {

	public void area(int a) {
		
		double area1=a*a*3.14;
		System.out.println("Area of circle: "+area1);
	
	}
	
	public void area(int x, int y) {
		int area2=x*y;
		System.out.println("Area of rectangle: "+area2);
	}
	
	public static void main(String[] args) {
		
		int radius = 2;
		int length =5, width =10;
		methodOverloading obj = new methodOverloading();
		obj.area(radius);
		System.out.println("----------------------");
		obj.area(length, width);
		
	}
	
}
