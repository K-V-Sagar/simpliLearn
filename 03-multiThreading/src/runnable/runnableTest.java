package runnable;

public class runnableTest implements Runnable{
	 
    public static int myCount = 0;
    
    public runnableTest(){
         
    }
    
    
    public void run() {
        while(runnableTest.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++runnableTest.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    
    
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        runnableTest mrt = new runnableTest();
        Thread t = new Thread(mrt);
        t.start(); //calling run()
        while(runnableTest.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++runnableTest.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}
