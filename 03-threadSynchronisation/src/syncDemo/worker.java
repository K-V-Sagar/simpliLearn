package syncDemo;

public class worker implements Runnable{
	
	dispMsg obj;
	String name;
	
	worker(dispMsg obj, String name){
		this.obj=obj; // reference to dispMsg class to be able to call hello()
		this.name=name; 
	}
	
	@Override
	public void run() {
		
		String tname = Thread.currentThread().getName();
		obj.hello(name);
		
	}

}
