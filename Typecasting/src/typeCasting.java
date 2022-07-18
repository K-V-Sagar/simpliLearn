
public class typeCasting {
	public static void main(String[] args) {
		
		char a = 'A'; int x1=10, x2=1024;
		
		//************** IMPLICIT TYPE CASTING **************
		int var1=a; //char to int
		System.out.println(var1+"\n");
		double var2=a; //char to double
		System.out.println(var2+"\n");
		float var3=a; //char to float
		System.out.println(var3+"\n");
		double ivar=x2; //int to double
		System.out.println(ivar+"\n");
		//below throws error
		//byte var4=a;
		
		
		
		//************** EXPLICIT TYPE CASTING *************** 
		byte var5=(byte)(x1);// int to byte
		System.out.println(var5+"\n");
		byte var6=(byte)(x2); //int to byte (loss of data because out of range)
		System.out.println(var6+"\n");
		float var7 = (int)(x1); //int to float
		System.out.println(var7+"\n");
		char cvar = (char)(var1); //int to char
		System.out.println(cvar+"\n");
		
		
		
		
	}
}
