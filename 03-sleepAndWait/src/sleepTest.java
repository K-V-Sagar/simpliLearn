
public class sleepTest extends Thread{

		private static Object LOCK = new Object();
		
		//overriding the run() of the class Thread
				//Mandatory
				public void run() {
					for(int i=1;i<=20;i++) {
						System.out.println("i:"+i);
						//sleep() by default must be handle for InterruptedException 
						try {
							Thread.sleep(200); //puts this thread to sleep for 200ms
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
				public static void main(String[] args) {
					
					sleepTest obj = new sleepTest();
					// calls the run() method
					//mandatory
					obj.start();
					
					for(int j=1;j<=20;j++) {
						System.out.println("j:"+j);
					}
					
					synchronized (LOCK) 
			        {
			            try {
							LOCK.wait(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			            System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 1 second");
			        }

					
				}
			
}
