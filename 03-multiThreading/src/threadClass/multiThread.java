package threadClass;

public class multiThread extends Thread{

	//overriding the run() of the class Thread
	//Mandatory
	public void run() {
		String tname = Thread.currentThread().getName();
		for(int i=1;i<=20;i++) {
			System.out.println(tname+" : i :"+i);
		}
	}
	
	public static void main(String[] args) {
		
		multiThread obj = new multiThread();
		//setting name for sub thread and can't set name to main
		obj.setName("iloop");
		// calls the run() method
		//mandatory
		obj.start();
		
		String tname = Thread.currentThread().getName();// gives thread identity
		for(int j=1;j<=20;j++) {
			System.out.println(tname+ " : j :"+j);
		}
		
	}
	
}
