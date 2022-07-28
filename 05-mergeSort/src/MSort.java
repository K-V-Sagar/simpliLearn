import java.util.Arrays;

public class MSort {

		public void mSort(int[] numbers, int start, int end) {
			if(start<end) {
				int mid=(end-start)/2+start;
				mSort(numbers, start, mid);
				mSort(numbers, mid+1, end);
				merge(numbers,start,mid,end);
			}
		}
		
		
		public void mSort(int[] numbers) {
			mSort(numbers, 0, numbers.length-1);
		}
		
		
		private void merge(int[] numbers, int start, int mid, int end) {
			int i = start;
			int j = mid+1;
			int temp[] = new int[end-start+1];
			for(int k=0;k<temp.length;k++) {
				if(i<=mid && (j>end || numbers[i]<=numbers[j])) {
					temp[k]=numbers[i];
					i++;
				}
				else {
					temp[k]=numbers[j];
					j++;
				}
			}
			System.arraycopy(temp, 0, numbers, start, temp.length);
		}
	
		
		public static void main(String[] args) {
			int a[]= {1,3,4,2,6,7,4,9,8,0,10};
			MSort obj = new MSort();
			obj.mSort(a);
			System.out.println("Array after sorting:");
			System.out.println(Arrays.toString(a));
		}
}