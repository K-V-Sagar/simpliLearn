package syncDemo;

public class test {
	
	public static void main(String[] args) throws InterruptedException {
		
		String tname = Thread.currentThread().getName();
		System.out.println(tname+" : Thread Started.");
		
		dispMsg obj = new dispMsg();
		
		Thread t1 = new Thread(new worker(obj, "MAX"));
		t1.setName("t1");
		t1.start();
		t1.join(); // main waits for t1 to complete
		
		Thread t2 = new Thread(new worker(obj, "AARON"));
		t2.setName("t2");
		t2.start();	
		
		Thread t3 = new Thread(new worker(obj, "PAUL"));
		t3.setName("t3");
		t3.start();	
		
		System.out.println(tname+" : Thread Ended.");
	}

}
