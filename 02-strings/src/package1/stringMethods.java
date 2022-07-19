package package1;

public class stringMethods {

	public static void main(String[] args) {
		
		String s1="Hello World";
		System.out.println("String :"+s1);
		System.out.println("Length of string :"+s1.length());
		System.out.println("Index of 'W' :"+s1.indexOf('W'));
		System.out.println("Index of space :"+s1.indexOf(' '));
		System.out.println("Char at 3 :"+s1.charAt(3));
		//error
		//System.out.println("Char at 20 :"+s1.charAt(20));
	    System.out.println("Index of 'l' :"+s1.indexOf('l'));
	    System.out.println("Index of 2nd 'l' :"+s1.indexOf('l', 3)+"\n");
	    //substring
	    System.out.println("Substring :"+s1.substring(3));
	    System.out.println("Substring :"+s1.substring(3,8)+"\n");
	    
	    //split
	    String[] s2=s1.split(" ");
	    System.out.println(s2[0]);
	    System.out.println(s2[1]+"\n");
	    //Replace
	    System.out.println("Replaced :"+ s1.replace("l", "j"));
	    //to uppercase
	    System.out.println("Uppercase :"+s1.toUpperCase());
	    //to lowercase
	    System.out.println("lowercase :"+s1.toLowerCase());
	    
	  //replace method
	  		StringBuffer sb=new StringBuffer("Hello");
	  		sb.replace(0, 2, "hEl");
	  		System.out.println(sb);

	  		//delete method
	  		sb.delete(0, 1);
	  		System.out.println(sb);
	  		
	  		//StringBuilder
	  		System.out.println("\n");
	  		System.out.println("Creating StringBuilder");
	  		StringBuilder sb1=new StringBuilder("Happy");
	  		sb1.append("Learning");
	  		System.out.println(sb1);

	  		System.out.println(sb1.delete(0, 1));

	  		System.out.println(sb1.insert(1, "Welcome"));

	  		System.out.println(sb1.reverse());
	  				
	  		//conversion	
	  		System.out.println("\n");
	  		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
	  		
	  		String str = "Hello"; 
	          
	        // conversion from String object to StringBuffer 
	        StringBuffer sbr = new StringBuffer(str); 
	        sbr.reverse(); 
	        System.out.println("String to StringBuffer");
	        System.out.println(sbr); 
	            
	        // conversion from String object to StringBuilder 
	        StringBuilder sbl = new StringBuilder(str); 
	        sbl.append("world"); 
	        System.out.println("String to StringBuilder");
	        System.out.println(sbl);       
	}
	
}
