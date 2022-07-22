package runnableDemo;

public class checkProcessor implements Runnable{

	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		System.out.println(tname+" : Check processed!");
		
	}

}
