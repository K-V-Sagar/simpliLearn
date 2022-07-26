public class test
{
	public static void main(String[] args) {
		smallest ob = new smallest(); 
        int arr[] = {7,24,2,4,66,3,5}; 
        int n = arr.length, k = 4; 
        System.out.println(" fourth smallest element is "+ ob.kthSmallest(arr, 0, n-1, k)); 
    }
}
