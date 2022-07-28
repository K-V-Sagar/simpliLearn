import java.util.Arrays;
import java.util.Scanner;

public class expoSearch {

public static  void main(String[] args){

    int[] arr = {2,4,5,1,8,10};
    int length= arr.length;
    System.out.println("Enter element to be searched: ");
    Scanner sc = new Scanner(System.in);
    int value = sc.nextInt();
    int outcome = exponentialSearch(arr,length,value);

    if(outcome<0){

       System.out.println( "Element is not present in the array");

    }
    else {

        System.out.println( "Element is  present in the array at index :"+outcome);
    }

 }


public static int exponentialSearch(int[] arr ,int length, int value ){

     if(arr[0]==value){
            return 0;
     }
     int i=1;
     // exponential search 
     while(i<length && arr[i]<=value){

         i=i*2;
         //System.out.println("i val:"+i);
     }
     // below method takes the following parameters
     // array, starting range, end range, value to be searched
     return Arrays.binarySearch(arr,i/2,Math.min(i,length),value);
  }


}
