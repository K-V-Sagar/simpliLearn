package syncDemo;

public class dispMsg {
	
	//synchronized keyword makes other threads wait till current thread finished task
	//it locks for other threads
	public synchronized void hello(String name) {
		
		String tname = Thread.currentThread().getName();
		for(int i=1;i<=10;i++) {
			System.out.println(tname+" : Hello "+name);
		}
		
	}
	
}
