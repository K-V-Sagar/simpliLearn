package runnableDemo;

public class test {
	
	public static void main(String[] args) throws InterruptedException {
		
		checkProcessor obj = new checkProcessor();
		Thread t = new Thread(obj);
		t.setName("t1");
		t.start();
		t.join(); // makes main wait for t1 to finish task
		
		String tname = Thread.currentThread().getName();
		System.out.println(tname+" : Main thread.");
		
	}

}
