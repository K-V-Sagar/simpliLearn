// longest increasing subsequence

public class longestIncSubseq {
    static int lis(int arr[], int n){
    	
        int lis[] = new int[n];
        int i, j, max = 0;
        // initializing all indices to 1
        for (i = 0; i < n; i++)
            lis[i] = 1;
        // traversing the array to find the lis
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
        // picking max value
        for (i = 0; i < n; i++)
            if (max < lis[i])
                max = lis[i];
 
        return max;
    }
 
    public static void main(String[] args)
    {
        int arr[] = { 2, -2, 3, 1, 5};
        System.out.println("The array is:");
        int n = arr.length;
        for(int i=0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }
        
        System.out.println("\nLength of the longest increasing subsequence is: " + lis(arr, n) + "\n");
    }
}