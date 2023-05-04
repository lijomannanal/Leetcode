import java.util.Arrays;

public class Solution {
    public void moveZeroes(int[] nums) {
    	int zerosCount = 0;
    	for(int i = 0; i< nums.length; i ++) {
    		if(nums[i] != 0 ) {
    			nums[zerosCount ++] = nums[i];
    		}
    		
    	}
    	
    	while(zerosCount < nums.length) {
    		nums[zerosCount ++] = 0;
    	}
        System.out.println(Arrays.toString(nums));
    }
}
