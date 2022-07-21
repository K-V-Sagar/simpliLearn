package customException;

//custom exception extending from RuntimeException
public class noFundException extends RuntimeException{
	
	public noFundException(String msg) {
		// super() access parent class's data
		super(msg);
	}
	
}
