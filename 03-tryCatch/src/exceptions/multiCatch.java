package exceptions;

public class multiCatch {
	
	public static void main(String[] args) {
		
		// ****************
		// right click -> run as -> run as configuration
		// arguments -> enter input
		// for multiple inputs use space between each input
		// ****************
		try {
		String input = args[0];
		System.out.println("Input: "+input);
		int output = Integer.parseInt(input);
		System.out.println("Output: "+output);
		}
		catch(java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Input is required!!!");
		}
		catch(java.lang.NumberFormatException e) {
			System.out.println("Input must be a number!!!");
		}
		// or use below statement, to handle both exceptions in one statement
		// catch(RuntimeException e) {}
		
	}

}
