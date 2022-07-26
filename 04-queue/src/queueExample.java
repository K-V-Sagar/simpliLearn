
import java.util.Iterator;
import java.util.PriorityQueue;

public class queueExample {

	public static void main(String[] args) {
		
		//Creating queue obj that can take string value ***FIFO***
		PriorityQueue<String> queueobj=new PriorityQueue<String>();
		
		//adding elements to queue
		queueobj.add("Person1");
		queueobj.add("Person2");
		queueobj.add("Person3");
		queueobj.add("Person4");
		queueobj.add("Person5");
		System.out.println("The Queue is : \n"+queueobj+"\n");
		
		//print head of the queue
		System.out.println("Head of the Queue is : \n"+queueobj.peek());//returns null if empty
		System.out.println("Head of the Queue is : \n"+queueobj.element()+"\n");
		
		//inserting and element into a queue
		queueobj.offer("Person6");
		System.out.println("The Queue after updating is : \n"+queueobj);
		
		//removing elements from queue
		queueobj.poll();//returns null if empty
		System.out.println("The Queue after removing 1 element is : \n"+queueobj);
		queueobj.remove();
		System.out.println("The Queue after removing 2 elements is : \n"+queueobj+"\n");
		
		//iterating throught the queue
		Iterator itr = queueobj.iterator(); //creating obj for iterator
		//hasNext() returns 1 if queue has an element
		while(itr.hasNext()){
			System.out.println("Iterating through the Queue...");
			System.out.println(itr.next());
		}
		
	}
	
}
