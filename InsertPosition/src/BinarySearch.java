
public class BinarySearch {
	public int searchInsert(int[] num, int target) {
		int start = 0;
		int end = num.length - 1;
		int midIndex;
		while(start <= end) {
			midIndex = (start + end) /2;
			if(num[midIndex] == target) {
				return midIndex;
			} else if(num[midIndex] > target) {
				end = midIndex - 1;
			} else {
				start =  midIndex + 1;
			}
		}
		return end + 1;
	}

}
