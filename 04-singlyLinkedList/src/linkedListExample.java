

import java.util.LinkedList;
import java.util.Iterator;

public class linkedListExample {

	public static void main(String[] args){
		
		//creating linked list object that can take string values
		LinkedList<String> llobj = new LinkedList<String>();
		
		//adding elements to linked list
		llobj.add("one");
		llobj.add("two");
		llobj.add("three");
		llobj.add("four");
		llobj.add("five");
		llobj.add("three");
		llobj.add("four");
		llobj.add("five");
		llobj.add("three");
		llobj.add("four");
		llobj.add("four");
		System.out.println("\nThe Linked List is : \n"+llobj);
		
		//printing linked list using iterator
		System.out.println("Linked List in normal order...\n");
		Iterator itr = llobj.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//priting in reverse order
		itr = llobj.descendingIterator();
		System.out.println("\nLinked List in reverse order...\n");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//removing first element
		System.out.println("Linked List is : "+llobj);
		llobj.removeFirst();
		System.out.println("Linked List after removing first element : "+llobj+"\n");
		//removing last element
		System.out.println("Linked List is : "+llobj);
		llobj.removeLast();
		System.out.println("Linked List after removing first element : "+llobj+"\n");
		
		//removing first occurrence
		System.out.println("Linked List is : "+llobj);
		llobj.removeFirstOccurrence("four");
		System.out.println("Linked List after removing first occurrence : "+llobj+"\n");
		//removing last occurrence
		System.out.println("Linked List is : "+llobj);
		llobj.removeLastOccurrence("three");
		System.out.println("Linked List after removing last occurrence : "+llobj+"\n");
		
		//clearing the linked list
		llobj.clear();
		System.out.println("Linked List after clearing : "+llobj);
		
	}
}
