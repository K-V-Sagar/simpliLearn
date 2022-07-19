package package1;

import java.util.*;

public class testMap {

	public static void main(String[] args) {
		
		//HASHMAP
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	    hm.put(1,"one");    
	    hm.put(2,"two");    
	    hm.put(3,"three");   
	    hm.put(4,"four");
	    System.out.println("\nThe elements of Hashmap are ");  
	    // for-each loop
	    for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" : "+m.getValue());    
	    }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      ht.put(5,"five");  
	      ht.put(6,"six");  
	      ht.put(7,"seven");  
	      System.out.println("\nThe elements of HashTable are ");  
	      
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" : "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"eight");    
	      map.put(9,"nine");    
	      map.put(10,"ten");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" : "+l.getValue());    
	      }    
	      
	   }  

	
}
