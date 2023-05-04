import java.util.HashMap;

public class Solution {
    public int majorityElement(int[] nums) {
    	HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
		int count;
    	for(int i = 0; i< nums.length; i ++ ) {
    		if(numbers.containsKey(nums[i])) {
              count = numbers.get(nums[i]) + 1;
              numbers.put(nums[i], count);
              if(count > (nums.length / 2)) {
            	  return nums[i];
              }
    			
    		} else {
    			numbers.put(nums[i], 1);
    		}
    	}	
    	return 0;
        
    }

}
