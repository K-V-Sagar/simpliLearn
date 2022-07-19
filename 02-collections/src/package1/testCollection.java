package package1;

import java.util.*;

public class testCollection {

	public static void main(String[] args) {
		//Arraylist
		System.out.println("ArrayList");
		ArrayList<String> car=new ArrayList<String>();   
	      car.add("HONDA");
	      car.add("AUDI"); 
	      car.add("BMW");
	      System.out.println("Arraylist: "+car);
	      car.remove(2);
	      System.out.println("Arraylist after modifying"+car);
	      System.out.println("\n-------------------------------\n");
		
	      //Vector
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(15); 
	      vec.addElement(30); 
	      System.out.println("Vector: "+vec);
	      vec.clear();
	      System.out.println("Vector after clearing: "+vec);
	      System.out.println("\n-------------------------------\n");
	      
		
		  //linkedlist
	      System.out.println("LinkedList");
	      LinkedList<String> cities=new LinkedList<String>();  
	      cities.add("Bangalore");  
	      cities.add("Chennai");  	      
	      cities.add("Mumbai");  	      
	      cities.add("Hyderabad"); 
	      Iterator<String> itr=cities.iterator();  //iterates through all cities
	      while(itr.hasNext()){  
	       System.out.println(itr.next());
	      }
	      System.out.println("\n-------------------------------\n");
	       
	       
	       //HashSet
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println(set);
	       System.out.println("\n-------------------------------\n");
	       
	       
	       //linkedHashSet
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	       System.out.println("\n-------------------------------\n");	
	} 
	      
}  

	

