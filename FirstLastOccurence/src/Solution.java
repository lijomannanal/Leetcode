
public class Solution {
	    public int[] searchRange(int[] nums, int target) {
	        int start = 0;
	        int end = nums.length - 1;
	        int firstIndex =findFirstOccurence(nums, start, end, target);
	        int lastIndex = findLastOccurence(nums, start, end, target);
	         return new int[] { firstIndex, lastIndex};
	    }

	     public int findFirstOccurence(int[] nums, int start, int end,  int target) {
	         int firstOcuurence = -1;
	         int mid;
	         while(start <= end ) {
	          mid = (start + end) / 2;
	          if(target > nums[mid]) {
	              start = mid + 1;
	          } else if (target < nums[mid]) {
	              end = mid - 1;
	          } else {
	              firstOcuurence = mid;
	              end = mid -1;
	          }
	         }
	         return firstOcuurence;
	     }

	     public int findLastOccurence(int[] nums, int start, int end, int target) {
	         int lastOcuurence = -1;
	                 int mid;
	         while(start <= end ) {
	          mid = (start + end) / 2;
	          if(target > nums[mid]) {
	              start = mid + 1;
	          } else if (target < nums[mid]) {
	              end = mid - 1;
	          } else {
	              lastOcuurence = mid;
	              start = mid + 1;
	          }
	         }
	         return lastOcuurence;
	     }
}
