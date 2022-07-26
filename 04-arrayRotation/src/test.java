
public class test
{
	public static void main(String[] args) {
		
		arrayRotation r = new arrayRotation();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
        
        System.out.println("Array before rotation...");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        } 
        System.out.println("-----------------");
        
        
        r.rotate(arr, 5); 
        
        System.out.println("Array after rotation...");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
	}
}
