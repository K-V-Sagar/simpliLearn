public class binarySearch {

	public boolean biSearch(int x, int[] sortedNum ) {
		return biSearch(x, sortedNum, 0, sortedNum.length);
	}
	
	public boolean biSearch(int x, int[] sortedNum, int start, int end) {
		if(start <= end) {
			int mid = (end -start)/2 + start;
			if(sortedNum[mid]==x) return true;
			if(sortedNum[mid]>x)
				return biSearch(x, sortedNum, start, mid-1);
			return biSearch(x, sortedNum, mid+1, end);
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		binarySearch obj = new binarySearch();
		System.out.println(obj.biSearch(2, new int[] {1,2,4,6,8,9}));;
		System.out.println(obj.biSearch(0, new int[] {1,2,4,6,8,9}));;
	}
}